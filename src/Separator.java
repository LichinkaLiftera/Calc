public class Separator {
    private String expression;

    private final char [] operations = {'+' , '-', '/' , '*'};
    private int num1;
    private int num2;
    private char operation;
    private String format;

    public void setExpression(String expression){
        this.expression = expression;
    }

    public void setFormat(String format){
        this.format = format;
    }

    public void separator() throws Exception {
        for (int i = 0; i < expression.length(); i++) {
            for (char q : operations) {
                if (expression.charAt(i) == q) {
                    operation = q;
                }
            }
        }
        if (format.equals(String.valueOf(Format.ARABIC))) {
            num1 = Integer.parseInt(expression.substring(0, expression.indexOf(operation)));
            num2 = Integer.parseInt(expression.substring(expression.indexOf(operation) + 1));
            if (num1 < 1 || num1 > 10) {
                throw new Exception("Число не может быть меньше 1 или больше 10, вы ввели: " + num1);
            }
            if (num2 < 1 || num2 > 10) {
                throw new Exception("Число не может быть меньше 1 или больше 10, вы ввели: " + num2);
            }
        }
        if (format.equals(String.valueOf(Format.ROME))) {
            String str1 = expression.substring(0, expression.indexOf(operation));
            String str2 = expression.substring(expression.indexOf(operation) + 1);
            num1 = RomanNum.valueOf(str1).ordinal();
            num2 = RomanNum.valueOf(str2).ordinal();
            if (num1 < 1 || num1 > 10) {
                throw new Exception("Число не может быть меньше 1 или больше 10, вы ввели: " + num1);
            }
            if (num2 < 1 || num2 > 10) {
                    throw new Exception("Число не может быть меньше 1 или больше 10, вы ввели: " + num2);
            }
        }
    }
    public int getNum1(){
        return this.num1;
    }
    public int getNum2(){
        return this.num2;
    }
    public char getOperation(){
        return this.operation;
    }

}
