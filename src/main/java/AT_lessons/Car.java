package AT_lessons;

public class Car {
String mark;
String model;
String color;
static float distance;
int mass;
boolean dtp;
int vol;
String engine;

public static void beep () {
    System.out.println("БИИИИИП");
}

public static void fuel_consumption_distance () {

   float fuelConsumptionDistance;
    fuelConsumptionDistance = Engine.fuelConsumption*distance;
    System.out.println(fuelConsumptionDistance);
}
}
