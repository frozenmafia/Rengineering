package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingResource;
import o.addSourceSha;
import o.dataStart;
import o.endMetadataList;
import o.getLoopers;
import o.startObject;
/* loaded from: classes7.dex */
public final class ObservableDebounceTimed<T> extends startObject<T, T> {
    final TimeUnit ah$a;
    final getLoopers toString;
    final long values;

    @Override // o.SwipeRefreshLayout.SavedState.AnonymousClass1
    public void valueOf(IdlingResource<? super T> idlingResource) {
        this.valueOf.subscribe(new values(new addSourceSha(idlingResource), this.values, this.ah$a, this.toString.ag$a()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class values<T> implements IdlingResource<T>, dataStart {
        final TimeUnit HaptikSDK$b;
        final IdlingResource<? super T> ag$a;
        volatile long ah$a;
        dataStart ah$b;
        final getLoopers.toString invoke;
        final long toString;
        boolean valueOf;
        dataStart values;

        values(IdlingResource<? super T> idlingResource, long j, TimeUnit timeUnit, getLoopers.toString tostring) {
            this.ag$a = idlingResource;
            this.toString = j;
            this.HaptikSDK$b = timeUnit;
            this.invoke = tostring;
        }

        @Override // o.IdlingResource
        public void onSubscribe(dataStart datastart) {
            if (DisposableHelper.validate(this.ah$b, datastart)) {
                this.ah$b = datastart;
                this.ag$a.onSubscribe(this);
            }
        }

        @Override // o.IdlingResource
        public void onNext(T t) {
            if (this.valueOf) {
                return;
            }
            long j = this.ah$a + 1;
            this.ah$a = j;
            dataStart datastart = this.values;
            if (datastart != null) {
                datastart.dispose();
            }
            DebounceEmitter debounceEmitter = new DebounceEmitter(t, j, this);
            this.values = debounceEmitter;
            debounceEmitter.setResource(this.invoke.valueOf(debounceEmitter, this.toString, this.HaptikSDK$b));
        }

        @Override // o.IdlingResource
        public void onError(Throwable th) {
            if (this.valueOf) {
                endMetadataList.valueOf(th);
                return;
            }
            dataStart datastart = this.values;
            if (datastart != null) {
                datastart.dispose();
            }
            this.valueOf = true;
            this.ag$a.onError(th);
            this.invoke.dispose();
        }

        @Override // o.IdlingResource
        public void onComplete() {
            if (this.valueOf) {
                return;
            }
            this.valueOf = true;
            dataStart datastart = this.values;
            if (datastart != null) {
                datastart.dispose();
            }
            DebounceEmitter debounceEmitter = (DebounceEmitter) datastart;
            if (debounceEmitter != null) {
                debounceEmitter.run();
            }
            this.ag$a.onComplete();
            this.invoke.dispose();
        }

        @Override // o.dataStart
        public void dispose() {
            this.ah$b.dispose();
            this.invoke.dispose();
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return this.invoke.isDisposed();
        }

        void valueOf(long j, T t, DebounceEmitter<T> debounceEmitter) {
            if (j == this.ah$a) {
                this.ag$a.onNext(t);
                debounceEmitter.dispose();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class DebounceEmitter<T> extends AtomicReference<dataStart> implements Runnable, dataStart {
        private static final long serialVersionUID = 6812032969491025141L;
        final long idx;
        final AtomicBoolean once = new AtomicBoolean();
        final values<T> parent;
        final T value;

        DebounceEmitter(T t, long j, values<T> valuesVar) {
            this.value = t;
            this.idx = j;
            this.parent = valuesVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.once.compareAndSet(false, true)) {
                this.parent.valueOf(this.idx, this.value, this);
            }
        }

        @Override // o.dataStart
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        public void setResource(dataStart datastart) {
            DisposableHelper.replace(this, datastart);
        }
    }
}
