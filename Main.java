class Animal {

  String name;

  void eat() {
    System.out.println("I can eat");
  }
}

class Dog extends Animal {

  void display() {
    System.out.println("i can barke ");
  }
}

class Cat extends Animal {
  void speak() {
    System.out.println("i can meow");
  }
}

class Main {
  public static void main(String[] args) {

    Dog labrador = new Dog();// single inheritance

    labrador.name = "Rohu";
    labrador.display();

    labrador.eat();

    Cat c1 = new Cat();// hirerchal inheritance
    c1.eat();
    c1.speak();

  }
}