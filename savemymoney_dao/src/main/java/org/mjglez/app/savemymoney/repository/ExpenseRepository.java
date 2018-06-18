package org.mjglez.app.savemymoney.repository;

import org.mjglezr.app.savemymoney.entity.Expense;
import org.springframework.data.repository.CrudRepository;

public interface ExpenseRepository extends CrudRepository<Expense, Long> {
}
