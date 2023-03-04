package pl.szczesny.dataservice.config;

import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.szczesny.dataservice.domain.model.entity.UserMapper;

@Configuration
@RequiredArgsConstructor
public class MapStructConfig {

    @Bean
    public UserMapper userMapper() {
        return Mappers.getMapper(UserMapper.class);
    }

}

