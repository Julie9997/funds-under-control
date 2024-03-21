package ru.julie.ExpensesTracker.DTO;

import lombok.Data;

@Data
public class FilterDTO {
    private String category;
    private int from;
    private int to;
    private String month;
    private String year;

}
