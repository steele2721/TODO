import org.apache.commons.lang3.CharUtils;
import utils.CommandLineInput;
import utils.CommandLineInputHandler;
import org.apache.commons.lang3.CharUtils.*;

public class ToDoApp {
    private static final char DEFAULT_INPUT = '\u0000';

    public static void main(String args[]) {
        CommandLineInputHandler commandLineInputHandler = new CommandLineInputHandler();
        char command = DEFAULT_INPUT;

        while (CommandLineInput.EXIT.getShortCmd() != command) {
            commandLineInputHandler.printOptions();
            String input = commandLineInputHandler.readInput();
            command = CharUtils.toChar(input, DEFAULT_INPUT);
            CommandLineInput commandLineInput = CommandLineInput.getCommandLineInputForInput(command);
            commandLineInputHandler.processInput(commandLineInput);
        }
    }
}
