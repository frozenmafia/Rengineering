package com.google.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;
import o.markViewHoldersUpdated;
import o.recycleUpdateOpsAndClearList;
/* loaded from: classes5.dex */
public abstract class AbstractIterator<T> implements Iterator<T> {
    private T toString;
    private State values = State.NOT_READY;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected abstract T values();

    /* JADX INFO: Access modifiers changed from: protected */
    public final T ah$a() {
        this.values = State.DONE;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.base.AbstractIterator$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ah$a;

        static {
            int[] iArr = new int[State.values().length];
            ah$a = iArr;
            try {
                iArr[State.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ah$a[State.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        markViewHoldersUpdated.ag$a(this.values != State.FAILED);
        int i = AnonymousClass1.ah$a[this.values.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return ag$a();
            }
            return true;
        }
        return false;
    }

    private boolean ag$a() {
        this.values = State.FAILED;
        this.toString = values();
        if (this.values != State.DONE) {
            this.values = State.READY;
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.values = State.NOT_READY;
        T t = (T) recycleUpdateOpsAndClearList.toString(this.toString);
        this.toString = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
