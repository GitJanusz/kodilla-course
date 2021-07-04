package com.kodilla.patterns2.observer.homework;

public interface Observation {
    void registerObserverMentor(ObserverMentor observerMentor);
    void notifyObserversMentors();
    void removeObserverMentor(ObserverMentor observerMentor);
}
