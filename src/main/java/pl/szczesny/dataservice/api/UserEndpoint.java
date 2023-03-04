package pl.szczesny.dataservice.api;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.szczesny.dataservice.domain.model.UserRepository;
import pl.szczesny.dataservice.domain.model.entity.User;
import pl.szczesny.dataservice.service.UserBasicDTO;
import pl.szczesny.dataservice.service.UserService;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping(value = "/users")
@RequiredArgsConstructor
public class UserEndpoint {

    private final UserService userService;
    @Operation(summary = "Greets user")
    @GetMapping("/hello")
    @ResponseStatus(OK)
    String GetGreeting(){
        return "xxyyzzz";
    }

//    @Operation(summary = "Adds user to database")
//    @PostMapping
//    @ResponseStatus(CREATED)
//    UserBasicDTO addUser(@RequestBody UserBasicDTO userBasicDTO){
//        if(userService.userExists(userBasicDTO)) return new ResponseStatus(400);
//    }

    @Operation(summary = "Find user by email")
    @GetMapping
    public UserBasicDTO getUserByEmail(@PathVariable String email) throws Exception {
        return userService.fetchUserByEmail(email);
    }

    @Operation(summary = "Adds user to database")
    @PostMapping
    public ResponseEntity<UserBasicDTO> addUser(@RequestBody UserBasicDTO userBasicDTO) {
        if (userService.userExists(userBasicDTO)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(null);
        } else {
            User user = userService.addUser(userBasicDTO);
            UserBasicDTO savedUser = userService.convertToUserBasicDTO(user);
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(savedUser);
        }
    }

    //co mam skonfigurować żeby się uruchomił swagger/ui, jak zrobić post mapping żeby zapisywało usera do bazy danych, jak zrobić get mapping do wyciągania usera

    // czemu private final?

    //@RequiredArgsConstructor w nowym Springu deklaruje tutaj automatycznie @Autowired


}
