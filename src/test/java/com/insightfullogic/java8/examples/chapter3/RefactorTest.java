package com.insightfullogic.java8.examples.chapter3;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.SampleData;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RefactorTest {

    @Test
    public void allStringJoins() {
        Stream<Supplier<Refactor.LongTrackFinder>> finders = Stream.of(
            Refactor.Step0::new,
            Refactor.Step1::new,
            Refactor.Step2::new,
            Refactor.Step3::new,
            Refactor.Step4::new,
            Refactor.Step5::new
        );

        List<Album> albums = Collections.unmodifiableList(Arrays.asList(SampleData.aLoveSupreme, SampleData.sampleShortAlbum));
        List<Album> noTracks = Collections.unmodifiableList(Collections.singletonList(SampleData.sampleShortAlbum));

        finders.forEach(finder -> {
            System.out.println("Testing: " + finder.toString());

            Refactor.LongTrackFinder longTrackFinder = finder.get();
            Set<String> longTracks = longTrackFinder.findLongTracks(albums);

            assertEquals("[Acknowledgement, Resolution]", longTracks.toString());

            longTracks = longTrackFinder.findLongTracks(noTracks);

            assertTrue(longTracks.isEmpty());
        });
    }
}
