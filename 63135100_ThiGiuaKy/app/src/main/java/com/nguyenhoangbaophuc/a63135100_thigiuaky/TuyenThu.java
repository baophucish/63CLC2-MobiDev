package com.nguyenhoangbaophuc.a63135100_thigiuaky;

public class TuyenThu {
    String name;
    String anhTT;
    int namSinh;

    public TuyenThu(String name, String anhTT, int namSinh) {
        this.name = name;
        this.anhTT = anhTT;
        this.namSinh = namSinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnhTT() {
        return anhTT;
    }

    public void setAnhTT(String anhTT) {
        this.anhTT = anhTT;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
}
