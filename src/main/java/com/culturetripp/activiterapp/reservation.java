package com.culturetripp.activiterapp;

public class reservation {
    private int id;
    private String FIRSTNAME;
    private String LASTNAME;
    private String NPEOPLE;
    private String PRICE;

    public String getFIRSTNAME() {
        return FIRSTNAME;
    }

    public void setFIRSTNAME(String FIRSTNAME) {
        this.FIRSTNAME = FIRSTNAME;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLASTNAME() {
        return LASTNAME;
    }

    public void setLASTNAME(String LASTNAME) {
        this.LASTNAME = LASTNAME;
    }

    public String getNPEOPLE() {
        return NPEOPLE;
    }

    public void setNPEOPLE(String NPEOPLE) {
        this.NPEOPLE = NPEOPLE;
    }

    public String getPRICE() {
        return PRICE;
    }

    public void setPRICE(String PRICE) {
        this.PRICE = PRICE;
    }
}
