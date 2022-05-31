import java.util.Scanner;

public class Main {
    public static void main(String [] args ) throws Exception {
        Input one = new Input();
        Separator two = new Separator();
        Calculate three = new Calculate();
        Output four = new Output();

        one.setExpression();
        two.setExpression(one.getExpression());
        two.setFormat(one.getFormat());
        two.separator();
        three.setNum1(two.getNum1());
        three.setNum2(two.getNum2());
        three.setOperation(two.getOperation());
        three.calc();
        four.setFormat(one.getFormat());
        four.setResult(three.getResult());
        four.release();
    }
}
