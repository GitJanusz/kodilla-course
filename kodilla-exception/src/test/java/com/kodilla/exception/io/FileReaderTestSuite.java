package com.kodilla.exception.io;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FileReaderTestSuite {

    @Test
    public void testReadFile() {
        //Given
        FileReader fileReader = new FileReader();
        //When & Then
        assertDoesNotThrow(() -> fileReader.readFile());
    }

    @Test
    public void whenFileDosentExistsReadFileShouldThrowException() {
        //Given
        FileReader fileReader = new FileReader();
        String fileName = "brak_pliku.txt";
        //When & Then
        assertThrows(FileReaderException.class, () -> fileReader.readFile2(fileName));
    }

    @Test
    public void testReadFileWithName() {
        // given
        FileReader fileReader = new FileReader();
        // when & then
        assertAll(
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile2("brak_pliku.txt")),
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile2(null)),
                () -> assertDoesNotThrow(() -> fileReader.readFile2("names.txt"))
        );
    }
}
