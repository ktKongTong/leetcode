package weekCompetition;

import competition.doubleWeek75.NumberOfWays;
import competition.doubleWeek75.SumScores;
import org.junit.jupiter.api.Test;

/**
 * @Title
 * @Link
 * @Author KongTong
 * @Date 2022/4/2
 */
public class BiCompetition75 {
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
