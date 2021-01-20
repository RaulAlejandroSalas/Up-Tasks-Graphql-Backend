package de.rauldev.uptasksgraphql.services;

import de.rauldev.uptasksgraphql.domain.UserEntity;
import de.rauldev.uptasksgraphql.dto.UserCreationDTO;
import de.rauldev.uptasksgraphql.exceptions.ConflictException;
import de.rauldev.uptasksgraphql.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
public class UserService {
    private IUserRepository userRepository;

    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    public UserService(IUserRepository userRepository){
        this.userRepository = userRepository;
    }

    private void checkIfUserExist(String email){
        this.userRepository.findByEmail(email)
                           .ifPresent(userEntity ->{
                               throw new ConflictException(String.format("User with email %s exist",email));
                           } );
    }

    public UserEntity create(UserCreationDTO userCreationDTO){
        this.checkIfUserExist(userCreationDTO.getEmail());
        return userRepository.save(new UserEntity(userCreationDTO.getName(), userCreationDTO.getEmail(),
                bCryptPasswordEncoder.encode(userCreationDTO.getPassword())));
    }

    public Stream<UserEntity> findAll() {
        return userRepository.findAll().stream();
    }
}
