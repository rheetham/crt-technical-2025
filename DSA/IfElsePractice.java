class IfElsePractice {
    public static void main(String[] args) {
        profitOrLoss(Integer.parseInt(args[0]), 120);
        isThreeDigit(931);
        fizzBuzz(15);
    }

    static void profitOrLoss(int cp, int sp) {
        if (sp - cp > 0) {
            System.out.println("Profit");
        } else {
            System.out.println("Loss");
        }
    }

    static void isThreeDigit(int num) {
        if (num > 99 && num < 1000) {
            System.out.println("Is a 3 digit");
        }
    }

    static void fizzBuzz(int val) {
        if (val % 3 == 0 && val % 5 == 0) {
            System.out.println("Is FizzBuzz");
        }
    }

}