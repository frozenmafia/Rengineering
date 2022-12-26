package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.LogoutFromAllDevicesMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class LogoutFromAllDevicesMutation$Data$Companion$invoke$1$logoutFromAllDevices$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, LogoutFromAllDevicesMutation.LogoutFromAllDevices> {
    public static final LogoutFromAllDevicesMutation$Data$Companion$invoke$1$logoutFromAllDevices$1 INSTANCE = new LogoutFromAllDevicesMutation$Data$Companion$invoke$1$logoutFromAllDevices$1();

    LogoutFromAllDevicesMutation$Data$Companion$invoke$1$logoutFromAllDevices$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final LogoutFromAllDevicesMutation.LogoutFromAllDevices invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return LogoutFromAllDevicesMutation.LogoutFromAllDevices.Companion.invoke(removecancellable);
    }
}
