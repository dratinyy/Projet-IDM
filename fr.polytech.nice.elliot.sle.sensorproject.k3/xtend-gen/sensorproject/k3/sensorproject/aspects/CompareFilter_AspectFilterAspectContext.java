package sensorproject.k3.sensorproject.aspects;

import java.util.Map;
import sensorproject.Filter;
import sensorproject.k3.sensorproject.aspects.CompareFilter_AspectFilterAspectProperties;

@SuppressWarnings("all")
public class CompareFilter_AspectFilterAspectContext {
  public final static CompareFilter_AspectFilterAspectContext INSTANCE = new CompareFilter_AspectFilterAspectContext();
  
  public static CompareFilter_AspectFilterAspectProperties getSelf(final Filter _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new sensorproject.k3.sensorproject.aspects.CompareFilter_AspectFilterAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Filter, CompareFilter_AspectFilterAspectProperties> map = new java.util.WeakHashMap<sensorproject.Filter, sensorproject.k3.sensorproject.aspects.CompareFilter_AspectFilterAspectProperties>();
  
  public Map<Filter, CompareFilter_AspectFilterAspectProperties> getMap() {
    return map;
  }
}
