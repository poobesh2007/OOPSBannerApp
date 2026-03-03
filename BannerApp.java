public class BannerApp {

    // UC7: Encapsulating character data and patterns
    public static class CharacterPattern {
        private final char character;
        private final String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() { return character; }
        public String[] getPattern() { return pattern; }
    }

    // Static store for our patterns
    public static class CharacterPatternMap {
        private static final CharacterPattern[] patterns = {
            new CharacterPattern('O', new String[]{
                "  *** ", " * * ", " * * ", " * * ", "  *** "
            }),
            new CharacterPattern('P', new String[]{
                " **** ", " * * ", " **** ", " * ", " * "
            }),
            new CharacterPattern('S', new String[]{
                "  **** ", " * ", "  *** ", "     * ", " **** "
            })
        };

        public static String[] getPatternFor(char c) {
            for (CharacterPattern cp : patterns) {
                if (Character.toUpperCase(c) == cp.getCharacter()) {
                    return cp.getPattern();
                }
            }
            return new String[]{" ", " ", " ", " ", " "}; // Default empty
        }
    }

    public static void displayBanner(String word) {
        int height = 5; 
        StringBuilder[] rows = new StringBuilder[height];
        
        for (int i = 0; i < height; i++) {
            rows[i] = new StringBuilder();
        }

        for (char c : word.toCharArray()) {
            String[] pattern = CharacterPatternMap.getPatternFor(c);
            for (int i = 0; i < height; i++) {
                rows[i].append(pattern[i]).append("  "); // Spacing between letters
            }
        }

        for (StringBuilder row : rows) {
            System.out.println(row.toString());
        }
    }

    public static void main(String[] args) {
        displayBanner("OOPS");
    }
}