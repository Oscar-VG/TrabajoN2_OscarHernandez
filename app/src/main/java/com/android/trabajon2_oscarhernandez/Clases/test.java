package com.android.trabajon2_oscarhernandez.Clases;

public class test {
    public String tvValor;
    public String tvDolar;
    public String tvLista;


    public test() {
        this.tvValor = "";
        this.tvDolar = "";
        this.tvLista = "";
    }

    public test(String textView1, String textView2, String textView3) {
        this.tvValor = textView1;
        this.tvDolar = textView2;
        this.tvLista = textView3;
    }

    public String getTextView1() {
        return tvValor;
    }

    public void setTextView1(String textView) {
        this.tvValor = textView;
    }

    public String getTextView2() {
        return tvDolar;
    }

    public void setTextView2(String textView2) {
        this.tvDolar = textView2;
    }

    public String getTextView3() {
        return tvLista;
    }

    public void setTextView3(String textView3) {
        this.tvLista = textView3;
    }

    @Override
    public String toString() {
        return "test{" +
                "textView1='" + tvValor + '\'' +
                ", textView2='" + tvDolar + '\'' +
                ", textView3='" + tvLista + '\'' +
                '}';
    }

}
