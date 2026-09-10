package dev.forkathon.kinshipshowcaselab.utils;

public final class TextNormalizer {
    private TextNormalizer() {}
    public static String normalize(String input) {
        if (input == null) return "";
        return input.trim().replaceAll("\\s+", " ").toLowerCase(java.util.Locale.ROOT);
    }
    public static String[] tokens(String input) {
        String normalized = normalize(input);
        if (normalized.isEmpty()) return new String[0];
        return normalized.split("[^a-z0-9]+");
    }
    public static boolean containsToken(String text, String token) {
        for (String current : tokens(text)) if (current.equals(normalize(token))) return true;
        return false;
    }
}
