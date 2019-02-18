// AspectJ classes that have been aspectized and name
package sensorproject;
public aspect AspectJNode{
int around (sensorproject.Node self)  :target (self) && (call ( int sensorproject.Node.getValue(  ) ) ) { return sensorproject.k3.sensorproject.aspects.ThresholdFilter_Aspect.getValue(self );}

}
