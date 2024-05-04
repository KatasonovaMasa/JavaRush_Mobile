package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:src/test/resources/config/test.properties"
})
public interface AuthConfig extends Config {

    @Key("login")
    String login();

    @Key("password")
    String password();
}
