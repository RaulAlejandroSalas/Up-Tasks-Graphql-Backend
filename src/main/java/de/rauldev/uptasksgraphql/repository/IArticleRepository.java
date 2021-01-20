package de.rauldev.uptasksgraphql.repository;

import de.rauldev.uptasksgraphql.domain.ArticleEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IArticleRepository extends MongoRepository<ArticleEntity,String> {
}
