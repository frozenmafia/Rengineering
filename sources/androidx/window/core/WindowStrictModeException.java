package androidx.window.core;

import o.runAnimators;
/* loaded from: classes6.dex */
public final class WindowStrictModeException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowStrictModeException(String str) {
        super(str);
        runAnimators.ag$a(str, "message");
    }
}
