package duke.command;

import duke.task.TaskList;
import duke.ui.Ui;

/**
 * Represents a command provided by the user.
 */
public interface Command {
    /**
     *
     * @param tasks List of user's tasks.
     * @param ui Ui object to handle display of message to user.
     * @throws MalformedCommandException If command could not be executed successfully.
     */
    void execute(TaskList tasks, Ui ui) throws MalformedCommandException;

    /**
     * Returns true if command should stop the chatbot.
     *
     * @return true if command should stop the chatbot.
     */
    boolean isExit();
}

