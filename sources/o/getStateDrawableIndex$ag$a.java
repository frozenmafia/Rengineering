package o;

import android.util.Log;
/* loaded from: classes.dex */
public final class getStateDrawableIndex$ag$a {
    public /* synthetic */ getStateDrawableIndex$ag$a(getTargetTypes gettargettypes) {
        this();
    }

    private getStateDrawableIndex$ag$a() {
    }

    public final boolean ah$a() {
        boolean z;
        z = getStateDrawableIndex.ag$a;
        return z;
    }

    public final void valueOf(Throwable th) {
        if (ah$a()) {
            while (th != null) {
                Log.d("dream11/app", "due to");
                Log.d("dream11/app", th.toString());
                StackTraceElement[] stackTrace = th.getStackTrace();
                runAnimators.ah$a(stackTrace, "throwable.stackTrace");
                int i = 0;
                int length = stackTrace.length;
                while (i < length) {
                    StackTraceElement stackTraceElement = stackTrace[i];
                    i++;
                    Log.d("dream11/app", stackTraceElement.toString());
                }
                th = th.getCause();
            }
        }
    }
}
