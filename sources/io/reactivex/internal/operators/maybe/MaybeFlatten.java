package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.FrameworkSQLiteOpenHelperFactory;
import o.SupportSQLiteOpenHelper;
import o.builder;
import o.setArrowDimensions;
/* loaded from: classes7.dex */
public final class MaybeFlatten<T, R> extends setArrowDimensions<T, R> {
    final FrameworkSQLiteOpenHelperFactory<? super T, ? extends SupportSQLiteOpenHelper.Configuration.Builder<? extends R>> valueOf;

    @Override // o.deleteDatabaseFile
    public void values(builder<? super R> builderVar) {
        this.values.valueOf(new FlatMapMaybeObserver(builderVar, this.valueOf));
    }

    /* loaded from: classes7.dex */
    static final class FlatMapMaybeObserver<T, R> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements builder<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = 4375739915521278546L;
        final builder<? super R> downstream;
        final FrameworkSQLiteOpenHelperFactory<? super T, ? extends SupportSQLiteOpenHelper.Configuration.Builder<? extends R>> mapper;
        FrameworkSQLiteDatabase.AnonymousClass2 upstream;

        FlatMapMaybeObserver(builder<? super R> builderVar, FrameworkSQLiteOpenHelperFactory<? super T, ? extends SupportSQLiteOpenHelper.Configuration.Builder<? extends R>> frameworkSQLiteOpenHelperFactory) {
            this.downstream = builderVar;
            this.mapper = frameworkSQLiteOpenHelperFactory;
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            DisposableHelper.dispose(this);
            this.upstream.dispose();
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // o.builder
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            if (DisposableHelper.validate(this.upstream, anonymousClass2)) {
                this.upstream = anonymousClass2;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.builder
        public void onSuccess(T t) {
            try {
                SupportSQLiteOpenHelper.Configuration.Builder builder = (SupportSQLiteOpenHelper.Configuration.Builder) Objects.requireNonNull(this.mapper.apply(t), "The mapper returned a null MaybeSource");
                if (isDisposed()) {
                    return;
                }
                builder.valueOf(new values());
            } catch (Exception e) {
                FrameworkSQLiteDatabase.values(e);
                this.downstream.onError(e);
            }
        }

        @Override // o.builder
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.builder
        public void onComplete() {
            this.downstream.onComplete();
        }

        /* loaded from: classes7.dex */
        final class values implements builder<R> {
            values() {
            }

            @Override // o.builder
            public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
                DisposableHelper.setOnce(FlatMapMaybeObserver.this, anonymousClass2);
            }

            @Override // o.builder
            public void onSuccess(R r) {
                FlatMapMaybeObserver.this.downstream.onSuccess(r);
            }

            @Override // o.builder
            public void onError(Throwable th) {
                FlatMapMaybeObserver.this.downstream.onError(th);
            }

            @Override // o.builder
            public void onComplete() {
                FlatMapMaybeObserver.this.downstream.onComplete();
            }
        }
    }
}
