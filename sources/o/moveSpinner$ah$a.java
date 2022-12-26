package o;
/* loaded from: classes5.dex */
final class moveSpinner$ah$a implements Comparable<moveSpinner$ah$a> {
    final int ag$a;
    final Runnable ah$a;
    final long toString;
    volatile boolean values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public moveSpinner$ah$a(Runnable runnable, Long l, int i) {
        this.ah$a = runnable;
        this.toString = l.longValue();
        this.ag$a = i;
    }

    @Override // java.lang.Comparable
    /* renamed from: ah$a */
    public int compareTo(moveSpinner$ah$a movespinner_ah_a) {
        int valueOf = discoverAndInitialize.valueOf(this.toString, movespinner_ah_a.toString);
        return valueOf == 0 ? discoverAndInitialize.toString(this.ag$a, movespinner_ah_a.ag$a) : valueOf;
    }
}
