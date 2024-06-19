package inheritance;
//Superclass (General class)
class Animal {
String name;

public Animal(String name) {
   this.name = name;
}

public void makeSound() {
   System.out.println("Some generic sound");
}
}

//Subclass (Specialized class)
class Dog extends Animal {
public Dog(String name) {
   super(name);
}

//Override
public void makeSound() {
   System.out.println("Woof!");
}
}

//Subclass (Specialized class)
class Cat extends Animal {
public Cat(String name) {
   super(name);
}

//override
public void makeSound() {
   System.out.println("Meow!");
}
}
public class Override {
	public static void main(String[] args) {
      Dog dog = new Dog("Buddy");
      Cat cat = new Cat("Whiskers");

      System.out.println("Dog: " + dog.name);
      dog.makeSound();

      System.out.println("Cat: " + cat.name);
      cat.makeSound();
  }
}
