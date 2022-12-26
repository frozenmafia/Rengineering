package o;

import o.setRecycledViewPool;
/* loaded from: classes7.dex */
final /* synthetic */ class unused implements Runnable {
    private final setRecycledViewPool.toString ah$a;
    private final String toString;

    private unused(setRecycledViewPool.toString tostring, String str) {
        this.ah$a = tostring;
        this.toString = str;
    }

    public static Runnable toString(setRecycledViewPool.toString tostring, String str) {
        return new unused(tostring, str);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.ah$a.toString(this.toString);
    }
}
