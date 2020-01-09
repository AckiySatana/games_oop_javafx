package ru.job4j.chess.firuges.black;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

/**
 * @author Anton T
 * @version $Id$
 * @since 0.1
 */
public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        if (!isDiagonal(source, dest)) {
            throw new IllegalStateException(
                    String.format("Could not move by diagonal from %s to %s", source, dest)
            );
        }
        int size = Math.abs(source.x-dest.x);
        Cell[] steps = new Cell[size];

        int deltaX = Integer.compare(dest.x,source.x);
        int deltaY = Integer.compare(dest.y,source.y);
        System.out.printf("deltaX " + deltaX +" deltaY "+ deltaY);
        for (int index = 1; index < size+1; index++) {
            steps[index-1] = Cell.findBy(source.x+index*deltaX,source.y+index*deltaY);
        }
        return steps;
    }


    public boolean isDiagonal(Cell source, Cell dest) {
       return Math.abs(source.x-dest.x)==Math.abs(source.y-dest.y);
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
