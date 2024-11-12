package com.example.asm1;

public class CarModel {
    private String id;
    private String ten;
    private int namSX;
    private String hang;
    private double gia;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public CarModel(String id, String ten, int namSX, String hang, double gia) {
        this.id = id;
        this.ten = ten;
        this.namSX = namSX;
        this.hang = hang;
        this.gia = gia;
    }
}