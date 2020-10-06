 //nesting 
 class Student{
  int id;
  Student (int i){
    id = i;
    Grades a = new Grades();
    a.passed();
  }

  private class Grades{
    public void passed(){
      System.out.println(id + " passed");
    }
  }
}



//anonymous classes
class phoneNumber {
  public void digits(){
    System.out.println(10);
  }
}

//abstract class
abstract class Phones{
  int chargingPort = 1;
  abstract void ringTone();
}

class Samsung extends Phones{
  public void ringTone(){
    System.out.println("ring ring");
  }
}


public class classes_objects {
  // car attributes
  private int wheels;
  private String color;
  private int maxSpeed;
  private int seats;

 


  //Seats constructor
  classes_objects(){
    this.setSeats(4);
  }

  classes_objects(int s){
    this.setSeats(s);
  }

  //Seats getter
  public int getSeats(){
    return seats;
  }

  //Seats setter
  public void setSeats(int s){
    this.seats = s;
  }

  // Wheels getter
  public int getWheels() {
    return wheels;
  }

  // Wheels setter
  public void setWheels(int w) {
    this.wheels = w;
  }

  // color getter
  public String getColor() {
    return color;
  }

  // color setter
  public void setColor(String c) {
    this.color = c;
  }

  // maxSpeed getter
  public int getMaxSpeed() {
    return maxSpeed;
  }

  // maxSpeed setter
  public void setMaxSpeed(int ms) {
    this.maxSpeed = ms;
  }


  // constructor
  public void horn() {
    System.out.println("Meep meep");
  }

  // first method
  static void newMethod() {
    System.out.println("more java code practice");
  }

  // method with a String
  static void kMethod(String name) {
    System.out.println("hey " + name);
  }

  // an object with a return
  static int sum(int v1, int v2) {
    return v1 + v2;
  }

  // options object
  static int options(int a, int b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }

  // another constructor object for coders
  public void coder101() {
    System.out.println("DRY");
  }

  //final
  public static final Double Pi = 3.14;

  //enums
  enum position{
    KEEPER,
    DEFENDER,
    MIDFIELDER,
    STRIKER
  }
  

  public static void main(String[] args) {
      //method 1
      newMethod();

      //abstract class instance
      Samsung sp = new Samsung();
      sp.ringTone();
      //method with a string
      kMethod("Kondwani");

      // a method a constructor used to define new objects with the class' attributes
      classes_objects co1 = new classes_objects();
      classes_objects co2 = new classes_objects();

      co1.setColor("red");
      co1.setWheels(4);
      co1.setMaxSpeed(180);
      co1.setSeats(2);

      co2.setColor("blue");
      co2.setWheels(4);
      co2.setMaxSpeed(200);
      co2.horn();
      co2.setSeats(4);
      System.out.println(co2.getColor());
      System.out.println(co1.getSeats());
      System.out.println(co2.getMaxSpeed());
    

      //an instance of the sum method with a return
      int y = sum(6, 7);
      System.out.println(y);

      //another instance of a object with a return
      int response = options(20, 21);
      System.out.println(response);

      //instance of the coder object
      classes_objects coderK = new classes_objects();
      coderK.coder101();

      //value type
      int d = 7;
      multiplyByTwo(d);
      System.out.println(d);
      
      //final instance
      System.out.println(Pi);
      //casting
      double ad = (double) 1.29;
      System.out.println(ad);
      //instance of an anonymous class
      phoneNumber pn = new phoneNumber(){
        @Override public void digits(){
          System.out.println(7);
        }
      };
      pn.digits();

      //instance of a nested class
      Student Kondwani = new Student(1234);

      //instance of the enum function with a switch statement
      position ps = position.STRIKER;

      switch(ps){
        case KEEPER:
        System.out.println("The keeper saves");
        break;
        case DEFENDER:
        System.out.println("The defender protects");
        break;
        case MIDFIELDER:
        System.out.println("The midfielder passes");
        break;
        case STRIKER:
        System.out.println("The strikers scores");
        break;
      }

    } 
  
    // object for the value type
    static void multiplyByTwo(int num) {
      num = num * 2;
    }    
}
