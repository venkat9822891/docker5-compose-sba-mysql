package in.venkat.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.venkat.binding.Book;

public interface BookRepository extends JpaRepository<Book, Serializable> {

}
