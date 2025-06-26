package oopconcepts;

//Abstract class showing abstraction
public abstract class Person {
 private String name;   // Encapsulated field
 private int age;

 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Getter methods (Encapsulation)
 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }

 // Abstract method to be overridden
 public abstract void showRole();
}
