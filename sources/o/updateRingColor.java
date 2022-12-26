package o;

import o.SupportSQLiteOpenHelper;
/* loaded from: classes.dex */
public final class updateRingColor<T> extends setProgressRotation<T, T> {
    final FrameworkSQLiteStatement<? super T> valueOf;

    public updateRingColor(noBackupDirectory<T> nobackupdirectory, FrameworkSQLiteStatement<? super T> frameworkSQLiteStatement) {
        super(nobackupdirectory);
        this.valueOf = frameworkSQLiteStatement;
    }

    @Override // o.SupportSQLiteQuery
    protected void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        this.toString.subscribe(new values(factory, this.valueOf));
    }

    /* loaded from: classes5.dex */
    static final class values<T> extends CircleImageView<T, T> {
        final FrameworkSQLiteStatement<? super T> HaptikSDK$a;

        values(SupportSQLiteOpenHelper.Factory<? super T> factory, FrameworkSQLiteStatement<? super T> frameworkSQLiteStatement) {
            super(factory);
            this.HaptikSDK$a = frameworkSQLiteStatement;
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onNext(T t) {
            this.ag$a.onNext(t);
            if (this.toString == 0) {
                try {
                    this.HaptikSDK$a.accept(t);
                } catch (Throwable th) {
                    ag$a(th);
                }
            }
        }

        @Override // o.e
        public int requestFusion(int i) {
            return valueOf(i);
        }

        @Override // o.elevationSupported
        public T poll() throws Exception {
            T poll = this.values.poll();
            if (poll != null) {
                this.HaptikSDK$a.accept(poll);
            }
            return poll;
        }
    }
}
