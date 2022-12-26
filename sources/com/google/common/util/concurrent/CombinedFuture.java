package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AggregateFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import o.animateAddImpl;
import o.markViewHoldersUpdated;
import o.releaseWrapperAndLocalPosition;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class CombinedFuture<V> extends AggregateFuture<Object, V> {
    private CombinedFuture<V>.CombinedFutureInterruptibleTask<?> toString;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.util.concurrent.AggregateFuture
    public void values(AggregateFuture.ReleaseResourcesReason releaseResourcesReason) {
        super.values(releaseResourcesReason);
        if (releaseResourcesReason == AggregateFuture.ReleaseResourcesReason.OUTPUT_FUTURE_DONE) {
            this.toString = null;
        }
    }

    @Override // o.countItemsBefore
    public void ah$a() {
        CombinedFuture<V>.CombinedFutureInterruptibleTask<?> combinedFutureInterruptibleTask = this.toString;
        if (combinedFutureInterruptibleTask != null) {
            combinedFutureInterruptibleTask.interruptTask();
        }
    }

    /* loaded from: classes7.dex */
    abstract class CombinedFutureInterruptibleTask<T> extends InterruptibleTask<T> {
        private final Executor listenerExecutor;

        abstract void setValue(T t);

        CombinedFutureInterruptibleTask(Executor executor) {
            this.listenerExecutor = (Executor) markViewHoldersUpdated.toString(executor);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final boolean isDone() {
            return CombinedFuture.this.isDone();
        }

        final void execute() {
            try {
                this.listenerExecutor.execute(this);
            } catch (RejectedExecutionException e) {
                CombinedFuture.this.values((Throwable) e);
            }
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final void afterRanInterruptiblySuccess(T t) {
            CombinedFuture.this.toString = null;
            setValue(t);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final void afterRanInterruptiblyFailure(Throwable th) {
            CombinedFuture.this.toString = null;
            if (th instanceof ExecutionException) {
                CombinedFuture.this.values(((ExecutionException) th).getCause());
            } else if (th instanceof CancellationException) {
                CombinedFuture.this.cancel(false);
            } else {
                CombinedFuture.this.values(th);
            }
        }
    }

    /* loaded from: classes7.dex */
    final class AsyncCallableInterruptibleTask extends CombinedFutureInterruptibleTask {
        private final releaseWrapperAndLocalPosition<V> callable;

        @Override // com.google.common.util.concurrent.CombinedFuture.CombinedFutureInterruptibleTask
        /* bridge */ /* synthetic */ void setValue(Object obj) {
            setValue((animateAddImpl) ((animateAddImpl) obj));
        }

        AsyncCallableInterruptibleTask(releaseWrapperAndLocalPosition<V> releasewrapperandlocalposition, Executor executor) {
            super(executor);
            this.callable = (releaseWrapperAndLocalPosition) markViewHoldersUpdated.toString(releasewrapperandlocalposition);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.InterruptibleTask
        public animateAddImpl<V> runInterruptibly() throws Exception {
            return (animateAddImpl) markViewHoldersUpdated.toString(this.callable.ah$a(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.callable);
        }

        void setValue(animateAddImpl<V> animateaddimpl) {
            CombinedFuture.this.ah$a(animateaddimpl);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        String toPendingString() {
            return this.callable.toString();
        }
    }

    /* loaded from: classes7.dex */
    final class CallableInterruptibleTask extends CombinedFutureInterruptibleTask {
        private final Callable<V> callable;

        CallableInterruptibleTask(Callable<V> callable, Executor executor) {
            super(executor);
            this.callable = (Callable) markViewHoldersUpdated.toString(callable);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        V runInterruptibly() throws Exception {
            return this.callable.call();
        }

        @Override // com.google.common.util.concurrent.CombinedFuture.CombinedFutureInterruptibleTask
        void setValue(V v) {
            CombinedFuture.this.values((CombinedFuture) v);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        String toPendingString() {
            return this.callable.toString();
        }
    }
}
