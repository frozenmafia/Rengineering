package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class NonParcelField<U, T extends U> extends endFakeDrag<T> implements Runnable {
    public final long values;

    public NonParcelField(long j, setPatternPath<? super U> setpatternpath) {
        super(setpatternpath.getContext(), setpatternpath);
        this.values = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        valueOf((Throwable) ParcelField.toString(this.values, this));
    }

    @Override // o.setupAnimatorsForTarget, o.VectorDrawableCompat.VPathRenderer
    public String valueOf() {
        return super.valueOf() + "(timeMillis=" + this.values + ')';
    }
}
