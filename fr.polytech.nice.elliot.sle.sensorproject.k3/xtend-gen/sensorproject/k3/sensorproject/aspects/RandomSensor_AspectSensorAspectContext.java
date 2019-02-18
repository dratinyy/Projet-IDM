package sensorproject.k3.sensorproject.aspects;

import java.util.Map;
import sensorproject.Sensor;
import sensorproject.k3.sensorproject.aspects.RandomSensor_AspectSensorAspectProperties;

@SuppressWarnings("all")
public class RandomSensor_AspectSensorAspectContext {
  public final static RandomSensor_AspectSensorAspectContext INSTANCE = new RandomSensor_AspectSensorAspectContext();
  
  public static RandomSensor_AspectSensorAspectProperties getSelf(final Sensor _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new sensorproject.k3.sensorproject.aspects.RandomSensor_AspectSensorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Sensor, RandomSensor_AspectSensorAspectProperties> map = new java.util.WeakHashMap<sensorproject.Sensor, sensorproject.k3.sensorproject.aspects.RandomSensor_AspectSensorAspectProperties>();
  
  public Map<Sensor, RandomSensor_AspectSensorAspectProperties> getMap() {
    return map;
  }
}
