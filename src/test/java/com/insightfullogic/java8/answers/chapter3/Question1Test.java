package com.insightfullogic.java8.answers.chapter3;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.SampleData;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.insightfullogic.java8.examples.chapter1.SampleData.*;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class Question1Test {

    @Test
    public void addsEmptyList() {
        int result = Question1.addUp(Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        assertEquals(55, result);
    }

    @Test
    public void concatenateString() {
        Stream<String> originalArray = Stream.of("S", "A", "M", "U", "E", "L");
        String result = originalArray.reduce(StringUtils.EMPTY, (acc, currentChar) -> acc + currentChar);
        assertEquals("SAMUEL", result);
    }

    @Test
    public void addsListWithValues() {
        int result = Question1.addUp(Stream.of(1, 3, -2));
        assertEquals(2, result);
    }

    @Test
    public void extractsNamesAndOriginsOfArtists() {
        List<String> namesAndOrigins = Question1.getNamesAndOrigins(SampleData.getThreeArtists());
        assertEquals(asList("John Coltrane", "US", "John Lennon", "UK", "The Beatles", "UK"), namesAndOrigins);
    }

    @Test
    public void extractsNamesAndOriginsOfArtistsMine() {
        List<String> result = SampleData.getThreeArtists().stream()
            .flatMap(artist -> Stream.of(artist.getName(), artist.getNationality()))
            .collect(Collectors.toList());

        List<String> namesAndOrigins = Question1.getNamesAndOrigins(SampleData.getThreeArtists());
        assertEquals(asList("John Coltrane", "US", "John Lennon", "UK", "The Beatles", "UK"), namesAndOrigins);
    }

    @Test
    public void findsShortAlbums() {
        List<Album> input = asList(manyTrackAlbum, sampleShortAlbum, aLoveSupreme);
        List<Album> result = Question1.getAlbumsWithAtMostThreeTracks(input);
        assertEquals(asList(sampleShortAlbum, aLoveSupreme), result);
    }

    @Test
    public void findsShortAlbumsMine() {
        List<Album> input = asList(manyTrackAlbum, sampleShortAlbum, aLoveSupreme);
        List<Album> result = input.stream()
            .filter(album -> album.getTracks().count() <= 3)
            .collect(Collectors.toList());
        assertEquals(asList(sampleShortAlbum, aLoveSupreme), result);
    }
}
