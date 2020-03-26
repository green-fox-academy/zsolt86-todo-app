package todo;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ToDoRead {
  int counter = 0;
  static Path filePath = Paths.get("textFiles/myToDo.txt");

  public ToDoRead() throws FileNotFoundException {
    Scanner readFile = new Scanner(new File(String.valueOf(filePath)));

    if (!readFile.hasNextLine()) {
      System.out.println("No todos for today! :)");
    } else {
      while (readFile.hasNextLine()) {
        counter++;
        System.out.println(counter + " - " + readFile.nextLine());
      }
      }
    }
}

