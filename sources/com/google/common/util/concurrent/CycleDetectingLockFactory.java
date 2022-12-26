package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.MapMaker;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.getChangePayload;
import o.markViewHoldersUpdated;
/* loaded from: classes7.dex */
public class CycleDetectingLockFactory {
    final valueOf toString;
    private static final ConcurrentMap<Class<? extends Enum<?>>, Map<? extends Enum<?>, CycleDetectingLockFactory$ah$a>> ag$a = new MapMaker().ah$b().HaptikSDK$c();
    private static final Logger values = Logger.getLogger(CycleDetectingLockFactory.class.getName());
    private static final ThreadLocal<ArrayList<CycleDetectingLockFactory$ah$a>> ah$a = new ThreadLocal<ArrayList<CycleDetectingLockFactory$ah$a>>() { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: valueOf */
        public ArrayList<CycleDetectingLockFactory$ah$a> initialValue() {
            return getChangePayload.values(3, "initialArraySize");
        }
    };

    /* loaded from: classes7.dex */
    public enum Policies implements valueOf {
        THROW { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.1
            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.valueOf
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
                throw potentialDeadlockException;
            }
        },
        WARN { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.2
            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.valueOf
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
                CycleDetectingLockFactory.values.log(Level.SEVERE, "Detected potential deadlock", (Throwable) potentialDeadlockException);
            }
        },
        DISABLED { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.3
            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.valueOf
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
            }
        }
    }

    /* loaded from: classes7.dex */
    public interface valueOf {
        void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException);
    }

    /* loaded from: classes7.dex */
    public static final class values<E extends Enum<E>> extends CycleDetectingLockFactory {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static class ExampleStackTrace extends IllegalStateException {
        static final StackTraceElement[] EMPTY_STACK_TRACE = new StackTraceElement[0];
        static final ImmutableSet<String> EXCLUDED_CLASS_NAMES = ImmutableSet.of(CycleDetectingLockFactory.class.getName(), ExampleStackTrace.class.getName(), CycleDetectingLockFactory$ah$a.class.getName());

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ExampleStackTrace(com.google.common.util.concurrent.CycleDetectingLockFactory$ah$a r4, com.google.common.util.concurrent.CycleDetectingLockFactory$ah$a r5) {
            /*
                r3 = this;
                java.lang.String r4 = r4.ah$a()
                java.lang.String r5 = r5.ah$a()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                int r1 = r1 + 4
                java.lang.String r2 = java.lang.String.valueOf(r5)
                int r2 = r2.length()
                int r1 = r1 + r2
                r0.<init>(r1)
                r0.append(r4)
                java.lang.String r4 = " -> "
                r0.append(r4)
                r0.append(r5)
                java.lang.String r4 = r0.toString()
                r3.<init>(r4)
                java.lang.StackTraceElement[] r4 = r3.getStackTrace()
                int r5 = r4.length
                r0 = 0
            L38:
                if (r0 >= r5) goto L6d
                java.lang.Class<com.google.common.util.concurrent.CycleDetectingLockFactory$values> r1 = com.google.common.util.concurrent.CycleDetectingLockFactory.values.class
                java.lang.String r1 = r1.getName()
                r2 = r4[r0]
                java.lang.String r2 = r2.getClassName()
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L52
                java.lang.StackTraceElement[] r4 = com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace.EMPTY_STACK_TRACE
                r3.setStackTrace(r4)
                goto L6d
            L52:
                com.google.common.collect.ImmutableSet<java.lang.String> r1 = com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace.EXCLUDED_CLASS_NAMES
                r2 = r4[r0]
                java.lang.String r2 = r2.getClassName()
                boolean r1 = r1.contains(r2)
                if (r1 != 0) goto L6a
                java.lang.Object[] r4 = java.util.Arrays.copyOfRange(r4, r0, r5)
                java.lang.StackTraceElement[] r4 = (java.lang.StackTraceElement[]) r4
                r3.setStackTrace(r4)
                goto L6d
            L6a:
                int r0 = r0 + 1
                goto L38
            L6d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace.<init>(com.google.common.util.concurrent.CycleDetectingLockFactory$ah$a, com.google.common.util.concurrent.CycleDetectingLockFactory$ah$a):void");
        }
    }

    /* loaded from: classes7.dex */
    public static final class PotentialDeadlockException extends ExampleStackTrace {
        private final ExampleStackTrace conflictingStackTrace;

        private PotentialDeadlockException(CycleDetectingLockFactory$ah$a cycleDetectingLockFactory$ah$a, CycleDetectingLockFactory$ah$a cycleDetectingLockFactory$ah$a2, ExampleStackTrace exampleStackTrace) {
            super(cycleDetectingLockFactory$ah$a, cycleDetectingLockFactory$ah$a2);
            this.conflictingStackTrace = exampleStackTrace;
            initCause(exampleStackTrace);
        }

        public ExampleStackTrace getConflictingStackTrace() {
            return this.conflictingStackTrace;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            String message = super.getMessage();
            message.getClass();
            StringBuilder sb = new StringBuilder(message);
            for (Throwable th = this.conflictingStackTrace; th != null; th = th.getCause()) {
                sb.append(", ");
                sb.append(th.getMessage());
            }
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void valueOf(CycleDetectingLockFactory$ag$a cycleDetectingLockFactory$ag$a) {
        if (cycleDetectingLockFactory$ag$a.isAcquiredByCurrentThread()) {
            return;
        }
        ArrayList<CycleDetectingLockFactory$ah$a> arrayList = ah$a.get();
        CycleDetectingLockFactory$ah$a lockGraphNode = cycleDetectingLockFactory$ag$a.getLockGraphNode();
        lockGraphNode.toString(this.toString, arrayList);
        arrayList.add(lockGraphNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ah$a(CycleDetectingLockFactory$ag$a cycleDetectingLockFactory$ag$a) {
        if (cycleDetectingLockFactory$ag$a.isAcquiredByCurrentThread()) {
            return;
        }
        ArrayList<CycleDetectingLockFactory$ah$a> arrayList = ah$a.get();
        CycleDetectingLockFactory$ah$a lockGraphNode = cycleDetectingLockFactory$ag$a.getLockGraphNode();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == lockGraphNode) {
                arrayList.remove(size);
                return;
            }
        }
    }

    /* loaded from: classes7.dex */
    final class CycleDetectingReentrantLock extends ReentrantLock implements CycleDetectingLockFactory$ag$a {
        private final CycleDetectingLockFactory$ah$a lockGraphNode;

        private CycleDetectingReentrantLock(CycleDetectingLockFactory$ah$a cycleDetectingLockFactory$ah$a, boolean z) {
            super(z);
            this.lockGraphNode = (CycleDetectingLockFactory$ah$a) markViewHoldersUpdated.toString(cycleDetectingLockFactory$ah$a);
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory$ag$a
        public CycleDetectingLockFactory$ah$a getLockGraphNode() {
            return this.lockGraphNode;
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory$ag$a
        public boolean isAcquiredByCurrentThread() {
            return isHeldByCurrentThread();
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lock() {
            CycleDetectingLockFactory.this.valueOf(this);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.ah$a(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.valueOf(this);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.ah$a(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.this.valueOf(this);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.ah$a(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.this.valueOf(this);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                CycleDetectingLockFactory.ah$a(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.ah$a(this);
            }
        }
    }

    /* loaded from: classes7.dex */
    final class CycleDetectingReentrantReadWriteLock extends ReentrantReadWriteLock implements CycleDetectingLockFactory$ag$a {
        private final CycleDetectingLockFactory$ah$a lockGraphNode;
        private final CycleDetectingReentrantReadLock readLock;
        private final CycleDetectingReentrantWriteLock writeLock;

        private CycleDetectingReentrantReadWriteLock(CycleDetectingLockFactory cycleDetectingLockFactory, CycleDetectingLockFactory$ah$a cycleDetectingLockFactory$ah$a, boolean z) {
            super(z);
            this.readLock = new CycleDetectingReentrantReadLock(this);
            this.writeLock = new CycleDetectingReentrantWriteLock(this);
            this.lockGraphNode = (CycleDetectingLockFactory$ah$a) markViewHoldersUpdated.toString(cycleDetectingLockFactory$ah$a);
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public ReentrantReadWriteLock.ReadLock readLock() {
            return this.readLock;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public ReentrantReadWriteLock.WriteLock writeLock() {
            return this.writeLock;
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory$ag$a
        public CycleDetectingLockFactory$ah$a getLockGraphNode() {
            return this.lockGraphNode;
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory$ag$a
        public boolean isAcquiredByCurrentThread() {
            return isWriteLockedByCurrentThread() || getReadHoldCount() > 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public class CycleDetectingReentrantReadLock extends ReentrantReadWriteLock.ReadLock {
        final CycleDetectingReentrantReadWriteLock readWriteLock;

        CycleDetectingReentrantReadLock(CycleDetectingReentrantReadWriteLock cycleDetectingReentrantReadWriteLock) {
            super(cycleDetectingReentrantReadWriteLock);
            this.readWriteLock = cycleDetectingReentrantReadWriteLock;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lock() {
            CycleDetectingLockFactory.this.valueOf(this.readWriteLock);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.ah$a(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.valueOf(this.readWriteLock);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.ah$a(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.this.valueOf(this.readWriteLock);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.ah$a(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.this.valueOf(this.readWriteLock);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                CycleDetectingLockFactory.ah$a(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.ah$a(this.readWriteLock);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public class CycleDetectingReentrantWriteLock extends ReentrantReadWriteLock.WriteLock {
        final CycleDetectingReentrantReadWriteLock readWriteLock;

        CycleDetectingReentrantWriteLock(CycleDetectingReentrantReadWriteLock cycleDetectingReentrantReadWriteLock) {
            super(cycleDetectingReentrantReadWriteLock);
            this.readWriteLock = cycleDetectingReentrantReadWriteLock;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lock() {
            CycleDetectingLockFactory.this.valueOf(this.readWriteLock);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.ah$a(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.valueOf(this.readWriteLock);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.ah$a(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.this.valueOf(this.readWriteLock);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.ah$a(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.this.valueOf(this.readWriteLock);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                CycleDetectingLockFactory.ah$a(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.ah$a(this.readWriteLock);
            }
        }
    }
}
