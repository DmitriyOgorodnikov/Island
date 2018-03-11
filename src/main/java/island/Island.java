package island;

import island.Explorer.Explorer;
import island.creator.CreatorWorld;
import island.world.World;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class Island {

  public static void main(String[] args) throws IOException {

    CreatorWorld creatorWorld = new CreatorWorld();

    World world = creatorWorld.create();

    Explorer explorer = new Explorer(world);

    System.out.println(explorer.explore());
  }
}
