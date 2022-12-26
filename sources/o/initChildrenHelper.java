package o;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import o.OrientationHelper;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class initChildrenHelper implements Thread.UncaughtExceptionHandler {
    private final OrientationHelper.AnonymousClass1 ag$a;
    private final AtomicBoolean ah$a = new AtomicBoolean(false);
    private final invalidateItemDecorations toString;
    private final Thread.UncaughtExceptionHandler valueOf;
    private final values values;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface values {
        void ah$a(invalidateItemDecorations invalidateitemdecorations, Thread thread, Throwable th);
    }

    public initChildrenHelper(values valuesVar, invalidateItemDecorations invalidateitemdecorations, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, OrientationHelper.AnonymousClass1 anonymousClass1) {
        this.values = valuesVar;
        this.toString = invalidateitemdecorations;
        this.valueOf = uncaughtExceptionHandler;
        this.ag$a = anonymousClass1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r2v3, types: [o.createScroller] */
    /* JADX WARN: Type inference failed for: r3v1, types: [o.createScroller] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.concurrent.atomic.AtomicBoolean] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        createScroller createscroller;
        ?? r3;
        createScroller createscroller2;
        ?? r0 = "Completed exception processing. Invoking default exception handler.";
        this.ah$a.set(true);
        try {
            try {
                if (!toString(thread, th)) {
                    createscroller2 = createScroller.valueOf;
                    createscroller2.ah$a("Uncaught exception will not be recorded by Crashlytics.");
                } else {
                    this.values.ah$a(this.toString, thread, th);
                }
            } catch (Exception e) {
                createscroller = createScroller.valueOf;
                createscroller.ag$a("An error occurred in the uncaught exception handler", e);
            }
        } finally {
            r3 = createScroller.valueOf;
            r3.ah$a(r0);
            this.valueOf.uncaughtException(thread, th);
            this.ah$a.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean values() {
        return this.ah$a.get();
    }

    private boolean toString(Thread thread, Throwable th) {
        createScroller createscroller;
        createScroller createscroller2;
        createScroller createscroller3;
        if (thread == null) {
            createscroller3 = createScroller.valueOf;
            createscroller3.toString("Crashlytics will not record uncaught exception; null thread");
            return false;
        } else if (th == null) {
            createscroller2 = createScroller.valueOf;
            createscroller2.toString("Crashlytics will not record uncaught exception; null throwable");
            return false;
        } else if (this.ag$a.values()) {
            createscroller = createScroller.valueOf;
            createscroller.ah$a("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        } else {
            return true;
        }
    }
}
