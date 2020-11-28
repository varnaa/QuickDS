package com.varnaa.test;

import com.varnaa.Node;
import com.varnaa.Quickds;
import com.varnaa.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @Author: swethavarnaa
 */
public class QuickDSTest {

    private final Quickds quickds = new Quickds();

    @Test
    public void createArrayTest() {
        int[] generatedArray = quickds.createRandom1dArray();
        int[][] generated2dArray = quickds.createRandom2dArray();
        assertNotNull(generatedArray);
        assertNotNull(generated2dArray);
        quickds.print1dArray(generatedArray);
        quickds.print2dArray(generated2dArray);
    }

    @Test
    public void createCustomArrayTest() {
        int[] generatedArray = quickds.createCustom1dArray(20);
        int[][] generated2dArray = quickds.createCustom2dArray(5, 5);
        Assertions.assertEquals(generatedArray.length, 20);
        Assertions.assertEquals(generated2dArray.length, 5);
        Assertions.assertEquals(generated2dArray[0].length, 5);


    }

    @Test
    public void formatArrayNullTest() {
        AssertionError error = Assertions.assertThrows(AssertionError.class, () -> quickds.formatTo1dArray(null));
        AssertionError error1 = Assertions.assertThrows(AssertionError.class, () -> quickds.formatTo2dCharArray(null, 1, 1));
        AssertionError error2 = Assertions.assertThrows(AssertionError.class, () -> quickds.formatTo2dIntArray(null, 1, 1));

        Assertions.assertEquals("input to format can not be null", error.getMessage());
        Assertions.assertEquals("input to format can not be null", error1.getMessage());
        Assertions.assertEquals("input to format can not be null", error2.getMessage());

    }


    @Test
    public void format1dArrayTest() {

        String input = "[17,2,3,4,5]";
        Assertions.assertArrayEquals(new int[]{17, 2, 3, 4, 5,}, quickds.formatTo1dArray(input));

    }

    @Test
    public void format2dArrayTest() {

        // int quickds
        String input = "[[2147483647,0,1,0,0],[0,0,0,0,0],[345,0,0,1,0],[1,1,0,1,1],[0,0,0,0,0]]";
        Assertions.assertArrayEquals(new int[][]{{2147483647, 0, 1, 0, 0}, {0, 0, 0, 0, 0}, {345, 0, 0, 1, 0}, {1, 1, 0, 1, 1}, {0, 0, 0, 0, 0}}, quickds.formatTo2dIntArray(input, 5, 5));

        // char quickds
        String charInput = "[['E','E','E'],['E','E','M',],['E','E','E']]";
        Assertions.assertArrayEquals(new char[][]{{'E', 'E', 'E'}, {'E', 'E', 'M'}, {'E', 'E', 'E'}}, quickds.formatTo2dCharArray(charInput, 3, 3));

    }

    @Test
    public void createRandomLinkedListTest() {
        Node node = quickds.createRandomLinkedList();
        assertNotNull(node);
    }

    @Test
    public void createCustomLinkedList() {
        Node node = quickds.formatStringToLinkedList("[4,1,8,4,5]");
        assertNotNull(node);

    }

    @Test
    public void createBST() {
        // Random
        TreeNode root = quickds.createRandomBST();
        assertNotNull(root);


        // Custom
        TreeNode customRoot = quickds.createCustomBST(45);


        quickds.prettyPrintBST(root);
        quickds.prettyPrintBST(customRoot);
        quickds.printBST(root);
        quickds.prettyPrintBST(customRoot);
    }


    @Test
    public void formattingBSTTest() {
        // String input
        String input = "[41,37,44,24,39,42,48,1,35,38,40,null,43,46,49,0,2,30,36,null,null,null,null,null,null,45,47,null,null,null,null,null,4,29,32,null,null,null,null,null,null,3,9,26,null,31,34,null,null,7,11,25,27,null,null,33,null,6,8,10,16,null,null,null,28,null,null,5,null,null,null,null,null,15,19,null,null,null,null,12,null,18,20,null,13,17,null,null,22,null,14,null,null,21,23]";
        TreeNode root = quickds.formatStringToBST(input);
        quickds.prettyPrintBST(root);
    }

}
