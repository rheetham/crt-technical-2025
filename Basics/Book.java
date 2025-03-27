class BookRunner {
    public static void main(String args[]) {
        // Create a new class called Book
        // Create three instances
        Book artOfComputerProgramming = new Book(100);
        Book effectiveJava = new Book(50);
        Book cleanCode = new Book(40);

        artOfComputerProgramming.setNoOfCopies(100);
        effectiveJava.setNoOfCopies(50);
        cleanCode.setNoOfCopies(45);
    }

}

class Book {
    private int noOfCopies;

    public Book(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        if (noOfCopies > 0)
            this.noOfCopies = noOfCopies;
    }

    public void increaseNoOfCopies(int howMuch) {
        setNoOfCopies(this.noOfCopies + howMuch);
    }

    public void decreaseNoOfCopies(int howMuch) {
        setNoOfCopies(this.noOfCopies - howMuch);
    }
}
