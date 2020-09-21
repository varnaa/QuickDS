package com.varnaa.test;

import com.varnaa.quickds.implementations.array.Array;
import com.varnaa.quickds.implementations.inputFormatter.InputFormatter;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @Author: swethavarnaa
 */
public class ArrayTest {
    private final Array array = new Array();
    private final InputFormatter inputFormatter = new InputFormatter();

    @Test
    public void createArrayTest() {
        int[] generatedArray = array.createRandomArray();
        int[][] generated2dArray = array.createRandom2DArray();
        assertTrue(generatedArray != null);
        assertTrue(generated2dArray != null);
        array.prettyPrint(generatedArray);
        array.prettyPrint(generated2dArray);
    }

    @Test
    public void createCustomArrayTest() {
        int[] generatedArray = array.createRandomArray(20);
        int[][] generated2dArray = array.createRandom2DArray(5, 5);

        assertTrue(generatedArray.length == 20);
        assertTrue(generated2dArray.length == 5);
        assertTrue(generated2dArray[0].length == 5);


    }

    @Test
    public void formatArrayNullTest() {
        AssertionError error = Assertions.assertThrows(AssertionError.class, () -> inputFormatter.format1dArray(null));
        AssertionError error1 = Assertions.assertThrows(AssertionError.class, () -> inputFormatter.format2dCharArray(null, 1, 1));
        AssertionError error2 = Assertions.assertThrows(AssertionError.class, () -> inputFormatter.format2dIntArray(null, 1, 1));

        Assertions.assertEquals("input to format can not be null", error.getMessage());
        Assertions.assertEquals("input to format can not be null", error1.getMessage());
        Assertions.assertEquals("input to format can not be null", error2.getMessage());

    }

    @Test
    public void format1dArrayTest() {

        String input = "[17,2,3,4,5]";
        assertArrayEquals(new int[]{17, 2, 3, 4, 5,}, inputFormatter.format1dArray(input));
    }

    @Test
    public void format2dArray() {

        // int array
        String input = "[[2147483647,0,1,0,0],[0,0,0,0,0],[345,0,0,1,0],[1,1,0,1,1],[0,0,0,0,0]]";
        Assertions.assertArrayEquals(new int[][]{{2147483647, 0, 1, 0, 0}, {0, 0, 0, 0, 0}, {345, 0, 0, 1, 0}, {1, 1, 0, 1, 1}, {0, 0, 0, 0, 0}}, inputFormatter.format2dIntArray(input, 5, 5));

        // char array
        String charInput = "[['E','E','E'],['E','E','M',],['E','E','E']]";
        Assertions.assertArrayEquals(new char[][]{{'E', 'E', 'E'}, {'E', 'E', 'M'}, {'E', 'E', 'E'}}, inputFormatter.format2dCharArray(charInput, 3, 3));

    }
}
