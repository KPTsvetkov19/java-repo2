public class Dell extends Laptop{
public Dell() {}
public Dell(String name) {
super(name);

}public String getDetails() {
return getName();
}
public static void main(String[] args) {
Dell obj = new Dell(“Dell Inspiron”);
System.out.println(obj.getDetails());
}
}














import java.util.Scanner;

public class Car extends Vehicle{
private String carName;
public String getDetails(String carName) {

Vehicle obj = new Car();
return carName+ “, “+ obj.getModel() + “, “+obj.getSpeed();

}
public static void main(String[] args) {

Car first = new Car();
String name;
Scanner scan = new Scanner(System.in);
name = scan.nextLine();
System.out.println(first.getDetails(name));

}
}

public class Vehicle {
    private String model = “Tesla”;
    private String speed = “100”;
    public String getModel()
    {
        return model;
    }
    public String getSpeed()
    {
        return speed;
    }
}

