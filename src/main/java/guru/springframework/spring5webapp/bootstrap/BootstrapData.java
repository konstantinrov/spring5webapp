package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Konstantin Romanov
 * @created 24/03/2020 - 17:28
 * @project spring5webapp
 */
@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Start in Bootstrap");

        Publisher pub = new Publisher();
        pub.setName("SPF Publisher");
        pub.setCity("Belgiume");
        pub.setState("FL");

        publisherRepository.save(pub);

        System.out.println("Publisher count : " + publisherRepository.count());

        Author koss = new Author("Konstantin", "Romanov");
        Book book = new Book("Domain Driven Design", "123123");
        koss.getBooks().add(book);
        book.getAuthors().add(koss);
        book.setPublisher(pub);
        pub.getBooks().add(book);

        authorRepository.save(koss);
        bookRepository.save(book);
        publisherRepository.save(pub); //again

        Author rod = new Author("Rod", "Johnson");
        Book bookr = new Book("J2EE Dev without EJB", "321321");

        rod.getBooks().add(bookr);
        bookr.getAuthors().add(rod);
        bookr.setPublisher(pub);
        pub.getBooks().add(bookr);

        authorRepository.save(rod);
        bookRepository.save(bookr);
        publisherRepository.save(pub);


        System.out.println("Number of books : " + bookRepository.count());
        System.out.println("Publisher Number of Books : " + pub.getBooks().size());
    }
}
