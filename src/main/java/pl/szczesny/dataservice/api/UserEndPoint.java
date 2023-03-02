package pl.szczesny.dataservice.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.szczesny.dataservice.domain.model.UserRepository;

@RestController
@RequestMapping(value = "/users")
@RequiredArgsConstructor
public class UserEndPoint {

    @GetMapping("/hello")
    String GetGreeting(){
        return "RuchamPsaJakSra";
    }

    //co mam skonfigurować żeby się uruchomił swagger/ui, jak zrobić post mapping żeby zapisywało usera do bazy danych, jak zrobić get mapping do wyciągania usera

    // czemu private final?

    //@RequiredArgsConstructor w nowym Springu deklaruje tutaj automatycznie @Autowired
    private final UserRepository repository;

}
