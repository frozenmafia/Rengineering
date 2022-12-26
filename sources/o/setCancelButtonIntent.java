package o;

import o.buildMediaButtonPendingIntent;
/* loaded from: classes4.dex */
public final class setCancelButtonIntent extends buildMediaButtonPendingIntent.valueOf {
    private static buildMediaButtonPendingIntent<setCancelButtonIntent> toString;
    public float valueOf;
    public float values;

    static {
        buildMediaButtonPendingIntent<setCancelButtonIntent> buildmediabuttonpendingintent = buildMediaButtonPendingIntent.toString(256, new setCancelButtonIntent(0.0f, 0.0f));
        toString = buildmediabuttonpendingintent;
        buildmediabuttonpendingintent.toString(0.5f);
    }

    @Override // o.buildMediaButtonPendingIntent.valueOf
    protected buildMediaButtonPendingIntent.valueOf ag$a() {
        return new setCancelButtonIntent(0.0f, 0.0f);
    }

    public static setCancelButtonIntent ah$a(float f, float f2) {
        setCancelButtonIntent ah$a = toString.ah$a();
        ah$a.valueOf = f;
        ah$a.values = f2;
        return ah$a;
    }

    public static void toString(setCancelButtonIntent setcancelbuttonintent) {
        toString.valueOf(setcancelbuttonintent);
    }

    public setCancelButtonIntent() {
    }

    public setCancelButtonIntent(float f, float f2) {
        this.valueOf = f;
        this.values = f2;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof setCancelButtonIntent) {
            setCancelButtonIntent setcancelbuttonintent = (setCancelButtonIntent) obj;
            return this.valueOf == setcancelbuttonintent.valueOf && this.values == setcancelbuttonintent.values;
        }
        return false;
    }

    public String toString() {
        return this.valueOf + "x" + this.values;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.valueOf) ^ Float.floatToIntBits(this.values);
    }
}
