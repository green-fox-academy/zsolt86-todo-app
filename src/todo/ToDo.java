package todo;

import java.io.FileNotFoundException;

public class ToDo {
  public static void main(String[] args) throws FileNotFoundException {

    if (args.length <= 0) {
      System.out.println("\tCommand Line Todo application\n\t=============================\n\n\tCommand line arguments:");
      System.out.println("\t-l\tLists all the tasks\n\t-a\tAdds a new task\n\t-r\tRemoves an task\n\t-c\tCompletes an task");
    } else {
      char menu = args[0].charAt(1);

      switch (menu) {
        case 'l':
          new ToDoRead();
          break;
        case 'a':
          System.out.println("Adds a new task");
          break;
        case 'r':
          System.out.println("Removes an task");
          break;
        case 'c':
          System.out.println("Completes an task");
          break;
        default:
          System.out.println("\tUnsupported argument!\n\t-l\tLists all the tasks\n\t-a\tAdds a new task\n\t-r\tRemoves an task\n\t-c\tCompletes an task");
      }
    }


  }
}
