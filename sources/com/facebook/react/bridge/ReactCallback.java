package com.facebook.react.bridge;
/* loaded from: classes4.dex */
interface ReactCallback {
    void decrementPendingJSCalls();

    void incrementPendingJSCalls();

    void onBatchComplete();
}
