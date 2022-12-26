package com.facebook.bolts;

import o.runAnimators;
/* loaded from: classes6.dex */
public final class ExecutorException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExecutorException(Exception exc) {
        super("An exception was thrown by an Executor", exc);
        runAnimators.ag$a(exc, "e");
    }
}
