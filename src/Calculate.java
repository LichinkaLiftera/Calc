public class Calculate {
    private int num1;
    private int num2;
    private char operation;
    private int result;

    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }
    public void setOperation(char operation){
        this.operation = operation;
    }

    public void calc(){
        switch (operation) {
            case '+' -> this.result = num1 + num2;
            case '-' -> this.result = num1 - num2;
            case '/' -> this.result = num1 / num2;
            case '*' -> this.result = num1 * num2;
        }
    }
    public int getResult(){
        return this.result;
    }
}
