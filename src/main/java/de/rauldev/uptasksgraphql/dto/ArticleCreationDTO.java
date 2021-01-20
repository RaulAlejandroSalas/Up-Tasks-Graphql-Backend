package de.rauldev.uptasksgraphql.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticleCreationDTO {
    private Long barcode;
    private String description;
    private BigDecimal price;
    private String provider;
}
