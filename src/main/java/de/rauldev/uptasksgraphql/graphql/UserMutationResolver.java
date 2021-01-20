package de.rauldev.uptasksgraphql.graphql;

import de.rauldev.uptasksgraphql.domain.UserEntity;
import de.rauldev.uptasksgraphql.dto.UserCreationDTO;
import de.rauldev.uptasksgraphql.services.UserService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserMutationResolver implements GraphQLMutationResolver {

    private UserService userService;

    @Autowired
    public UserMutationResolver(UserService userService){
        this.userService = userService;
    }

    public UserEntity createUser(UserCreationDTO userCreationDTO){
        return this.userService.create(userCreationDTO);
    }
}
