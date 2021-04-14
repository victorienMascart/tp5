package question3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class VisitorTest {
    @Test
    public void testSimpleExpression() {
        Visitor<Integer> visitor = new VisitorCalculation();
        Expression number1 = new LeafExpression(10);
        Expression number2 = new LeafExpression(5);

        Expression sub = new Substraction(number1, number2);
        assertEquals(5, sub.accept(visitor));
    }

    @Test
    public void testNestedExpression() {
        Visitor<Integer> visitor = new VisitorCalculation();

        Expression number1 = new LeafExpression(10);
        Expression number2 = new LeafExpression(5);

        Expression sub = new Substraction(number1, number2);

        Expression expression = new Substraction(sub, new LeafExpression(2));

        assertEquals(3, expression.accept(visitor));
    }
}
