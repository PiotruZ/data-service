package pl.szczesny.dataservice.domain.model.entity;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.szczesny.dataservice.service.UserBasicDTO;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserBasicDTO userToUserBasicDTO(User user);

    User userBasicDTOToUser(UserBasicDTO userBasicDTO);

}


