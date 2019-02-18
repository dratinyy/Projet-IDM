package sensorproject.k3.sensorproject.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import sensorproject.Sensor
import sensorproject.System
import sensorproject.Filter
import java.util.Random;
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step

import static extension sensorproject.k3.sensorproject.aspects.RandomSensor_Aspect.*
import static extension sensorproject.k3.sensorproject.aspects.CompareFilter_Aspect.*
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod

@Aspect(className=Sensor)
class RandomSensor_Aspect {
	Random r = new Random();
	
	@Step
	@ReplaceAspectMethod
	def int getValue() {		
		var v = _self.r.nextInt()
		print("v:"+v)	
		return v;
	}
}

@Aspect(className=Filter)
class CompareFilter_Aspect {
	
	@Step
	@ReplaceAspectMethod
	def int getValue() {
		if (_self.previousNodes.length < 2) {
			return 0
		}
		return 1;
	}
}

@Aspect(className=System)
class SystemAspect {
	
	@Main
	def void main(){
		println(_self.nodes)
		for(n: _self.nodes) {
			println(n.name)
			
		}
	}
}
