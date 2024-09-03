//3、计算 1×3×5+2×4×6+3×5×7+4×6×8+…的累加和，直到单项值超过 10000 时停止，输出项数及累加之
//和。

public class T03 {
    public static void main(String[] args) {
        System.out.println(fun());
    }
    public static long fun(){
        int temp = 0;
        int i = 1;
        int sum = 0;
        while(temp <= 10000){
           temp = i * (i + 1) * (i + 2);
           i++;
           sum += temp;
        }
        return sum;
    }
}
