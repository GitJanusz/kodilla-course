package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.medium.TwitterPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("John England");
        User rob = new YGeneration("Rob Could");
        User mia = new ZGeneration("Mia West");
        //When
        String johnPrefersShare = john.sharePost();
        System.out.println("John prefers: " + johnPrefersShare);
        String robPrefersShare = rob.sharePost();
        System.out.println("Rob prefers: " + robPrefersShare);
        String miaPrefersShare = mia.sharePost();
        System.out.println("Mia prefers: " + miaPrefersShare);
        //Then
        assertEquals("[FACEBOOK]", johnPrefersShare);
        assertEquals("[SNAPCHAT]", robPrefersShare);
        assertEquals("[TWITTER]", miaPrefersShare);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User bob = new Millenials("Bob the builder");
        //When
        String bobPrefersShare = bob.sharePost();
        System.out.println("Bob prefers: " + bobPrefersShare);
        bob.setSocialMedia(new TwitterPublisher());
        bobPrefersShare = bob.sharePost();
        System.out.println("But now Bob prefers: " + bobPrefersShare);
        //Then
        assertEquals("[TWITTER]", bobPrefersShare);
    }
}
