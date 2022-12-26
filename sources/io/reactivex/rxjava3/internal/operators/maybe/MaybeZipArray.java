package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.FlatBufferBuilder;
import o.IdlingRegistry;
import o.SwipeRefreshLayout;
import o.addOffset;
import o.dataStart;
import o.endMetadataList;
/* loaded from: classes7.dex */
public final class MaybeZipArray<T, R> extends SwipeRefreshLayout.AnonymousClass8<R> {
    final SwipeRefreshLayout.SavedState<? extends T>[] ag$a;
    final addOffset<? super Object[], ? extends R> values;

    @Override // o.SwipeRefreshLayout.AnonymousClass8
    public void valueOf(IdlingRegistry<? super R> idlingRegistry) {
        SwipeRefreshLayout.SavedState<? extends T>[] savedStateArr = this.ag$a;
        int length = savedStateArr.length;
        if (length == 1) {
            savedStateArr[0].ag$a(new FlatBufferBuilder.ByteBufferBackedInputStream.values(idlingRegistry, new valueOf()));
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(idlingRegistry, length, this.values);
        idlingRegistry.onSubscribe(zipCoordinator);
        for (int i = 0; i < length && !zipCoordinator.isDisposed(); i++) {
            SwipeRefreshLayout.SavedState<? extends T> savedState = savedStateArr[i];
            if (savedState == null) {
                zipCoordinator.innerError(new NullPointerException("One of the sources is null"), i);
                return;
            }
            savedState.ag$a(zipCoordinator.observers[i]);
        }
    }

    /* loaded from: classes7.dex */
    static final class ZipCoordinator<T, R> extends AtomicInteger implements dataStart {
        private static final long serialVersionUID = -5556924161382950569L;
        final IdlingRegistry<? super R> downstream;
        final ZipMaybeObserver<T>[] observers;
        final Object[] values;
        final addOffset<? super Object[], ? extends R> zipper;

        ZipCoordinator(IdlingRegistry<? super R> idlingRegistry, int i, addOffset<? super Object[], ? extends R> addoffset) {
            super(i);
            this.downstream = idlingRegistry;
            this.zipper = addoffset;
            ZipMaybeObserver<T>[] zipMaybeObserverArr = new ZipMaybeObserver[i];
            for (int i2 = 0; i2 < i; i2++) {
                zipMaybeObserverArr[i2] = new ZipMaybeObserver<>(this, i2);
            }
            this.observers = zipMaybeObserverArr;
            this.values = new Object[i];
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return get() <= 0;
        }

        @Override // o.dataStart
        public void dispose() {
            if (getAndSet(0) > 0) {
                for (ZipMaybeObserver<T> zipMaybeObserver : this.observers) {
                    zipMaybeObserver.dispose();
                }
            }
        }

        void innerSuccess(T t, int i) {
            this.values[i] = t;
            if (decrementAndGet() == 0) {
                try {
                    R apply = this.zipper.apply(this.values);
                    Objects.requireNonNull(apply, "The zipper returned a null value");
                    this.downstream.onSuccess(apply);
                } catch (Throwable th) {
                    FlatBufferBuilder.ah$a(th);
                    this.downstream.onError(th);
                }
            }
        }

        void disposeExcept(int i) {
            ZipMaybeObserver<T>[] zipMaybeObserverArr = this.observers;
            int length = zipMaybeObserverArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                zipMaybeObserverArr[i2].dispose();
            }
            while (true) {
                i++;
                if (i >= length) {
                    return;
                }
                zipMaybeObserverArr[i].dispose();
            }
        }

        void innerError(Throwable th, int i) {
            if (getAndSet(0) > 0) {
                disposeExcept(i);
                this.downstream.onError(th);
                return;
            }
            endMetadataList.valueOf(th);
        }

        void innerComplete(int i) {
            if (getAndSet(0) > 0) {
                disposeExcept(i);
                this.downstream.onComplete();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class ZipMaybeObserver<T> extends AtomicReference<dataStart> implements IdlingRegistry<T> {
        private static final long serialVersionUID = 3323743579927613702L;
        final int index;
        final ZipCoordinator<T, ?> parent;

        ZipMaybeObserver(ZipCoordinator<T, ?> zipCoordinator, int i) {
            this.parent = zipCoordinator;
            this.index = i;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
        public void onSubscribe(dataStart datastart) {
            DisposableHelper.setOnce(this, datastart);
        }

        @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
        public void onSuccess(T t) {
            this.parent.innerSuccess(t, this.index);
        }

        @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
        public void onError(Throwable th) {
            this.parent.innerError(th, this.index);
        }

        @Override // o.IdlingRegistry
        public void onComplete() {
            this.parent.innerComplete(this.index);
        }
    }

    /* loaded from: classes7.dex */
    final class valueOf implements addOffset<T, R> {
        valueOf() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], java.lang.Object] */
        @Override // o.addOffset
        public R apply(T t) throws Throwable {
            R apply = MaybeZipArray.this.values.apply(new Object[]{t});
            Objects.requireNonNull(apply, "The zipper returned a null value");
            return apply;
        }
    }
}
