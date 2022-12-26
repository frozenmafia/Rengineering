package com.facebook.login;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class DeviceAuthMethodHandler$ag$a {
    public /* synthetic */ DeviceAuthMethodHandler$ag$a(getTargetTypes gettargettypes) {
        this();
    }

    private DeviceAuthMethodHandler$ag$a() {
    }

    public final ScheduledThreadPoolExecutor values() {
        ScheduledThreadPoolExecutor values;
        synchronized (this) {
            if (DeviceAuthMethodHandler.values() == null) {
                DeviceAuthMethodHandler.valueOf(new ScheduledThreadPoolExecutor(1));
            }
            values = DeviceAuthMethodHandler.values();
            if (values == null) {
                runAnimators.valueOf("backgroundExecutor");
                throw null;
            }
        }
        return values;
    }
}
