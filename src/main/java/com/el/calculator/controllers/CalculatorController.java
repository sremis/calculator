package com.el.calculator.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class CalculatorController {

	@GetMapping("")
	public String showCalculator() {
	        return "calculator";
	}
	
	ArrayList<String> resultList = new ArrayList<String>();
	 @PostMapping("")
	    public ModelAndView result(Double firstNumber, String operator, Double secondNumber, Double number) {
	        ModelAndView mv = new ModelAndView("calculator");
	        Double answer = -1.0;
	        switch(operator) {
	        case "+" :
	        	answer = firstNumber + secondNumber;
	        	resultList.add(0,firstNumber.toString()+" "+operator+" "+secondNumber.toString()+" = "+answer.toString());
	        	break;
	        case "-" :
	        	answer = firstNumber - secondNumber;
	        	resultList.add(0,firstNumber.toString()+" "+operator+" "+secondNumber.toString()+" = "+answer.toString());
	        	break;
	        case "*" :
	        	answer = firstNumber * secondNumber;
	        	resultList.add(0,firstNumber.toString()+" "+operator+" "+secondNumber.toString()+" = "+answer.toString());
	        	break;
	        case "/" :
	        	answer = firstNumber / secondNumber;
	        	resultList.add(0,firstNumber.toString()+" "+operator+" "+secondNumber.toString()+" = "+answer.toString());
	        	break;
	        case "^" :
	        	answer = Math.pow(firstNumber, secondNumber);
	        	resultList.add(0,firstNumber.toString()+" "+operator+" "+secondNumber.toString()+" = "+answer.toString());
	        	break;
	        case "nRoot" :
	        	answer = Math.pow(firstNumber, 1 / secondNumber);
	        	resultList.add(0,firstNumber.toString()+" "+operator+" "+secondNumber.toString()+" = "+answer.toString());
	        	break;
	        case "log" :
	        	answer = Math.log(secondNumber)/Math.log(firstNumber);
	        	resultList.add(0,firstNumber.toString()+" "+operator+" "+secondNumber.toString()+" = "+answer.toString());
	        	break;
	        case "sin" :
	        	answer = Math.sin(number);
	        	resultList.add(0,number.toString()+" "+operator+" = "+answer.toString());
	        	break;
	        case "cos" :
	        	answer = Math.cos(number);
	        	resultList.add(0,number.toString()+" "+operator+" = "+answer.toString());
	        	break;
	        case "tan" :
	        	answer = Math.tan(number);
	        	resultList.add(0,number.toString()+" "+operator+" = "+answer.toString());
	        	break;
	        case "sinh" :
	        	answer = Math.sinh(number);
	        	resultList.add(0,number.toString()+" "+operator+" = "+answer.toString());
	        	break;
	        case "cosh" :
	        	answer = Math.cosh(number);
	        	resultList.add(0,number.toString()+" "+operator+" = "+answer.toString());
	        	break;
	        case "tanh" :
	        	answer = Math.tanh(number);
	        	resultList.add(0,number.toString()+" "+operator+" = "+answer.toString());
	        	break;
	        case "logN" :
	        	answer = Math.log(number);
	        	resultList.add(0,number.toString()+" "+operator+" = "+answer.toString());
	        	break;
	        case "e^n" :
	        	answer = Math.exp(number);
	        	resultList.add(0,number.toString()+" "+operator+" = "+answer.toString());
	        	break;
	    }
	        mv.addObject("result",resultList);
			return mv;
	  
	 }
}
