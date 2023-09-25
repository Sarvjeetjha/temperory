class Animal {

  int x=5;
  String name;
   void eat() {
    System.out.println("I can eat");
  }
}


class Dog extends Animal {

  int x=10;
   void display() {
    System.out.println("i can bark ");
  }
}

class Puppy extends Dog{
    int x=15;
    void speak(){
        System.out.println("i can also bark");
    }
    void prin(){
        super.x=50;
        System.out.println(super.x);
    }
}

class Multilevel {
  public static void main(String[] args) {

    
    Puppy p1 = new Puppy();//multilevel

    p1.prin();
    p1.name = "charliy";
    p1.display();

    
    p1.eat();

    p1.speak();


  }
}