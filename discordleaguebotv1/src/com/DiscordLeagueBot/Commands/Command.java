package com.DiscordLeagueBot.Commands;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;

public interface Command {
    Boolean called(String[] args, GuildMessageReceivedEvent e);
    void action(String[] args, GuildMessageReceivedEvent e);
    String usage();
    String descripition();
    void executed(boolean success, GuildMessageReceivedEvent e);
}
