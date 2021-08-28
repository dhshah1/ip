package duke.parser;

import duke.command.AddDeadlineCommand;
import duke.command.AddEventCommand;
import duke.command.AddTodoCommand;
import duke.command.Command;
import duke.command.DeleteCommand;
import duke.command.DoneCommand;
import duke.command.ExitCommand;
import duke.command.FindCommand;
import duke.command.ListCommand;
import duke.command.MalformedCommandException;
import duke.command.UnsupportedCommandException;

/**
 * Responsible for parsing of command line user input.
 */
public class Parser {
    /**
     * Parses and returns the command represented by the user input.
     *
     * @param userInput String input provided by user.
     * @return user command
     * @throws UnsupportedCommandException If user command is not supported.
     * @throws MalformedCommandException If a supported user command has the wrong format.
     */
    public static Command parse(String userInput) throws UnsupportedCommandException, MalformedCommandException {
        String[] userInputSplit = userInput.split(" ", 2);
        String userCommand = userInputSplit[0];

        switch (userCommand){
        case ListCommand.COMMAND_IDENTIFIER:
            return ListCommand.create();
        case DoneCommand.COMMAND_IDENTIFIER:
            return DoneCommand.create(userInput);
        case DeleteCommand.COMMAND_IDENTIFIER:
            return DeleteCommand.create(userInput);
        case AddTodoCommand.COMMAND_IDENTIFIER:
            return AddTodoCommand.create(userInput);
        case AddDeadlineCommand.COMMAND_IDENTIFIER:
            return AddDeadlineCommand.create(userInput);
        case AddEventCommand.COMMAND_IDENTIFIER:
            return AddEventCommand.create(userInput);
        case FindCommand.COMMAND_IDENTIFIER:
            return FindCommand.create(userInput);
        case ExitCommand.COMMAND_IDENTIFIER:
            return ExitCommand.create();
        default:
            throw new UnsupportedCommandException("OOPS!!! I'm sorry, but I don't know what that means :-(");
        }
    }
}
