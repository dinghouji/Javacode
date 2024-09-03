class Bank {
    int savedMoney;  //存款数
    int year;  //存款年限
    double interest; //存款利息
    double interestRate; //存款年利率
    double dayli; //每日利率

    public double computeInterest() { //按整年计算利息
        interest = year * interestRate * savedMoney;
        return interest;
    }

    public void setInterestRate(double rate) {
        interestRate = rate;
    }

    public void setSavedMoney(int savedMoney) {
        this.savedMoney = savedMoney;
    }

    public void setDayli(double dayli) {
        this.dayli = dayli;
    }

    double computeDay() { //按天计算利息
        return day * dayli * savedMoney;
    }

    double total() { //计算总利息
        return computeInterest() + computeDay();
    }

    void show() { //显示总利息
        System.out.println(total());
    }
}

class ConstructionBank extends Bank {
    double year; // 自己声明一个double型的year变量

    void setYear(double year) {
        this.year = year;
        super.year = (int) Math.floor(year); // 将整数部分赋给隐藏的year
    }

    void setDay() {
        day = (int) ((year * 1000) - (Math.floor(year) * 1000)); // 计算天数
    }

    @Override
    public double computeInterest() {
        super.computeInterest(); // 计算整数年利息
        return super.interest + computeDay(); // 加上计算天数的利息
    }
}

class BankOfDalian extends Bank {
    double year; // 自己声明一个double型的year变量

    void setYear(double year) {
        this.year = year;
        super.year = (int) Math.floor(year); // 将整数部分赋给隐藏的year
    }

    void setDay() {
        day = (int) ((year * 1000) - (Math.floor(year) * 1000)); 
    }

    @Override
    public double computeInterest() {
        super.computeInterest(); 
        return super.interest + computeDay(); 
    }
}

public class E_05 {
    public static void main(String[] args) {
        ConstructionBank c1 = new ConstructionBank();
        BankOfDalian b1 = new BankOfDalian();

        c1.setYear(8.236);
        b1.setYear(8.236);

        c1.setInterestRate(0.035);
        b1.setInterestRate(0.035);

        c1.setSavedMoney(8000); // 设置存款金额
        b1.setSavedMoney(8000); // 设置存款金额

        c1.setDayli(0.0001); // 设置每日利率
        b1.setDayli(0.00012); // 设置每日利率

        c1.setDay();
        b1.setDay();

        c1.show();
        b1.show();
    }
}
