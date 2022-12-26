package o;

import o.BidiFormatter;
/* loaded from: classes3.dex */
final class nextSpanTransition extends BidiFormatter.DirectionalityEstimator {
    private final long values;

    public nextSpanTransition(getExitDir getexitdir, long j) {
        super(getexitdir);
        FingerprintManagerCompat.toString(getexitdir.values() >= j);
        this.values = j;
    }

    @Override // o.BidiFormatter.DirectionalityEstimator, o.getExitDir
    public long values() {
        return super.values() - this.values;
    }

    @Override // o.BidiFormatter.DirectionalityEstimator, o.getExitDir
    public long ag$a() {
        return super.ag$a() - this.values;
    }

    @Override // o.BidiFormatter.DirectionalityEstimator, o.getExitDir
    public long ah$a() {
        return super.ah$a() - this.values;
    }
}
