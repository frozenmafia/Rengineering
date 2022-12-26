package o;

import defpackage.ah;
/* loaded from: classes.dex */
public final class ah$b {

    /* renamed from: o.ah$b$5  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] ag$a;

        static {
            int[] iArr = new int[ah.a.values().length];
            ag$a = iArr;
            try {
                iArr[ah.a.ACCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ag$a[ah.a.REFRESH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static ah valueOf(ah.a aVar) {
        int i = AnonymousClass5.ag$a[aVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new cc();
            }
            throw new IllegalArgumentException("Unknown token type for factory " + aVar);
        }
        return new onAudioInfoChanged();
    }
}
