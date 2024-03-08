package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        String alfa = "";
        alfa += number%10;
        number = number/10;
        alfa+=number%10;
        number = number/10;
        alfa+=number%10;
        System.out.println(alfa);

    }
}