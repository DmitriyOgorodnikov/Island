package island.Explorer;


import island.world.World;
import java.util.ArrayList;

public class Explorer {

  private World world;
  private ArrayList<String> cartographer = new ArrayList<>();

  public Explorer(World world){
    this.world = world;
  }

  /*
   * Explore the map and return the number of Islands found
   */
  public int explore(){
    int foundIsland = 0;
    int height = world.getHeight();
    int width = world.getWidth();
    char[][] tmpMap = world.getWorldMap();

    for (int i = 0; i < height; i++){
      for (int z = 0; z < width; z++){
        if ('*' == tmpMap[i][z]){
          String coordinate = translateToCoordinate(i,z);
          if (!cartographer.contains(coordinate)){
            foundIsland++;
            islandExplore(tmpMap, i, z);
          }
        }
      }
    }
    return foundIsland;
  }

  /*
   * The survey found the Islands
   */
  private void islandExplore(char[][] worldMap, int i, int z){
    String coordinate = translateToCoordinate(i,z);
    if ( ('*' == worldMap[i][z]  ) && !(cartographer.contains(coordinate)) ){
      cartographer.add(coordinate);
      islandExplore(worldMap, i + 1, z);
      islandExplore(worldMap, i - 1, z);
      islandExplore(worldMap, i, z + 1);
      islandExplore(worldMap, i, z - 1);
    }
  }

  private String translateToCoordinate(int i, int z){
    return "H:" + i + "," + "W:" + z;
  }

}
