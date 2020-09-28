

public class classes_objects {
    //car  attributes
      int maxSpeed;
      int wheels;
      String color;

    //constructor
    void horn(){
      System.out.println("Meep meep");
    }
    //first method
    static void newMethod(){
        System.out.println("more java code practice");
    }
    //method with a String
    static void kMethod(String name){
      System.out.println("hey " + name);
    }

    public static void main(String[] args) {
      //method 1
      newMethod();
      //method with a string
      kMethod("Kondwani");
      // a method a constructor used to define new objects with the class' attributes
      classes_objects co1 = new classes_objects();
      classes_objects co2 = new classes_objects();

      co1.color= "red";
      co1.wheels= 4;
      co1.maxSpeed = 180;
      co2.maxSpeed = 200;
      co2.wheels=4;
      co2.horn();
      System.out.println(co1.color);
    }    
}
