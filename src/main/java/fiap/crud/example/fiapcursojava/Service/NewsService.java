package fiap.crud.example.fiapcursojava.Service;

import java.util.List;
import java.util.Optional;

import fiap.crud.example.fiapcursojava.Model.News;

public interface NewsService {

    News Save(News news);

    List<News> FindAll();

    Optional<News> FindById(Long id);

    News Update(News news);

    void DeleteById(Long id);

}