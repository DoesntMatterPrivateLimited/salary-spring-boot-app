package com.example.budget.controller;

import com.example.budget.model.BudgetResponse;
import com.example.budget.service.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BudgetController {

    @Autowired
    private BudgetService budgetService;

    @GetMapping("/calculate")
    public BudgetResponse calculateBudget(@RequestParam double salary) {
        return budgetService.calculateBudget(salary);
    }
}
