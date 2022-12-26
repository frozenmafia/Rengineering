package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import o.SwipeRefreshLayout;
import o.registerConfigurationChangeListener;
/* loaded from: classes7.dex */
public final class FlowableFromCompletionStage<T> extends SwipeRefreshLayout.AnonymousClass2<T> {
    final CompletionStage<T> ah$a;

    @Override // o.SwipeRefreshLayout.AnonymousClass2
    public void ag$a(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        BiConsumerAtomicReference biConsumerAtomicReference = new BiConsumerAtomicReference();
        CompletionStageHandler completionStageHandler = new CompletionStageHandler(registerconfigurationchangelistener, biConsumerAtomicReference);
        biConsumerAtomicReference.lazySet(completionStageHandler);
        registerconfigurationchangelistener.onSubscribe(completionStageHandler);
        this.ah$a.whenComplete(biConsumerAtomicReference);
    }

    /* loaded from: classes7.dex */
    static final class CompletionStageHandler<T> extends DeferredScalarSubscription<T> implements BiConsumer<T, Throwable> {
        private static final long serialVersionUID = 4665335664328839859L;
        final BiConsumerAtomicReference<T> whenReference;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.function.BiConsumer
        public /* bridge */ /* synthetic */ void accept(Object obj, Throwable th) {
            accept2((CompletionStageHandler<T>) obj, th);
        }

        CompletionStageHandler(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener, BiConsumerAtomicReference<T> biConsumerAtomicReference) {
            super(registerconfigurationchangelistener);
            this.whenReference = biConsumerAtomicReference;
        }

        /* renamed from: accept  reason: avoid collision after fix types in other method */
        public void accept2(T t, Throwable th) {
            if (th != null) {
                this.downstream.onError(th);
            } else if (t != null) {
                complete(t);
            } else {
                this.downstream.onError(new NullPointerException("The CompletionStage terminated with null."));
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, o.getSidecarVersion
        public void cancel() {
            super.cancel();
            this.whenReference.set(null);
        }
    }

    /* loaded from: classes7.dex */
    static final class BiConsumerAtomicReference<T> extends AtomicReference<BiConsumer<T, Throwable>> implements BiConsumer<T, Throwable> {
        private static final long serialVersionUID = 45838553147237545L;

        BiConsumerAtomicReference() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.function.BiConsumer
        public /* bridge */ /* synthetic */ void accept(Object obj, Throwable th) {
            accept2((BiConsumerAtomicReference<T>) obj, th);
        }

        /* renamed from: accept  reason: avoid collision after fix types in other method */
        public void accept2(T t, Throwable th) {
            BiConsumer<T, Throwable> biConsumer = get();
            if (biConsumer != null) {
                biConsumer.accept(t, th);
            }
        }
    }
}
