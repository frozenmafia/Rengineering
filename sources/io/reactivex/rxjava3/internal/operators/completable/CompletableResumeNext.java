package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import o.FlatBufferBuilder;
import o.SwipeRefreshLayout;
import o.addOffset;
import o.dataStart;
import o.setSlingshotDistance;
/* loaded from: classes7.dex */
public final class CompletableResumeNext extends setSlingshotDistance {
    final SwipeRefreshLayout.AnonymousClass1 ag$a;
    final addOffset<? super Throwable, ? extends SwipeRefreshLayout.AnonymousClass1> toString;

    @Override // o.setSlingshotDistance
    public void ag$a(SwipeRefreshLayout.AnonymousClass3 anonymousClass3) {
        ResumeNextObserver resumeNextObserver = new ResumeNextObserver(anonymousClass3, this.toString);
        anonymousClass3.onSubscribe(resumeNextObserver);
        this.ag$a.values(resumeNextObserver);
    }

    /* loaded from: classes7.dex */
    static final class ResumeNextObserver extends AtomicReference<dataStart> implements SwipeRefreshLayout.AnonymousClass3, dataStart {
        private static final long serialVersionUID = 5018523762564524046L;
        final SwipeRefreshLayout.AnonymousClass3 downstream;
        final addOffset<? super Throwable, ? extends SwipeRefreshLayout.AnonymousClass1> errorMapper;
        boolean once;

        ResumeNextObserver(SwipeRefreshLayout.AnonymousClass3 anonymousClass3, addOffset<? super Throwable, ? extends SwipeRefreshLayout.AnonymousClass1> addoffset) {
            this.downstream = anonymousClass3;
            this.errorMapper = addoffset;
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onSubscribe(dataStart datastart) {
            DisposableHelper.replace(this, datastart);
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onError(Throwable th) {
            if (this.once) {
                this.downstream.onError(th);
                return;
            }
            this.once = true;
            try {
                SwipeRefreshLayout.AnonymousClass1 apply = this.errorMapper.apply(th);
                Objects.requireNonNull(apply, "The errorMapper returned a null CompletableSource");
                apply.values(this);
            } catch (Throwable th2) {
                FlatBufferBuilder.ah$a(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // o.dataStart
        public void dispose() {
            DisposableHelper.dispose(this);
        }
    }
}
