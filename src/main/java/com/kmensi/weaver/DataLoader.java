package com.kmensi.weaver;

import com.kmensi.weaver.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.kmensi.weaver.domain.Book;

/**
 *
 * @author user
 */
@Component
public class DataLoader implements ApplicationRunner {

    private BookRepository repository;

    @Autowired
    public DataLoader(BookRepository repository) {
        this.repository = repository;
    }

    public void run(ApplicationArguments args) {
        repository.save(Book.builder().title("Android in Action, Second Edition").build());
    }
}
