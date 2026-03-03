/**
 * OOPS Banner App - UC6
 * Focus: Modularity through Static Methods
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        // Modular Initialization: Methods are called to populate the 2D array
        String[][] banner = {
            getPatternO(),
            getPatternO(),
            getPatternP(),
            getPatternS()
        };

        renderBanner(banner);
    }

    // --- Static Helper Methods (Encapsulation of Patterns) ---

    static String[] getPatternO() {
        return new String[]{
            " ***** ",
            "* *",
            "* *",
            "* *",
            " ***** "
        };
    }

    static String[] getPatternP() {
        return new String[]{
            "****** ",
            "* *",
            "****** ",
            "* ",
            "* "
        };
    }

    static String[] getPatternS() {
        return new String[]{
            " ***** ",
            "* ",
            " ***** ",
            "      *",
            " ***** "
        };
    }

    // Standard loop-based rendering logic
    static void renderBanner(String[][] banner) {
        int rows = 5; // Height of each character
        for (int i = 0; i < rows; i++) {
            for (String[] character : banner) {
                System.out.print(character[i] + "  "); // Space between letters
            }
            System.out.println();
        }
    }
}