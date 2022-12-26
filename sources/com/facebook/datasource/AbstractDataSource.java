package com.facebook.datasource;

import android.util.Pair;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import o.FragmentAnim;
import o.addDisappearingFragmentView;
/* loaded from: classes4.dex */
public abstract class AbstractDataSource<T> implements FragmentAnim.AnimationOrAnimator<T> {
    private static volatile values sDataSourceInstrumenter;
    private Map<String, Object> mExtras;
    private T mResult = null;
    private Throwable mFailureThrowable = null;
    private float mProgress = 0.0f;
    private boolean mIsClosed = false;
    private DataSourceStatus mDataSourceStatus = DataSourceStatus.IN_PROGRESS;
    private final ConcurrentLinkedQueue<Pair<addDisappearingFragmentView<T>, Executor>> mSubscribers = new ConcurrentLinkedQueue<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public enum DataSourceStatus {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    /* loaded from: classes4.dex */
    public interface values {
        Runnable valueOf(Runnable runnable, String str);
    }

    protected void closeResult(T t) {
    }

    @Override // o.FragmentAnim.AnimationOrAnimator
    public boolean hasMultipleResults() {
        return false;
    }

    public static void provideInstrumenter(values valuesVar) {
        sDataSourceInstrumenter = valuesVar;
    }

    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.mIsClosed;
        }
        return z;
    }

    @Override // o.FragmentAnim.AnimationOrAnimator
    public boolean isFinished() {
        boolean z;
        synchronized (this) {
            z = this.mDataSourceStatus != DataSourceStatus.IN_PROGRESS;
        }
        return z;
    }

    @Override // o.FragmentAnim.AnimationOrAnimator
    public boolean hasResult() {
        boolean z;
        synchronized (this) {
            z = this.mResult != null;
        }
        return z;
    }

    @Override // o.FragmentAnim.AnimationOrAnimator
    public T getResult() {
        T t;
        synchronized (this) {
            t = this.mResult;
        }
        return t;
    }

    @Override // o.FragmentAnim.AnimationOrAnimator
    public Map<String, Object> getExtras() {
        return this.mExtras;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setExtras(Map<String, Object> map) {
        this.mExtras = map;
    }

    public boolean hasFailed() {
        boolean z;
        synchronized (this) {
            z = this.mDataSourceStatus == DataSourceStatus.FAILURE;
        }
        return z;
    }

    @Override // o.FragmentAnim.AnimationOrAnimator
    public Throwable getFailureCause() {
        Throwable th;
        synchronized (this) {
            th = this.mFailureThrowable;
        }
        return th;
    }

    @Override // o.FragmentAnim.AnimationOrAnimator
    public float getProgress() {
        float f;
        synchronized (this) {
            f = this.mProgress;
        }
        return f;
    }

    @Override // o.FragmentAnim.AnimationOrAnimator
    public boolean close() {
        synchronized (this) {
            if (this.mIsClosed) {
                return false;
            }
            this.mIsClosed = true;
            T t = this.mResult;
            this.mResult = null;
            if (t != null) {
                closeResult(t);
            }
            if (!isFinished()) {
                notifyDataSubscribers();
            }
            synchronized (this) {
                this.mSubscribers.clear();
            }
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // o.FragmentAnim.AnimationOrAnimator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void subscribe(o.addDisappearingFragmentView<T> r3, java.util.concurrent.Executor r4) {
        /*
            r2 = this;
            o.Fragment.AnonymousClass8.ah$a(r3)
            o.Fragment.AnonymousClass8.ah$a(r4)
            monitor-enter(r2)
            boolean r0 = r2.mIsClosed     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto Ld
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            return
        Ld:
            com.facebook.datasource.AbstractDataSource$DataSourceStatus r0 = r2.mDataSourceStatus     // Catch: java.lang.Throwable -> L41
            com.facebook.datasource.AbstractDataSource$DataSourceStatus r1 = com.facebook.datasource.AbstractDataSource.DataSourceStatus.IN_PROGRESS     // Catch: java.lang.Throwable -> L41
            if (r0 != r1) goto L1c
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<o.addDisappearingFragmentView<T>, java.util.concurrent.Executor>> r0 = r2.mSubscribers     // Catch: java.lang.Throwable -> L41
            android.util.Pair r1 = android.util.Pair.create(r3, r4)     // Catch: java.lang.Throwable -> L41
            r0.add(r1)     // Catch: java.lang.Throwable -> L41
        L1c:
            boolean r0 = r2.hasResult()     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L31
            boolean r0 = r2.isFinished()     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L31
            boolean r0 = r2.wasCancelled()     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L2f
            goto L31
        L2f:
            r0 = 0
            goto L32
        L31:
            r0 = 1
        L32:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L40
            boolean r0 = r2.hasFailed()
            boolean r1 = r2.wasCancelled()
            r2.notifyDataSubscriber(r3, r4, r0, r1)
        L40:
            return
        L41:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.AbstractDataSource.subscribe(o.addDisappearingFragmentView, java.util.concurrent.Executor):void");
    }

    private void notifyDataSubscribers() {
        boolean hasFailed = hasFailed();
        boolean wasCancelled = wasCancelled();
        Iterator<Pair<addDisappearingFragmentView<T>, Executor>> it = this.mSubscribers.iterator();
        while (it.hasNext()) {
            Pair<addDisappearingFragmentView<T>, Executor> next = it.next();
            notifyDataSubscriber((addDisappearingFragmentView) next.first, (Executor) next.second, hasFailed, wasCancelled);
        }
    }

    protected void notifyDataSubscriber(final addDisappearingFragmentView<T> adddisappearingfragmentview, Executor executor, final boolean z, final boolean z2) {
        Runnable runnable = new Runnable() { // from class: com.facebook.datasource.AbstractDataSource.5
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    adddisappearingfragmentview.onFailure(AbstractDataSource.this);
                } else if (z2) {
                    adddisappearingfragmentview.onCancellation(AbstractDataSource.this);
                } else {
                    adddisappearingfragmentview.onNewResult(AbstractDataSource.this);
                }
            }
        };
        values dataSourceInstrumenter = getDataSourceInstrumenter();
        if (dataSourceInstrumenter != null) {
            runnable = dataSourceInstrumenter.valueOf(runnable, "AbstractDataSource_notifyDataSubscriber");
        }
        executor.execute(runnable);
    }

    private boolean wasCancelled() {
        boolean z;
        synchronized (this) {
            if (isClosed()) {
                z = isFinished() ? false : true;
            }
        }
        return z;
    }

    public boolean setResult(T t, boolean z, Map<String, Object> map) {
        setExtras(map);
        boolean resultInternal = setResultInternal(t, z);
        if (resultInternal) {
            notifyDataSubscribers();
        }
        return resultInternal;
    }

    public boolean setResult(T t, boolean z) {
        return setResult(t, z, null);
    }

    public boolean setFailure(Throwable th) {
        return setFailure(th, null);
    }

    public boolean setFailure(Throwable th, Map<String, Object> map) {
        boolean failureInternal = setFailureInternal(th, map);
        if (failureInternal) {
            notifyDataSubscribers();
        }
        return failureInternal;
    }

    public boolean setProgress(float f) {
        boolean progressInternal = setProgressInternal(f);
        if (progressInternal) {
            notifyProgressUpdate();
        }
        return progressInternal;
    }

    private boolean setResultInternal(T t, boolean z) {
        AbstractDataSource<T> abstractDataSource;
        T t2;
        T t3;
        T t4 = null;
        try {
            synchronized (this) {
                try {
                    try {
                        if (!this.mIsClosed && this.mDataSourceStatus == DataSourceStatus.IN_PROGRESS) {
                            if (z) {
                                this.mDataSourceStatus = DataSourceStatus.SUCCESS;
                                this.mProgress = 1.0f;
                            }
                            t2 = this.mResult;
                            if (t2 != t) {
                                try {
                                    this.mResult = t;
                                    t3 = t2;
                                } catch (Throwable th) {
                                    th = th;
                                    t4 = t2;
                                    abstractDataSource = this;
                                    while (true) {
                                        try {
                                            try {
                                                break;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                if (t4 != null) {
                                                    abstractDataSource.closeResult(t4);
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    }
                                    throw th;
                                }
                            } else {
                                t3 = null;
                            }
                            if (t3 != null) {
                                closeResult(t3);
                                return true;
                            }
                            return true;
                        }
                        if (t != null) {
                            closeResult(t);
                            return false;
                        }
                        return false;
                    } catch (Throwable th4) {
                        t2 = t;
                        th = th4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        } catch (Throwable th6) {
            th = th6;
            abstractDataSource = this;
        }
    }

    private boolean setFailureInternal(Throwable th, Map<String, Object> map) {
        synchronized (this) {
            if (!this.mIsClosed && this.mDataSourceStatus == DataSourceStatus.IN_PROGRESS) {
                this.mDataSourceStatus = DataSourceStatus.FAILURE;
                this.mFailureThrowable = th;
                this.mExtras = map;
                return true;
            }
            return false;
        }
    }

    private boolean setProgressInternal(float f) {
        synchronized (this) {
            if (!this.mIsClosed && this.mDataSourceStatus == DataSourceStatus.IN_PROGRESS) {
                if (f < this.mProgress) {
                    return false;
                }
                this.mProgress = f;
                return true;
            }
            return false;
        }
    }

    protected void notifyProgressUpdate() {
        Iterator<Pair<addDisappearingFragmentView<T>, Executor>> it = this.mSubscribers.iterator();
        while (it.hasNext()) {
            Pair<addDisappearingFragmentView<T>, Executor> next = it.next();
            final addDisappearingFragmentView adddisappearingfragmentview = (addDisappearingFragmentView) next.first;
            ((Executor) next.second).execute(new Runnable() { // from class: com.facebook.datasource.AbstractDataSource.2
                @Override // java.lang.Runnable
                public void run() {
                    adddisappearingfragmentview.onProgressUpdate(AbstractDataSource.this);
                }
            });
        }
    }

    public static values getDataSourceInstrumenter() {
        return sDataSourceInstrumenter;
    }
}
