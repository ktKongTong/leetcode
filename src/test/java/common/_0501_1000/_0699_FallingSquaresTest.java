package common._0501_1000;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _0699_FallingSquaresTest {

    @Test
    void fallingSquares() {
        _0699_FallingSquares fallingSquares = new _0699_FallingSquares();

//        int[][] positions = new int[][]{{1,2},{2,3},{6,1}};
        int[][] positions = new int[][]{{100,100},{200,100}};
        List<Integer> res = fallingSquares.fallingSquares(positions);

    }
}