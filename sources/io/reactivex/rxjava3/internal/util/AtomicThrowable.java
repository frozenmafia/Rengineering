package io.reactivex.rxjava3.internal.util;

import java.util.concurrent.atomic.AtomicReference;
import o.IdlingRegistry;
import o.IdlingResource;
import o.SwipeRefreshLayout;
import o.endMetadataList;
import o.registerConfigurationChangeListener;
/* loaded from: classes5.dex */
public final class AtomicThrowable extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    public boolean tryAddThrowable(Throwable th) {
        return ExceptionHelper.toString(this, th);
    }

    public boolean tryAddThrowableOrReport(Throwable th) {
        if (tryAddThrowable(th)) {
            return true;
        }
        endMetadataList.valueOf(th);
        return false;
    }

    public Throwable terminate() {
        return ExceptionHelper.ag$a(this);
    }

    public boolean isTerminated() {
        return get() == ExceptionHelper.ag$a;
    }

    public void tryTerminateAndReport() {
        Throwable terminate = terminate();
        if (terminate == null || terminate == ExceptionHelper.ag$a) {
            return;
        }
        endMetadataList.valueOf(terminate);
    }

    public void tryTerminateConsumer(registerConfigurationChangeListener<?> registerconfigurationchangelistener) {
        Throwable terminate = terminate();
        if (terminate == null) {
            registerconfigurationchangelistener.onComplete();
        } else if (terminate != ExceptionHelper.ag$a) {
            registerconfigurationchangelistener.onError(terminate);
        }
    }

    public void tryTerminateConsumer(IdlingResource<?> idlingResource) {
        Throwable terminate = terminate();
        if (terminate == null) {
            idlingResource.onComplete();
        } else if (terminate != ExceptionHelper.ag$a) {
            idlingResource.onError(terminate);
        }
    }

    public void tryTerminateConsumer(IdlingRegistry<?> idlingRegistry) {
        Throwable terminate = terminate();
        if (terminate == null) {
            idlingRegistry.onComplete();
        } else if (terminate != ExceptionHelper.ag$a) {
            idlingRegistry.onError(terminate);
        }
    }

    public void tryTerminateConsumer(IdlingResource.ResourceCallback<?> resourceCallback) {
        Throwable terminate = terminate();
        if (terminate == null || terminate == ExceptionHelper.ag$a) {
            return;
        }
        resourceCallback.onError(terminate);
    }

    public void tryTerminateConsumer(SwipeRefreshLayout.AnonymousClass3 anonymousClass3) {
        Throwable terminate = terminate();
        if (terminate == null) {
            anonymousClass3.onComplete();
        } else if (terminate != ExceptionHelper.ag$a) {
            anonymousClass3.onError(terminate);
        }
    }

    public void tryTerminateConsumer(SwipeRefreshLayout.AnonymousClass4<?> anonymousClass4) {
        Throwable terminate = terminate();
        if (terminate == null) {
            anonymousClass4.onComplete();
        } else if (terminate != ExceptionHelper.ag$a) {
            anonymousClass4.onError(terminate);
        }
    }
}
