package todo;

public class ToDo {
  public static void main(String[] args) {
    if (args.length <= 0) {
      System.out.println("\tCommand Line Todo application\n\t=============================\n\n\tCommand line arguments:");
      System.out.println("\t-l   Lists all the tasks\n\t-a   Adds a new task\n\t-r   Removes an task\n\t-c   Completes an task");
    } else {
      char menu = args[0].charAt(1);

      switch (menu) {
        case 'l':
          System.out.println("Lists all the tasks");
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
          System.out.println("Invalid argument");
      }
    }

  }
}
