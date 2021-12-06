package com.android.trabajon2_oscarhernandez.Clases;

public class test {
    public String textView;
    public String textView2;
    public String textView3;


    public test() {
        this.textView = "";
        this.textView2 = "";
        this.textView3 = "";
    }

    public test(String textView, String textView2, String textView3) {
        this.textView = textView;
        this.textView2 = textView2;
        this.textView3 = textView3;
    }

    public String getTextView() {
        return textView;
    }

    public void setTextView(String textView) {
        this.textView = textView;
    }

    public String getTextView2() {
        return textView2;
    }

    public void setTextView2(String textView2) {
        this.textView2 = textView2;
    }

    public String getTextView3() {
        return textView3;
    }

    public void setTextView3(String textView3) {
        this.textView3 = textView3;
    }

    @Override
    public String toString() {
        return "test{" +
                "textView='" + textView + '\'' +
                ", textView2='" + textView2 + '\'' +
                ", textView3='" + textView3 + '\'' +
                '}';
    }
}
