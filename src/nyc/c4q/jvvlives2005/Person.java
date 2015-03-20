package nyc.c4q.jvvlives2005;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Access Code 2.1
 *
 * Author  Gregory Gundersen
 * Date    March 2015
 *
 * This class represents a person with a name and age.
 */

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {

        this.name = name;
    }

    public void setName(String newName) {

        this.name = newName;
    }

    public String getName() {

        return this.name;
    }

    public void setAge(int newAge) {

        this.age = newAge;
    }

    public int getAge() {

        return this.age;
    }

    public static void greet() {

        System.out.println("I'm speaking for all Persons");
    }

    /*public static void main(String[] args){
        int n = 0;
        Person fred = new Person("Fred");     //these are constructors
        System.out.println(fred.getAge());
        Person bob = new Person("Bob", 28);
        System.out.println(bob.getAge());
        System.out.println(bob == fred);      //shows that if Bob is the same as Fred

        Calendar c = Calendar.getInstance();

       Scanner in = new Scanner(System.in);
        String s = "hey";

        Person.greet();
        String.format("Formatting the number %d", 9);
        }

    public static void main(String[] args){

        Person fred = new Person("Fred", 28);
        Person bob = fred;
           Person.greet(); <-- Only one to use it (greet)    Person.getAge(); <-- cannot be done
        bob.setName("John");
        System.out.println(fred.getAge());
        System.out.println(fred.getName());
    }
    public static void main(String[] args) {
        String s1 = new String ("hello");
        String s2 = new String ("hello");
        String s3 = new String(s2);
        System.out.println("hello" == "hel" + "lo");
    }*/

    public static void main (String[] args) {
        Person bob = new Person("Bob");
        //Person mike = bob;
        System.out.println(bob.toString());

    }


}