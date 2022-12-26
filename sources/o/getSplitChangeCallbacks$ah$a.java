package o;
/* loaded from: classes5.dex */
final class getSplitChangeCallbacks$ah$a {
    private final int ah$a;
    private final int valueOf;
    private final getSplitChangeCallbacks$ah$a[] values;

    public final getSplitChangeCallbacks$ah$a[] values() {
        return this.values;
    }

    public final int ag$a() {
        return this.valueOf;
    }

    public final int ah$a() {
        return this.ah$a;
    }

    public getSplitChangeCallbacks$ah$a() {
        this.values = new getSplitChangeCallbacks$ah$a[256];
        this.valueOf = 0;
        this.ah$a = 0;
    }

    public getSplitChangeCallbacks$ah$a(int i, int i2) {
        this.values = null;
        this.valueOf = i;
        int i3 = i2 & 7;
        this.ah$a = i3 == 0 ? 8 : i3;
    }
}
