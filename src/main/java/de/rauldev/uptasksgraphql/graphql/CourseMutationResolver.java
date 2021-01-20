package de.rauldev.uptasksgraphql.graphql;

import de.rauldev.uptasksgraphql.domain.CourseEntity;
import de.rauldev.uptasksgraphql.dto.CourseCreationDTO;
import de.rauldev.uptasksgraphql.services.CourseService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CourseMutationResolver implements GraphQLMutationResolver {

    private CourseService courseService;

    @Autowired
    public CourseMutationResolver(CourseService courseService){
        this.courseService = courseService;
    }

    public CourseEntity createCourse(CourseCreationDTO courseCreationDTO){
        return  courseService.create(courseCreationDTO);
    }
}
