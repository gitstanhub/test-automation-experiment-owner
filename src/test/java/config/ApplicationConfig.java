package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:configuration/application.properties",
        "system:properties",
        "classpath:configuration/${env}.properties"
})
public interface ApplicationConfig extends Config {

    @Key("browserName")
    BrowserName browserName();

    @Key("browserSizeWidth")
    int browserSizeWidth();

    @Key("browserSizeHeight")
    int browserSizeHeight();

    @Key("isRemote")
    boolean isRemote();

    @Key("remoteURL")
    String remoteURL();

    @Key("baseURL")
    String baseURL();

    @Key("${country}.country")
    String country();

    @Key("${country}.selectedMBPModelDescription")
    String selectedMBPModelDescription();
}
