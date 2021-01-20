package de.rauldev.uptasksgraphql.dto;

import lombok.*;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserCreationDTO  {
    private String name;
    private String email;
    private String password;


}
