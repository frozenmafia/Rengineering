package io.reactivex.internal.queue;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import o.CircleImageView;
/* loaded from: classes7.dex */
public final class MpscLinkedQueue<T> implements CircleImageView.OvalShadow<T> {
    private final AtomicReference<LinkedQueueNode<T>> ag$a = new AtomicReference<>();
    private final AtomicReference<LinkedQueueNode<T>> toString = new AtomicReference<>();

    public MpscLinkedQueue() {
        LinkedQueueNode<T> linkedQueueNode = new LinkedQueueNode<>();
        toString(linkedQueueNode);
        valueOf(linkedQueueNode);
    }

    @Override // o.elevationSupported
    public boolean offer(T t) {
        Objects.requireNonNull(t, "Null is not a valid element");
        LinkedQueueNode<T> linkedQueueNode = new LinkedQueueNode<>(t);
        valueOf(linkedQueueNode).soNext(linkedQueueNode);
        return true;
    }

    @Override // o.CircleImageView.OvalShadow, o.elevationSupported
    public T poll() {
        LinkedQueueNode<T> lvNext;
        LinkedQueueNode<T> ag$a = ag$a();
        LinkedQueueNode<T> lvNext2 = ag$a.lvNext();
        if (lvNext2 != null) {
            T andNullValue = lvNext2.getAndNullValue();
            toString(lvNext2);
            return andNullValue;
        } else if (ag$a != valueOf()) {
            do {
                lvNext = ag$a.lvNext();
            } while (lvNext == null);
            T andNullValue2 = lvNext.getAndNullValue();
            toString(lvNext);
            return andNullValue2;
        } else {
            return null;
        }
    }

    @Override // o.elevationSupported
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    LinkedQueueNode<T> valueOf() {
        return this.ag$a.get();
    }

    LinkedQueueNode<T> valueOf(LinkedQueueNode<T> linkedQueueNode) {
        return this.ag$a.getAndSet(linkedQueueNode);
    }

    LinkedQueueNode<T> values() {
        return this.toString.get();
    }

    LinkedQueueNode<T> ag$a() {
        return this.toString.get();
    }

    void toString(LinkedQueueNode<T> linkedQueueNode) {
        this.toString.lazySet(linkedQueueNode);
    }

    @Override // o.elevationSupported
    public boolean isEmpty() {
        return values() == valueOf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class LinkedQueueNode<E> extends AtomicReference<LinkedQueueNode<E>> {
        private static final long serialVersionUID = 2404266111789071508L;
        private E value;

        LinkedQueueNode() {
        }

        LinkedQueueNode(E e) {
            spValue(e);
        }

        public E getAndNullValue() {
            E lpValue = lpValue();
            spValue(null);
            return lpValue;
        }

        public E lpValue() {
            return this.value;
        }

        public void spValue(E e) {
            this.value = e;
        }

        public void soNext(LinkedQueueNode<E> linkedQueueNode) {
            lazySet(linkedQueueNode);
        }

        public LinkedQueueNode<E> lvNext() {
            return get();
        }
    }
}
