class PointGuardPlayer extends BasketBall {

  public PointGuardPlayer(String name){
    super(name);
  }

  @Override
  public void dribble(){
    System.out.println(name + " Dribbles");
  }
}
