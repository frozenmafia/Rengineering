package o;

import o.buildMediaButtonPendingIntent;
/* loaded from: classes4.dex */
public class generateBigContentView extends buildMediaButtonPendingIntent.valueOf {
    private static buildMediaButtonPendingIntent<generateBigContentView> toString;
    public double ag$a;
    public double values;

    static {
        buildMediaButtonPendingIntent<generateBigContentView> buildmediabuttonpendingintent = buildMediaButtonPendingIntent.toString(64, new generateBigContentView(0.0d, 0.0d));
        toString = buildmediabuttonpendingintent;
        buildmediabuttonpendingintent.toString(0.5f);
    }

    public static generateBigContentView valueOf(double d, double d2) {
        generateBigContentView ah$a = toString.ah$a();
        ah$a.values = d;
        ah$a.ag$a = d2;
        return ah$a;
    }

    public static void toString(generateBigContentView generatebigcontentview) {
        toString.valueOf(generatebigcontentview);
    }

    @Override // o.buildMediaButtonPendingIntent.valueOf
    protected buildMediaButtonPendingIntent.valueOf ag$a() {
        return new generateBigContentView(0.0d, 0.0d);
    }

    private generateBigContentView(double d, double d2) {
        this.values = d;
        this.ag$a = d2;
    }

    public String toString() {
        return "MPPointD, x: " + this.values + ", y: " + this.ag$a;
    }
}
