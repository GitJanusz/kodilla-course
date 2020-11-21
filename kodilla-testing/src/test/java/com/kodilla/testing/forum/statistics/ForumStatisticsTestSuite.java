package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.ForumStatistics;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;

    @Nested
    class testCalculateAverageValuesWithMock {
        @Test
        public void testPostsNumberEqualZero() {

        }

        @Test
        public void testPostsNumberEqualThousand() {

        }

        @Test
        public void testCommentsNumberEqualZero() {

        }

        @Test
        public void testCommentsNumberSmallerThanPostsNumber() {

        }

        @Test
        public void testCommentsNumberBiggerThanPostsNumber() {

        }

        @Test
        public void testUsersNumberEqualZero() {

        }

        @Test
        public void testUsersNumberEqualThousand() {

        }
    }
}
