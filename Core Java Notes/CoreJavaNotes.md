-  jshell command to try java on the go
-  java is platform independent but not JVM
-  java code ---> javac ---> byte code ---> JVM
-  JDK <JRE    <   JVM     >   JRE >    JDK
-  In order to run byte code JVM needs extra libraries which are part of Java Runtime Environment(JRE)
-  java is Write Once and Run Anyware language(WORA)
-  whenever u download JDK we get updated JRE and JVM
-  java is strongly typed language

- `javac Demo.java`  - to compile 
- `java Demo`        - to run

```java
class Example {
    public static void main(String args[]) {
        System.out.println("Hello Nithish"); //semi colon ends the statement
    } // } ends the block

}
```



Data Types
- Primitive
	- Integer
		- byte - 1 byte
		- short- 2 bytes
		- int  - 4 bytes
		- long - 8 bytes (long l= 5854l; )
	- Float
		- double- 8 bytes (by default point values are double)
		- float - 4 bytes ( float num= 5.6f; )
	- Character
		- char  - 2 bytes (because of UNICODE)
	- Boolean
		- true - is not equal to 1 in java
		- false- is not equal to 0 in java
	- User Defined


```java
int num1 =  0b101; //binary format
int num2 =  0x7E;   //hexadecimal format
int num3 =  10_00_00_000; //for better readablility
double num4 =  12e10;
char c = 'a'; //c++ is b
```


### TYPE CONVERSION AND TYPE CASTING

```java
byte b = 127;
int  a = 12;

b = a; //java wont allow it because a's range is bigger than because
b = (byte)a //casting ie explicitly converting int to byte

    a = b // conversion, byte to int no error

        //we cannot store boolean values in char type

        float b = 7.45f;
int a = (int)b; //.45 will be lost

//  byte range is -128 to +127, what if convert int a = 257 which is greater than 256; to byte?
//  here 257%256 = 1 is remain after casting to byte
byte c = 12;
int d = 258;
c = (byte)d; // 258%256==2
```


### OPERATORS

+, -, *, /, %

#### Short hand
+=, -=, /=, *=

```java
//increment and decrement
num++, num-- , ++num, --num

//Relational Operators
<,>, ==, !=, <=, >=

/*LOGICAL OPERATORS*/

& - AND
| - OR
! - not

//Short circuits

&&, || , !

x > y && a<b // if first condition is false it wont check 2nd condition
x>y || a < b // if first condition is true it wont check 2nd condition
```



              


### CONDITIONAL STATEMENTS

```java
if (condition) {

} else if (condition) {

} else {

}
``` 


### TERENARY OPERATOR
```java
int num = 4;
boolean numIsEven = num % 2 == 0 ? true : false;
System.out.println(a );
```

### SWITCH STATEMENT
```java

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
```

### LOOPS 

```java
//for Loop

for (int i = 0; i < 5; i++) {
    System.out.println("Hi " + i);
}

//while Loop

int i = 1;  //initialization
while (i < 6) { //condition
    System.out.println("Hi " + i);
    i++;    //increment or decrement
}

//do while loop

//if we want to execute the block atleast once even the condition is false
int i = 7;
do {
    System.out.println("Hi " + i);
    i++;
} while (i < 6);
```


### OBJECT ORIENTED PROGRAMMING 

- Every object has properties(data) and behaviour(methods)

- To create object we need a class(blue print of object).
- Using the byte code in class file JVM creates the object.

```java
class Demo {
    public static void main(String args[]) {

        int num1 = 7;
        int num2 = 4;

        int result = num1 + num2; //here adding two nums is a behaviour of a calculator, lets create a calculator class
        System.out.println(result);

    }

}
```

// CREATING A CALCULATOR CLASS

```java
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
```


BEHIND THE SCENES

- JRE provides inbuilt libraries for our code to run
- JVM is a part of JRE
- JRE is a part of JDK

### METHOD OVERLOADING 


```java
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
```

### HOW MEMORY ALLOCATES INSIDE THE JVM?


```java
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
```


- Every method has its own stack iside jvm to store all local variables of that method
- We will have heap memory to store all the objects
- The objects inside heap memory contains instance variables, and method definations


###  ARRAY 

- One Dimensional Array

```java
int arr1[] = { 4, 6, 3, 6 }; // if you have the values
int arr2[] = new int[5]; // without values, here 5 is array size

for (int i = 0; i < arr1.length; i++) {

    System.out.println(arr1[i]);

}
```

