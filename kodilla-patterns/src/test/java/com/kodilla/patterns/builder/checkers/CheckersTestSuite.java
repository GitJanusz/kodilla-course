package com.kodilla.patterns.builder.checkers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckersTestSuite {
    @Test
    void testCheckersBuilder() {
        //Given
        Checkers checkers = new Checkers.CheckersBuilder()          // [1]
                .PlayerOne("John")                                       // [2]
                .PlayerTwo("Theresa")                                    // [3]
                .Figure(FigureFactory.PAWN, Figure.WHITE, 0, 3)          // [4]
                .Figure(FigureFactory.PAWN, Figure.BLACK, 9, 7)          // [5]
                .Figure(FigureFactory.QUEEN, Figure.WHITE, 0, 2)         // [6]
                .build();                                                // [7]
        System.out.println(checkers.getBoard());                    // [8]

        //When
        Figure figureOne = checkers.getBoard().getFigure(0, 3);    // [9]
        Figure figureTwo = checkers.getBoard().getFigure(9, 7);    // [10]
        Figure figureThree = checkers.getBoard().getFigure(0, 2);  // [11]
        Figure figureFour = checkers.getBoard().getFigure(1, 1);   // [12]

        //Then
        assertEquals(Figure.WHITE, figureOne.getColor());           // [13]
        assertEquals(Pawn.class, figureTwo.getClass());             // [14]
        assertEquals(Queen.class, figureThree.getClass());          // [15]
        assertNull(figureFour);                                     // [16]
    }
}
//Spójrz na linie [1]-[7] – jak przyjazne w użyciu jest korzystanie z Buildera.
// Możemy w bardzo czytelny sposób stworzyć grę z dowolnym początkowym ustawieniem figur na planszy.
// W naszym przykładzie na planszy znajdują się dwa pionki (biały i czarny), oraz jedna damka (biała).
//W liniach [9]-[12] pobieramy wszystkie trzy figury z planszy oraz – dla sprawdzenia –
// próbujemy pobrać figurę z pola, na którym nie stoi żadna figura.
//Seria asercji w liniach [13]-[16] sprawdza, czy pobrane wartości zgadzają się z oczekiwanymi.