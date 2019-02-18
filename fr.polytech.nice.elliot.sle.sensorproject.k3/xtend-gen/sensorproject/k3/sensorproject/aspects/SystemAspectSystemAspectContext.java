package sensorproject.k3.sensorproject.aspects;

import java.util.Map;
import sensorproject.k3.sensorproject.aspects.SystemAspectSystemAspectProperties;

@SuppressWarnings("all")
public class SystemAspectSystemAspectContext {
  public final static SystemAspectSystemAspectContext INSTANCE = new SystemAspectSystemAspectContext();
  
  public static SystemAspectSystemAspectProperties getSelf(final sensorproject.System _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new sensorproject.k3.sensorproject.aspects.SystemAspectSystemAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<sensorproject.System, SystemAspectSystemAspectProperties> map = new java.util.WeakHashMap<sensorproject.System, sensorproject.k3.sensorproject.aspects.SystemAspectSystemAspectProperties>();
  
  public Map<sensorproject.System, SystemAspectSystemAspectProperties> getMap() {
    return map;
  }
}
