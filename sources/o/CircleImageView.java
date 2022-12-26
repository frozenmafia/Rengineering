package o;

import io.reactivex.internal.disposables.DisposableHelper;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
/* loaded from: classes5.dex */
public abstract class CircleImageView<T, R> implements SupportSQLiteOpenHelper.Factory<T>, StartupLogger<R> {
    protected final SupportSQLiteOpenHelper.Factory<? super R> ag$a;
    protected boolean ah$a;
    protected int toString;
    protected FrameworkSQLiteDatabase.AnonymousClass2 valueOf;
    protected StartupLogger<T> values;

    /* loaded from: classes5.dex */
    public interface OvalShadow<T> extends elevationSupported<T> {
        @Override // o.elevationSupported
        T poll();
    }

    protected boolean ah$a() {
        return true;
    }

    protected void valueOf() {
    }

    public CircleImageView(SupportSQLiteOpenHelper.Factory<? super R> factory) {
        this.ag$a = factory;
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public final void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        if (DisposableHelper.validate(this.valueOf, anonymousClass2)) {
            this.valueOf = anonymousClass2;
            if (anonymousClass2 instanceof StartupLogger) {
                this.values = (StartupLogger) anonymousClass2;
            }
            if (ah$a()) {
                this.ag$a.onSubscribe(this);
                valueOf();
            }
        }
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onError(Throwable th) {
        if (this.ah$a) {
            setProgressBackgroundColor.values(th);
            return;
        }
        this.ah$a = true;
        this.ag$a.onError(th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ag$a(Throwable th) {
        FrameworkSQLiteDatabase.values(th);
        this.valueOf.dispose();
        onError(th);
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onComplete() {
        if (this.ah$a) {
            return;
        }
        this.ah$a = true;
        this.ag$a.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int valueOf(int i) {
        StartupLogger<T> startupLogger = this.values;
        if (startupLogger == null || (i & 4) != 0) {
            return 0;
        }
        int requestFusion = startupLogger.requestFusion(i);
        if (requestFusion != 0) {
            this.toString = requestFusion;
        }
        return requestFusion;
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public void dispose() {
        this.valueOf.dispose();
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public boolean isDisposed() {
        return this.valueOf.isDisposed();
    }

    @Override // o.elevationSupported
    public boolean isEmpty() {
        return this.values.isEmpty();
    }

    @Override // o.elevationSupported
    public void clear() {
        this.values.clear();
    }

    @Override // o.elevationSupported
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
