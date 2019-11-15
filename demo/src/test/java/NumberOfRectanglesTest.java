import javafx.util.Pair;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class NumberOfRectanglesTest {

    private NumberOfRectangles sut = new NumberOfRectangles();

    @Test
    public void testNumberOfRectangles() {
        List<Pair<Integer, Integer>> coordinates = new ArrayList<Pair<Integer, Integer>>();
        coordinates.add(0,new Pair<Integer, Integer>(1,1));
        coordinates.add(0,new Pair<Integer, Integer>(1,2));
        coordinates.add(0,new Pair<Integer, Integer>(2,1));
        coordinates.add(0,new Pair<Integer, Integer>(2,2));
        coordinates.add(0,new Pair<Integer, Integer>(3,1));
        coordinates.add(0,new Pair<Integer, Integer>(3,2));

        Integer answer = sut.calculateNumberOfRectangles(coordinates);
        Assert.assertEquals(3, answer.intValue());
    }

    @Test
    public void testNumberOfRectangles2() {
        List<Pair<Integer, Integer>> coordinates = new ArrayList<Pair<Integer, Integer>>();
        coordinates.add(0,new Pair<Integer, Integer>(1,1));
        coordinates.add(0,new Pair<Integer, Integer>(1,2));
        coordinates.add(0,new Pair<Integer, Integer>(1,3));
        coordinates.add(0,new Pair<Integer, Integer>(2,1));
        coordinates.add(0,new Pair<Integer, Integer>(2,2));
        coordinates.add(0,new Pair<Integer, Integer>(2,3));

        Integer answer = sut.calculateNumberOfRectangles(coordinates);
        Assert.assertEquals(3, answer.intValue());
    }

    @Test
    public void testNumberOfRectangles3() {
        List<Pair<Integer, Integer>> coordinates = new ArrayList<Pair<Integer, Integer>>();
        coordinates.add(0,new Pair<Integer, Integer>(1,1));
        coordinates.add(0,new Pair<Integer, Integer>(1,2));
        coordinates.add(0,new Pair<Integer, Integer>(1,3));
        coordinates.add(0,new Pair<Integer, Integer>(2,1));
        coordinates.add(0,new Pair<Integer, Integer>(2,2));
        coordinates.add(0,new Pair<Integer, Integer>(2,3));
        coordinates.add(0,new Pair<Integer, Integer>(3,1));
        coordinates.add(0,new Pair<Integer, Integer>(3,2));
        coordinates.add(0,new Pair<Integer, Integer>(3,3));

        Integer answer = sut.calculateNumberOfRectangles(coordinates);
        Assert.assertEquals(9, answer.intValue());
    }

    @Test
    public void testNumberOfRectangles4() {
        List<Pair<Integer, Integer>> coordinates = new ArrayList<Pair<Integer, Integer>>();
        coordinates.add(0,new Pair<Integer, Integer>(1,1));
        coordinates.add(0,new Pair<Integer, Integer>(1,3));
        coordinates.add(0,new Pair<Integer, Integer>(2,1));
        coordinates.add(0,new Pair<Integer, Integer>(2,2));
        coordinates.add(0,new Pair<Integer, Integer>(2,3));
        coordinates.add(0,new Pair<Integer, Integer>(3,1));
        coordinates.add(0,new Pair<Integer, Integer>(3,2));
        coordinates.add(0,new Pair<Integer, Integer>(3,3));

        Integer answer = sut.calculateNumberOfRectangles(coordinates);
        Assert.assertEquals(5, answer.intValue());
    }

    @Test
    public void testNumberOfRectangles5() {
        List<Pair<Integer, Integer>> coordinates = new ArrayList<Pair<Integer, Integer>>();
        coordinates.add(0,new Pair<Integer, Integer>(2,1));
        coordinates.add(0,new Pair<Integer, Integer>(1,2));
        coordinates.add(0,new Pair<Integer, Integer>(3,1));
        coordinates.add(0,new Pair<Integer, Integer>(2,2));
        coordinates.add(0,new Pair<Integer, Integer>(4,1));
        coordinates.add(0,new Pair<Integer, Integer>(3,2));

        Integer answer = sut.calculateNumberOfRectangles(coordinates);
        Assert.assertEquals(1, answer.intValue());
    }
}
