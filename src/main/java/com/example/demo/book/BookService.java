package com.example.demo.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @PostConstruct
    public void setUp(){
        System.out.println(bookRepository.getClass());
    }

//    @Autowired
//    List<BookRepository> bookRepositoryList;

//    public void printBookRepository(){
//        bookRepositoryList.forEach(x ->
//                System.out.println(x.getClass())
//        );
//    }
}
