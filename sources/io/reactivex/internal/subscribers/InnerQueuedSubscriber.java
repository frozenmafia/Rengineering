package io.reactivex.internal.subscribers;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.SupportSQLiteOpenHelper;
import o.dependencies;
import o.elevationSupported;
import o.getSidecarVersion;
import o.moveToStart;
import o.startProgressAlphaStartAnimation;
/* loaded from: classes7.dex */
public final class InnerQueuedSubscriber<T> extends AtomicReference<getSidecarVersion> implements SupportSQLiteOpenHelper<T>, getSidecarVersion {
    private static final long serialVersionUID = 22876611072430776L;
    volatile boolean done;
    int fusionMode;
    final int limit;
    final startProgressAlphaStartAnimation<T> parent;
    final int prefetch;
    long produced;
    volatile elevationSupported<T> queue;

    public InnerQueuedSubscriber(startProgressAlphaStartAnimation<T> startprogressalphastartanimation, int i) {
        this.parent = startprogressalphastartanimation;
        this.prefetch = i;
        this.limit = i - (i >> 2);
    }

    @Override // o.SupportSQLiteOpenHelper, o.registerConfigurationChangeListener
    public void onSubscribe(getSidecarVersion getsidecarversion) {
        if (SubscriptionHelper.setOnce(this, getsidecarversion)) {
            if (getsidecarversion instanceof dependencies) {
                dependencies dependenciesVar = (dependencies) getsidecarversion;
                int requestFusion = dependenciesVar.requestFusion(3);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = dependenciesVar;
                    this.done = true;
                    this.parent.innerComplete(this);
                    return;
                } else if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = dependenciesVar;
                    moveToStart.valueOf(getsidecarversion, this.prefetch);
                    return;
                }
            }
            this.queue = moveToStart.toString(this.prefetch);
            moveToStart.valueOf(getsidecarversion, this.prefetch);
        }
    }

    @Override // o.registerConfigurationChangeListener
    public void onNext(T t) {
        if (this.fusionMode == 0) {
            this.parent.innerNext(this, t);
        } else {
            this.parent.drain();
        }
    }

    @Override // o.registerConfigurationChangeListener
    public void onError(Throwable th) {
        this.parent.innerError(this, th);
    }

    @Override // o.registerConfigurationChangeListener
    public void onComplete() {
        this.parent.innerComplete(this);
    }

    @Override // o.getSidecarVersion
    public void request(long j) {
        if (this.fusionMode != 1) {
            long j2 = this.produced + j;
            if (j2 >= this.limit) {
                this.produced = 0L;
                get().request(j2);
                return;
            }
            this.produced = j2;
        }
    }

    public void requestOne() {
        if (this.fusionMode != 1) {
            long j = this.produced + 1;
            if (j == this.limit) {
                this.produced = 0L;
                get().request(j);
                return;
            }
            this.produced = j;
        }
    }

    @Override // o.getSidecarVersion
    public void cancel() {
        SubscriptionHelper.cancel(this);
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
}
