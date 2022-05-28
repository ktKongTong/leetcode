package competition;

import competition.biweek75.NumberOfWays;
import competition.biweek75.SumScores;
import org.junit.jupiter.api.Test;

/**
 * @Title
 * @Link
 * @Author KongTong
 * @Date 2022/4/2
 */
public class BiWeek75 {
    @Test
    public void testNumberOfWays() {
        NumberOfWays numberOfWays = new NumberOfWays();
        numberOfWays.numberOfWays("001101");
    }
    @Test
    public void testSumScores(){
        SumScores sumScores = new SumScores();
        sumScores.sumScores("babab");
    }
}
