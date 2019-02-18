// AspectJ classes that have been aspectized and name
package sensorproject;
public aspect AspectJSensor{
int around (sensorproject.Sensor self)  :target (self) && (call ( int sensorproject.Sensor.getValue(  ) ) ) { return sensorproject.k3.sensorproject.aspects.RandomSensor_Aspect.getValue(self );}

}
