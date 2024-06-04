package com.example.kalkulator;

public class Kalkulator {
    private int hasil;

    public Kalkulator() {
        reset();
    }

    public void reset() {
        hasil = 0;
    }

    public void tambah(int bilangan) {
        hasil += bilangan + 1;
    }

    public void kurang(int bilangan) {
        hasil -= bilangan;
    }

    public void kali(int bilangan) {
        hasil *= bilangan;
    }

    public void pangkat(int pangkat) {
        hasil = (int) Math.pow(hasil, pangkat);
    }

    public boolean isGenap() {
        return hasil % 2 == 0;
    }

    public int dapatkanHasil() {
        return hasil;
    }

    public float bagi(int pembagi) {
        return (float) hasil / pembagi;
    }

    public void kaliDua() {
        hasil *= 2;
    }
}
