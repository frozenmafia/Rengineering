package androidx.window.core;

import android.util.Log;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class AndroidLogger implements Logger {
    public static final AndroidLogger INSTANCE = new AndroidLogger();

    private AndroidLogger() {
    }

    @Override // androidx.window.core.Logger
    public void debug(String str, String str2) {
        runAnimators.ag$a(str, "tag");
        runAnimators.ag$a(str2, "message");
        Log.d(str, str2);
    }
}
