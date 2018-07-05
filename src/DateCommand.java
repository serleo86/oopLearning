import java.time.LocalDate;

/**
 * Created by sbt-panichev-sl on 20.06.2018.
 */
public class DateCommand implements Command{

    @Override
    public String getName() {
        return "date";
    }

    @Override
    public void execute(String[] args) {
        System.out.println(LocalDate.now());
    }
}
