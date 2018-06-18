package org.mjglezr.app.savemymoney.ui.controller;

import org.mjglezr.app.savemymoney.entity.Saving;
import org.mjglezr.app.savemymoney.service.impl.SavingServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/saving")
public class SavingController extends IncomingController<Saving, SavingServiceImpl> {
}
