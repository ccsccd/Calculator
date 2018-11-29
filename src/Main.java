import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入运算表达式:");
        String expressionStr=sc.nextLine();
        List<String> zx= Operation.toInfixExpression(expressionStr);
        List<String> rpn=Operation.parseSuffixExpression(zx);
        String rpnStr="";
        for(String str:rpn){
            rpnStr+=str;
        }
        System.out.println(expressionStr+"＝"+ Operation.calculate(rpn));
        System.out.println("计算结果："+Operation.calculate(rpn));
    }

}
