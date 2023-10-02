//simple inheritence example
package practice;

//Base class (superclass)
class Animal {
 String name;

 Animal(String name) {
     this.name = name;
 }

 void eat() {
     System.out.println(name + " is eating.");
 }

 void sleep() {
     System.out.println(name + " is sleeping.");
 }
}

//Derived class (subclass)
class Dog extends Animal {
 Dog(String name) {
     super(name); // Call the constructor of the base class
 }

 void bark() {
     System.out.println(name + " is barking.");
 }
}

public class InheritanceExample {
 public static void main(String[] args) {
     // Create an instance of the Dog class
     Dog myDog = new Dog("Buddy");

     // Access methods from the base class
     myDog.eat();
     myDog.sleep();

     // Access methods specific to the Dog class
     myDog.bark();
 }
}

