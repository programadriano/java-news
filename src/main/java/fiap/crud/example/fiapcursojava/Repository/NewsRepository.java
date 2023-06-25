package fiap.crud.example.fiapcursojava.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fiap.crud.example.fiapcursojava.Model.News;

public interface NewsRepository extends JpaRepository<News, Long> {

}