package sensorproject.k3.sensorproject.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.Conversions;
import sensorproject.Filter;
import sensorproject.k3.sensorproject.aspects.CompareFilter_AspectFilterAspectProperties;

@Aspect(className = Filter.class)
@SuppressWarnings("all")
public class CompareFilter_Aspect {
  @Step
  @ReplaceAspectMethod
  public static int getValue(final Filter _self) {
    final sensorproject.k3.sensorproject.aspects.CompareFilter_AspectFilterAspectProperties _self_ = sensorproject.k3.sensorproject.aspects.CompareFilter_AspectFilterAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# int getValue()
    if (_self instanceof sensorproject.Filter){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(sensorproject.k3.sensorproject.aspects.CompareFilter_Aspect._privk3_getValue(_self_, (sensorproject.Filter)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Filter", "getValue");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (int)result;
  }
  
  protected static int _privk3_getValue(final CompareFilter_AspectFilterAspectProperties _self_, final Filter _self) {
    int _length = ((Object[])Conversions.unwrapArray(_self.getPreviousNodes(), Object.class)).length;
    boolean _lessThan = (_length < 2);
    if (_lessThan) {
      return 0;
    }
    return 1;
  }
}
