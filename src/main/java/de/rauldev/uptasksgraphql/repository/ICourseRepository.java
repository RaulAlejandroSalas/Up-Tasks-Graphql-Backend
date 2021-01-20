package de.rauldev.uptasksgraphql.repository;

import de.rauldev.uptasksgraphql.domain.CourseEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ICourseRepository extends MongoRepository<CourseEntity,String> {
}
