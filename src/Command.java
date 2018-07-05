/**
 * Created by sbt-panichev-sl on 20.06.2018.
 */
public interface Command {
    String getName();
    void execute (String [] args);
}
