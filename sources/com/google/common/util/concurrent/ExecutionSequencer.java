package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import o.animateAddImpl;
import o.animateRemoveImpl;
import o.markViewHoldersUpdated;
import o.releaseWrapperAndLocalPosition;
/* loaded from: classes7.dex */
public final class ExecutionSequencer {
    private final AtomicReference<animateAddImpl<Void>> toString = new AtomicReference<>(animateRemoveImpl.values());
    private valueOf values = new valueOf(null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public enum RunningState {
        NOT_RUN,
        CANCELLED,
        STARTED
    }

    private ExecutionSequencer() {
    }

    /* loaded from: classes7.dex */
    static final class valueOf {
        Executor ag$a;
        Runnable valueOf;
        Thread values;

        private valueOf() {
        }

        /* synthetic */ valueOf(AnonymousClass5 anonymousClass5) {
            this();
        }
    }

    /* renamed from: com.google.common.util.concurrent.ExecutionSequencer$5  reason: invalid class name */
    /* loaded from: classes7.dex */
    class AnonymousClass5 implements releaseWrapperAndLocalPosition<T> {
        final /* synthetic */ Callable valueOf;

        @Override // o.releaseWrapperAndLocalPosition
        public animateAddImpl<T> ah$a() throws Exception {
            return animateRemoveImpl.values(this.valueOf.call());
        }

        public String toString() {
            return this.valueOf.toString();
        }
    }

    /* loaded from: classes7.dex */
    static final class TaskNonReentrantExecutor extends AtomicReference<RunningState> implements Executor, Runnable {
        Executor delegate;
        ExecutionSequencer sequencer;
        Thread submitting;
        Runnable task;

        /* synthetic */ TaskNonReentrantExecutor(Executor executor, ExecutionSequencer executionSequencer, AnonymousClass5 anonymousClass5) {
            this(executor, executionSequencer);
        }

        private TaskNonReentrantExecutor(Executor executor, ExecutionSequencer executionSequencer) {
            super(RunningState.NOT_RUN);
            this.delegate = executor;
            this.sequencer = executionSequencer;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (get() == RunningState.CANCELLED) {
                this.delegate = null;
                this.sequencer = null;
                return;
            }
            this.submitting = Thread.currentThread();
            try {
                ExecutionSequencer executionSequencer = this.sequencer;
                executionSequencer.getClass();
                valueOf valueof = executionSequencer.values;
                if (valueof.values == this.submitting) {
                    this.sequencer = null;
                    markViewHoldersUpdated.ag$a(valueof.valueOf == null);
                    valueof.valueOf = runnable;
                    Executor executor = this.delegate;
                    executor.getClass();
                    valueof.ag$a = executor;
                    this.delegate = null;
                } else {
                    Executor executor2 = this.delegate;
                    executor2.getClass();
                    this.delegate = null;
                    this.task = runnable;
                    executor2.execute(this);
                }
            } finally {
                this.submitting = null;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread currentThread = Thread.currentThread();
            if (currentThread != this.submitting) {
                Runnable runnable = this.task;
                runnable.getClass();
                this.task = null;
                runnable.run();
                return;
            }
            valueOf valueof = new valueOf(null);
            valueof.values = currentThread;
            ExecutionSequencer executionSequencer = this.sequencer;
            executionSequencer.getClass();
            executionSequencer.values = valueof;
            this.sequencer = null;
            try {
                Runnable runnable2 = this.task;
                runnable2.getClass();
                this.task = null;
                runnable2.run();
                while (true) {
                    Runnable runnable3 = valueof.valueOf;
                    boolean z = runnable3 != null;
                    Executor executor = valueof.ag$a;
                    if (!(executor != null) || !z) {
                        return;
                    }
                    valueof.valueOf = null;
                    valueof.ag$a = null;
                    executor.execute(runnable3);
                }
            } finally {
                valueof.values = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean trySetStarted() {
            return compareAndSet(RunningState.NOT_RUN, RunningState.STARTED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean trySetCancelled() {
            return compareAndSet(RunningState.NOT_RUN, RunningState.CANCELLED);
        }
    }
}
