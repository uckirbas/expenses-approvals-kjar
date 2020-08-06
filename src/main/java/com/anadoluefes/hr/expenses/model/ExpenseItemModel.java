package com.anadoluefes.hr.expenses.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ExpenseItemModel implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Expense Type")
	private java.lang.String expenseType;

	@org.kie.api.definition.type.Label(value = "Expense Value")
	private java.lang.Float expenseValue;

	public ExpenseItemModel() {
	}

	public java.lang.String getExpenseType() {
		return this.expenseType;
	}

	public void setExpenseType(java.lang.String expenseType) {
		this.expenseType = expenseType;
	}

	public java.lang.Float getExpenseValue() {
		return this.expenseValue;
	}

	public void setExpenseValue(java.lang.Float expenseValue) {
		this.expenseValue = expenseValue;
	}

	public ExpenseItemModel(java.lang.String expenseType,
			java.lang.Float expenseValue) {
		this.expenseType = expenseType;
		this.expenseValue = expenseValue;
	}

}