-  Two dimensional Array

```java
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
```

- Enhanced for loop

```java
class Demo {
    public static void main(String args[]) {
        int arr[] = new int[4];
        arr[0] = 6;
        arr[1] = 7;
        arr[2] = 8;
        arr[3] = 2;

        for (int num : arr) {
            System.out.println(num);
        }
    }
}
```

### String

- String constant pool
- unreferenced string objects in string constant pool will be garbage collected to get the memory back

```java
class Demo {
    public static void main(String args[]) {
        String name = "Nithish";
        String surName = new String("Nakka");
        System.out.println(surName + name);
        String s1 = "Phani";
        String s2 = "Phani";
        System.out.println(s1.hashCode() + " " + s2.hashCode()); //both hashcodes are same
    }

    //Mutable String - can be changed (we can make mutable strings using StringBuffer, StrigBuilder classes)
    //Immutable Strings - unchange  (by default strings are immutable in java)

    //StringBuffer - it is thread safe
    //StringBuilder- it is not thread safe
    class Demo {
        public static void main(String args[]) {
            StringBuffer name = new StringBuffer();
            System.out.println(name.capacity()); // bydefault gives 16 characters
            //when we assign a string to name, the capacity becomes length of string+16
            //To reduce the relocation of the string, it gives 16 characters buffer
            System.out.println(name.length());
            name.setLength(30); //
            System.out.println(name.length());
        }
    }
```


### static keyword

-  a static variable (class variable) will be shared by all the objects of the class
- in non static methods we can use static variables


### Static Block

- We can initialize static variables inside static block, because if we initialize the statice variable inside constucter
method like instance variables, the statice variable will be initialized for every obeject which is not needed*/

- Irrespective of how many objects you create, the static block will only be called once*/

- The static block will be exectuted when it is loaded in to class loader.

- If we don't create an object, it won't load the class,if we want to load the class without creating an object, we can use
`Class.forName()`*/


/* */

```java
class Mobile {
String brand;
int price;
static String type;

static {
	type = "Smart Phone";
}

public void show() {
	System.out.println(brand + ":" + price + ":" + type);
}

}

class Demo {
public static void main(String args[]) throws ClassNotFoundException {

	Class.forName("Mobile"); //to load class Mobile without creating an object, and this might throw exception

	Mobile m1 = new Mobile();
	Mobile m2 = new Mobile();
	Mobile.type = "Smart Phone";  //If you want to access a static variable, you should use a class name
	m1.brand = "apple";
	m2.brand = "samsung";
	m1.price = 15000;
	m2.price = 10000;
	m1.show();
	m2.show();
}
}
```


- We cannot use a non static variable inside a static method directly, as JVM don't know which object variable you
trying to access, but we can use indirectly by passing the object reference*/

```java
class Mobile {
String brand;
int price;
static String type;

static {
	type = "Smart Phone";
	System.out.println("in Static Block");
}

public static void show(Mobile m1) {
	System.out.println(m1.brand + ":" + m1.price + ":" + m1.type);
}

}

class Demo {
public static void main(String args[]) throws ClassNotFoundException {

	Class.forName("Mobile");

	Mobile m1 = new Mobile();
	Mobile.type = "Smart Phone";  //If you want to access a static variable, you should use a class name
	m1.brand = "apple";
	m1.price = 15000;
	Mobile.show(m1);
}
}

```
### Why main method is static*/

- as main is the starting point of the code, we cannot create an object to access main method, to avoid dead lock situation
the main method need to be static method*/


### ENCAPSULATION

- If one can have the object, he can access the data inside the object */

- One should not have the direct access to the object variables directly, it's like reading our mind without our consent */

- So to prevent this, always make instance variables private, and they can only be accessing via the setters and getters only which are public*/

- `this` keyword
```java
class Human {

private int age;  //Whenever you create an instance vairable, make it private
private String name; //private variables can only be accessed from the same class only
public int getAge() {
	return age;
}
public String getName() {
	return name;
}
// public void setAge(int age, Human ob) {
//     Human objl = ob;
//     obj1.age = age;
// }  instead of doing this, java gives us this keyword

public void setAge(int age) {
	this.age = age; //this keyword is the reference of the object which is calling the setAge method
}
public void setName(String name) {
	this.name = name;
}

}

class Demo {
public static void main(String args[]) {
	Human obj = new Human();
	obj.setAge(21); //    obj.setAge(21, obj);
	obj.setName("Nithish");
	System.out.println(obj.getName() + ":" + obj.getAge());

}
}

//Every method has his own stack in the memory
/*all objects are stored in the heap memory*/
```


