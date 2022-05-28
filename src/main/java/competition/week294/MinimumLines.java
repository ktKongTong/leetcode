package competition.week294;

import java.util.Arrays;

/**
 * @Title
 * @Link
 * @Author KongTong
 * @Date 2022/5/22
 */
public class MinimumLines {
    public int minimumLines(int[][] stockPrices) {
        Arrays.sort(stockPrices, (a, b) -> a[0] - b[0]);
        if(stockPrices.length < 3){
            return stockPrices.length - 1;
        }
        int preX = stockPrices[1][0];
        int preY = stockPrices[1][1];
        // 斜率
        Fraction k = new Fraction(stockPrices[1][1] - stockPrices[0][1], stockPrices[1][0] - stockPrices[0][0]);
        int res = 1;

        for(int i = 2; i < stockPrices.length; i++){
            int x = stockPrices[i][0];
            int y = stockPrices[i][1];
            Fraction k1 = new Fraction(y - preY, x - preX);
            if(!k.equals(k1)){
                res++;
            }
            preX = x;
            preY = y;
            k = k1;
        }

        return res;
    }
    private static class Fraction{
        int numerator;
        int denominator;
        public Fraction(int numerator, int denominator){
            this.numerator = numerator;
            this.denominator = denominator;
            reduce();
        }
        public boolean equals(Object obj){
            if(obj instanceof Fraction){
                Fraction f = (Fraction)obj;
                return f.numerator == numerator && f.denominator == denominator;
            }
            return false;
        }
        private void reduce() {   //化简分数
            int gcd = this.gcd(this.numerator, this.denominator);
            this.numerator /= gcd;
            this.denominator /= gcd;
        }

        private int gcd(int a, int b) {   //辗转相除法求最大公约数
            int mod = a % b;
            if (mod == 0) {
                return b;
            } else {
                return gcd(b,mod);
            }
        }
    }
}
