package o;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.FrameworkSQLiteDatabase;
/* loaded from: classes7.dex */
public final class setStartTrim implements Future<Object> {
    final FrameworkSQLiteDatabase.AnonymousClass2 ag$a;

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException, ExecutionException {
        return null;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return false;
    }

    public setStartTrim(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        this.ag$a = anonymousClass2;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        this.ag$a.dispose();
        return false;
    }
}
