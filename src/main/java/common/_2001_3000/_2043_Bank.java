package common._2001_3000;

/*
 * @Author KongTong
 * @Link https://leetcode-cn.com/problems/simple-bank-system/
 * @Title 2043. 简易银行系统
 * @Date 2022/3/18
 */
public class _2043_Bank {
    private final long [] balance;
    public _2043_Bank(long [] balance) {
        this.balance = balance;
    }
    public boolean transfer(int account1, int account2, long money) {
        if(balance.length< account1 ||balance.length< account2 || balance[account1 - 1] < money){
            return false;
        }
        balance[account1 - 1] -= money;
        balance[account2 - 1] += money;
        return true;
    }

    public boolean deposit(int account, long money) {
        if(balance.length< account){
            return false;
        }
        balance[account - 1] += money;
        return true;
    }

    public boolean withdraw(int account, long money) {
        if(balance.length< account || balance[account - 1] < money){
            return false;
        }
        balance[account - 1] -= money;
        return true;
    }
}
