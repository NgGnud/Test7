package org.example.test7;

public class SinhVien {
    private String maSV;
    private String ten;
    private Integer tuoi;
    private float diemTB;
    private Integer kyHoc;
    private String chuyenNganh;

    public SinhVien(String maSV, String ten, Integer tuoi, float diemTB, Integer kyHoc, String chuyenNganh) {
        setMaSV(maSV);
        setTen(ten);
        setTuoi(tuoi);
        setDiemTB(diemTB);
        setKyHoc(kyHoc);
        setChuyenNganh(chuyenNganh);
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public Integer getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(Integer kyHoc) {
        this.kyHoc = kyHoc;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
}
