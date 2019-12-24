package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Assert;

public class BishopBlackTest {
    BishopBlack bish = new BishopBlack(Cell.C1);
    Cell pos = bish.position();

    @Test
    public void position() {
        boolean result = false;
        if (pos.equals(Cell.C1)){
            result = true;
        }
        assertThat(result, is(true));
    }

    @Test
    public void copy() {
        Cell dest =  Cell.A3;
        Figure newbish = bish.copy(dest);
        boolean result = false;
        if (dest.equals(newbish.position())){
            result = true;
        }
        assertThat(result, is(true));
    }

    @Test
    public void test_way() {
        Cell[] way =  bish.way(bish.position(), Cell.G5);
        Cell[] result ={Cell.D2,Cell.E3,Cell.F4,Cell.G5};
        Assert.assertArrayEquals( result, way );
    }
}