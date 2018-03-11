package island.world;


public class World {

  private Integer height;
  private Integer width;
  private char[][] worldMap;

  public World(Integer height, Integer width, char[][] worldMap){
    this.height = height;
    this.width = width;
    this.worldMap = worldMap;
  }

  public void setHeight(Integer height){
    this.height = height;
  }

  public Integer getHeight(){
    return this.height;
  }

  public void setWidth(Integer width){
    this.width = width;
  }

  public Integer getWidth(){
    return this.width;
  }

  public void setWorldMap(char[][] worldMap){
    this.worldMap = worldMap;
  }

  public char[][] getWorldMap(){
    return this.worldMap;
  }

}
