/**
 * Created by sbt-panichev-sl on 20.06.2018.
 */
public class HelpCommand implements Command {
    @Override
    public String getName() {
        return "help";
    }

    @Override
    public void execute(String[] args) {
        System.out.println("help - список команд и краткое описание");
        System.out.println();
        System.out.println("time - отображение текущего времени");
        System.out.println();
        System.out.println("date - отображение текущей даты");
        System.out.println();
        System.out.println("exit - выход из программы");
    }
}
