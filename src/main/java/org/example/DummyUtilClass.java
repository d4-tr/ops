package org.example;

import java.util.logging.Logger;

public final class DummyUtilClass {

    private static Logger logger = Logger.getLogger(DummyUtilClass.class.getName());
    public static void doOperationA(final int i) {
        logger.info(String.format("%d", i));
    }

    public static void doOperationB(final boolean b) {

    }
}
