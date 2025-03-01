package org.example.test7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoNguyenTest {
    private SoNguyen soNguyen;
    @BeforeEach
    void setUp() {
        soNguyen = new SoNguyen();
    }

    @Test
    void arrSum() {
        assertEquals(0,soNguyen.arrSum(new int[]{}));
    }
    @Test
    void arrSumtrongmangco2so() {
        assertEquals(2,soNguyen.arrSum(new int[]{1,1}));
    }
    @Test
    void arrSumvoigiatritoida() {
        assertEquals(55,soNguyen.arrSum(new int[]{1,2,3,4,5,6,7,8,9,10}));
    }
    @Test
    void arrSumvoiso0() {
        assertEquals(1,soNguyen.arrSum(new int[]{0,1}));
    }
    @Test
    void arrSumvoisocosoam() {
        assertEquals(-1,soNguyen.arrSum(new int[]{1,-2}));
    }
}