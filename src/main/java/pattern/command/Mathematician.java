package pattern.command;

public interface Command {
    public abstract void execute();
}

public class Calculator {
    private Command command;
    public Calculator calculator(command){
        setCommand(command);
    }
    public void setCommand(Command newCommand){
        this.command = newCommand;
    }
    public void pressed(){
        command.execute();
    }
}

public class Adder {
    public int Addition(Integer a, Integer b) {
        return a + b;
    }
}

public class AdderOnCommand implements Command{
    private Adder adder;
    public AdderOnCommand(Calculator calculator){

    }
}
public class Mathematician {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Command adderoncommand = new AdderOnCommand(calculator);

        Calculator calculator1 = new Calculator(adderoncommand);


    }
}
