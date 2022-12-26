package o;

import o.PrecomputedTextCompat;
import o.SupportMenuItem;
import o.skipEntityForward;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class setHyphenationFrequency implements PrecomputedTextCompat.PrecomputedTextFutureTask.PrecomputedTextCallback {
    private final SupportMenuItem.CC ag$a;
    private final long ah$a;
    private final SupportMenuItem.CC toString;
    private long values;

    @Override // o.skipEntityForward
    public boolean ah$a() {
        return true;
    }

    public setHyphenationFrequency(long j, long j2, long j3) {
        this.values = j;
        this.ah$a = j3;
        SupportMenuItem.CC cc = new SupportMenuItem.CC();
        this.ag$a = cc;
        SupportMenuItem.CC cc2 = new SupportMenuItem.CC();
        this.toString = cc2;
        cc.ag$a(0L);
        cc2.ag$a(j2);
    }

    @Override // o.PrecomputedTextCompat.PrecomputedTextFutureTask.PrecomputedTextCallback
    public long toString(long j) {
        return this.ag$a.toString(getElevationDegrees.ag$a(this.toString, j, true, true));
    }

    @Override // o.PrecomputedTextCompat.PrecomputedTextFutureTask.PrecomputedTextCallback
    public long valueOf() {
        return this.ah$a;
    }

    @Override // o.skipEntityForward
    public long ag$a() {
        return this.values;
    }

    @Override // o.skipEntityForward
    public skipEntityForward.toString ah$a(long j) {
        int ag$a = getElevationDegrees.ag$a(this.ag$a, j, true, true);
        skipTagBackward skiptagbackward = new skipTagBackward(this.ag$a.toString(ag$a), this.toString.toString(ag$a));
        if (skiptagbackward.ag$a == j || ag$a == this.ag$a.valueOf() - 1) {
            return new skipEntityForward.toString(skiptagbackward);
        }
        int i = ag$a + 1;
        return new skipEntityForward.toString(skiptagbackward, new skipTagBackward(this.ag$a.toString(i), this.toString.toString(i)));
    }

    public void toString(long j, long j2) {
        if (valueOf(j)) {
            return;
        }
        this.ag$a.ag$a(j);
        this.toString.ag$a(j2);
    }

    public boolean valueOf(long j) {
        SupportMenuItem.CC cc = this.ag$a;
        return j - cc.toString(cc.valueOf() - 1) < 100000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ag$a(long j) {
        this.values = j;
    }
}
