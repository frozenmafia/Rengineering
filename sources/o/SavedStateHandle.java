package o;

import android.app.Activity;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;
import java.util.Objects;
/* loaded from: classes6.dex */
public final class SavedStateHandle {
    public static final SavedStateHandle ag$a = new SavedStateHandle();

    /* renamed from: o.SavedStateHandle$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass1 {
        public static final AnonymousClass1 toString = new AnonymousClass1();

        private AnonymousClass1() {
        }

        public final boolean ag$a(String str) {
            if (runAnimators.values((Object) str, (Object) "")) {
                return true;
            }
            return String.valueOf(str).length() == 0;
        }
    }

    private SavedStateHandle() {
    }

    public final boolean ag$a(Activity activity) {
        Objects.requireNonNull(activity, "null cannot be cast to non-null type android.content.Context");
        Activity activity2 = activity;
        Object systemService = activity2.getSystemService("connectivity");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        boolean z = activeNetworkInfo != null && activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED;
        if (!z) {
            Toast.makeText(activity2, "No Active Internet Connection", 1).show();
        }
        return z;
    }
}
