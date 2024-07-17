class FerrariClass implements EngineInterface, TransmissionInterface{
  String name;

  FerrariClass(String name){
    this.name = name;
  }

  @Override
  public void engine(){
    System.out.println(name+", Has V12 offroad only ferrari!");
  }

  @Override
  public void trans(){
    System.out.println(name+", Has paddle shift F1 gear box!");
  }
}
