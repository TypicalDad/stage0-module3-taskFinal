package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int Thousands = number /1000;
        int afterThousands = number - Thousands*1000;
        int Hundreds = afterThousands /100;
        int afterHundreds = afterThousands - Hundreds*100;
        int tenth = afterHundreds /10;
        int aftertenth = afterHundreds - tenth*10;
        int x = Thousands + Hundreds + tenth + aftertenth;
        System.out.println(x);
    }
}
