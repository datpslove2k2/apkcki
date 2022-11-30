package com.example.conganapk126;

public class PoliceItem {
    private String txtName, txtDir, txtCountry;
    private int txtStar, img;

    public PoliceItem(String txtName, String txtDir, String txtCountry, int txtStar, int img) {
        this.txtName = txtName;
        this.txtDir = txtDir;
        this.txtCountry = txtCountry;
        this.txtStar = txtStar;
        this.img = img;
    }

    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

    public String getTxtDir() {
        return txtDir;
    }

    public void setTxtDir(String txtDir) {
        this.txtDir = txtDir;
    }

    public String getTxtCountry() {
        return txtCountry;
    }

    public void setTxtCountry(String txtCountry) {
        this.txtCountry = txtCountry;
    }

    public int getTxtStar() {
        return txtStar;
    }

    public void setTxtStar(int txtStar) {
        this.txtStar = txtStar;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}

