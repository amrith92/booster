package org.tgm.collections;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ArrayListTest {

    private ArrayList<Integer> arrayListUnderTest;

    @Before
    public void setUp() {
        arrayListUnderTest = new ArrayList<>();
    }

    @Test
    public void shouldAddAnyInt() {

        arrayListUnderTest.add(5);

        Assert.assertEquals(1, arrayListUnderTest.size());
        Assert.assertNotNull(arrayListUnderTest.get(0));
        Assert.assertEquals(5, (int) arrayListUnderTest.get(0));
    }

    @Test
    @Ignore
    public void shouldSupportIndexBasedRemove() {

        arrayListUnderTest.add(1);

        Assert.assertEquals(1, arrayListUnderTest.size());

        arrayListUnderTest.remove(0);
        Assert.assertEquals(0, arrayListUnderTest.size());
    }

    @Test
    public void shouldReportZeroSize()  {

        Assert.assertEquals(0, arrayListUnderTest.size());
    }

    @Test
    public void shouldReportTheCorrectSize() {

        Assert.assertEquals(0, arrayListUnderTest.size());

        for (int i = 0; i < 10000; ++i) {
            arrayListUnderTest.add(i);
            Assert.assertEquals(i + 1, arrayListUnderTest.size());
        }
    }

    @Test
    public void shouldSupportIndexBasedInsert() {

        final int expectedSize = 1000;
        for (int i = 0; i < expectedSize; ++i) {
            arrayListUnderTest.add(i, i + 1);
        }

        Assert.assertEquals(expectedSize, arrayListUnderTest.size());

        for (int i = 0; i < expectedSize; ++i) {
            Assert.assertEquals(i + 1, (int) arrayListUnderTest.get(i));
        }
    }
}
