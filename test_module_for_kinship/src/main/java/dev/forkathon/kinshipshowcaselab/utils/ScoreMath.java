package dev.forkathon.kinshipshowcaselab.utils;

public final class ScoreMath {
    private ScoreMath() {}
    public static double clamp(double value, double min, double max) {
        return Math.max(min, Math.min(max, value));
    }
    public static double weighted(double relevance, double trust, double freshness) {
        return clamp(relevance * 0.55 + trust * 0.30 + freshness * 0.15, 0, 1);
    }
    public static double freshness(long ageMs, long horizonMs) {
        if (horizonMs <= 0) return 0;
        return clamp(1.0 - ((double) ageMs / horizonMs), 0, 1);
    }
}
