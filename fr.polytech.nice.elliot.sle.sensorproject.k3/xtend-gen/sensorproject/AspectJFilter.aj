// AspectJ classes that have been aspectized and name
package sensorproject;
public aspect AspectJFilter{
int around (sensorproject.Filter self)  :target (self) && (call ( int sensorproject.Filter.getValue(  ) ) ) { return sensorproject.k3.sensorproject.aspects.CompareFilter_Aspect.getValue(self );}

}
