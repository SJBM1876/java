public class IfStatement {
    public static void main(String[]args) {

        int myInt = 13;

        if(myInt > 0 && myInt <= 10) {
            System.out.println("Number is a value between 0 and 10");
        } else if(myInt > 10 && myInt <= 30) {
            System.out.println("Number is between 11 and 30");
        } else {
            System.out.println("This is false");
        }
    }
}
