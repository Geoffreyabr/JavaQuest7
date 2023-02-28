import java.util.ArrayList;

  public class Hangar {

      public static void main(String[] args){

        Car ferrari = new Car ("Ferrari", 2000);        
        Boat titanic = new Boat ("Titanic", 50000);       

        System.out.println(ferrari.doStuff());
        System.out.println(titanic.doStuff());
      }
  }