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
    } // } ends the statement

}

//Data Type
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