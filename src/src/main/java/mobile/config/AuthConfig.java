package mobile.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:test.properties"
})
public interface AuthConfig extends Config {

    @Key("login")
    String login();

    @Key("password")
    String password();
}
