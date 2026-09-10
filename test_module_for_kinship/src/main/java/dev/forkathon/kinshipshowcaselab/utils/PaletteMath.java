package dev.forkathon.kinshipshowcaselab.utils;

public final class PaletteMath {
    private PaletteMath() {}
    public static int blend(int a, int b, float amount) {
        amount = Math.max(0f, Math.min(1f, amount));
        int ar=(a>>16)&255, ag=(a>>8)&255, ab=a&255;
        int br=(b>>16)&255, bg=(b>>8)&255, bb=b&255;
        int r=(int)(ar+(br-ar)*amount), g=(int)(ag+(bg-ag)*amount), bl=(int)(ab+(bb-ab)*amount);
        return android.graphics.Color.rgb(r,g,bl);
    }
}
