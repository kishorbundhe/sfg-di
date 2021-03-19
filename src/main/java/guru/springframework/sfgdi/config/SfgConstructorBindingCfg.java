package guru.springframework.sfgdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Configuration;


@ConstructorBinding
@ConfigurationProperties("kishor")
public class SfgConstructorBindingCfg {
    private final String username;
    private final String password;
    private final String jdbcurl;

    public SfgConstructorBindingCfg(String username, String password, String jdbcurl) {
        this.username = username;
        this.password = password;
        this.jdbcurl = jdbcurl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getJdbcurl() {
        return jdbcurl;
    }
}
