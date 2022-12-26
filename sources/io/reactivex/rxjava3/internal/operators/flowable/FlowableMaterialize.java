package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber;
import java.util.Objects;
import o.endMetadataList;
import o.onRefresh;
import o.registerConfigurationChangeListener;
import o.required;
/* loaded from: classes7.dex */
public final class FlowableMaterialize<T> extends required<T, onRefresh<T>> {
    @Override // o.SwipeRefreshLayout.AnonymousClass2
    public void ag$a(registerConfigurationChangeListener<? super onRefresh<T>> registerconfigurationchangelistener) {
        this.ag$a.values(new MaterializeSubscriber(registerconfigurationchangelistener));
    }

    /* loaded from: classes7.dex */
    static final class MaterializeSubscriber<T> extends SinglePostCompleteSubscriber<T, onRefresh<T>> {
        private static final long serialVersionUID = -3740826063558713822L;

        @Override // io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber
        public /* bridge */ /* synthetic */ void onDrop(Object obj) {
            onDrop((onRefresh) ((onRefresh) obj));
        }

        MaterializeSubscriber(registerConfigurationChangeListener<? super onRefresh<T>> registerconfigurationchangelistener) {
            super(registerconfigurationchangelistener);
        }

        @Override // o.registerConfigurationChangeListener
        public void onNext(T t) {
            this.produced++;
            this.downstream.onNext(Objects.requireNonNull(t, "value is null"));
        }

        @Override // o.registerConfigurationChangeListener
        public void onError(Throwable th) {
            complete(Objects.requireNonNull(th, "error is null"));
        }

        @Override // o.registerConfigurationChangeListener
        public void onComplete() {
            complete(onRefresh.ah$a());
        }

        protected void onDrop(onRefresh<T> onrefresh) {
            if (onrefresh.valueOf()) {
                endMetadataList.valueOf(onrefresh.ag$a());
            }
        }
    }
}
