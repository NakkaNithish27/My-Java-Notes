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
