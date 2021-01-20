package de.rauldev.uptasksgraphql.graphql;

import de.rauldev.uptasksgraphql.domain.UserEntity;
import de.rauldev.uptasksgraphql.services.UserService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserQueryResolver implements GraphQLQueryResolver {

    private UserService userService;

    @Autowired
    public UserQueryResolver(UserService userService){
        this.userService = userService;
    }

    public List<UserEntity> users(){
        return this.userService.findAll().collect(Collectors.toList());
    }
}
