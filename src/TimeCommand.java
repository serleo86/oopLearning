import java.time.LocalTime;

/**
 * Created by sbt-panichev-sl on 20.06.2018.
 */
public class TimeCommand implements Command {
    @Override
    public String getName() {
        return "time";
    }

    @Override
    public void execute(String[] args) {
        System.out.println(LocalTime.now());
    }
}
