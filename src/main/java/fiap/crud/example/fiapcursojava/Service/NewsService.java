package fiap.crud.example.fiapcursojava.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fiap.crud.example.fiapcursojava.Model.News;
import fiap.crud.example.fiapcursojava.Repository.INewsRepository;

import java.util.List;
import java.util.Optional;

@Service
public class NewsService implements INewsService {

    @Autowired
    private INewsRepository _newsRepository;

    @Override
    public News Save(News news) {
        return _newsRepository.save(news);
    }

    @Override
    public List<News> FindAll() {
        return _newsRepository.findAll();
    }

    @Override
    public Optional<News> FindById(Long id) {
        return _newsRepository.findById(id);
    }

    @Override
    public News Update(News news) {
        return _newsRepository.save(news);
    }

    @Override
    public void DeleteById(Long id) {
        _newsRepository.deleteById(id);
    }

}