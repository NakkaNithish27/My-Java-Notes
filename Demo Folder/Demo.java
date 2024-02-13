class A extends Object { //In java every class extends the Object class
  public A() {
    super();
    System.out.println("In A");
  }
  public A(int n) {
    super();
    System.out.println("In A int");
  }
}

class B extends A {
  public B() {
    super(); //it's there but we can't see it
    System.out.println("In B");
  }
  public B(int n) {
    super(); //super(5), if we want to call parameterized consturctor of super class
    System.out.println("In B int");
  }
}

class Demo {
  public static void main(String args[]) {
    B obj = new B();

  }
}
