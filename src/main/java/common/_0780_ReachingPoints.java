package common;

/**
 * @Title
 * @Link
 * @Author KongTong
 * @Date 2022/4/9
 */
public class _0780_ReachingPoints {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        while (tx >= sx && ty >= sy) {
            // 相同直接return
            if (tx == sx && ty == sy){
                return true;
            }
            if(tx == ty){
                return false;
            }
            if (tx > ty) {
                // tx 与sx 相等时，只需判断 ty - sy 是否整除 sx;
                if(ty == sy && (tx-sx)%sy == 0){
                        return true;
                }
                tx = tx % ty==0 ? ty : tx % ty;
            }else {
                if(tx == sx && (ty-sy)%sx == 0){
                    return true;
                }
                ty = ty % tx==0 ? tx : ty % tx;
            }
        }
        return false;
    }
}
