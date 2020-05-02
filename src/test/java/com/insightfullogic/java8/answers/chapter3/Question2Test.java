package com.insightfullogic.java8.answers.chapter3;

import com.insightfullogic.java8.examples.chapter1.Artist;
import com.insightfullogic.java8.examples.chapter1.SampleData;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.insightfullogic.java8.answers.chapter3.Question2.countBandMembersInternal;
import static org.junit.Assert.assertEquals;

public class Question2Test {

    @Test
    public void internal() {
        assertEquals(4, countBandMembersInternal(Arrays.asList(SampleData.johnColtrane, SampleData.theBeatles)));
    }

    @Test
    public void internalIterationMine() {
        List<Artist> artists = Arrays.asList(SampleData.johnColtrane, SampleData.theBeatles);
        long result = artists.stream().map(artist -> artist.getMembers().count()).reduce(0L, Long::sum);

        assertEquals(4L, result);
    }
}
