package com.kmensi.weaver.repository;

import com.kmensi.weaver.domain.Book;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author user
 */
public interface BookRepository extends CrudRepository<Book, Long> {

    @Override
    List<Book> findAll();
}
