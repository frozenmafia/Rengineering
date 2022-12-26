package io.reactivex.rxjava3.internal.util;

import o.IdlingRegistry;
import o.IdlingResource;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.endMetadataList;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
/* loaded from: classes7.dex */
public enum EmptyComponent implements SwipeRefreshLayout.AnonymousClass5<Object>, IdlingResource<Object>, IdlingRegistry<Object>, IdlingResource.ResourceCallback<Object>, SwipeRefreshLayout.AnonymousClass3, getSidecarVersion, dataStart {
    INSTANCE;

    @Override // o.getSidecarVersion
    public void cancel() {
    }

    @Override // o.dataStart
    public void dispose() {
    }

    @Override // o.dataStart
    public boolean isDisposed() {
        return true;
    }

    @Override // o.registerConfigurationChangeListener
    public void onComplete() {
    }

    @Override // o.registerConfigurationChangeListener
    public void onNext(Object obj) {
    }

    @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
    public void onSuccess(Object obj) {
    }

    @Override // o.getSidecarVersion
    public void request(long j) {
    }

    public static <T> registerConfigurationChangeListener<T> asSubscriber() {
        return INSTANCE;
    }

    public static <T> IdlingResource<T> asObserver() {
        return INSTANCE;
    }

    @Override // o.IdlingResource
    public void onSubscribe(dataStart datastart) {
        datastart.dispose();
    }

    @Override // o.SwipeRefreshLayout.AnonymousClass5, o.registerConfigurationChangeListener
    public void onSubscribe(getSidecarVersion getsidecarversion) {
        getsidecarversion.cancel();
    }

    @Override // o.registerConfigurationChangeListener
    public void onError(Throwable th) {
        endMetadataList.valueOf(th);
    }
}
