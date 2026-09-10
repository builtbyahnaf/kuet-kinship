package dev.forkathon.kinshipshowcaselab.components;

import android.content.Context;
import android.util.AttributeSet;
import android.graphics.*;
import android.view.*;
import android.widget.*;

public class PulseTextView extends TextView {
    private final Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private long createdAt = System.currentTimeMillis();
    private boolean active = true;

    public PulseTextView(Context context) { super(context); initialize(); }
    public PulseTextView(Context context, AttributeSet attrs) { super(context, attrs); initialize(); }
    public PulseTextView(Context context, AttributeSet attrs, int style) { super(context, attrs, style); initialize(); }

    private void initialize() {
        paint.setStrokeWidth(2f);
        setWillNotDraw(false);
    }

    public void setActive(boolean value) { active = value; invalidate(); }
    public boolean isActive() { return active; }
    public long getAgeMs() { return System.currentTimeMillis() - createdAt; }


    private float emphasis = 1f;
    public void setEmphasis(float value) { emphasis = Math.max(0.1f, Math.min(3f, value)); invalidate(); }
    public float getEmphasis() { return emphasis; }

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
        return "PulseTextView[active=" + active + ", ageMs=" + getAgeMs() + "]";
    }
}
