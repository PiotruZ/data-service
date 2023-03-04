package pl.szczesny.dataservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.szczesny.dataservice.domain.model.UserRepository;
import pl.szczesny.dataservice.domain.model.entity.User;
import pl.szczesny.dataservice.domain.model.entity.UserMapper;

@Service
@RequiredArgsConstructor
public class UserService {
    UserMapper userMapper;
    UserRepository userRepository;
//    public UserBasicDTO createUser(UserBasicDTO userBasicDTO){
//
//    }

    public UserBasicDTO fetchUserByEmail(String email) throws Exception {
        User user = userRepository.findByEmail(email).orElseThrow(()->new Exception("User not found"));
        return userMapper.userToUserBasicDTO(user);
    }

    public Boolean userExists(UserBasicDTO userBasicDTO){
        return userRepository.existsByEmail(userBasicDTO.getEmail());
    }

    public User addUser(UserBasicDTO userBasicDTO) {
        User user = userMapper.userBasicDTOToUser(userBasicDTO);
        return userRepository.save(user);
    }

    public UserBasicDTO convertToUserBasicDTO(User user) {
        return userMapper.userToUserBasicDTO(user);
    }
}
