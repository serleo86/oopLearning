/**
 * Created by sbt-panichev-sl on 20.06.2018.
 */
public class ExitCommand implements Command {
    @Override
    public String getName() {
        return "exit";
    }

    @Override
    public void execute(String[] args) {
        System.exit(0);
    }
}
