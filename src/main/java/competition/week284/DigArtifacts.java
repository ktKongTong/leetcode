package competition.week284;
/**
 * @Link https://leetcode-cn.com/problems/find-all-k-distant-indices-in-an-array/
 * @Title 2201. 统计可以提取的工件
 * @Description 存在一个 n x n 大小、下标从 0 开始的网格，网格中埋着一些工件。
 * 给你一个整数 n 和一个下标从 0 开始的二维整数数组 artifacts，
 * artifacts 描述了矩形工件的位置，其中 artifacts[i] = [r1i, c1i, r2i, c2i] 表示第 i 个工件在子网格中的填埋情况：
 * (r1i, c1i) 是第 i 个工件 左上 单元格的坐标，且
 * (r2i, c2i) 是第 i 个工件 右下 单元格的坐标。
 * 你将会挖掘网格中的一些单元格，并清除其中的填埋物。如果单元格中埋着工件的一部分，那么该工件这一部分将会裸露出来。
 * 如果一个工件的所有部分都都裸露出来，你就可以提取该工件。
 * 给你一个下标从 0 开始的二维整数数组 dig ，其中 dig[i] = [ri, ci] 表示你将会挖掘单元格 (ri, ci) ，返回你可以提取的工件数目。
 * @Author KongTong
 * @Date 2022/03/13
 * */
public class DigArtifacts {
    public int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        int[][] dp = new int[n][n];
        int res = 0;
        // 工件数目
        int count = 0;
        for (int[] artifact : artifacts) {
            // 标注同一个工件
            count++;
            // 工件的坐标
            int[] topLeft = {artifact[0], artifact[1]};
            int[] bottomRight = {artifact[2], artifact[3]};
            for (int j = topLeft[0]; j <= bottomRight[0]; j++) {
                for (int k = topLeft[1]; k <= bottomRight[1]; k++) {
                    dp[j][k] = count;
                }
            }
        }
        for (int[] ints : dig) {
            // 挖掘工件
            dp[ints[0]][ints[1]] = -1;
        }
        int [] resCount = new int[count];
        // 遍历
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //从1-count的数中，不存在的数count++
                if(dp[i][j] >0){
                    resCount[dp[i][j]-1] = 1;
                }
            }
        }
        for (int i = 0; i < count; i++) {
            res += resCount[i];
        }
        return count-res;
//        return 0;
    }
}
