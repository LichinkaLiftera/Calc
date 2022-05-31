import java.util.Scanner;

public class Input {
    private String expression;
    private String equation;
    private String format;

    public void setExpression() throws Exception {
        System.out.println("Введите выражение формата 2 + 2 или два римских числа от I до X:[III + V] + Enter" );
        Scanner sc = new Scanner(System.in);
        equation = sc.nextLine().replaceAll("\\s","");
        filter();
    }
    private void filter() throws Exception {

        if (equation.isEmpty()){
            throw new NullPointerException();
        }else
            if (equation.matches("\\d\\d?[+/*\\-]\\d\\d?")){
                expression = equation;
                format = String.valueOf(Format.ARABIC);
        }else
            if (equation.matches("[IVX]+[+/*\\-][IVX]+")){
                expression = equation;
                format = String.valueOf(Format.ROME);
        }else
            if (equation.matches("\\d\\d?[+/*\\-]?[IVX]")){
            throw new Exception("Разные ситстемы исчисления");
        }else
            if (equation.matches("[\\dA-Z]{0,3}.?")){
            throw new Exception("Строка не является математической операцией");
        }else {
                throw new Exception("Неверный формат ввода");
            }
    }
    public String getExpression(){
        return this.expression;
    }
    public String getFormat(){
        return format;
    }
}
