package o;

import o.AccessibilityEventCompat;
/* loaded from: classes3.dex */
public final class getMovementGranularity extends AccessibilityEventCompat.ContentChangeType<Integer> {
    private int ag$a;
    private String ah$a;
    private int values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getMovementGranularity(int i, int i2, String str) {
        super(Integer.valueOf(i), i2, str);
        runAnimators.ag$a(str, "errorMsg");
        this.values = i;
        this.ag$a = i2;
        this.ah$a = str;
    }

    @Override // o.setAction
    public boolean ag$a() {
        int i = this.values;
        if (i == Integer.MIN_VALUE) {
            asRecord.valueOf("Timer End Value not defined. Not showing notification");
            return false;
        }
        boolean z = i <= this.ag$a;
        if (z) {
            asRecord.valueOf(this.ah$a + ". Not showing notification");
        }
        return !z;
    }
}
