interface FuelEfficient{
public double calculateFuelEfficiency();
public static void main(String[] args){
FuelEfficient car=new Car(50.5,20.235);
FuelEfficient truck=new Truck(50.5,20.235);
FuelEfficient motorcycle=new Motorcycle(50.5,20.235);
System.out.println(" Miles per Gallons of Car is "+ car.calculateFuelEfficiency());
System.out.println(" Tons per Gallons of Truck is "+ truck.calculateFuelEfficiency());
System.out.println(" Miles per Litres of Motorcycle is "+ motorcycle.calculateFuelEfficiency());
}
}
class Car implements FuelEfficient{
double miles;
double gallons;
public Car(double miles, double gallons){
this.miles=miles;
this.gallons=gallons;
}
public double calculateFuelEfficiency(){
return miles/gallons;
}
}
class Truck implements FuelEfficient{
double tons;
double gallons;
public Truck(double tons, double gallons){
this.tons=tons;
this.gallons=gallons;
}
public double calculateFuelEfficiency(){
return tons/gallons;
}
}
class Motorcycle implements FuelEfficient{
double miles;
double litres;
public Motorcycle(double miles, double litres){
this.miles=miles;
this.litres=litres;
}
public double calculateFuelEfficiency(){
return miles/litres;
}
}


