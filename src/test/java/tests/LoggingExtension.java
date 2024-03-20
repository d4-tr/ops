package tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.util.Collections;

public class LoggingExtension implements BeforeEachCallback {
    private static final Logger LOGGER = LogManager.getLogger(LoggingExtension.class);

    @Override
    public void beforeEach(ExtensionContext context) {
        String test = context.getRequiredTestMethod().getName();
        String testClass = context.getTestClass().get().getName();
        LOGGER.info(String.join("", Collections.nCopies(80, "#")));
        LOGGER.info("Starting: " + testClass + "." + test);
    }
}
