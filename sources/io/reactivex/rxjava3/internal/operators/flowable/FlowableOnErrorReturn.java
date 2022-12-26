package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber;
import java.util.Objects;
import o.FlatBufferBuilder;
import o.addOffset;
import o.registerConfigurationChangeListener;
import o.required;
/* loaded from: classes7.dex */
public final class FlowableOnErrorReturn<T> extends required<T, T> {
    final addOffset<? super Throwable, ? extends T> values;

    @Override // o.SwipeRefreshLayout.AnonymousClass2
    public void ag$a(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        this.ag$a.values(new OnErrorReturnSubscriber(registerconfigurationchangelistener, this.values));
    }

    /* loaded from: classes7.dex */
    static final class OnErrorReturnSubscriber<T> extends SinglePostCompleteSubscriber<T, T> {
        private static final long serialVersionUID = -3740826063558713822L;
        final addOffset<? super Throwable, ? extends T> valueSupplier;

        OnErrorReturnSubscriber(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener, addOffset<? super Throwable, ? extends T> addoffset) {
            super(registerconfigurationchangelistener);
            this.valueSupplier = addoffset;
        }

        @Override // o.registerConfigurationChangeListener
        public void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }

        @Override // o.registerConfigurationChangeListener
        public void onError(Throwable th) {
            try {
                T apply = this.valueSupplier.apply(th);
                Objects.requireNonNull(apply, "The valueSupplier returned a null value");
                complete(apply);
            } catch (Throwable th2) {
                FlatBufferBuilder.ah$a(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        @Override // o.registerConfigurationChangeListener
        public void onComplete() {
            this.downstream.onComplete();
        }
    }
}