### CONSTRUCTERS

- constructer is a special method which have the same name as class name,
using constucter we can assign default values to the variables*/

- constructer don't have return type*/

- Whenever you perform a operation like assignment, always do it inside a method, don't do it directly*/

- When we want to connect our application to a network/database, we will write the connections in constructer*/

```java
class Human {

private int age;
private String name;
public Human() { //normal constructer or default constructer
	age = 21;
	name = "Nakka";
}

//Constructer overloading
public Human(int age, String name) { //parameterized constructer
	this.age = age;
	this.name = name;
}
public String getName() {
	return name;
}
public int getAge() {
	return age;
}


}

class Demo {
public static void main(String args[]) {


	Human obj = new Human();
	Human obj1 = new Human(20, "john");

	System.out.println(obj.getName() + ":" + obj.getAge());
	System.out.println(obj1.getName() + ":" + obj1.getAge());

}
}
```


### this and super*/

- In every consturctor the first line is `super()`*/

- `this()` method executes the constructor of the same class*/

- `super()` method executes the sonstuctor of the super class

```java
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
```


### Namining Conventions in Java

#### Camel Casing

```java
/*class and interface*/- Calc, Runnable
/*variable and method*/ - marks, show()
/*constants*/ - PIE, BRA
```



### Anonymous Object

- Unreferenced objects are called anonymous objects, and they can only be used once
because if we want to use it again, it will create another new object
*/
- `new A().show();`

### INHERITANCE
- is, has*/
- ex: Laptop has ram, cpu*/
- ex: Laptop is computer*/

- Parent class or Base class or Super class*/

- Child class or sub class or derived class*/

- For inheritance just class file is enough, no need to have the java file*/

- In java we can have multi level inheritance*/

- In java we dont have multiple inheritance because of ambiguity problem(if both parent
has the same method lets say show(), jvm don't know which method we are calling)*/

```java
public class Calc {
public int add(int a, int b) {
	return a + b;
}
public int sub(int a, int b) {
	return a - b;
}
}
public class AdvCalc extends Calc {
public int mul(int a, int b) {
	return a * b;
}
public int  div(int a, int b) {
	return a / b;
}
}
public class Demo {
public static void main(String[] args) {
	AdvCalc obj = new AdvCalc();
	int r1 = obj.add(4, 2);
	int r2 = obj.sub(4, 2);
	System.out.println(r1 + " " + r2 );
}
}
```


### METHOD OVERRIDING
- If both child and parent class has the methods with same name, child class mehod
overrides the parent class method*/

### PACKAGES

- A package is nothing but a folder*/

- If we want to use classes that are in different package/folder, we nee to import them*/

- By default in java, in every file we have*/
- `import java.lang.*;`

- After creating a package, we will host it in server for everyone in the internet can use it
for that we have to make it unique, for that we can simply reverse our website domain name*/
- `package com.google.calculation`

```java
import others.*; //this only imports all the files in others, it wont import folders in others
```
### ACCESS MODIFIERS

- `public, private, protected, default`

- If you want somting to be accessed outside of the package, it should be public*/

- private variables can only be used inside the same class, we can't use even if private
variable is in the same class */

- default means, can be use inside the same package*/

- protected variables acts like public only as long as they are in same package, in
different package we must extend the class inorder to use the protected variables*/

- make classes public, instance variables private, we can have only one public class inside
a file*/

### POLYMORPHISM

Same object have Many behaviours

Two types

	1. Compiletime polymorphism- early bindin- 
	2. Runtime polymorphism - late binding

compile time
-  we know whant thing will be executed at compile time itself
Happens in method overloading

run time
-   we know which method will be executed at run time only
Happens in method overriding*/

- Run time polymorphism using dynamic method dispatch*/

```java
// We can use parent reference variable and object of child class
class A {
public void show() {
	System.out.println("In A show");
}
}
class B extends A {
public void show() {
	System.out.println("In B show");
}
}


public class Demo {
public static void main(String[] args) {
	A obj = new A();
	obj.show();
	obj = new B();
	obj.show();  //same obj behaving differently
}
}
```


### final keyword*/

```java
final num = 10;// making constants with final, this value cannot be changed later
/*final classes cannot be extended*/
/*We can prevent method overriding by making it final*/

/*Object class*/

/*Every object in java extends Object class*/
``### 


```java
class Laptop {
String name = "Lenovo";
int price = 10000;
@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.name + ":" + this.price;
}
@Override
public boolean equals(Object that) {
	Laptop lap = (Laptop)that;
	// TODO Auto-generated method stub
	return this.name.equals(lap.name) && this.price ==  lap.price;
}
}


