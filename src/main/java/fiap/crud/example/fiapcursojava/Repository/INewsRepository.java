package fiap.crud.example.fiapcursojava.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fiap.crud.example.fiapcursojava.Model.News;

public interface INewsRepository extends JpaRepository<News, Long> {

}