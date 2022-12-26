package io.reactivex.rxjava3.internal.queue;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import o.compatAdded;
import o.endObject;
/* loaded from: classes7.dex */
public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements endObject<E> {
    private static final Integer MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;
    final AtomicLong consumerIndex;
    final int lookAheadStep;
    final int mask;
    final AtomicLong producerIndex;
    long producerLookAhead;

    int calcElementOffset(long j, int i) {
        return ((int) j) & i;
    }

    public SpscArrayQueue(int i) {
        super(compatAdded.valueOf(i));
        this.mask = length() - 1;
        this.producerIndex = new AtomicLong();
        this.consumerIndex = new AtomicLong();
        this.lookAheadStep = Math.min(i / 4, MAX_LOOK_AHEAD_STEP.intValue());
    }

    @Override // o.putByte
    public boolean offer(E e) {
        Objects.requireNonNull(e, "Null is not a valid element");
        int i = this.mask;
        long j = this.producerIndex.get();
        int calcElementOffset = calcElementOffset(j, i);
        if (j >= this.producerLookAhead) {
            long j2 = this.lookAheadStep + j;
            if (lvElement(calcElementOffset(j2, i)) == null) {
                this.producerLookAhead = j2;
            } else if (lvElement(calcElementOffset) != null) {
                return false;
            }
        }
        soElement(calcElementOffset, e);
        soProducerIndex(j + 1);
        return true;
    }

    public boolean offer(E e, E e2) {
        return offer(e) && offer(e2);
    }

    @Override // o.endObject, o.putByte
    public E poll() {
        long j = this.consumerIndex.get();
        int calcElementOffset = calcElementOffset(j);
        E lvElement = lvElement(calcElementOffset);
        if (lvElement == null) {
            return null;
        }
        soConsumerIndex(j + 1);
        soElement(calcElementOffset, null);
        return lvElement;
    }

    @Override // o.putByte
    public boolean isEmpty() {
        return this.producerIndex.get() == this.consumerIndex.get();
    }

    void soProducerIndex(long j) {
        this.producerIndex.lazySet(j);
    }

    void soConsumerIndex(long j) {
        this.consumerIndex.lazySet(j);
    }

    @Override // o.putByte
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    int calcElementOffset(long j) {
        return this.mask & ((int) j);
    }

    void soElement(int i, E e) {
        lazySet(i, e);
    }

    E lvElement(int i) {
        return get(i);
    }
}
