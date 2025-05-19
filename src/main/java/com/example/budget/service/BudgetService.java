package com.example.budget.service;

import com.example.budget.model.BudgetResponse;
import org.springframework.stereotype.Service;

@Service
public class BudgetService {

    public BudgetResponse calculateBudget(double salary) {
        BudgetResponse res = new BudgetResponse();
        res.setRent(salary * 0.30);
        res.setGroceries(salary * 0.20);
        res.setTravel(salary * 0.10);
        res.setInvestment(salary * 0.20);
        res.setSavings(salary * 0.20);
        return res;
    }
}
