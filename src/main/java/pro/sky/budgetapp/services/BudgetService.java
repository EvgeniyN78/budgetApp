package pro.sky.budgetapp.services;

import pro.sky.budgetapp.model.Transaction;

public interface BudgetService {

    int getDailyBudget();

    int getBalance();

    long addTransaction(Transaction transaction);

    Transaction getTransaction(long id);

    Transaction editTransaction(long id, Transaction transaction);

    boolean deleteTransaction(long id);

    void deleteAllTransaction();

    int getDailyBalance();

    int getAllSpend();

    int getVacationBonus(int daysCount);

    int getSalaryWithVacation(int vacationDaysCount, int vacationWorkingDaysCount, int workingDaysInMonth);

}
