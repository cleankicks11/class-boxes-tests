public class ChildClass extends ParentClass {
  int id;
  int age;
  String className;
  boolean isCon;

  //constructor
  ChildClass(int id, String newClassName){
    this.id = id;
    className = newClassName;
  }

  //constructor overload
  ChildClass(int id, String newClassName, boolean isCon){
    this.id = id;
    className = newClassName;
    this.isCon = isCon;
  }

  //method
  void className() {
    System.out.println("I am the " + className + ", my id: " + id + ", has constructor: " + isCon);
  }

  //exception used in method to catch problems custom
  void isConstParam() throws ExceptionClass {
    if(isCon){
      throw new ExceptionClass("Exception: Constructor Parameter found!");
    }
  }

  //Method overridding
  @Override
  public void greeting(){
    System.out.println("Hello my name is: " + name + ", i'm " + age);
  }
}
