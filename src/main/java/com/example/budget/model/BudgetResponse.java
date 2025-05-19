package com.example.budget.model;

public class BudgetResponse {
    private double rent;
    private double groceries;
    private double travel;
    private double investment;
    private double savings;

    public double getRent() { return rent; }
    public void setRent(double rent) { this.rent = rent; }

    public double getGroceries() { return groceries; }
    public void setGroceries(double groceries) { this.groceries = groceries; }

    public double getTravel() { return travel; }
    public void setTravel(double travel) { this.travel = travel; }

    public double getInvestment() { return investment; }
    public void setInvestment(double investment) { this.investment = investment; }

    public double getSavings() { return savings; }
    public void setSavings(double savings) { this.savings = savings; }
}
