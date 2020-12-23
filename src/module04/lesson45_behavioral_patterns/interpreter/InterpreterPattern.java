package module04.lesson45_behavioral_patterns.interpreter;

/**
 * Class InterpreterPattern demonstrates the work of interpreter pattern, which
 * allows to provide a way to evaluate language grammar or expression.
 * The best example of interpreter design pattern is java compiler that interprets the java source code into byte code
 * that is understandable by JVM.
 *
 * @author Kamila Meshcheryakova
 * created 23.12.2020
 */
public class InterpreterPattern {
    public static void main(String[] args) {
        String expression = "1+2+3-4";//2
        Expression evaluator = new Evaluate(expression);
        System.out.println(evaluator.interpret(evaluator));
    }
}
