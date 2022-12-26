package io.reactivex.rxjava3.internal.operators.maybe;

import o.SwipeRefreshLayout;
import o.addOffset;
import o.getSidecar;
/* loaded from: classes7.dex */
public enum MaybeToPublisher implements addOffset<SwipeRefreshLayout.SavedState<Object>, getSidecar<Object>> {
    INSTANCE;

    public static <T> addOffset<SwipeRefreshLayout.SavedState<T>, getSidecar<T>> instance() {
        return INSTANCE;
    }

    @Override // o.addOffset
    public getSidecar<Object> apply(SwipeRefreshLayout.SavedState<Object> savedState) {
        return new MaybeToFlowable(savedState);
    }
}
