package de.rauldev.uptasksgraphql.services;

import de.rauldev.uptasksgraphql.domain.CourseEntity;
import de.rauldev.uptasksgraphql.dto.CourseCreationDTO;
import de.rauldev.uptasksgraphql.repository.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
public class CourseService {

    private ICourseRepository courseRepository;

    @Autowired
    public CourseService(ICourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    public Stream<CourseEntity> readAll(){
        return courseRepository.findAll().stream();
    }

    public CourseEntity create(CourseCreationDTO courseCreationDTO) {
        return courseRepository.save(new CourseEntity(courseCreationDTO.getTitle(), courseCreationDTO.getTech()));
    }
}
