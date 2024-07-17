public class Child extends ParentClass {
  int age;

  //Method overridding
  @Override
  public void greeting(){
    System.out.println("Hello my name is: " + name + ", i'm " + age);
  }
}
