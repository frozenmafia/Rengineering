package com.facebook.imagepipeline.core;

import com.facebook.common.references.SharedReference;
import com.facebook.imagepipeline.debug.CloseableReferenceLeakTracker;
import java.io.Closeable;
import java.io.PrintWriter;
import java.io.StringWriter;
import o.FragmentActivity;
import o.onGetHost;
/* loaded from: classes4.dex */
public class CloseableReferenceFactory {
    private final FragmentActivity.AnonymousClass1.toString mLeakHandler;

    public CloseableReferenceFactory(final CloseableReferenceLeakTracker closeableReferenceLeakTracker) {
        this.mLeakHandler = new FragmentActivity.AnonymousClass1.toString() { // from class: com.facebook.imagepipeline.core.CloseableReferenceFactory.1
            @Override // o.FragmentActivity.AnonymousClass1.toString
            public void reportLeak(SharedReference<Object> sharedReference, Throwable th) {
                closeableReferenceLeakTracker.trackCloseableReferenceLeak(sharedReference, th);
                Object values = sharedReference.values();
                FragmentActivity.ah$a("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(sharedReference)), values != null ? values.getClass().getName() : "<value is null>", CloseableReferenceFactory.getStackTraceString(th));
            }

            @Override // o.FragmentActivity.AnonymousClass1.toString
            public boolean requiresStacktrace() {
                return closeableReferenceLeakTracker.isSet();
            }
        };
    }

    public <U extends Closeable> FragmentActivity.AnonymousClass1<U> create(U u) {
        return FragmentActivity.AnonymousClass1.ag$a(u, this.mLeakHandler);
    }

    public <T> FragmentActivity.AnonymousClass1<T> create(T t, onGetHost<T> ongethost) {
        return FragmentActivity.AnonymousClass1.valueOf(t, ongethost, this.mLeakHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
