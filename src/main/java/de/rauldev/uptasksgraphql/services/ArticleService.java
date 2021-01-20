package de.rauldev.uptasksgraphql.services;

import de.rauldev.uptasksgraphql.domain.ArticleEntity;
import de.rauldev.uptasksgraphql.repository.IArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
public class ArticleService {

    public IArticleRepository articleRepository;

    @Autowired
    public ArticleService(IArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public ArticleEntity create(ArticleEntity articleEntity){
        return articleRepository.save(articleEntity);
    }

    public Stream<ArticleEntity> readAll(){
        return articleRepository.findAll().stream();
    }
}
