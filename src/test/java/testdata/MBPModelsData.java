package testdata;

import base.PlaywrightDriverHandler;
import config.ApplicationConfig;

public class MBPModelsData {
    protected ApplicationConfig applicationConfig = PlaywrightDriverHandler.getApplicationConfig();
    public final String MBP16_MODEL_DESCRIPTION = applicationConfig.selectedMBPModelDescription();
}
