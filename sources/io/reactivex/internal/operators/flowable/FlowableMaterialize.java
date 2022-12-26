package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import o.callback;
import o.getArrowHeight;
import o.registerConfigurationChangeListener;
import o.setProgressBackgroundColor;
/* loaded from: classes7.dex */
public final class FlowableMaterialize<T> extends getArrowHeight<T, callback<T>> {
    @Override // o.SimpleSQLiteQuery
    public void values(registerConfigurationChangeListener<? super callback<T>> registerconfigurationchangelistener) {
        this.valueOf.ah$a(new MaterializeSubscriber(registerconfigurationchangelistener));
    }

    /* loaded from: classes7.dex */
    static final class MaterializeSubscriber<T> extends SinglePostCompleteSubscriber<T, callback<T>> {
        private static final long serialVersionUID = -3740826063558713822L;

        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber
        public /* bridge */ /* synthetic */ void onDrop(Object obj) {
            onDrop((callback) ((callback) obj));
        }

        MaterializeSubscriber(registerConfigurationChangeListener<? super callback<T>> registerconfigurationchangelistener) {
            super(registerconfigurationchangelistener);
        }

        @Override // o.registerConfigurationChangeListener
        public void onNext(T t) {
            this.produced++;
            this.downstream.onNext(callback.toString(t));
        }

        @Override // o.registerConfigurationChangeListener
        public void onError(Throwable th) {
            complete(callback.toString(th));
        }

        @Override // o.registerConfigurationChangeListener
        public void onComplete() {
            complete(callback.ag$a());
        }

        protected void onDrop(callback<T> callbackVar) {
            if (callbackVar.ah$a()) {
                setProgressBackgroundColor.values(callbackVar.values());
            }
        }
    }
}