public class Demo {
public static void main(String[] args) {
	Laptop obj1 = new Laptop();
	Laptop obj2 = new Laptop();

	System.out.println(obj1); //here it calls obj1.toString()
	System.out.println(obj1.equals(obj2));

}
}
```


### Type casting
```java
//Downcasting
//Upcasting

public class Demo {
public static void main(String[] args) {
	double num = 4.5;
	int i = (int)num;//Downcasting

	System.out.println(i);

}
}

/*Type casting in OOPS*/

class A {
public void show1() {
	System.out.println("In A show");
}
}


class B extends A {
public void show2() {
	System.out.println("In B show");
}
}
public class Demo {
public static void main(String[] args) {
	A obj = new B(); //Upcasting
	obj.show1();
	B obj1 = (B) obj; //Downcasting
	obj1.show2();

}
}
```


### abstract keyword in java*/
- If you don't know how to define a method, you can simply delcare it as an absrtact method,

- We can have abstract method only in abstract class

- We cannot create  object of abstract class

- we can only create object of concrete class*/


```java
abstract class Car {  //Abstract class
public abstract void drive();
public void playMusic() {
	System.out.println("Playing Music...");
}
}
class WagonR extends Car { //Concrete class
public void drive() {
	System.out.println("Driving...");
}
}


public class Demo {
public static void main(String[] args) {
	WagonR obj = new WagonR();
	obj.drive();
	obj.playMusic();
}
}

/*Inner Class*/

class A {
int name = "Nithish";
public void show() {
	System.out.println("In A show");
}
class B {  //A$B.class file will be created
	public void config() {
		System.out.println("In B config");
	}
}
/*static class B {
	public void config() {
		System.out.println("In B config");
	}
}*/

}
public class Demo {
public static void main(String[] args) {
	A obj = new A();
	A.B obj1 = obj.new B(); //as B class is not static, we need object of A to create object of B class
	//A.B obj1=new A.B() if B is static class
}
}
/*We can only use static for inner class, not for outer class*/

/*Anonymous Inner class*/

/*If we want to extend a class just to override a method, instead of creating a new
class, we can use anonymous inner class*/


class A {
public void show() {
	System.out.println("In A show");
}

}
public class Demo {
public static void main(String[] args) {
	A obj = new A() {  //Anonymous Inner class, A$1.class file will be created
		public void show() {
			System.out.println("In new show");
		}
	};
	obj.show();
}
}

/*Using anonymous inner class with abstact class*/

abstract class A {
abstract public void show();

}
public class Demo {
public static void main(String[] args) {
	A obj = new A() { //implementing absract clas methods using anonymous class
		public void show() {
			System.out.println("In new show");
		}
	};
	obj.show();
}
}
```


### interface
- In abstract class we can have abstract methods and normal methods

- When we have an abstract class with only abstract methods, the other alternative for
that is to create an interface

- First of all, interface is not a class

- By default every method in interface is public abstract, so we don't have to mention it

- By default every variable in interface is final static, since it is final we need to initialize variables in the interface itseld

- We use interface to design a class

- interface variables are final static because what be instatiate is the class that implements the
interface and that too we can get to implement the methods, not the variables,so the interface
can't have the heap memory



- class -  class -> extends
- class - interface -> implements
- interface -  interface ->extends


```java
interface A {
String name = "Nithish"; // by default final,static
int age = 21;
void show(); //by default all methods are public abstract

}

interface B {
void config();
}

interface D extends B { //one interface can extend another interface

}
class C implements A, D { //one class can implements multiple interfaces
public void show() {
	System.out.println("showing...");
}
public void config() {
	System.out.println("In config...");
}
}
public class Demo {
public static void main(String[] args) {
	A obj = new C();  //Here we we can only call show(), as the reference is of A
	obj.show();
	obj.config();
	System.out.println(A.name);
}
}
```


- What is the need for the interface
- In this example we are generalising things using interface, the deleloper cannot say he
can only code in laptop only or desktop only


```java
interface Computer {
void code();
}
class Laptop implements Computer {
public void code() {
	System.out.println("code, compile, run");
}
}
class Desktop implements  Computer {
public void code() {
	System.out.println("code, compile, run: faster");
}
}

