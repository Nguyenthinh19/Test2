package com.example.luckybest;

public class Date {
    private String date;
    private boolean isChecked;

    public Date(String date, boolean isChecked) {
        this.date = date;
        this.isChecked = isChecked;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
}
