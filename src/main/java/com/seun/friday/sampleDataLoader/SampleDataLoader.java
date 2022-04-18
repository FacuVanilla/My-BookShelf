package com.seun.friday.sampleDataLoader;

import com.seun.friday.entity.Book;
import com.seun.friday.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class SampleDataLoader {

    private final BookRepository bookRepository;

    @Autowired
    public SampleDataLoader(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostConstruct
    public void loadSampleData() {
        bookRepository.saveAll(List.of(
                new Book("Things Fall Apart", "Chinua Achebe", "Satire", "https://images-na.ssl-images-amazon.com/images/I/91yNF5xdR4L.jpg", "Things Fall Apart is written with remarkable economy and subtle irony."),
                new Book("Wuthering Heights", "Emily Brontë", "Gothic Fiction", "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1630501681l/6185._SY475_.jpg", "Emily Brontë describes the feelings of other characters so deeply, yet so realistically."),
                new Book("Emma", "Jane Austen", "Romance", "https://fb2bookfree.com/uploads/posts/2020-04/1587923554_61wz2omujdl.jpg", "Emma,the way her character shapes up as the book progresses is a delight to read."),
                new Book("Efuru", "Flora Nwapa", "Fiction", "https://images-na.ssl-images-amazon.com/images/I/81cOGwFiFTL.jpg",  "It's always nice when an important book is also a good book."),
                new Book("Nineteen Eighty-Four", "George Orwell", "Dystopian", "https://m.media-amazon.com/images/I/51HKO6C5A5L.jpg", "The ability to construct such a thorough version of hell is truly remarkable."),
                new Book("Macbeth", "William ShakeSpare", "Tragedy", "https://images-na.ssl-images-amazon.com/images/I/71ek4O9Zy6L.jpg",  "It's a book brimming with magnetic words, which beg to be savored.")
        ));
    }
}
