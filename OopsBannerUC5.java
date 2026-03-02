public class OopsBannerUC5 {

    public static void main(String[] args) {

        // Array declaration + initialization in single step
        String[] banner = {
                String.join("", " *****   ", " ******  ", " ******  ", " ****** "),
                String.join("", "*     *  ", "*     *  ", "*     *  ", "*     *"),
                String.join("", "*     *  ", "******   ", "******   ", "****** "),
                String.join("", "*     *  ", "*        ", "*        ", "*      "),
                String.join("", " *****   ", "*        ", "*        ", "*      "),
                String.join("", "         ", " ******  ", " ******  ", " ****** "),
                String.join("", "         ", "*        ", "*        ", "*      ")
        };

        // Enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}