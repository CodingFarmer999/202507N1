package com.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.course.model.ResultBean;
import com.course.service.GuessDbService;

@Controller
public class GuessDbController {
	
	@Autowired
	private GuessDbService guessDbService;
	
	// http://localhost:8080/03_exp_guess/
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/newGame")
	public String newGame(Model model) {
		Long gameId = guessDbService.getAnswer();
		// 將ID提供給頁面，在猜數字時傳送當作識別ID
		model.addAttribute("gameId", gameId);
		return "index";
	}
	
	@GetMapping("/guess")
	public String guessAnswer(@RequestParam("gameId") Long gameId, @RequestParam("guessNum") String guessNumber, Model model) {
		guessDbService.checkAnswer(gameId, guessNumber);
		List<ResultBean> historyList = guessDbService.getHistory(gameId);
		model.addAttribute("history", historyList);
		model.addAttribute("gameId", gameId);
		return "index";
	}
	
}
