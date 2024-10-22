package pe.com.franquicia.r2dbc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.r2dbc")
@Data
public class PostgresqlConnectionProperties {

    private String database;
    private String schema;
    private String username;
    private String password;
    private String host;
    private Integer port;

}
