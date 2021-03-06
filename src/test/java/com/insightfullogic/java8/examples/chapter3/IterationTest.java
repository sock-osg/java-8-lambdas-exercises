package com.insightfullogic.java8.examples.chapter3;

import com.insightfullogic.java8.examples.chapter1.SampleData;
import org.junit.Test;

public class IterationTest {

    @Test
    public void lazyPrintOuts() {
        Iteration iteration = new Iteration();
        // lazy recipe
        iteration.filterArtistsFromLondonPrinted(SampleData.membersOfTheBeatles);
    }

    @Test
    public void evaluatedPrintOuts() {
        Iteration iteration = new Iteration();
        // eager recipe
        iteration.internalCountArtistsFromLondonPrinted(SampleData.membersOfTheBeatles);
    }
}
