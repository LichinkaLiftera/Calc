public class Output {
    private String format;
    private int result;


    public void setFormat(String format) {
        this.format = format;
    }
    public void setResult(int result){
        this.result = result;
    }

    public void release() throws Exception {
        if (format.equals(String.valueOf(Format.ARABIC))){
            System.out.print(result);
        }else
            if (format.equals(String.valueOf(Format.ROME))){
                if (result >= 0) {
                    System.out.print(RomanNum.values()[result]);
                }else {
                     throw new Exception("Значение не может быть меньше 1");
                }
            }
    }
}
