
class Calculator {
    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }
}

class Demo {
    public static void main(String args[]) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 4, 5));
        System.out.println(calc.add(4, 6));
        System.out.println(calc.add(4.6, 46.6));

    }

}