//  jshell command to try java on the go
//  java is platform independent but not JVM
//  java code ---> javac ---> byte code ---> JVM
//  JDK <JRE    <   JVM     >   JRE >    JDK
//  In order to run byte code JVM needs extra libraries which are part of Java Runtime Environment(JRE)
//  java is Write Once and Run Anyware language(WORA)
//  whenever u download JDK we get updated JRE and JVM
//  java is strongly typed language

//javac Demo.java  - to compile
//java Demo        - to run

class Example{
    public static void main(String args[]){
        System.out.println("Hello Nithish"); //semi colon ends the statement
    } // } ends the block

}



//Data Types
    //Primitive
        //Integer
            // byte - 1 byte
            // short- 2 bytes
            // int  - 4 bytes 
            // long - 8 bytes (long l= 5854l; )
        //Float
            //double- 8 bytes (by default point values are double)
            //float - 4 bytes ( float num= 5.6f; )
        //Character
            //char  - 2 bytes (because of UNICODE)
        //Boolean
            //true - is not equal to 1 in java
            //false- is not equal to 0 in java
    //User Defined


    int num1 =  0b101; //binary format
    int num2 =  0x7E;   //hexadecimal format
    int num3 =  10_00_00_000; //for better readablility
    double num4 =  12e10;
    char c= 'a'; //c++ is b


    /*TYPE CONVERSION AND TYPE CASTING*/

    byte b = 127;
    int  a = 12;

    b = a; //java wont allow it because a's range is bigger than because
    b = (byte)a //casting ie explicitly converting int to byte

    a=b // conversion, byte to int no error

    //we cannot store boolean values in char type

    float b = 7.45f;
    int a = (int)b; //.45 will be lost

    //  byte range is -128 to +127, what if convert int a = 257 which is greater than 256; to byte?
    //  here 257%256 = 1 is remain after casting to byte
    byte c = 12;
    int d = 258;
    c = (byte)d; // 258%256==2


    /*OPERATORS*/

    +,-,*,/,%

    //Short hand
    +=,-=,/=,*=

    //increment and decrement
    num++,num-- , ++num, --num

    //Relational Operators 
    <,>,==,!=,<=,>=

    /*LOGICAL OPERATORS*/

    & - AND
    | - OR
    ! - not

    //Short circuits

    &&, || ,!

    x>y && a<b // if first condition is false it wont check 2nd condition
    x>y || a<b // if first condition is true it wont check 2nd condition


    /*CONDITIONAL STATEMENTS*/

    if(condition){

    }else if(condition){

    }else{

    }

    
    //TERENARY OPERATOR
    int num=4;
    boolean numIsEven=num%2==0 ? true : false;  
    System.out.println(a );

    //SWITCH STATEMENT

    //here break is important, without break it executes all the remaining statment after a case is matched
     int day = 10;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Enter a valid day");
                break;
        }

        //With recent versions of java we can actually avoid using break, there is a different syntax for that

        /*LOOPS */

        //for Loop
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi " + i);
        }
    
        //while Loop

        int i = 1;  //initialization
        while (i < 6) { //condition
            System.out.println("Hi "+i);
            i++;    //increment or decrement
        }

        //do while loop

        //if we want to execute the block atleast once even the condition is false
        int i = 7;
        do {
            System.out.println("Hi " + i);
            i++;
        } while (i < 6);


        /*OBJECT ORIENTED PROGRAMMING */

        //Every object has properties(data) and behaviour(methods)

        //To create object we need a class(blue print of object).
        //Using the byte code in class file JVM creates the object.
        
        class Demo {
        public static void main(String args[]) {

            int num1=7;
            int num2=4;

            int result = num1+num2; //here adding two nums is a behaviour of a calculator, lets create a calculator class
            System.out.println(result);

        }

    }

    // CREATING A CALCULATOR CLASS

    class Calculator {
        int a;
        public int add(int n1, int n2) {
            return n1 + n2;
        }

    }

    class Demo {
        public static void main(String args[]) {

            int num1 = 9;
            int num2 = 9;

            // here calc is reference variable
            // Calculator() is the constructor method
            Calculator calc = new Calculator();
            int result = calc.add(num1, num2);
            System.out.println(result);

        }

    }

    //BEHIND THE SCENES

    //JRE provides inbuilt libraries for our code to run
    //JVM is a part of JRE
    //JRE is a part of JDK

    /*METHOD OVERLOADING */

        
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

    //HOW MEMORY ALLOCATES INSIDE THE JVM?

    
    class Calculator {
        int a;  //instance variable
        public int add(int num1, int num2) { //num1,num2 are local variables
            return num1 + num2;      //We will have add stack
        }

    }

    class Demo {
        public static void main(String args[]) { //we will have main stack
            Calculator calc = new Calculator();
            System.out.println(calc.add(4, 6));

        }

    }

    //Every method has its own stack iside jvm to store all local variables of that method
    //We will have heap memory to store all the objects
    //The objects inside heap memory contains instance variables, and method definations
    

    /*  ARRAY */

    // One Dimensional Array

    int arr1[] = { 4, 6, 3, 6 }; // if you have the values
    int arr2[] = new int[5]; // without values, here 5 is array size

    for(int i = 0;i<arr1.length;i++){
            
        System.out.println(arr1[i]);

        }

    //  Two dimensional Array
    
    class Demo {
        public static void main(String args[]) {
            int nums[][] = new int[3][4]; 

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    nums[i][j] = (int) (Math.random() * 10);
                }
            }

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    System.out.print(nums[i][j] + " ");
                }
                System.out.println();
            }

        }
    }

    // Enhanced for loop

