package question2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class InterpreterTest {
    @Test
    public void testSimpleExpression() {
        Expression number1 = new LeafExpression(10);
        Expression number2 = new LeafExpression(5);

        Expression sub = new Substraction(number1, number2);
        assertEquals(5, sub.interpreter());
    }

    @Test
    public void testNestedExpression() {
        Expression number1 = new LeafExpression(10);
        Expression number2 = new LeafExpression(5);

        Expression sub = new Substraction(number1, number2);

        Expression expression = new Substraction(sub, new LeafExpression(2));

        assertEquals(3, expression.interpreter());
    }
}
