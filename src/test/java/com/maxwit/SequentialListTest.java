package com.maxwit;

import org.junit.Assert;
import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class SequentialListTest {
    /**
     * Rigorous Test :-)
     */
    SequentialList<Integer> sequentialList = new SequentialList<>();

    int i = 0;

    @Test
    public void sequentialListTest() {
        Assert.assertTrue(sequentialList.isEmpty());
        // test passed
        for(int i = 0; i < 10; i++) {
            Assert.assertTrue(sequentialList.insert(i + 1));
        }

        // test failed
//        for(int i = 0; i < 11; i++) {
//            Assert.assertTrue(sequentialList.insert(i + 1));
//        }

        sequentialList.traversal(x -> {
            Assert.assertTrue(x == sequentialList.arr[i++]);
        });
    }
}