package dev.forkathon.kinshipshowcaselab;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ShowcaseActivity extends Activity {
    @Override public void onCreate(Bundle state) {
        super.onCreate(state);
        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setGravity(Gravity.CENTER);
        root.setPadding(48, 48, 48, 48);
        TextView title = new TextView(this);
        title.setText("Kinship Showcase Lab");
        title.setTextSize(28);
        title.setTextColor(Color.rgb(35, 35, 45));
        root.addView(title);
        TextView subtitle = new TextView(this);
        subtitle.setText("Standalone UI / animation / interaction laboratory");
        subtitle.setTextSize(15);
        subtitle.setPadding(0, 24, 0, 0);
        root.addView(subtitle);
        setContentView(root);
    }
}
