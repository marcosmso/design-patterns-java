public class NoCommand implements Command {
    
    public NoCommand() {

    }   
    
    public void execute() {
        System.out.println("Dummy button");
    }

    public void undo(){}
}
