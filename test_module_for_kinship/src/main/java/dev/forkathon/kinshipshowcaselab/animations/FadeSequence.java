package dev.forkathon.kinshipshowcaselab.animations;

public final class FadeSequence {
    private FadeSequence() {}

    public static float interpolate(float start, float end, float progress) {
        float t = Math.max(0f, Math.min(1f, progress));
        float eased = t * t * (3f - 2f * t);
        return start + (end - start) * eased;
    }

    public static float sample(float progress) {
        float t = Math.max(0f, Math.min(1f, progress));
        return (float)(0.5 - 0.5 * Math.cos(t * Math.PI));
    }

    public static float overshoot(float progress, float tension) {
        float t = Math.max(0f, Math.min(1f, progress));
        float x = t - 1f;
        return x * x * ((tension + 1f) * x + tension) + 1f;
    }

    public static float damped(float progress, float damping, float frequency) {
        float t = Math.max(0f, Math.min(1f, progress));
        return (float)(1.0 - Math.exp(-damping * t) * Math.cos(frequency * t * Math.PI));
    }

    public static String description() {
        return "FadeSequence: reusable standalone motion primitive";
    }
}
