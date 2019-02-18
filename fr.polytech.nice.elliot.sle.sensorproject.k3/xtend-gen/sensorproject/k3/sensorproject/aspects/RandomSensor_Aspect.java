package sensorproject.k3.sensorproject.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.Random;
import org.eclipse.xtext.xbase.lib.InputOutput;
import sensorproject.Sensor;
import sensorproject.k3.sensorproject.aspects.RandomSensor_AspectSensorAspectProperties;

@Aspect(className = Sensor.class)
@SuppressWarnings("all")
public class RandomSensor_Aspect {
  @Step
  @ReplaceAspectMethod
  public static int getValue(final Sensor _self) {
    final sensorproject.k3.sensorproject.aspects.RandomSensor_AspectSensorAspectProperties _self_ = sensorproject.k3.sensorproject.aspects.RandomSensor_AspectSensorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# int getValue()
    if (_self instanceof sensorproject.Sensor){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(sensorproject.k3.sensorproject.aspects.RandomSensor_Aspect._privk3_getValue(_self_, (sensorproject.Sensor)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Sensor", "getValue");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (int)result;
  }
  
  private static Random r(final Sensor _self) {
    final sensorproject.k3.sensorproject.aspects.RandomSensor_AspectSensorAspectProperties _self_ = sensorproject.k3.sensorproject.aspects.RandomSensor_AspectSensorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Random r()
    if (_self instanceof sensorproject.Sensor){
    	result = sensorproject.k3.sensorproject.aspects.RandomSensor_Aspect._privk3_r(_self_, (sensorproject.Sensor)_self);
    };
    return (java.util.Random)result;
  }
  
  private static void r(final Sensor _self, final Random r) {
    final sensorproject.k3.sensorproject.aspects.RandomSensor_AspectSensorAspectProperties _self_ = sensorproject.k3.sensorproject.aspects.RandomSensor_AspectSensorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void r(Random)
    if (_self instanceof sensorproject.Sensor){
    	sensorproject.k3.sensorproject.aspects.RandomSensor_Aspect._privk3_r(_self_, (sensorproject.Sensor)_self,r);
    };
  }
  
  protected static int _privk3_getValue(final RandomSensor_AspectSensorAspectProperties _self_, final Sensor _self) {
    int v = RandomSensor_Aspect.r(_self).nextInt();
    InputOutput.<String>print(("v:" + Integer.valueOf(v)));
    return v;
  }
  
  protected static Random _privk3_r(final RandomSensor_AspectSensorAspectProperties _self_, final Sensor _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getR") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.Random) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.r;
  }
  
  protected static void _privk3_r(final RandomSensor_AspectSensorAspectProperties _self_, final Sensor _self, final Random r) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setR")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, r);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.r = r;
    }
  }
}
