package hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class HomeWorkTest {
    HomeWork homeWork;
    @BeforeEach
    void setup() {
        homeWork = new HomeWork();
    }
    @Test
    public void evenNumber(){
        assertTrue(homeWork.evenOddNumber(2));
    }

    @Test
    public void oddNumber(){
        assertFalse(homeWork.evenOddNumber(1));
    }
    @Test
    void numberIsInInterval() {
        for (int i = 26;i <100; i++){
            assertTrue(homeWork.numberInInterval(i));
        }
    }
    @Test
    void numberIsNotInInterval() {
        int[] i = new int[]{-6, 0, 25, 100, 10000};
        for (int number: i) {
            assertFalse(homeWork.numberInInterval(number));
        }
    }
}
