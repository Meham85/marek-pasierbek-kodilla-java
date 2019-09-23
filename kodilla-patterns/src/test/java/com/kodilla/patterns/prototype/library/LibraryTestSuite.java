package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library");
        IntStream.rangeClosed(1, 10)
                .forEach(n -> library.getBooks().add(new Book("Book title " + n, "Author " + n, LocalDate.of(2000, n, n * 2))));
        System.out.println(library);

        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("Shallow cloned library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);

        }
        System.out.println(shallowClonedLibrary);
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Deep cloned library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }


        //When
        Set<Book> booksToRemove = library.getBooks().stream()
                .filter(b -> b.getAuthor().equals("Author 1"))
                .collect(Collectors.toSet());

        library.getBooks().removeAll(booksToRemove);

        //Then
        Assert.assertEquals(9, library.getBooks().size());
        Assert.assertEquals(9, shallowClonedLibrary.getBooks().size());
        Assert.assertEquals(10, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(shallowClonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
