package com.oblivioussp.spartanshields.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.oblivioussp.spartanshields.ModSpartanShields;

public class Log
{
    private static final Logger LOG = LogManager.getLogger(ModSpartanShields.NAME);

    public static void info(Object message) { LOG.info(message); }
    public static void warn(Object message) { LOG.warn(message); }
    public static void error(Object message) { LOG.error(message); }
    public static void fatal(Object message) { LOG.fatal(message); }
    public static void debug(Object message) { LOG.debug(message); }
}
