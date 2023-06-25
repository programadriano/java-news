package fiap.crud.example.fiapcursojava.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import fiap.crud.example.fiapcursojava.Model.News;
import fiap.crud.example.fiapcursojava.Service.NewsService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping
    public ResponseEntity<List<News>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(newsService.FindAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<News>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(newsService.FindById(id));
    }

    @PostMapping
    public ResponseEntity<News> create(@RequestBody News news){
        return ResponseEntity.status(HttpStatus.CREATED).body(newsService.Save(news));
    }

    @PutMapping
    public ResponseEntity<News> update(@RequestBody News news){
        return ResponseEntity.status(HttpStatus.OK).body(newsService.Update(news));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        newsService.DeleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}