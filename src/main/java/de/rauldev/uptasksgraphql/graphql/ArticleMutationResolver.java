package de.rauldev.uptasksgraphql.graphql;

import de.rauldev.uptasksgraphql.domain.ArticleEntity;
import de.rauldev.uptasksgraphql.services.ArticleService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ArticleMutationResolver implements GraphQLMutationResolver {

    private ArticleService articleService;

    @Autowired
    public ArticleMutationResolver(ArticleService articleService){
        this.articleService = articleService;
    }

    public ArticleEntity createArticle(ArticleEntity articleEntity){
        return this.articleService.create(articleEntity);
    }


}
