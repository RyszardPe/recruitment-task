package com.ryspie.tasks.task_3.messagesProvider;

import java.util.Locale;

public class MainLoopCommandComparator {
    public static boolean compareCommands(String command, MainLoopCommand next) {
        if (command.toLowerCase(Locale.ROOT).equals(String.valueOf(next).toLowerCase(Locale.ROOT)))
            return true;
        return false;
    }
}
