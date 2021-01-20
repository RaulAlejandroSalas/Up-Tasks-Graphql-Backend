package de.rauldev.uptasksgraphql.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Document(value = "articles")
public class ArticleEntity {

    @Id
    private String id;
    private LocalDate registrationDate;
    @Indexed(unique = true)
    private Long barCode;
    private String description;
    private BigDecimal price;
    private String provider;


    public ArticleEntity(){
        this.id = UUID.randomUUID().toString();
        this.registrationDate = LocalDate.now();
    }

    public ArticleEntity(Long barCode, String description, BigDecimal price, String provider) {
        this();
        this.barCode = barCode;
        this.description = description;
        this.price = price;
        this.provider = provider;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Long getBarCode() {
        return barCode;
    }

    public void setBarCode(Long barCode) {
        this.barCode = barCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    @Override
    public String toString() {
        return "ArticleEntity{" +
                "id='" + id + '\'' +
                ", registrationDate=" + registrationDate +
                ", barCode=" + barCode +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", provider='" + provider + '\'' +
                '}';
    }
}
