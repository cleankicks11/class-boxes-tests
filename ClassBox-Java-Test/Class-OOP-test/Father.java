public class Father {
  String name;
  private String tool = "Saws-all";

  public void greeting(){
    System.out.println("Hello im the " + name + " class!");
  }

  public void chore(){
    System.out.println("Im the father. I do the heavy lifting and work the "+tool);
  }

  public String getTool(){
    return tool;
  }

  public void setTool(String tool){
    this.tool = tool;
  }
}
