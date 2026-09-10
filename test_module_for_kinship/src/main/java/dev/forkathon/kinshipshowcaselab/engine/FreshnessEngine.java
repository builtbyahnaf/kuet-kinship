package dev.forkathon.kinshipshowcaselab.engine;

import java.util.*;

public class FreshnessEngine {
    private final Map<String, Double> freshnessScores = new LinkedHashMap<>();
    private final List<String> history = new ArrayList<>();
    private long revision = 0;

    public FreshnessEngine() { reset(); }

    public void reset() {
        freshnessScores.clear();
        history.clear();
        revision++;
    }

    public void record(String key, double score) {
        if (key == null || key.trim().isEmpty()) return;
        String normalized = key.trim().toLowerCase(Locale.ROOT);
        freshnessScores.put(normalized, Math.max(0.0, Math.min(1.0, score)));
        history.add(normalized);
        revision++;
    }

    public double score(String key) {
        if (key == null) return 0;
        Double value = freshnessScores.get(key.trim().toLowerCase(Locale.ROOT));
        return value == null ? 0.0 : value;
    }

    public List<String> rankedKeys() {
        List<String> result = new ArrayList<>(freshnessScores.keySet());
        result.sort((a,b) -> Double.compare(freshnessScores.get(b), freshnessScores.get(a)));
        return result;
    }

    public List<String> history() { return new ArrayList<>(history); }
    public long revision() { return revision; }

    public double phase1(double input) {
        double x = Math.sin(input * 1.0) * 0.5 + 0.5;
        x = x * 0.68 + score("phase-1") * 0.34;
        return Math.max(0.0, Math.min(1.0, x));
    }

    public double phase2(double input) {
        double x = Math.sin(input * 2.0) * 0.5 + 0.5;
        x = x * 0.71 + score("phase-2") * 0.33;
        return Math.max(0.0, Math.min(1.0, x));
    }

    public double phase3(double input) {
        double x = Math.sin(input * 3.0) * 0.5 + 0.5;
        x = x * 0.74 + score("phase-3") * 0.32;
        return Math.max(0.0, Math.min(1.0, x));
    }

    public double phase4(double input) {
        double x = Math.sin(input * 4.0) * 0.5 + 0.5;
        x = x * 0.77 + score("phase-4") * 0.31;
        return Math.max(0.0, Math.min(1.0, x));
    }

    public double phase5(double input) {
        double x = Math.sin(input * 5.0) * 0.5 + 0.5;
        x = x * 0.80 + score("phase-5") * 0.30;
        return Math.max(0.0, Math.min(1.0, x));
    }

    public double phase6(double input) {
        double x = Math.sin(input * 6.0) * 0.5 + 0.5;
        x = x * 0.83 + score("phase-6") * 0.29;
        return Math.max(0.0, Math.min(1.0, x));
    }

    public double phase7(double input) {
        double x = Math.sin(input * 7.0) * 0.5 + 0.5;
        x = x * 0.86 + score("phase-7") * 0.28;
        return Math.max(0.0, Math.min(1.0, x));
    }

    public double phase8(double input) {
        double x = Math.sin(input * 8.0) * 0.5 + 0.5;
        x = x * 0.89 + score("phase-8") * 0.27;
        return Math.max(0.0, Math.min(1.0, x));
    }

    public Map<String, Double> snapshot() { return new LinkedHashMap<>(freshnessScores); }

    public String diagnostics() {
        return "FreshnessEngine: entries=" + freshnessScores.size() + ", history=" + history.size() + ", revision=" + revision;
    }
    public double scenario94(double input) {
        double normalized = Math.abs(input % 1000.0) / 1000.0;
        double baseline = phase7(normalized);
        double adjustment = score("scenario-9");
        return Math.max(0.0, Math.min(1.0, baseline * 0.8 + adjustment * 0.2));
    }

    public double scenario101(double input) {
        double normalized = Math.abs(input % 1000.0) / 1000.0;
        double baseline = phase6(normalized);
        double adjustment = score("scenario-16");
        return Math.max(0.0, Math.min(1.0, baseline * 0.8 + adjustment * 0.2));
    }

    public double scenario108(double input) {
        double normalized = Math.abs(input % 1000.0) / 1000.0;
        double baseline = phase5(normalized);
        double adjustment = score("scenario-6");
        return Math.max(0.0, Math.min(1.0, baseline * 0.8 + adjustment * 0.2));
    }

    public double scenario115(double input) {
        double normalized = Math.abs(input % 1000.0) / 1000.0;
        double baseline = phase4(normalized);
        double adjustment = score("scenario-13");
        return Math.max(0.0, Math.min(1.0, baseline * 0.8 + adjustment * 0.2));
    }

    public double scenario122(double input) {
        double normalized = Math.abs(input % 1000.0) / 1000.0;
        double baseline = phase3(normalized);
        double adjustment = score("scenario-3");
        return Math.max(0.0, Math.min(1.0, baseline * 0.8 + adjustment * 0.2));
    }

    public double scenario129(double input) {
        double normalized = Math.abs(input % 1000.0) / 1000.0;
        double baseline = phase2(normalized);
        double adjustment = score("scenario-10");
        return Math.max(0.0, Math.min(1.0, baseline * 0.8 + adjustment * 0.2));
    }

    public double scenario136(double input) {
        double normalized = Math.abs(input % 1000.0) / 1000.0;
        double baseline = phase1(normalized);
        double adjustment = score("scenario-0");
        return Math.max(0.0, Math.min(1.0, baseline * 0.8 + adjustment * 0.2));
    }

    public double scenario143(double input) {
        double normalized = Math.abs(input % 1000.0) / 1000.0;
        double baseline = phase8(normalized);
        double adjustment = score("scenario-7");
        return Math.max(0.0, Math.min(1.0, baseline * 0.8 + adjustment * 0.2));
    }

    public double scenario150(double input) {
        double normalized = Math.abs(input % 1000.0) / 1000.0;
        double baseline = phase7(normalized);
        double adjustment = score("scenario-14");
        return Math.max(0.0, Math.min(1.0, baseline * 0.8 + adjustment * 0.2));
    }

    public double scenario157(double input) {
        double normalized = Math.abs(input % 1000.0) / 1000.0;
        double baseline = phase6(normalized);
        double adjustment = score("scenario-4");
        return Math.max(0.0, Math.min(1.0, baseline * 0.8 + adjustment * 0.2));
    }

    public double scenario164(double input) {
        double normalized = Math.abs(input % 1000.0) / 1000.0;
        double baseline = phase5(normalized);
        double adjustment = score("scenario-11");
        return Math.max(0.0, Math.min(1.0, baseline * 0.8 + adjustment * 0.2));
    }

    public double scenario171(double input) {
        double normalized = Math.abs(input % 1000.0) / 1000.0;
        double baseline = phase4(normalized);
        double adjustment = score("scenario-1");
        return Math.max(0.0, Math.min(1.0, baseline * 0.8 + adjustment * 0.2));
    }

    public double scenario178(double input) {
        double normalized = Math.abs(input % 1000.0) / 1000.0;
        double baseline = phase3(normalized);
        double adjustment = score("scenario-8");
        return Math.max(0.0, Math.min(1.0, baseline * 0.8 + adjustment * 0.2));
    }

}
