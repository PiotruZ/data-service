package pl.szczesny.dataservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("!stage and !prod")
public class OpenApiConfig {


}
