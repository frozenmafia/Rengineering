package com.bugsnag.android;

import com.bugsnag.android.Thread;
import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.ViewCompat;
import o.runAnimators;
import o.setImportantForAccessibility;
/* loaded from: classes3.dex */
public final class ThreadState$captureThreadTrace$1 extends Lambda implements Styleable.ChangeBounds<java.lang.Thread, Thread> {
    final /* synthetic */ java.lang.Thread $currentThread;
    final /* synthetic */ Throwable $exc;
    final /* synthetic */ boolean $isUnhandled;
    final /* synthetic */ setImportantForAccessibility $logger;
    final /* synthetic */ Collection $projectPackages;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadState$captureThreadTrace$1(java.lang.Thread thread, Throwable th, boolean z, Collection collection, setImportantForAccessibility setimportantforaccessibility) {
        super(1);
        this.$currentThread = thread;
        this.$exc = th;
        this.$isUnhandled = z;
        this.$projectPackages = collection;
        this.$logger = setimportantforaccessibility;
    }

    @Override // o.Styleable.ChangeBounds
    public final Thread invoke(java.lang.Thread thread) {
        StackTraceElement[] stackTrace;
        runAnimators.valueOf(thread, "thread");
        boolean z = thread.getId() == this.$currentThread.getId();
        if (z) {
            Throwable th = this.$exc;
            if (th != null && this.$isUnhandled) {
                stackTrace = th.getStackTrace();
            } else {
                stackTrace = this.$currentThread.getStackTrace();
            }
        } else {
            stackTrace = thread.getStackTrace();
        }
        runAnimators.toString(stackTrace, "if (isErrorThread) {\n   …ckTrace\n                }");
        return new Thread(thread.getId(), thread.getName(), ThreadType.ANDROID, z, Thread.State.forThread(thread), new ViewCompat.AnonymousClass2(stackTrace, this.$projectPackages, this.$logger), this.$logger);
    }
}