class Developer {
public void devApp(Computer obj) {
	obj.code();
}
}
class Demo {
public static void main(String[] args) {
	Computer comp = new Desktop();
	Developer Nithish = new Developer();

	Nithish.devApp(comp);
}
}
```


### enumeration (enums)

- enums are named constants ex: error codes*/

- enum is a class, but we cannot extend another class, apart from that we can define methods,
constructors, and create variables inside variables*/

- If enum cannot extend another class, then how we are getting all the methods like ordinal(), values() etc*/

- enum in java extends Enum class, and we are getting all the methods from Enum class


```java
enum Status {
Running, Failed, Pending, Success  //these are like default constuctors
}
class Demo {
public static void main(String[] args) {
	int i = 5;
	Status s = Status.Success;
	System.out.println(s);
	System.out.println(s.ordinal());
	Status statusArray[] = Status.values();
	for (Status stat : statusArray) {
		System.out.println(stat + ":" + stat.ordinal());
	}
}
}


```


### Comparing enums

```java
enum Status {
Running, Failed, Pending, Success
}
class Demo {
public static void main(String[] args) {

	Status s = Status.Success;


	switch (s) {
	case Running:
		System.out.println("All good");
		break;
	case Failed:
		System.out.println("Try again");
		break;
	case Pending:
		System.out.println("Please wait");
		break;
	default:
		System.out.println("Done");
		break;

	}
	// if (s == Status.Running) {
	//  System.out.println("All good");
	// } else if (s == Status.Failed) {
	//  System.out.println("Try again");
	// } else if (s == Status.Pending) {
	//  System.out.println("Please wait");
	// } else {
	//  System.out.println("Done");
	// }

}
}
```


### Giving values to the constants

```java
enum Laptops {
Macbook(1000), Xps(800), Surface, Thinkpad(400); //these are like four objects inside same class
private int price;
private Laptops() {
	this.price = 500;
}
private Laptops(int price) {
	this.price = price;

}
public void setPrice(int price) {
	this.price = price;
}
public int getPrice() {
	return price;
}
}
class Demo {
public static void main(String[] args) {
	Laptops obj = Laptops.Surface;
	System.out.println(obj);
	for ( Laptops lap : Laptops.values()) {
		System.out.println(lap + ":" + lap.getPrice());
	}

}
}

```


### Annotations

- Annotations simply means a supplement to the compiler/runtime

- We also call annotations as a meta data

- Sometime we want to say something to the compiler */

```java
class A {
public void show() {
	System.out.println("In A show");
}
}
class B extends A {
@Override
public void show() {  //Here if we write the spelling of show wrong, the compiler give us error
	System.out.println("In B show");
}
}
class Demo {
public static void main(String[] args) {
	B obj = new B();
	obj.show();

}
}
```

### Functional interface or Single Abstract Method Interface(SAM)*/

- For functional interface we can reduce the code using lamda expression while creating anonymous class*/

```java

@FunctionalInterface
interface A {
public void show(int x);
}


class Demo {
public static void main(String[] args) {
	A obj = x->
			System.out.println("In A show" + ":" + x);

	// A obj = new A() {
	//  public void show() {
	//      System.out.println("In A show");
	//  }
	// };
	obj.show(5);
}

}

/*If the method has only one statement and that too return statement, we don't have to use return
keyword in lamda expression*/


@FunctionalInterface
interface A {
public int show(int x, int y);
}


