package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {
    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Library1");

        Book book1 = new Book("Title1", "Author1", LocalDate.of(2001, 1, 1));
        Book book2 = new Book("Title2", "Author2", LocalDate.of(2002, 2, 2));
        Book book3 = new Book("Title3", "Author3", LocalDate.of(2003, 3, 3));
        Book book4 = new Book("Title4", "Author4", LocalDate.of(2004, 4, 4));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library1 - shallow copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deppClonedLibrary = null;
        try {
            deppClonedLibrary = library.deepCopy();
            deppClonedLibrary.setName("Library1 - deep copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        library.getBooks().remove(book1);
        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deppClonedLibrary);
        assertEquals(3, library.getBooks().size());
        assertEquals(3, clonedLibrary.getBooks().size());
        assertEquals(4, deppClonedLibrary.getBooks().size());
        assertEquals(library.getBooks(), clonedLibrary.getBooks());
        assertNotEquals(library.getBooks(), deppClonedLibrary.getBooks());
    }
}
