import java.util.*;  
public class Assignment2 {

   public static void main(String args[]) {
      Piano obj = new Instrument();
      obj.play();
   }
}

interface Piano  {

   default void play() {
      System.out.println("Piano");
   }

}

interface Guitar {

   default void play() {
      System.out.println("Guitar");
   }
}

class Instrument implements Piano, Guitar {

   public void play() {
      System.out.println("Hello!");
	  Piano.super.play();
	  Guitar.super.play();
   }
}