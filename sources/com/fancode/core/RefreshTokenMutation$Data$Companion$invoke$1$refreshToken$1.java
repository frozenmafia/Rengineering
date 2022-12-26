package com.fancode.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes4.dex */
final class RefreshTokenMutation$Data$Companion$invoke$1$refreshToken$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, RefreshTokenMutation$ag$a> {
    public static final RefreshTokenMutation$Data$Companion$invoke$1$refreshToken$1 INSTANCE = new RefreshTokenMutation$Data$Companion$invoke$1$refreshToken$1();

    RefreshTokenMutation$Data$Companion$invoke$1$refreshToken$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final RefreshTokenMutation$ag$a invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return RefreshTokenMutation$ag$a.ag$a.values(removecancellable);
    }
}
