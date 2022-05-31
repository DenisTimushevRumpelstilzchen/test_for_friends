package config;

import com.codeborne.selenide.Config;

public interface CredentialsConfig extends Config {
    String login();
    String password();
}
