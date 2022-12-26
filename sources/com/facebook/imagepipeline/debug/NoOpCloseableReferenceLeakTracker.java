package com.facebook.imagepipeline.debug;

import com.facebook.common.references.SharedReference;
import com.facebook.imagepipeline.debug.CloseableReferenceLeakTracker;
/* loaded from: classes4.dex */
public class NoOpCloseableReferenceLeakTracker implements CloseableReferenceLeakTracker {
    @Override // com.facebook.imagepipeline.debug.CloseableReferenceLeakTracker
    public boolean isSet() {
        return false;
    }

    @Override // com.facebook.imagepipeline.debug.CloseableReferenceLeakTracker
    public void setListener(CloseableReferenceLeakTracker.Listener listener) {
    }

    @Override // com.facebook.imagepipeline.debug.CloseableReferenceLeakTracker
    public void trackCloseableReferenceLeak(SharedReference<Object> sharedReference, Throwable th) {
    }
}
