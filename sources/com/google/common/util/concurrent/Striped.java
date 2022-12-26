package com.google.common.util.concurrent;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.offsetPositionsForRemovingLaidOutOrNewView;
/* loaded from: classes7.dex */
public abstract class Striped<L> {
    private static final offsetPositionsForRemovingLaidOutOrNewView<ReadWriteLock> valueOf = new offsetPositionsForRemovingLaidOutOrNewView<ReadWriteLock>() { // from class: com.google.common.util.concurrent.Striped.2
        @Override // o.offsetPositionsForRemovingLaidOutOrNewView
        /* renamed from: valueOf */
        public ReadWriteLock get() {
            return new ReentrantReadWriteLock();
        }
    };
    private static final offsetPositionsForRemovingLaidOutOrNewView<ReadWriteLock> ag$a = new offsetPositionsForRemovingLaidOutOrNewView<ReadWriteLock>() { // from class: com.google.common.util.concurrent.Striped.3
        @Override // o.offsetPositionsForRemovingLaidOutOrNewView
        /* renamed from: ah$a */
        public ReadWriteLock get() {
            return new toString();
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class toString implements ReadWriteLock {
        private final ReadWriteLock valueOf = new ReentrantReadWriteLock();

        toString() {
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock readLock() {
            return new Striped$ag$a(this.valueOf.readLock(), this);
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock writeLock() {
            return new Striped$ag$a(this.valueOf.writeLock(), this);
        }
    }

    /* loaded from: classes7.dex */
    static class PaddedLock extends ReentrantLock {
        long unused1;
        long unused2;
        long unused3;

        PaddedLock() {
            super(false);
        }
    }

    /* loaded from: classes7.dex */
    static class PaddedSemaphore extends Semaphore {
        long unused1;
        long unused2;
        long unused3;

        PaddedSemaphore(int i) {
            super(i, false);
        }
    }
}
