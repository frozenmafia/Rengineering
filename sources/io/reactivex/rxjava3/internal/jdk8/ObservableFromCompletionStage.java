package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import o.IdlingResource;
import o.SwipeRefreshLayout;
/* loaded from: classes7.dex */
public final class ObservableFromCompletionStage<T> extends SwipeRefreshLayout.SavedState.AnonymousClass1<T> {
    final CompletionStage<T> valueOf;

    @Override // o.SwipeRefreshLayout.SavedState.AnonymousClass1
    public void valueOf(IdlingResource<? super T> idlingResource) {
        BiConsumerAtomicReference biConsumerAtomicReference = new BiConsumerAtomicReference();
        CompletionStageHandler completionStageHandler = new CompletionStageHandler(idlingResource, biConsumerAtomicReference);
        biConsumerAtomicReference.lazySet(completionStageHandler);
        idlingResource.onSubscribe(completionStageHandler);
        this.valueOf.whenComplete(biConsumerAtomicReference);
    }

    /* loaded from: classes7.dex */
    static final class CompletionStageHandler<T> extends DeferredScalarDisposable<T> implements BiConsumer<T, Throwable> {
        private static final long serialVersionUID = 4665335664328839859L;
        final BiConsumerAtomicReference<T> whenReference;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.function.BiConsumer
        public /* bridge */ /* synthetic */ void accept(Object obj, Throwable th) {
            accept2((CompletionStageHandler<T>) obj, th);
        }

        CompletionStageHandler(IdlingResource<? super T> idlingResource, BiConsumerAtomicReference<T> biConsumerAtomicReference) {
            super(idlingResource);
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

        @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, o.dataStart
        public void dispose() {
            super.dispose();
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
