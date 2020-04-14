package com.insightfullogic.java8.examples.chapter3;

import com.insightfullogic.java8.examples.chapter1.SampleData;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DecisionsTest {

  @Test
  public void originsOfBandsTest() {
    Decisions decisions = new Decisions();

    Set<String> originsOfBands = decisions.originsOfBands(SampleData.yesterdayAlbum);
    Assert.assertEquals(Stream.of("MEX", "UK", "JAM").collect(Collectors.toSet()), originsOfBands);
  }
}
