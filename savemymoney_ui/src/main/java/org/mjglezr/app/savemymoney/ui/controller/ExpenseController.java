package org.mjglezr.app.savemymoney.ui.controller;

import org.mjglezr.app.savemymoney.entity.Expense;
import org.mjglezr.app.savemymoney.service.impl.ExpenseServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/expense")
public class ExpenseController extends IncomingController<Expense, ExpenseServiceImpl> {

}
