package de.rauldev.uptasksgraphql.graphql;

import de.rauldev.uptasksgraphql.domain.CourseEntity;
import de.rauldev.uptasksgraphql.services.CourseService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CourseQueryResolver implements GraphQLQueryResolver {

    private CourseService courseService;

    @Autowired
    public CourseQueryResolver(CourseService courseService){
        this.courseService = courseService;
    }
    public List<CourseEntity> courses(){
        return this.courseService.readAll().collect(Collectors.toList());
    }
}
