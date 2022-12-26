package o;
/* loaded from: classes5.dex */
public final class addOnPageChangeListener$ag$a {
    public /* synthetic */ addOnPageChangeListener$ag$a(getTargetTypes gettargettypes) {
        this();
    }

    public final long ag$a(long j, long j2) {
        return j & (~j2);
    }

    public final int toString(long j) {
        return (j & 2305843009213693952L) != 0 ? 2 : 1;
    }

    private addOnPageChangeListener$ag$a() {
    }

    public final long toString(long j, int i) {
        return ag$a(j, 1073741823L) | (i << 0);
    }

    public final long values(long j, int i) {
        return ag$a(j, 1152921503533105152L) | (i << 30);
    }
}
