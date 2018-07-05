/**
 * Created by sbt-panichev-sl on 20.06.2018.
 */
public class Main {
    public static void main(String[] args) {
        Shell_help s = new Shell_help();
        s.addCommand(new TimeCommand());
        s.addCommand(new DateCommand());
        s.addCommand(new ExitCommand());
        s.addCommand(new HelpCommand());
        s.runShell_help();
    }
}
