package com.example.ps29253_baove;

public class GhiChu {
    private String tieuDe;
    private  Integer maGhiChu;

    public GhiChu(String tieuDe, Integer maGhiChu) {
        this.tieuDe = tieuDe;
        this.maGhiChu = maGhiChu;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public Integer getMaGhiChu() {
        return maGhiChu;
    }

    public void setMaGhiChu(Integer maGhiChu) {
        this.maGhiChu = maGhiChu;
    }
}
