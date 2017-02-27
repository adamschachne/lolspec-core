package com.DiscordLeagueBot.Commands;

import java.util.HashMap;

public class CommandHandler {
    public static final CommandParser parser = new CommandParser();
    public static HashMap<String, Command> commands = new HashMap<String, Command>();

    public static void handleCommand(CommandParser.CommandContainer cmd){
        if (commands.containsKey(cmd.invoke)) {
            Boolean safe = commands.get(cmd.invoke).called(cmd.args, cmd.e);

            if (safe) {
                commands.get(cmd.invoke).action(cmd.args,cmd.e);
                commands.get(cmd.invoke).executed(safe,cmd.e);

            }
            else {
                commands.get(cmd.invoke).executed(safe,cmd.e);
            }
        }
    }
    
    public static void handleCommand2(CommandParser.CommandContainer cmd){
        if (commands.containsKey(cmd.invoke)) {
            Boolean safe = true;

            if (safe) {
                commands.get(cmd.invoke).action2(cmd.args);
                commands.get(cmd.invoke).executed2(safe);

            }
            else {
                commands.get(cmd.invoke).executed2(safe);
            }
        }
    }
}
