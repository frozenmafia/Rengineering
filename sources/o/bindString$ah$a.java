package o;

import o.bindString;
/* loaded from: classes5.dex */
public final class bindString$ah$a {
    private final int ag$a;
    private final bindString.valueOf[] toString;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bindString$ah$a(int i, bindString.valueOf... valueofArr) {
        this.ag$a = i;
        this.toString = valueofArr;
    }

    public int ah$a() {
        return this.ag$a;
    }

    public int valueOf() {
        int i = 0;
        for (bindString.valueOf valueof : this.toString) {
            i += valueof.values();
        }
        return i;
    }

    public int values() {
        return this.ag$a * valueOf();
    }

    public bindString.valueOf[] ag$a() {
        return this.toString;
    }
}
