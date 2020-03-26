package todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class ToDo {

  public static void main(String[] args) throws IOException {

    if (args.length <= 0) {
      System.out.println("\tCommand Line Todo application\n\t=============================\n\n\tCommand line arguments:");
      System.out.println("\t-l\tLists all the tasks\n\t-a\tAdds a new task\n\t-r\tRemoves an task\n\t-c\tCompletes an task");

    } else {
      String menu = args[0];

      switch (menu) {
        case "-l":
          new ToDoRead();
          break;
        case "-a":
          if (args.length == 1) {
            System.out.println("Unable to add: no task provided");
          } else {
            String addToDo = "\n" + args[1];
            Files.write(ToDoRead.filePath, addToDo.getBytes(), StandardOpenOption.APPEND);
          }
          break;
        case "-r":
          System.out.println("Removes an task");
          break;
        case "-c":
          System.out.println("Completes an task");
          break;
        default:
          System.out.println("\tUnsupported argument!\n\t-l\tLists all the tasks\n\t-a\tAdds a new task\n\t-r\tRemoves an task\n\t-c\tCompletes an task");
      }
    }


  }
}
