package de.rauldev.uptasksgraphql;

import de.rauldev.uptasksgraphql.data.DatabaseSeedService;
import de.rauldev.uptasksgraphql.domain.ArticleEntity;
import de.rauldev.uptasksgraphql.repository.IArticleRepository;
import de.rauldev.uptasksgraphql.repository.ICourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class UpTasksGraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpTasksGraphqlApplication.class, args);
	}

	@Bean
	CommandLineRunner init(IArticleRepository articleRepository, ICourseRepository courseRepository){
		return args -> {
			DatabaseSeedService databaseSeedService =  new DatabaseSeedService(articleRepository, courseRepository);
			databaseSeedService.seedDatabase();
		};
	}
}
