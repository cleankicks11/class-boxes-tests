interface EngineInterface {
  //public static final implied in interface method and variables
  String name = "The V12 Engine";

  public void engine();

  public static void dealer(){
    System.out.println(name+" Is our best engine");
  }
}
