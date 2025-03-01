package org.example.test7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinhVienServiceTest {
    private SinhVienService sinhVienService = new SinhVienService();
    @BeforeEach
    void setUp() {
        sinhVienService = new SinhVienService();
    }

    @Test
    void addSinhVien() {
        SinhVien sinhVien = new SinhVien("hh01","dungdz",18,9,5,"IT");
        assertTrue(sinhVienService.addSinhVien(sinhVien));
    }
    @Test
    void addSinhViennull() {
        assertThrows(IllegalArgumentException.class, () -> sinhVienService.addSinhVien(null));
    }
    @Test
    void addSinhVienthieuma() {
        assertThrows(IllegalArgumentException.class, () -> sinhVienService.addSinhVien(new SinhVien("","dungdz",18,9,5,"IT")));
    }

}