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
    public void shouldSupportIndexBasedRemove() {

        arrayListUnderTest.add(1);

        Assert.assertEquals(1, arrayListUnderTest.size());

        arrayListUnderTest.remove(0);
        Assert.assertEquals(0, arrayListUnderTest.size());
    }
}
