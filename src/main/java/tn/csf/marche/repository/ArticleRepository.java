package tn.csf.marche.repository;
import org.springframework.data.repository.CrudRepository;

import tn.csf.marche.model.Article;

  
public interface ArticleRepository extends CrudRepository<Article, Integer>  
{  
}  