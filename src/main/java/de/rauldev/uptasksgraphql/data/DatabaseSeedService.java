package de.rauldev.uptasksgraphql.data;

import de.rauldev.uptasksgraphql.domain.ArticleEntity;
import de.rauldev.uptasksgraphql.domain.CourseEntity;
import de.rauldev.uptasksgraphql.repository.ICourseRepository;
import org.apache.logging.log4j.LogManager;
import de.rauldev.uptasksgraphql.repository.IArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Arrays;

@Service
public class DatabaseSeedService {

    public IArticleRepository articleRepository;
    private ICourseRepository courseRepository;

    @Autowired
    public DatabaseSeedService(IArticleRepository articleRepository,ICourseRepository courseRepository){

        this.articleRepository = articleRepository;
        this.courseRepository = courseRepository;
    }

    public void seedDatabase(){
        LogManager.getLogger(this.getClass()).warn("------- Data Initial Load -----------");
        ArticleEntity [] articles = {
                new ArticleEntity(84001L, "art 001", new BigDecimal("1.23"), "prov 1"),
                new ArticleEntity(84002L, "art 002", new BigDecimal("0.27"), "prov 2"),
                new ArticleEntity(84003L, "art 003", new BigDecimal("12.13"), "prov 3"),
                new ArticleEntity(84004L, "art 004", new BigDecimal("4.00"), "prov 4"),
                new ArticleEntity(84005L, "art 005", new BigDecimal("0.45"), "prov 5")
        };
        articleRepository.saveAll(Arrays.asList(articles));


        CourseEntity [ ] courses={
                new CourseEntity("JavaScript Modern, Build +10 Projects","JavaScript ES6"),
                new CourseEntity("React The Guide Definity , Hooks Context Redux MERN","React"),
                new CourseEntity("Nodejs BootCamp Development Web inc, MVC and Rest Api","Nodejs"),
                new CourseEntity("Reactjs Advanced Full Stack GraphQL and Apollo","React")
        };
        courseRepository.saveAll(Arrays.asList(courses));

    }

}
