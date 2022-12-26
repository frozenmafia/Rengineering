package io.reactivex.rxjava3.internal.disposables;

import o.IdlingRegistry;
import o.IdlingResource;
import o.SwipeRefreshLayout;
import o.forceDefaults;
/* loaded from: classes5.dex */
public enum EmptyDisposable implements forceDefaults<Object> {
    INSTANCE,
    NEVER;

    @Override // o.putByte
    public void clear() {
    }

    @Override // o.dataStart
    public void dispose() {
    }

    @Override // o.putByte
    public boolean isEmpty() {
        return true;
    }

    @Override // o.putByte
    public Object poll() {
        return null;
    }

    @Override // o.notNested
    public int requestFusion(int i) {
        return i & 2;
    }

    @Override // o.dataStart
    public boolean isDisposed() {
        return this == INSTANCE;
    }

    public static void complete(IdlingResource<?> idlingResource) {
        idlingResource.onSubscribe(INSTANCE);
        idlingResource.onComplete();
    }

    public static void complete(IdlingRegistry<?> idlingRegistry) {
        idlingRegistry.onSubscribe(INSTANCE);
        idlingRegistry.onComplete();
    }

    public static void error(Throwable th, IdlingResource<?> idlingResource) {
        idlingResource.onSubscribe(INSTANCE);
        idlingResource.onError(th);
    }

    public static void complete(SwipeRefreshLayout.AnonymousClass3 anonymousClass3) {
        anonymousClass3.onSubscribe(INSTANCE);
        anonymousClass3.onComplete();
    }

    public static void error(Throwable th, SwipeRefreshLayout.AnonymousClass3 anonymousClass3) {
        anonymousClass3.onSubscribe(INSTANCE);
        anonymousClass3.onError(th);
    }

    public static void error(Throwable th, IdlingResource.ResourceCallback<?> resourceCallback) {
        resourceCallback.onSubscribe(INSTANCE);
        resourceCallback.onError(th);
    }

    public static void error(Throwable th, IdlingRegistry<?> idlingRegistry) {
        idlingRegistry.onSubscribe(INSTANCE);
        idlingRegistry.onError(th);
    }

    @Override // o.putByte
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
