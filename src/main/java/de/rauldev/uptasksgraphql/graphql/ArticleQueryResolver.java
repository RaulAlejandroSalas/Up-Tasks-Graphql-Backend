package de.rauldev.uptasksgraphql.graphql;

import de.rauldev.uptasksgraphql.domain.ArticleEntity;
import de.rauldev.uptasksgraphql.services.ArticleService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ArticleQueryResolver implements GraphQLQueryResolver {

    private ArticleService articleService;

    @Autowired
    public ArticleQueryResolver(ArticleService articleService){
        this.articleService = articleService;
    }

    public List<ArticleEntity> articles(){
        return articleService.readAll().collect(Collectors.toList());
    }
}
