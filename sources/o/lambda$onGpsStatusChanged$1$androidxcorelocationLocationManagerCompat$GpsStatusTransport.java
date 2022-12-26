package o;
/* renamed from: o.lambda$onGpsStatusChanged$1$androidx-core-location-LocationManagerCompat$GpsStatusTransport  reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class lambda$onGpsStatusChanged$1$androidxcorelocationLocationManagerCompat$GpsStatusTransport {
    public static int HaptikSDK$a(int i) {
        return i & 32;
    }

    public static int ag$a(int i) {
        return i & 7;
    }

    public static int ah$a(int i) {
        return i & 64;
    }

    public static int toString(int i) {
        return i & 128;
    }

    public static int valueOf(int i, int i2, int i3, int i4, int i5) {
        return i | i2 | i3 | i4 | i5;
    }

    public static int values(int i) {
        return i & 24;
    }

    public static int valueOf(int i) {
        return values(i, 0, 0);
    }

    public static int values(int i, int i2, int i3) {
        return valueOf(i, i2, i3, 0, 128);
    }
}
