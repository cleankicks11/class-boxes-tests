class CenterPlayer extends BasketBall {

  public CenterPlayer(String name){
    super(name);
  }

  @Override
  public void dribble(){
    System.out.println(name + " Dribbles");
  }
}
