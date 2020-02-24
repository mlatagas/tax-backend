package com.mycompany.mycompanyTax.model;

public class TaxReq {

    int taxYear;
    int age;
    int medicalAidMembers;
    double taxableEarnings;

    public TaxReq(int age, String taxType, int taxYear, double taxableEarnings, String medicalAidMembers, String taxType1) {
    }

    public int getTaxYear() {
        return taxYear;
    }

    public void setTaxYear(int taxYear) {
        this.taxYear = taxYear;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMedicalAidMembers() {
        return medicalAidMembers;
    }

    public void setMedicalAidMembers(int medicalAidMembers) {
        this.medicalAidMembers = medicalAidMembers;
    }

    public double getTaxableEarnings() {
        return taxableEarnings;
    }

    public void setTaxableEarnings(double taxableEarnings) {
        this.taxableEarnings = taxableEarnings;
    }

    @Override
    public String toString() {
        return "TaxReq{" +
                "taxYear=" + taxYear +
                ", age=" + age +
                ", medicalAidMembers=" + medicalAidMembers +
                ", taxableEarnings=" + taxableEarnings +
                '}';
    }
}
