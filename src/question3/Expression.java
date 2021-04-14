package question3;

public interface Expression {
    public abstract <T> T accept(Visitor<T> v);
}
