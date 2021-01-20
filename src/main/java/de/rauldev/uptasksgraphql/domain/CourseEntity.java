package de.rauldev.uptasksgraphql.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.UUID;

@Document(value = "courses")
public class CourseEntity {
    @Id
    private String id;
    private String title;
    private String tech;
    private LocalDate registrationDate;

    public CourseEntity(){
        this.id = UUID.randomUUID().toString();
        this.registrationDate = LocalDate.now();
    }

    public CourseEntity(String title, String tech) {
        this();
        this.title = title;
        this.tech = tech;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        return "CourseEntity{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", tech='" + tech + '\'' +
                ", registrationDate=" + registrationDate +
                '}';
    }
}
