package o;

import android.os.SystemClock;
/* loaded from: classes4.dex */
public class onShouldSaveFragmentState implements onSupportInvalidateOptionsMenu {
    private static final onShouldSaveFragmentState valueOf = new onShouldSaveFragmentState();

    private onShouldSaveFragmentState() {
    }

    public static onShouldSaveFragmentState valueOf() {
        return valueOf;
    }

    @Override // o.onSupportInvalidateOptionsMenu
    public long values() {
        return SystemClock.elapsedRealtime();
    }
}
