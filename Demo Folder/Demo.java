class Mobile {
  String brand;
  int price;
  static String type;

  static {
    type = "Smart Phone";
    System.out.println("in Static Block");
  }

  public void show() {
    System.out.println(brand + ":" + price + ":" + type);
  }

}

class Demo {
  public static void main(String args[]) throws ClassNotFoundException {

    Class.forName("Mobile");

    // Mobile m1 = new Mobile();
    // Mobile m2 = new Mobile();
    // Mobile.type = "Smart Phone";  //If you want to access a static variable, you should use a class name
    // m1.brand = "apple";
    // m2.brand = "samsung";
    // m1.price = 15000;
    // m2.price = 10000;
    // m1.show();
    // m2.show();
  }
}
