package sensorproject.k3.sensorproject.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import sensorproject.Node;
import sensorproject.k3.sensorproject.aspects.SystemAspectSystemAspectProperties;

@Aspect(className = sensorproject.System.class)
@SuppressWarnings("all")
public class SystemAspect {
  @Main
  public static void main(final sensorproject.System _self) {
    final sensorproject.k3.sensorproject.aspects.SystemAspectSystemAspectProperties _self_ = sensorproject.k3.sensorproject.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void main()
    if (_self instanceof sensorproject.System){
    	sensorproject.k3.sensorproject.aspects.SystemAspect._privk3_main(_self_, (sensorproject.System)_self);
    };
  }
  
  protected static void _privk3_main(final SystemAspectSystemAspectProperties _self_, final sensorproject.System _self) {
    InputOutput.<EList<Node>>println(_self.getNodes());
    EList<Node> _nodes = _self.getNodes();
    for (final Node n : _nodes) {
      InputOutput.<String>println(n.getName());
    }
  }
}
