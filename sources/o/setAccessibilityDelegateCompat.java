package o;

import o.processAppeared;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final /* synthetic */ class setAccessibilityDelegateCompat implements Runnable {
    private final C0373getDy toString;
    private final processAppeared.toString values;

    private setAccessibilityDelegateCompat(processAppeared.toString tostring, C0373getDy c0373getDy) {
        this.values = tostring;
        this.toString = c0373getDy;
    }

    public static Runnable values(processAppeared.toString tostring, C0373getDy c0373getDy) {
        return new setAccessibilityDelegateCompat(tostring, c0373getDy);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.values.valueOf(this.toString.ah$a());
    }
}
