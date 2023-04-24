package FunctionalProgrammingInDepth.HigherOrderFunctions;

public interface IConfigurator<T,R> {
    R configure(T t);
}