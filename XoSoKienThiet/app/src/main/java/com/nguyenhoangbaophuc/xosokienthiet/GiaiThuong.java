package com.nguyenhoangbaophuc.xosokienthiet;

public class GiaiThuong implements IDoVeSo{
    String tenGiai;

    String[] boSoTrungThuong;

    IDoVeSo giaiThapHon;

    public GiaiThuong(String tenGiai, String[] boSoTrungThuong) {
        this.tenGiai = tenGiai;
        this.boSoTrungThuong = boSoTrungThuong;
    }


    @Override
    public IDoVeSo giaiThapHon(IDoVeSo giaiKeTiep) {
        this.giaiThapHon = giaiKeTiep;
        return giaiKeTiep;
    }

    @Override
    public String doVeSo(String veSo) {
        for(String s : boSoTrungThuong){
            if(veSo.endsWith(s))
                return "Ban da trung giai " + tenGiai;
        }
        return giaiThapHon.doVeSo(veSo);
    }
}
