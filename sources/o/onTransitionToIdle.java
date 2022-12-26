package o;

import java.util.Objects;
import o.IdlingResource;
/* loaded from: classes7.dex */
public abstract class onTransitionToIdle<T> implements decrement<T> {
    protected abstract void toString(IdlingResource.ResourceCallback<? super T> resourceCallback);

    @Override // o.decrement
    public final void values(IdlingResource.ResourceCallback<? super T> resourceCallback) {
        Objects.requireNonNull(resourceCallback, "observer is null");
        IdlingResource.ResourceCallback<? super T> values = endMetadataList.values(this, resourceCallback);
        Objects.requireNonNull(values, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            toString(values);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            FlatBufferBuilder.ah$a(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
