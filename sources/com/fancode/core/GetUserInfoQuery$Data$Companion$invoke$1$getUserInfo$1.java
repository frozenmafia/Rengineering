package com.fancode.core;

import com.fancode.core.GetUserInfoQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GetUserInfoQuery$Data$Companion$invoke$1$getUserInfo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetUserInfoQuery.valueOf> {
    public static final GetUserInfoQuery$Data$Companion$invoke$1$getUserInfo$1 INSTANCE = new GetUserInfoQuery$Data$Companion$invoke$1$getUserInfo$1();

    GetUserInfoQuery$Data$Companion$invoke$1$getUserInfo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetUserInfoQuery.valueOf invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetUserInfoQuery.valueOf.ah$a.valueOf(removecancellable);
    }
}
