package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import javax.swing.text.DefaultEditorKit;
import java.util.*;

public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier decorate = new PoemBeautifier();
        decorate.beautify(() -> System.out.println("text to upper case".toUpperCase()));
        decorate.beautify(() -> System.out.println("TEXT TO LOWER CASE".toLowerCase()));
        decorate.beautify(() -> System.out.println("Text change - No".replace("No", "Yes")));
        decorate.beautify(() -> System.out.println("Text co".concat("mbine")));
        decorate.beautify(() -> System.out.println("         Delete whitespace".trim()));

        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10,5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);

        System.out.println("Using Stream to generate even numbers for 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}