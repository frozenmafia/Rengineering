package o;

import kotlin.reflect.KVariance;
/* loaded from: classes7.dex */
public final /* synthetic */ class ViewGroupUtilsApi14$ag$a {
    public static final /* synthetic */ int[] toString;

    static {
        int[] iArr = new int[KVariance.values().length];
        try {
            iArr[KVariance.INVARIANT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[KVariance.IN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[KVariance.OUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        toString = iArr;
    }
}
