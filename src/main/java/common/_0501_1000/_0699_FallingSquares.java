package common._0501_1000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Title
 * @Link
 * @Author KongTong
 * @Date 2022/5/26
 */
public class _0699_FallingSquares {
    public List<Integer> fallingSquares(int[][] positions) {
        Arrays.sort(positions, (a, b) -> a[0] - b[0]);
        List<Integer> list = new ArrayList<>();
        int preHeight = positions[0][1];
        int preRight = preHeight + positions[0][0];
        int maxHeight = preHeight;
        list.add(preHeight);
        for (int i = 1; i < positions.length; i++) {
            int left = positions[i][0];
            int height = positions[i][1];
            int right = left + height;
            if (preRight > left) {
                maxHeight = Math.max(maxHeight, height + preHeight);
                preHeight = height + preHeight;
                list.add(preHeight);
            } else {
                preHeight = height;
                list.add(preHeight);
            }
            preRight = right;
        }
        return list;
    }
}
