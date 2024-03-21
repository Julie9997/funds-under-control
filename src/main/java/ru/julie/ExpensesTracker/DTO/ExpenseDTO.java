package ru.julie.ExpensesTracker.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpenseDTO {
    private int expenseId;
    private int clientId;
    private String category;
    private int amount;
    private String dateTime;
    private String description;

}
