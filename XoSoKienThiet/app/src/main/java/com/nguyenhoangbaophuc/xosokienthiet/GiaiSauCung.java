package com.nguyenhoangbaophuc.xosokienthiet;

public class GiaiSauCung implements IDoVeSo{
    String tenGiai;
    String[] boSoTrungThuong;

    public GiaiSauCung(String tenGiai, String[] boSoTrungThuong) {
        this.tenGiai = tenGiai;
        this.boSoTrungThuong = boSoTrungThuong;
    }

    @Override
    public IDoVeSo giaiThapHon(IDoVeSo giaiKeTiep) {
        return null;
    }

    @Override
    public String doVeSo(String veSo) {
        for(String s: boSoTrungThuong){
            if(veSo.endsWith(s))
                return "Ban da trung giai " + tenGiai;
        }
        return "Chuc May man lan sau!";
    }
}
