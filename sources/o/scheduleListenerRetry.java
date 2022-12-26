package o;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
/* loaded from: classes6.dex */
public final /* synthetic */ class scheduleListenerRetry implements FrameworkSQLiteStatement {
    public final /* synthetic */ TrustedWebActivityCallbackRemote ag$a$d840001;
    public final /* synthetic */ boolean ah$a;
    public final /* synthetic */ int toString;
    public final /* synthetic */ int valueOf;
    public final /* synthetic */ onIsPermissionRevocationEnabledForAppResult values;

    public /* synthetic */ scheduleListenerRetry(TrustedWebActivityCallbackRemote trustedWebActivityCallbackRemote, onIsPermissionRevocationEnabledForAppResult onispermissionrevocationenabledforappresult, int i, int i2, boolean z) {
        this.ag$a$d840001 = trustedWebActivityCallbackRemote;
        this.values = onispermissionrevocationenabledforappresult;
        this.toString = i;
        this.valueOf = i2;
        this.ah$a = z;
    }

    @Override // o.FrameworkSQLiteStatement
    public final void accept(Object obj) {
        try {
            ((Class) getRealOwner.ag$a((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 42855), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 31, 22 - View.combineMeasuredStates(0, 0))).getMethod("ah$a", onIsPermissionRevocationEnabledForAppResult.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, getEditChoicesBeforeSending.class).invoke(this.ag$a$d840001, this.values, Integer.valueOf(this.toString), Integer.valueOf(this.valueOf), Boolean.valueOf(this.ah$a), (getEditChoicesBeforeSending) obj);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
