package com.insightfullogic.java8.examples.chapter1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class SampleData {

    public static final Artist johnColtrane = new Artist("John Coltrane", "US");

    public static final Artist johnLennon = new Artist("John Lennon", "UK");
    public static final Artist paulMcCartney = new Artist("Paul McCartney", "UK");
    public static final Artist georgeHarrison = new Artist("George Harrison", "UK");
    public static final Artist ringoStarr = new Artist("Ringo Starr", "UK");
    public static final Artist metallica = new Artist("Metallica", "USA");
    public static final Artist losTemerarios = new Artist("The Temerarios", "MEX");
    public static final Artist theWailers = new Artist("The Wailers", "JAM");

    public static final List<Artist> membersOfTheBeatles = Arrays.asList(johnLennon, paulMcCartney, georgeHarrison, ringoStarr);

    public static final Artist theBeatles = new Artist("The Beatles", membersOfTheBeatles, "UK");
    public static final Artist theRollingStones = new Artist("The Rolling Stones", membersOfTheBeatles, "UK");
    public static final Artist theSexPistols = new Artist("The Sex Pistols", membersOfTheBeatles, "UK");
    public static final Artist ub40 = new Artist("UB-40", membersOfTheBeatles, "UK");
    public static final Artist madness = new Artist("Madness", membersOfTheBeatles, "UK");

    public static final Album yesterdayAlbum = new Album("Yesterday",
        asList(
            new Track("Yesterday", 123000),
            new Track("Act Naturally", 153000),
            new Track("You Like Me Too Much", 140000),
            new Track("It's Only Love", 113000)
        ), asList(theBeatles, theRollingStones, theSexPistols, ub40, madness, johnLennon, paulMcCartney, georgeHarrison, ringoStarr, metallica, losTemerarios, theWailers));

    public static final Album aLoveSupreme = new Album("A Love Supreme", asList(new Track("Acknowledgement", 467), new Track("Resolution", 442)), asList(johnColtrane));

    public static final Album sampleShortAlbum = new Album("sample Short Album", asList(new Track("short track", 30)), asList(johnColtrane));

    public static final Album manyTrackAlbum = new Album("sample Short Album", asList(new Track("short track", 30), new Track("short track 2", 30), new Track("short track 3", 30), new Track("short track 4", 30), new Track("short track 5", 30)), asList(johnColtrane));

    public static Stream<Album> albums = Stream.of(aLoveSupreme);

    public static Stream<Artist> threeArtists() {
        return Stream.of(johnColtrane, johnLennon, theBeatles);
    }

    public static List<Artist> getThreeArtists() {
        return Arrays.asList(johnColtrane, johnLennon, theBeatles);
    }

}
