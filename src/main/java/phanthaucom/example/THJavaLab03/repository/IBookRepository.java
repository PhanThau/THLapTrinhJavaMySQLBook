package phanthaucom.example.THJavaLab03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import phanthaucom.example.THJavaLab03.entity.Book;

@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {

}

