package de.rauldev.uptasksgraphql.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CourseCreationDTO {
    private String title;
    private String tech;
}
