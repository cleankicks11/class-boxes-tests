import java.util.*;

class Main {

  public static void main(String[] args){
    //Instatiate child class in project folder
    try{
      ChildClass child = new ChildClass(1, "ChildClass", true);
      child.className();
      child.isConstParam();
      child.className();

    }catch(ExceptionClass e){
      e.printStackTrace();
    }

  
      ParentClass parent = new ParentClass();
      parent.name = "iParent";
      parent.greeting();

      Child child2 = new Child();
      child2.name = "iChild";
      child2.age = 39;
      child2.greeting();

    //Interitence with father and son classes, initialize and inherit name variable and greet method
    Father pa = new Father();
    pa.name = "Pa";
    pa.greeting();
    //Encapsulation test with tool variable
    pa.chore();
    //Private access modifier - encapsulation test
    //System.out.println(pa.tool);
    pa.setTool("Welder");
    System.out.println("Father pa object is currently holding tool: "+pa.getTool());
    //Reset object state variable with getter mutator method
    pa.setTool("Pressure Washer");
    System.out.println("Father pa object is currently holding tool: "+pa.getTool());

    Son son = new Son();
    son.name = "Son";
    son.greeting();

    //List COllection interface
    List<String> nameList = new ArrayList<>();
    nameList.add("Char one");
    nameList.add("Char two");
    nameList.add("Char three");
    //insert element at index
    nameList.add(0, "New guy cut in!");
    nameList.remove(1);
    System.out.println("the list size is: " + nameList.size());

    Collections.sort(nameList);

    for(String names : nameList){
      System.out.println("List name: " + names);
    }

    Collections.reverse(nameList);

    for(int i = 0; i < nameList.size(); i++){
      System.out.println("Reverse List: " + nameList.get(i));
    }

    add(1,2);
    add(9,9,9);
    add(1.1,2.5,3.8);

    Son sonCast = new Son();
    Cousin cousinCast = new Cousin();
    cast(sonCast);
    cast(cousinCast);
    cast2(sonCast);
    cast2(cousinCast);

    //Abstarct classes test - basketball
    CenterPlayer center = new CenterPlayer("wilt");
    PointGuardPlayer pointGuard = new PointGuardPlayer("Mike");
    System.out.println(center.name);
    System.out.println(pointGuard.name);
    center.shoot();
    pointGuard.shoot();
    center.dribble();
    pointGuard.dribble();
    
    //interface test - ferrari class implements interface hidden car attributes
    FerrariClass enzo = new FerrariClass("enzo");
    enzo.engine();
    enzo.trans();
    //Can call interface method from project folder
    //static method must be called from interface itself
    EngineInterface.dealer();
  }   
    //Method Overloading - in two addmethods
    public static void add(int first, int second){
      System.out.println("First: "+first+", plus second: "+second+", equals = "+first+second+".");
    }

    //Method doing the overload with more parameters
    public static void add(int first, int second, int third){
      System.out.println("First: "+first+", plus second: "+second+", plus third "+third+" equals = "+first+second+third+"!");
    }

    //method overload by type of parameter 
    public static void add(double first, double second, double third){
      System.out.println(first+second+third);
    }
  
    //Casting objects - upcast from Father class object to subclasses
    public static void cast(Father father){
      father.chore();
    }

    //Casting object with conditional
    public static void cast2(Father father){
      if(father instanceof Son){
        Son sonDownCast = (Son)father;
        System.out.println("Down cast Son class. I use a "+sonDownCast.tool);
      } else if (father instanceof Cousin){
        Cousin cousinDownCast = (Cousin)father;
        System.out.println("Down cast of Cousin class. I use a "+cousinDownCast.tool);
      }
    }
}
