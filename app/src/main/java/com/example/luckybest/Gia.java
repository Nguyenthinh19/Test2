package com.example.luckybest;

public class Gia {
    private String gia;
    private boolean isChecked;

    public Gia(String gia, boolean isChecked) {
        this.gia = gia;
        this.isChecked = isChecked;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
}
