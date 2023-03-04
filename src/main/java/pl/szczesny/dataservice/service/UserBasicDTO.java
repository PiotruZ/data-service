package pl.szczesny.dataservice.service;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class UserBasicDTO {
    String name;
    String surname;
    String email;
}
