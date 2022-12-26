package com.facebook.imagepipeline.debug;

import com.facebook.common.references.SharedReference;
/* loaded from: classes4.dex */
public interface CloseableReferenceLeakTracker {

    /* loaded from: classes6.dex */
    public interface Listener {
        void onCloseableReferenceLeak(SharedReference<Object> sharedReference, Throwable th);
    }

    boolean isSet();

    void setListener(Listener listener);

    void trackCloseableReferenceLeak(SharedReference<Object> sharedReference, Throwable th);
}
