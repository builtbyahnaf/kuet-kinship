package dev.forkathon.kinshipshowcaselab.components;

import android.content.Context;
import android.util.AttributeSet;
import android.graphics.*;
import android.view.*;
import android.widget.*;

public class ShimmerPanel extends View {
    private final Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private long createdAt = System.currentTimeMillis();
    private boolean active = true;

    public ShimmerPanel(Context context) { super(context); initialize(); }
    public ShimmerPanel(Context context, AttributeSet attrs) { super(context, attrs); initialize(); }
    public ShimmerPanel(Context context, AttributeSet attrs, int style) { super(context, attrs, style); initialize(); }

    private void initialize() {
        paint.setStrokeWidth(2f);
        setWillNotDraw(false);
    }

    public void setActive(boolean value) { active = value; invalidate(); }
    public boolean isActive() { return active; }
    public long getAgeMs() { return System.currentTimeMillis() - createdAt; }


    private float intensity = 1f;
    public void setIntensity(float value) { intensity = Math.max(0f, Math.min(2f, value)); invalidate(); }
    public float getIntensity() { return intensity; }

    @Override protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        float radius = Math.min(width, height) * 0.12f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setAlpha(active ? 180 : 70);
        canvas.drawRoundRect(1, 1, width - 1, height - 1, radius, radius, paint);
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(255);
    }

    public void animateActivation() {
        animate().alpha(active ? 1f : 0.65f).setDuration(180).start();
    }

    public String componentInfo() {
        return "ShimmerPanel[active=" + active + ", ageMs=" + getAgeMs() + "]";
    }
}
