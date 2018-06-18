package com.muntian.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@WebServlet("/")
public class HomeServlet extends HttpServlet {
    final static Random random = new Random();
    final static String[] operatorList = {"+","-","*","/"};
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int firstOperand = random.nextInt(100) + 1;
        int secondOperand = random.nextInt(100) + 1;
        String operator = operatorList[random.nextInt(3) + 1];
        double result = calculateResult(firstOperand,secondOperand,operator);
        req.getRequestDispatcher("/WEB-INF/view/question.jsp")
                .forward(req, resp);
        req.setAttribute("f_operand", firstOperand);
        req.setAttribute("s_operand", secondOperand);
        req.setAttribute("operator", operator);
    }

    private double calculateResult(int firstOperand, int secondOperand, String operator) {
        switch (operator){
            case "+":
                return firstOperand+secondOperand;
            case "-":
                return firstOperand-secondOperand;
            case "*":
                return firstOperand*secondOperand;
            case "/":
                return firstOperand/secondOperand;
        }
        return -1;
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
