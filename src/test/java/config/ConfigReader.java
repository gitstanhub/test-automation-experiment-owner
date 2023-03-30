package config;

import org.aeonbits.owner.ConfigFactory;

public enum ConfigReader {
    INSTANCE;

    private static final ApplicationConfig applicationConfig = ConfigFactory.create(
            ApplicationConfig.class, System.getProperties());

    public ApplicationConfig read() {
        return applicationConfig;
    }
}
