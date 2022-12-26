package o;
/* loaded from: classes5.dex */
final class access$getHINGE$cp {
    private validateFeatureBounds$window_release ag$a;
    private validateFeatureBounds$window_release values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ag$a(validateFeatureBounds$window_release validatefeaturebounds_window_release) {
        synchronized (this) {
            if (validatefeaturebounds_window_release == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            validateFeatureBounds$window_release validatefeaturebounds_window_release2 = this.values;
            if (validatefeaturebounds_window_release2 != null) {
                validatefeaturebounds_window_release2.ah$a = validatefeaturebounds_window_release;
                this.values = validatefeaturebounds_window_release;
            } else if (this.ag$a == null) {
                this.values = validatefeaturebounds_window_release;
                this.ag$a = validatefeaturebounds_window_release;
            } else {
                throw new IllegalStateException("Head present, but no tail");
            }
            notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public validateFeatureBounds$window_release valueOf() {
        validateFeatureBounds$window_release validatefeaturebounds_window_release;
        synchronized (this) {
            validatefeaturebounds_window_release = this.ag$a;
            if (validatefeaturebounds_window_release != null) {
                validateFeatureBounds$window_release validatefeaturebounds_window_release2 = validatefeaturebounds_window_release.ah$a;
                this.ag$a = validatefeaturebounds_window_release2;
                if (validatefeaturebounds_window_release2 == null) {
                    this.values = null;
                }
            }
        }
        return validatefeaturebounds_window_release;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public validateFeatureBounds$window_release valueOf(int i) throws InterruptedException {
        validateFeatureBounds$window_release valueOf;
        synchronized (this) {
            if (this.ag$a == null) {
                wait(i);
            }
            valueOf = valueOf();
        }
        return valueOf;
    }
}
