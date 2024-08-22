public class Q7_commanline {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No values");
        } else {
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
                if (i < args.length - 1) {
                    System.out.print(", ");
                }
            }
        }
    }
}
//output
// inorder to run this programming we need to pass the following command line
// javac Q7_commanline.java 
// java Q7_commanline apple mangp