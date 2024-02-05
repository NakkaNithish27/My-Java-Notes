
class Mobile {
    String brand;
    int price;
    static String type;

    public void show() {
        System.out.println(brand + ":" + price + ":" + type);
    }

}

class Demo {
    public static void main(String args[]) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        Mobile.type = "Smart Phone";
        m1.brand = "apple";
        m2.brand = "samsung";
        m1.price = 15000;
        m2.price = 10000;
        m1.show();
        m2.show();
    }
}