class Demo {
public static void main(String[] args) {
	A obj = (x, y) -> x + y;


	// A obj = new A() {
	//  public int show(int x, int y) {
	//      return x + y;
	//  }
	// };
	obj.show(5, 6);
}

}
```


### Types of Interfaces

1. Normal interface - two or more abstract methods

1. Functinal interface -  only one abstract method

1. Marker interface - Blank interface to update/give permission to the compiler


- After java 8, we got option of defining methods in interface

- Serialization -  saving the state of the object in hard disk
- De-serialization - restoring the object

- By default every object is not allow to do that, we have to give permision with the help
of marker interface*1.



### Exceptions

**Types of errors**

- Compiletime errors - synctatical errors
- Runtime errors - In runtime errors the execution will stop in between
- Logical errors - errors in our logic


Runtime errors are also called exceptions , and we need to handle those exceptions*/

Statements can be normal statements or critical statements*/

ArithmaticeException -> RuntimeException -> Exception -> Throwable*/

All names ends with able are interfaces, but Throwable only is a class*/

Search for types of exceptions hierarchy*/

```java
class Demo {
public static void main(String[] args) {
	int i = 1;
	int j = 0;
	int arr[] = new int[5];
	String str = null;

	try {
		j = 18 / i;   //We put critical statements in try block
		System.out.println(str.length());
		System.out.println(arr[5]);

	} catch (ArithmeticException e) {
		System.out.println("cannot divide by zero");

	} catch (ArrayIndexOutOfBoundsException e) {

		System.out.println("Array index limit reached");
	} catch (Exception e) {
		System.out.println("Something went wrong" + e);
	}
}
}
```

- Even if there is no exception we can call the catch block using throw keyword and creating
the object of the exception 


```java
class Demo {
public static void main(String[] args) {
	int i = 2;
	int j = 0;

	try {
		j = 18 / i; //here this won't raises exception
		if (i > 0) {
			throw new ArithmeticException("my custom message");
		}

	} catch (ArithmeticException e) {
		System.out.println("cannot divide by zero" + e);//here no only printing message, we can also write code

	} catch (Exception e) {
		System.out.println("Something went wrong" + e);
	}
}
}
```


- We can also create our own exception

```java
class NithishException extends Exception {
public NithishException(String str) {
	super(str); //we need to pass the message to super class constuctor
}
}

class Demo {
public static void main(String[] args) {
	int i = 2;
	int j = 0;

	try {
		j = 18 / i; //here this won't raises exception
		if (i > 0) {
			throw new NithishException("my custom message");
		}

	} catch (NithishException e) {
		System.out.println("Nithish exception occured " + e);

	} catch (Exception e) {
		System.out.println("Something went wrong" + e);
	}
}
}
```


### throws keyword

- we can duck the exception using throws keyword*/

- if a method throws an exception instead of handling the exception using try catch blocks
,we can duck the exception using throws keyword, so that the next method that calls the
method will have to handle the exception*/

- For unchecked exceptions,it's not compulsion for us to handle the exception
But for checked exception ex: IOexception , it is compulsory to handle it*/

```java
class A {
public void show() throws ClassNotFoundException {
	/*here instead of handling, we are ducking the exception so that it has to be handled
	by the next method that calls it, which is main method*/
	Class.forName("Calc");
}
}
class Demo {
public static void main(String[] args) {
	A obj = new A();

	try {
		obj.show();

	} catch (ClassNotFoundException e) {
		System.out.println("Calc class in not foung" + e);
		e.printStackTrace();

	}
}
}

```


### How to take input from the user*/

- out is the object of print stream which is created as a static variable inside System class*/

```java
import java.io.IOException;

class Demo {
public static void main(String[] args) throws IOException {
	int num = System.in.read();  //this returns Ascii value
	System.out.println(num - 48);
}
}
/*Taking input using BufferedReader*/

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

class Demo {
public static void main(String[] args) throws IOException {
	InputStreamReader in = new InputStreamReader(System.in);
	BufferedReader bf = new BufferedReader(in);
	int num = Integer.parseInt(bf.readLine());
	System.out.println(num);

	bf.close(); //closing the resource
}
}

/*Taking input using Scanner*/

//import java.util.Scanner;

class Demo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	System.out.println(num);
	sc.close();
}
}
```


### Using try with finally

```java
/*we can use try with finally, without catch block*/

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

class Demo {
public static void main(String[] args) throws IOException {
	int num;

	BufferedReader br = null;
	try {
		br = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(br.readLine());
		System.out.println(num);
	} finally {
		br.close(); //closing the resourse manually
	}
}
}

/*We can also close the resourse without using finally block*/

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

