package AT_lessons;

public class Car {
String mark;
String model;
String color;
static float distance;
int mass;
boolean dtp;
int vol;
Engine engine;
int fuelConsumption = Engine.getFuelConsumption ();

public void beep () {
    System.out.println("БИИИИИП");
}

public void fuel_consumption_distance () {

   float fuelConsumptionDistance;
    fuelConsumptionDistance = Engine.getFuelConsumption ()*distance;
    System.out.println(fuelConsumptionDistance);
}
}
