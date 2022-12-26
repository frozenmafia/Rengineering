package io.reactivex.rxjava3.internal.queue;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import o.endObject;
/* loaded from: classes7.dex */
public final class MpscLinkedQueue<T> implements endObject<T> {
    private final AtomicReference<LinkedQueueNode<T>> toString = new AtomicReference<>();
    private final AtomicReference<LinkedQueueNode<T>> valueOf = new AtomicReference<>();

    public MpscLinkedQueue() {
        LinkedQueueNode<T> linkedQueueNode = new LinkedQueueNode<>();
        valueOf(linkedQueueNode);
        values(linkedQueueNode);
    }

    @Override // o.putByte
    public boolean offer(T t) {
        Objects.requireNonNull(t, "Null is not a valid element");
        LinkedQueueNode<T> linkedQueueNode = new LinkedQueueNode<>(t);
        values(linkedQueueNode).soNext(linkedQueueNode);
        return true;
    }

    @Override // o.endObject, o.putByte
    public T poll() {
        LinkedQueueNode<T> lvNext;
        LinkedQueueNode<T> ag$a = ag$a();
        LinkedQueueNode<T> lvNext2 = ag$a.lvNext();
        if (lvNext2 != null) {
            T andNullValue = lvNext2.getAndNullValue();
            valueOf(lvNext2);
            return andNullValue;
        } else if (ag$a != values()) {
            do {
                lvNext = ag$a.lvNext();
            } while (lvNext == null);
            T andNullValue2 = lvNext.getAndNullValue();
            valueOf(lvNext);
            return andNullValue2;
        } else {
            return null;
        }
    }

    @Override // o.putByte
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    LinkedQueueNode<T> values() {
        return this.toString.get();
    }

    LinkedQueueNode<T> values(LinkedQueueNode<T> linkedQueueNode) {
        return this.toString.getAndSet(linkedQueueNode);
    }

    LinkedQueueNode<T> ah$a() {
        return this.valueOf.get();
    }

    LinkedQueueNode<T> ag$a() {
        return this.valueOf.get();
    }

    void valueOf(LinkedQueueNode<T> linkedQueueNode) {
        this.valueOf.lazySet(linkedQueueNode);
    }

    @Override // o.putByte
    public boolean isEmpty() {
        return ah$a() == values();
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
