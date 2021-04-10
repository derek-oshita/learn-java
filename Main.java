import java.util.Date;


import java.awt.Point;

// https://www.youtube.com/watch?v=eIrMbAQSU34&ab_channel=ProgrammingwithMosh
// 43:00 mins

public class Main {

    public static class Drink {
        private enum Size {
            SMALL, MEDIUM, LARGE
        }

        public enum OrderName {
            OLD_FASHIONED, MOJITO, AMF
        }

        Size size; 
        OrderName orderName; 
        String note; 
    }


    public static class Person {
        String name; 
        byte age; 
        String location; 
    }

    public static void main (String[] args) {
        Drink drink_order_one = new Drink(); 
        drink_order_one.size = Drink.Size.LARGE; 
        drink_order_one.orderName = Drink.OrderName.OLD_FASHIONED; 
        drink_order_one.note = "WHISKY IS SUPER SICK!"; 
        
        Person person_one = new Person(); 
        person_one.name = "Derek"; 
        person_one.age = 29; 
        person_one.location = "San Francisco, CA"; 

        System.out.println(person_one.name + " ordered a " + drink_order_one.size + " " + drink_order_one.orderName + "!" );

    }

}

