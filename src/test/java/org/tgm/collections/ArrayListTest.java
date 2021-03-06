package org.tgm.collections;

import org.junit.Assert;
import org.junit.Before;
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
    public void should_RemoveByIndex_WhenValidIndexProvided() {

        arrayListUnderTest.add(1);

        Assert.assertEquals(1, arrayListUnderTest.size());

        arrayListUnderTest.remove(0);
        Assert.assertEquals(0, arrayListUnderTest.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldFail_RemoveByIndex_WhenIndexOutOfUpperBound() {
        arrayListUnderTest.add(1);
        arrayListUnderTest.add(2);
        Assert.assertEquals(2, arrayListUnderTest.size());

        arrayListUnderTest.remove(2);
        Assert.fail("Index does not exist.");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldFail_RemoveByIndex_WhenIndexOutOfLowerBound() {
        arrayListUnderTest.add(1);
        arrayListUnderTest.add(2);
        Assert.assertEquals(2, arrayListUnderTest.size());

        arrayListUnderTest.remove(-1);
        Assert.fail("Index does not exist.");
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
    @Test
    public void shouldSupportRemoveByElement() {


        arrayListUnderTest.add(1);

        arrayListUnderTest.remove(Integer.valueOf(1));
        Assert.assertEquals(0, arrayListUnderTest.size());
    }

    @Test
    public void shouldFail_RemoveElement_WhenElementDoesNotExist() {
        arrayListUnderTest.add(1);
        arrayListUnderTest.add(2);

        arrayListUnderTest.add(3);

        final boolean result = arrayListUnderTest.remove(Integer.valueOf(4));
        Assert.assertFalse(result);
    }
}
