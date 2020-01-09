package ru.job4j.chess.Exceptions;

public class OccupiedWayException extends RuntimeException {

    public OccupiedWayException(String msg) {
        super(msg);
    }
}