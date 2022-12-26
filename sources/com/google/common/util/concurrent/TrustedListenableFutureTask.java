package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import o.animateAddImpl;
import o.markViewHoldersUpdated;
import o.onStateRestorationPolicyChanged$ah$a;
import o.releaseWrapperAndLocalPosition;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class TrustedListenableFutureTask<V> extends onStateRestorationPolicyChanged$ah$a<V> implements RunnableFuture<V> {
    private volatile InterruptibleTask<?> ah$a;

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        InterruptibleTask<?> interruptibleTask = this.ah$a;
        if (interruptibleTask != null) {
            interruptibleTask.run();
        }
        this.ah$a = null;
    }

    @Override // o.countItemsBefore
    public void valueOf() {
        InterruptibleTask<?> interruptibleTask;
        super.valueOf();
        if (invoke() && (interruptibleTask = this.ah$a) != null) {
            interruptibleTask.interruptTask();
        }
        this.ah$a = null;
    }

    @Override // o.countItemsBefore
    public String HaptikSDK$a() {
        InterruptibleTask<?> interruptibleTask = this.ah$a;
        if (interruptibleTask != null) {
            String valueOf = String.valueOf(interruptibleTask);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
            sb.append("task=[");
            sb.append(valueOf);
            sb.append("]");
            return sb.toString();
        }
        return super.HaptikSDK$a();
    }

    /* loaded from: classes7.dex */
    final class TrustedFutureInterruptibleTask extends InterruptibleTask<V> {
        private final Callable<V> callable;

        TrustedFutureInterruptibleTask(Callable<V> callable) {
            this.callable = (Callable) markViewHoldersUpdated.toString(callable);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final boolean isDone() {
            return TrustedListenableFutureTask.this.isDone();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        V runInterruptibly() throws Exception {
            return this.callable.call();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        void afterRanInterruptiblySuccess(V v) {
            TrustedListenableFutureTask.this.values((TrustedListenableFutureTask) v);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        void afterRanInterruptiblyFailure(Throwable th) {
            TrustedListenableFutureTask.this.values(th);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        String toPendingString() {
            return this.callable.toString();
        }
    }

    /* loaded from: classes7.dex */
    final class TrustedFutureInterruptibleAsyncTask extends InterruptibleTask<animateAddImpl<V>> {
        private final releaseWrapperAndLocalPosition<V> callable;

        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* bridge */ /* synthetic */ void afterRanInterruptiblySuccess(Object obj) {
            afterRanInterruptiblySuccess((animateAddImpl) ((animateAddImpl) obj));
        }

        TrustedFutureInterruptibleAsyncTask(releaseWrapperAndLocalPosition<V> releasewrapperandlocalposition) {
            this.callable = (releaseWrapperAndLocalPosition) markViewHoldersUpdated.toString(releasewrapperandlocalposition);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final boolean isDone() {
            return TrustedListenableFutureTask.this.isDone();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.InterruptibleTask
        public animateAddImpl<V> runInterruptibly() throws Exception {
            return (animateAddImpl) markViewHoldersUpdated.toString(this.callable.ah$a(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.callable);
        }

        void afterRanInterruptiblySuccess(animateAddImpl<V> animateaddimpl) {
            TrustedListenableFutureTask.this.ah$a(animateaddimpl);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        void afterRanInterruptiblyFailure(Throwable th) {
            TrustedListenableFutureTask.this.values(th);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        String toPendingString() {
            return this.callable.toString();
        }
    }
}
