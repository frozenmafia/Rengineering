package com.bugsnag.android;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class ThreadSendPolicy$ah$a {
    private ThreadSendPolicy$ah$a() {
    }

    public /* synthetic */ ThreadSendPolicy$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    public final ThreadSendPolicy ah$a(String str) {
        ThreadSendPolicy threadSendPolicy;
        runAnimators.valueOf(str, "str");
        ThreadSendPolicy[] values = ThreadSendPolicy.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                threadSendPolicy = null;
                break;
            }
            threadSendPolicy = values[i];
            if (runAnimators.values((Object) threadSendPolicy.name(), (Object) str)) {
                break;
            }
            i++;
        }
        return threadSendPolicy != null ? threadSendPolicy : ThreadSendPolicy.ALWAYS;
    }
}
