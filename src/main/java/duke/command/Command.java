package duke.command;

import duke.BobException;
import duke.Storage;
import duke.TaskList;
import duke.Ui;

/**
 * Represents a command from the user.
 */
public abstract class Command {
    public static final Command noop = new NoopCommand();

    /**
     * Executes the command.
     *
     * @param tasks The list of tasks for the command to interact with.
     * @param ui The ui for the command to interact with.
     * @param storage The storage for the command to interact with.
     */
    public abstract void execute(TaskList tasks, Ui ui, Storage storage) throws BobException;

    /**
     * Returns whether the program should exit after execution.
     *
     * @return Whether the program should exit after execution.
     */
    public boolean isExit() {
        return false;
    };
}