class Demo {
public static void main(String[] args) throws IOException {
	int num;
	//initialize the resourse that you want to close automatically
	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

		num = Integer.parseInt(br.readLine());
		System.out.println(num);
	}
}
}
```


### Threads*/


```java
class A extends Thread {
public void run() {
	for (int i = 0; i < 10; i++) {
		System.out.println("hi");
		try {
			Thread.sleep(10);   //trying to optimise the threads

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
}

class B extends Thread {
public void run() {
	for (int i = 0; i < 10; i++)
		System.out.println("hello");
}
}
class Demo {
public static void main(String[] args) {
	A obj1 = new A(); //obj1 and obj2 are two threads
	B obj2 = new B();
	/*suggesting the schedular about the thread priority*/
	obj2.setPriority(Thread.MAX_PRIORITY);
	obj1.start();
	try {
		Thread.sleep(5);

	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	obj2.start();
	//Using thread priority we can tell the schedular
	System.out.println(obj1.getPriority());
	//1 is the least priority
	//5 is the normal priority
	//10 is the highest priority

}
}
```


- This idea of extending Thread class is not a good idea, as won't be able to extend any
other class*/

- We can implement a Runnable interface, the Runnable interface will not have Thread methods
we need to create thread objects also*/

- As Runnable is a functional interface, we can further reduce this code using lamda expression*/

```java
class A implements Runnable {
public void run() {
	for (int i = 0; i < 10; i++) {
		System.out.println("hi");
		try {
			Thread.sleep(10);   //trying to optimise the threads

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
}

class B implements Runnable {
public void run() {
	for (int i = 0; i < 10; i++) {
		System.out.println("hello");
		try {
			Thread.sleep(10);   //trying to optimise the threads

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}
class Demo {
public static void main(String[] args) {
	Runnable obj1 = new A();
	Runnable obj2 = new B();
	Thread t1 = new Thread(obj1);
	Thread t2 = new Thread(obj2);
	t1.start();
	t2.start();

}
}

```


### Race condition

- Thread safe-  only one thread can access/change the variable at one time

- We can prevent race condition by using the keyword synchronized


```java
class Count {
int counter;
public synchronized void increment() { //only one thread can call this method at one time
	counter++;
}
}

class Demo {
public static void main(String[] args) throws InterruptedException {
	Count c = new Count();
	Runnable obj1 = () -> {
		for (int i = 0; i < 1000; i++) {
			c.increment();
		}

	};

	Runnable obj2 = () -> {
		for (int i = 0; i < 1000; i++) {
			c.increment();
		}
	};
	Thread t1 = new Thread(obj1);
	Thread t2 = new Thread(obj2);
	t1.start();
	t2.start();

	/*If we don't mention this, the main thread will execute the println statement first
	as it is free, we are asking main thread to wait while t1,t2 finish*/
	t1.join();
	t2.join();

	System.out.println(c.counter);

}
}
```



### Thread States 
New

Runnable

Running

Waiting

Dead


### Collections in Java

Collection API -  concept using which we can implement various data structures
Collection - interface
Collections - Class
*/

Collection -  interface

- List - interface
	- ArrayList - Class that implements List
	- LinkedList - Class that implements List

- Queue - interface
	- DeQueue - Class that implements Queue

- Set - interface
	- HashSet - Class that implements Set
	- LinkedHashSet - Class that implementsS
*/

1. By default Collection works with the object type, if we want to store specific datatype we need to mention it in
with the help of genrics i.e <>*/


1. Without generic the collection interface works with Object type
1. Collection dont support index valus*/
1. ArrayList implements List, with supports index values*/
1. List also supports duplicate values*/
1.  Set won't support duplicate values, elements are not stored in order*/
1. Collection extens another interface called Iterable, in which we have iterator() method*/

```java
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


class Demo {
public static void main(String[] args) {


	// Collection <Integer> nums = new ArrayList<Integer>();
	//If we specify generic on lefthand side, it is not mandatory to specify it on righthand side
	List<Integer> nums = new ArrayList<Integer>();
	Set<Integer> s = new HashSet<Integer>();
	Set<Integer> s1 = new TreeSet<Integer>(); //stores elements in sorted format
	nums.add(3);
	nums.add(5);
	nums.add(9);
	nums.add(2);

	Iterator<Integer> it = nums.iterator(); //iterator() method gives Iterator object

	while (it.hasNext())
		System.out.println(it.next());

	System.out.println(nums.get(1));

	for (int num : nums) {
		System.out.println(num);
	}


}
}
```


- Map is an interface,  it donesnot extend Collection interface, but it is a part of Collection Api*/
- Map is a collection of key value pair*/

Map - interface

HashMap - Class that implements Map

Hashtable - it is synchronized


```java
import java.util.HashMap;
import java.util.Map;

class Demo {
public static void main(String[] args) {
	Map <String, Integer> students = new HashMap<>();
	students.put("Nithish", 100);
	students.put("Phani", 84);
	students.put("Harsh", 49);
	students.put("Navin", 92);

	for (String key : students.keySet()) {
		System.out.println(key + " : " + students.get(key));
	}
	System.out.println(students.values());

}
}



/*How to sort a collection*/

/*We can sort the values in a collection based on our own logic using Comparator object*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Demo {
public static void main(String[] args) {
	List<Integer> nums = new ArrayList<>();
	Comparator<Integer> com = new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			/*Swapping based on unit digit number*/
			if (o1 % 10 > o2 % 10)
				return 1;  //swap
			else
				return -1;  //don't swap
		}
	};
	nums.add(83);
	nums.add(92);
	nums.add(96);
	nums.add(72);
	nums.add(27);
	/*In Collections class we have various methods we can use*/
	Collections.sort(nums);
	System.out.println(nums);
	Collections.sort(nums, com);
	System.out.println(nums);

}
}

```



- In above example sorting is working for Integer collection as by default Integer implements Comparable
interface
- So if we create our own class, lets say Student, and we have created a students collection, we can
sort our students either by using Comparator object or by implementing Comparable interface in our
Student class

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
int age ;
String name;
public Student(int age, String name) {
	this.age = age;
	this.name = name;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.name + " : " + this.age;
}
@Override
public int compareTo(Student that) {
	/*Swapping based on age*/
	if (this.age > that.age)
		return 1;  //swap
	else
		return -1;  //don't swap
}
}
class Demo {
public static void main(String[] args) {
	List <Student> studs = new ArrayList<>();

	/*As Comparator is functional interface, we can reduce this code using lamda expression*/
	Comparator<Student> com = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			/*Swapping based on age*/
			if (o1.age > o2.age)
				return 1;  //swap
			else
				return -1;  //don't swap
		}
	};
	studs.add(new Student(21, "Nithish"));
	studs.add(new Student(23, "Phani"));
	studs.add(new Student(43, "Suresh"));
	studs.add(new Student(26, "Rajesh"));
	studs.add(new Student(24, "Satish"));

	// Collections.sort(studs, com);
	Collections.sort(studs);

	System.out.println(studs);

}
}
```


### Stream Api

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Demo {
public static void main(String[] args) {
	List <Integer> nums = Arrays.asList(4, 7, 8, 3, 9, 2);

	/*Three ways we can work on nums elements*/
	for (int i = 0; i < nums.size(); i++) {
		System.out.println(nums.get(i));
	}

	for (int num : nums) {
		System.out.println(num);
	}

	nums.forEach(n->System.out.println(n));

}
}
```


### forEach meth

- forEach method takes object of a Consumer interface*/

- Since Consumer is a functional interface, we can implement the abstract method void accept()
using an anonymous class and we can pass to the forEach() method*/

```java
import java.util.List;
import java.util.function.Consumer;
import java.util.Arrays;

class Demo {
public static void main(String[] args) {
	List <Integer> nums = Arrays.asList(4, 7, 8, 3, 9, 2);

	Consumer<Integer > con = new Consumer<Integer>() {
		public void accept(Integer n) {
			System.out.println(n);
		}
	};

	nums.forEach(con);

	/*We can reduce the above code by simply using lamda expression*/

	nums.forEach(n->System.out.println(n));
}
}
```


- Stream is an interface*/
- Once you use the stream, you cannot reuse it*/
- stream provides lot of methods that we can use it like map(), filter(), reduce()*/


```java
import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

class Demo {
public static void main(String[] args) {
	List <Integer> nums = Arrays.asList(4, 7, 8, 3, 9, 2);
	int result = nums.stream()
				 .filter(n -> n % 2 == 0)  //takes object of Predicate interface
				 .map(n->n * 2) //takes object of Function interface
				 .reduce(0, (c, e)->c + e); /*0 is the intitial value, c is carry and e is the element*/
	System.out.println(result);

	/*To get sorted values*/
	Stream<Integer> sortedValues = nums.stream()
								   .filter(n -> n % 2 == 0)
								   .map(n->n * 2)
								   .sorted();
	sortedValues.forEach(n-> System.out.print(n));
	System.out.println();

	/*What if want to do filtering with multiple threads, we can use parallelStream*/
	/*use only if you want to filter, don't use parallel stream if you want to sort the stream values*/
	Stream<Integer> ps = nums.parallelStream()
						 .filter(n->n % 2 == 0);
	ps.forEach(e->System.out.print(e));

}
}

```





