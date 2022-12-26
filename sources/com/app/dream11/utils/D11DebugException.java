package com.app.dream11.utils;

import androidx.core.app.NotificationCompat;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class D11DebugException extends Throwable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D11DebugException(String str, Throwable th) {
        super(str, th);
        runAnimators.ag$a(str, NotificationCompat.CATEGORY_MESSAGE);
        runAnimators.ag$a(th, "throwable");
    }
}
