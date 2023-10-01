
 class Calculator {
    public int add(int n1,int n2){
        return n1+n2;
    }
    
}

class Demo {
    public static void main(String args[]) {

        int num1=7;
        int num2=9;

        Calculator calc = new Calculator();
        int result = calc.add(num1,num2);
        System.out.println(result);

    }

}