package o;

import o.onAbandon;
/* loaded from: classes6.dex */
final class onAbandon$ag$a {
    final String[] ag$a;
    final int toString;
    final onAbandon.valueOf[] valueOf;
    final int values;

    public onAbandon$ag$a(int i, int i2, String[] strArr, onAbandon.valueOf[] valueofArr) {
        this.toString = i;
        this.values = i2;
        this.ag$a = strArr;
        this.valueOf = valueofArr;
    }

    public onAbandon$ag$a(onAbandon onabandon) {
        this.toString = onAbandon.values(onabandon);
        this.values = onAbandon.valueOf(onabandon);
        this.ag$a = onAbandon.ag$a(onabandon);
        this.valueOf = onAbandon.ah$a(onabandon);
    }

    public static onAbandon$ag$a ah$a(int i) {
        return new onAbandon$ag$a(0, 0, new String[i], new onAbandon.valueOf[i >> 1]);
    }
}
