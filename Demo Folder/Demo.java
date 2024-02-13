class Human {

  private int age;  //Whenever you create an instance vairable, make it private
  private String name; //private variables can only be accessed from the same class only
  public int getAge() {
    return age;
  }
  public String getName() {
    return name;
  }
  public void setAge(int age, Human ob) {
    ob.age = age;
  }
  public void setName(String name) {
    this.name = name;
  }

}

class Demo {
  public static void main(String args[]) {
    Human obj = new Human();
    obj.setAge(21, obj);
    obj.setName("Nithish");
    System.out.println(obj.getName() + ":" + obj.getAge());

  }
}
