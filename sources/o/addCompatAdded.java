package o;

import java.util.Objects;
import o.IdlingResource;
/* loaded from: classes7.dex */
public final class addCompatAdded<T, R> extends onTransitionToIdle<R> {
    final addOffset<? super T, ? extends R> ah$a;
    final decrement<? extends T> toString;

    @Override // o.onTransitionToIdle
    protected void toString(IdlingResource.ResourceCallback<? super R> resourceCallback) {
        this.toString.values(new values(resourceCallback, this.ah$a));
    }

    /* loaded from: classes7.dex */
    public static final class values<T, R> implements IdlingResource.ResourceCallback<T> {
        final addOffset<? super T, ? extends R> ah$a;
        final IdlingResource.ResourceCallback<? super R> values;

        public values(IdlingResource.ResourceCallback<? super R> resourceCallback, addOffset<? super T, ? extends R> addoffset) {
            this.values = resourceCallback;
            this.ah$a = addoffset;
        }

        @Override // o.IdlingResource.ResourceCallback
        public void onSubscribe(dataStart datastart) {
            this.values.onSubscribe(datastart);
        }

        @Override // o.IdlingResource.ResourceCallback
        public void onSuccess(T t) {
            try {
                R apply = this.ah$a.apply(t);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                this.values.onSuccess(apply);
            } catch (Throwable th) {
                FlatBufferBuilder.ah$a(th);
                onError(th);
            }
        }

        @Override // o.IdlingResource.ResourceCallback
        public void onError(Throwable th) {
            this.values.onError(th);
        }
    }
}
