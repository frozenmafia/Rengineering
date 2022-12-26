package io.reactivex.internal.observers;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.StartupLogger;
import o.SupportSQLiteOpenHelper;
import o.applyFinishTranslation;
import o.elevationSupported;
import o.moveToStart;
/* loaded from: classes7.dex */
public final class InnerQueuedObserver<T> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements SupportSQLiteOpenHelper.Factory<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
    private static final long serialVersionUID = -5417183359794346637L;
    volatile boolean done;
    int fusionMode;
    final applyFinishTranslation<T> parent;
    final int prefetch;
    elevationSupported<T> queue;

    public InnerQueuedObserver(applyFinishTranslation<T> applyfinishtranslation, int i) {
        this.parent = applyfinishtranslation;
        this.prefetch = i;
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        if (DisposableHelper.setOnce(this, anonymousClass2)) {
            if (anonymousClass2 instanceof StartupLogger) {
                StartupLogger startupLogger = (StartupLogger) anonymousClass2;
                int requestFusion = startupLogger.requestFusion(3);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = startupLogger;
                    this.done = true;
                    this.parent.innerComplete(this);
                    return;
                } else if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = startupLogger;
                    return;
                }
            }
            this.queue = moveToStart.toString(-this.prefetch);
        }
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onNext(T t) {
        if (this.fusionMode == 0) {
            this.parent.innerNext(this, t);
        } else {
            this.parent.drain();
        }
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onError(Throwable th) {
        this.parent.innerError(this, th);
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onComplete() {
        this.parent.innerComplete(this);
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    public boolean isDone() {
        return this.done;
    }

    public void setDone() {
        this.done = true;
    }

    public elevationSupported<T> queue() {
        return this.queue;
    }

    public int fusionMode() {
        return this.fusionMode;
    }
}
