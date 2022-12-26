package o;
/* loaded from: classes5.dex */
public final class compatAdded {
    public static int valueOf(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }
}
