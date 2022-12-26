package o;
/* loaded from: classes.dex */
public final class evaluateColorChange<T> extends CircularProgressDrawable<T> {
    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onNext(T t) {
        if (this.valueOf == null) {
            this.valueOf = t;
            this.ag$a.dispose();
            countDown();
        }
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onError(Throwable th) {
        if (this.valueOf == null) {
            this.values = th;
        }
        countDown();
    }
}
