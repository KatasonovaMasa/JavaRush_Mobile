package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:src/main/resources/config/test.properties"
})
public interface MobileConfig extends Config {

    @Key("browserstack.username")
    String username();

    @Key("browserstack.passwordKey")
    String passwordKey();

    @Key("browserstack.remoteMobileUrl")
    String remoteMobileUrl();

    @Key("browserstack.app")
    String app();

    @Key("browserstack.deviceName")
    String deviceName();

    @Key("browserstack.osVersion")
    String osVersion();

    @Key("browserstack.url")
    String url();

    @Key("browserstack.platformName")
    String platformName();

    @Key("browserstack.appPackage")
    String appPackage();

    @Key("browserstack.videoUrl")
    String videoUrl();
    @Key("browserstack.appActivity")
    String appActivity();
    @Key("false")
    @DefaultValue("isRemote")
    String isRemote();
}
