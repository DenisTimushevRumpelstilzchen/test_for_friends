package config;

import com.codeborne.selenide.Config;

@Config.Sourses("classpath:config/credentials.properties")
public interface CredentialsConfig extends Config {
    String login();
    String password();
}
