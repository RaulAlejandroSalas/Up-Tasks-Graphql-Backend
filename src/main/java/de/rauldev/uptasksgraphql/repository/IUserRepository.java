package de.rauldev.uptasksgraphql.repository;

import de.rauldev.uptasksgraphql.domain.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface IUserRepository extends MongoRepository<UserEntity,String> {

    public Optional<UserEntity> findByEmail(String email);
}
