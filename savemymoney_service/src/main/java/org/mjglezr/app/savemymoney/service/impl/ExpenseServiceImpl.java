package org.mjglezr.app.savemymoney.service.impl;

import org.mjglez.app.savemymoney.repository.ExpenseRepository;
import org.mjglez.app.savemymoney.repository.SavingRepository;
import org.mjglezr.app.savemymoney.entity.Expense;
import org.mjglezr.app.savemymoney.entity.Saving;
import org.mjglezr.app.savemymoney.service.IncomingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl extends IncomingServiceImpl<Expense, ExpenseRepository> {
}
