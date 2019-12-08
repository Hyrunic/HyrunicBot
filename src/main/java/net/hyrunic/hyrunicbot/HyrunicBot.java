package net.hyrunic.hyrunicbot;

import net.dv8tion.jda.api.JDA;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public final class HyrunicBot {

    private static JDA client;
    private static String directory;

    public static void main(String[] args)throws Exception{
        Logger logger = (Logger) LoggerFactory.getLogger(Logger.class);
        logger.setLevel(Level.INFO);
        directory = new File(HyrunicBot.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getParent();
        directory = directory.replace("%20", " ");

    }

}
