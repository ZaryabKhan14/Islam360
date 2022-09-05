package com.example.islam360;

public class quranlistadaptar {
    int id ,suratid,paraid,ayatnumber;
    String translation_urdu,arabic;

    public quranlistadaptar(int ayatnumber, int suratid, String translation_urdu, String arabic) {
        this.id = id;
        this.suratid = suratid;
        this.paraid = paraid;
        this.ayatnumber = ayatnumber;
        this.translation_urdu = translation_urdu;
        this.arabic = arabic;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSuratid() {
        return suratid;
    }

    public void setSuratid(int suratid) {
        this.suratid = suratid;
    }

    public int getParaid() {
        return paraid;
    }

    public void setParaid(int paraid) {
        this.paraid = paraid;
    }

    public int getAyatnumber() {
        return ayatnumber;
    }

    public void setAyatnumber(int ayatnumber) {
        this.ayatnumber = ayatnumber;
    }

    public String getTranslation_urdu() {
        return translation_urdu;
    }

    public void setTranslation_urdu(String translation_urdu) {
        this.translation_urdu = translation_urdu;
    }

    public String getArabic() {
        return arabic;
    }

    public void setArabic(String arabic) {
        this.arabic = arabic;
    }

}
