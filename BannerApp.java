import java.util.HashMap;
import java.util.Map;

public class BannerApp {

    // UC8: Using a Map for O(1) retrieval and better scalability
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    static {
        // Initialize the "Library" of characters
        patternMap.put('O', new String[]{
            "  *** ",
            " * * ",
            " * * ",
            " * * ",
            "  *** "
        });
        patternMap.put('P', new String[]{
            " **** ",
            " * * ",
            " **** ",
            " * ",
            " * "
        });
        patternMap.put('S', new String[]{
            "  **** ",
            " * ",
            "  *** ",
            "     * ",
            " **** "
        });
    }

    /**
     * Renders the word by looking up patterns in the Map
     */
    public static void renderBanner(String word) {
        if (word == null || word.isEmpty()) return;

        int height = 5; // Standard height for our ASCII art
        StringBuilder[] displayRows = new StringBuilder[height];

        for (int i = 0; i < height; i++) {
            displayRows[i] = new StringBuilder();
        }

        for (char c : word.toUpperCase().toCharArray()) {
            String[] lines = patternMap.getOrDefault(c, new String[]{" ", " ", " ", " ", " "});
            for (int i = 0; i < height; i++) {
                displayRows[i].append(lines[i]).append("  "); 
            }
        }

        for (StringBuilder row : displayRows) {
            System.out.println(row.toString());
        }
    }

    public static void main(String[] args) {
        renderBanner("OOPS");
    }
}