package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int reversedNumber = 0;
        while (number > 0){
            int lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number = number/10;
        }
        System.out.println(reversedNumber);
    }
}
