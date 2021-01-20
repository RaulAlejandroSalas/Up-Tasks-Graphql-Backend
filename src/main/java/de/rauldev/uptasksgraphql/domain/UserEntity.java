package de.rauldev.uptasksgraphql.domain;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.UUID;

@Document(value = "users")
public class UserEntity {


    @Id
    private String id;
    @NotNull(value = "The UserName is required")
    private String name;
    @NotNull(value = "The Email is required")
    private String email;
    @NotNull(value = "The Password is required")
    private String password;
    private LocalDate registrationDate;


    public UserEntity(){
        this.id = UUID.randomUUID().toString();
        this.registrationDate = LocalDate.now();
    }

    public UserEntity(@NotNull String name,@NotNull String email, @NotNull String password) {
        this();
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @NotNull
    public String getEmail() {
        return email;
    }

    public void setEmail(@NotNull String email) {
        this.email = email;
    }

    @NotNull
    public String getPassword() {
        return password;
    }

    public void setPassword(@NotNull String password) {
        this.password = password;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    @NotNull
    public String getName() {
        return name;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", registrationDate=" + registrationDate +
                '}';
    }
}
