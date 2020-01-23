package com.incometaxcalculator.TaxCalculator;

import java.util.List;

public class TaxService {

    private List<Integer> taxBrackets;
    private List<Double> taxPercentage;
    private List<Integer> taxAmountPerBracket;
    private double totalTaxAmount;

    public List<Integer> getTaxBrackets() {
        return taxBrackets;
    }

    public void setTaxBrackets(List<Integer> taxBrackets) {
        this.taxBrackets = taxBrackets;
    }

    public List<Double> getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(List<Double> taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public List<Integer> getTaxAmountPerBracket() {
        return taxAmountPerBracket;
    }

    public void setTaxAmountPerBracket(List<Integer> taxAmountPerBracket) {
        this.taxAmountPerBracket = taxAmountPerBracket;
    }

    public double getTotalTaxAmount() {
        return totalTaxAmount;
    }

    public void setTotalTaxAmount(double totalTaxAmount) {
        this.totalTaxAmount = totalTaxAmount;
    }

    @Override
    public String toString() {
        return "TaxService{" +
                "taxBrackets=" + taxBrackets +
                ", taxPercentage=" + taxPercentage +
                ", taxAmountPerBracket=" + taxAmountPerBracket +
                ", totalTaxAmount=" + totalTaxAmount +
                '}';
    }
}
