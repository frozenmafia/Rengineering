package com.google.common.collect;

import java.util.NoSuchElementException;
import o.AsyncListUtil;
import o.markViewHoldersUpdated;
import o.removeViewIfHidden;
/* loaded from: classes5.dex */
public abstract class AbstractIterator<T> extends removeViewIfHidden<T> {
    private T ah$a;
    private State values = State.NOT_READY;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected abstract T ah$a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final T valueOf() {
        this.values = State.DONE;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.collect.AbstractIterator$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[State.values().length];
            values = iArr;
            try {
                iArr[State.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                values[State.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        markViewHoldersUpdated.ag$a(this.values != State.FAILED);
        int i = AnonymousClass1.values[this.values.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return values();
            }
            return true;
        }
        return false;
    }

    private boolean values() {
        this.values = State.FAILED;
        this.ah$a = ah$a();
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
        T t = (T) AsyncListUtil.ViewCallback.ag$a(this.ah$a);
        this.ah$a = null;
        return t;
    }
}
