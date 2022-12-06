package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int newNymber = number;
        int newNumber = newNymber /100;
        int nowNumber = number - (newNumber *100);
        int blueNumber = nowNumber / 10;
        int newwNumber = nowNumber - (blueNumber *10);
        System.out.println(newwNumber +""+ blueNumber +""+ newNumber);
    }
}
