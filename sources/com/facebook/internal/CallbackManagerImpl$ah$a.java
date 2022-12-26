package com.facebook.internal;

import android.content.Intent;
import com.facebook.internal.CallbackManagerImpl;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class CallbackManagerImpl$ah$a {
    public /* synthetic */ CallbackManagerImpl$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    private CallbackManagerImpl$ah$a() {
    }

    public final void toString(int i, CallbackManagerImpl.toString tostring) {
        synchronized (this) {
            runAnimators.ag$a(tostring, "callback");
            if (CallbackManagerImpl.ah$a().containsKey(Integer.valueOf(i))) {
                return;
            }
            CallbackManagerImpl.ah$a().put(Integer.valueOf(i), tostring);
        }
    }

    private final CallbackManagerImpl.toString toString(int i) {
        CallbackManagerImpl.toString tostring;
        synchronized (this) {
            tostring = (CallbackManagerImpl.toString) CallbackManagerImpl.ah$a().get(Integer.valueOf(i));
        }
        return tostring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean ah$a(int i, int i2, Intent intent) {
        CallbackManagerImpl.toString callbackManagerImpl$ah$a = toString(i);
        if (callbackManagerImpl$ah$a == null) {
            return false;
        }
        return callbackManagerImpl$ah$a.ag$a(i2, intent);
    }
}
