package com.mycompany.mycompanyTax.model;

public class TaxResp {

    double netCash;
    double taxCredits;
    double payeAfterTaxCredit;
    double payeBeforeTaxCredit;

    public TaxResp(double netCash, double taxCredits, double payeAfterTaxCredit, double payeBeforeTaxCredit) {
        this.netCash = netCash;
        this.taxCredits = taxCredits;
        this.payeAfterTaxCredit = payeAfterTaxCredit;
        this.payeBeforeTaxCredit = payeBeforeTaxCredit;
    }

    public double getNetCash() {
        return netCash;
    }

    public void setNetCash(double netCash) {
        this.netCash = netCash;
    }

    public double getTaxCredits() {
        return taxCredits;
    }

    public void setTaxCredits(double taxCredits) {
        this.taxCredits = taxCredits;
    }

    public double getPayeAfterTaxCredit() {
        return payeAfterTaxCredit;
    }

    public void setPayeAfterTaxCredit(double payeAfterTaxCreidt) {
        this.payeAfterTaxCredit = payeAfterTaxCreidt;
    }

    public double getPayeBeforeTaxCredit() {
        return payeBeforeTaxCredit;
    }

    public void setPayeBeforeTaxCredit(double payeBeforeTaxCredit) {
        this.payeBeforeTaxCredit = payeBeforeTaxCredit;
    }

    @Override
    public String toString() {
        return "TaxResp{" +
                "netCash=" + netCash +
                ", taxCredits=" + taxCredits +
                ", payeAfterTaxCredit=" + payeAfterTaxCredit +
                ", payeBeforeTaxCredit=" + payeBeforeTaxCredit +
                '}';
    }
}
