package org.example.test7;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    private List<SinhVien> sinhViens = new ArrayList<>();
    public boolean addSinhVien(SinhVien sinhVien) {
        if (sinhVien == null) {
            throw new IllegalArgumentException("student is null");
        }
        for (SinhVien st: sinhViens) {
            if (st.getMaSV().equals(sinhVien.getMaSV())) {
                throw new IllegalArgumentException("ma Sinh Vien khong duoc trung");
            }
        }
        return sinhViens.add(sinhVien);
    }
}
