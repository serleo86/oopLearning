import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by sbt-panichev-sl on 20.06.2018.
 */
public class Shell_help {
    private Map<String, Command> comm = new HashMap<>();

    public void addCommand (Command c) {
        comm.put(c.getName(), c);
    }
    public void runShell_help () {
        Scanner sca = new Scanner(System.in);
        while (true){
            System.out.print(">" );
            String commandName = sca.nextLine();
            if (comm.containsKey(commandName))
                comm.get (commandName).execute (new String [] {});
            else
                System.out.println("Такая команда отсутствует " + commandName);
        }
    }

}
