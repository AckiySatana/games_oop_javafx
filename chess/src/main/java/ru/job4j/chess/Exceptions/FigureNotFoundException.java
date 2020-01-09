package ru.job4j.chess.Exceptions;

public class FigureNotFoundException  extends RuntimeException  {
    public FigureNotFoundException(String msg) {
        super(msg);
    }
}
