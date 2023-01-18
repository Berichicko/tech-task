package sdet.tech.task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class WordsTest {

    @Test
    public void IsNullWordsTest() {
        String words = null;
        String result = Words.getFirstThreeWordsTitle(words);
        Assertions.assertEquals("Title is null", result);
    }

    @Test
    public void wordsTest() {
        String words = "Volvo released a new car with the following spec: " +
                "V6 236HP. It will cost $22647 and going to be sold in New York only";
        String result = Words.getFirstThreeWordsTitle(words);
        Assertions.assertEquals("Volvo released a new...", result);
    }


    @Test
    public void isEmptyWordsTest() {
        String words = "";
        String result = Words.getFirstThreeWordsTitle(words);
        Assertions.assertEquals("Title is empty", result);
    }

    @Test
    public void longWordsTest() {
        String words = "Pneumonoultramicroscopicsilicovolcanoconiosis сhargoggagoggmanchauggagoggchaubunagungamaugg";
        String result = Words.getFirstThreeWordsTitle(words);
        Assertions.assertEquals("Pneumonoultramicroscopicsilicovolcanoconiosis...", result);
    }


    @Test
    public void spacesWordsTest() {
        String words = "  ";
        String result = Words.getFirstThreeWordsTitle(words);
        Assertions.assertEquals("Title is empty", result);
    }

    @Test
    public void shortWordsTest() {
        String words = "Volvo released";
        String result = Words.getFirstThreeWordsTitle(words);
        Assertions.assertEquals("Volvo released", result);
    }
}
