abstract class BasketBall {
  String name;

  //abstract class can have constructor
  public BasketBall(String name){
    this.name = name;
  }

  //abstract method
  public abstract void dribble();

  //abstract class with concrete method
  public void shoot(){
    System.out.println(name + " shoots and scores!");
  }
}
