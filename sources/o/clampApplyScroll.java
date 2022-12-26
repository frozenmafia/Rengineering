package o;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.auth.FirebaseAuth;
/* loaded from: classes7.dex */
public final class clampApplyScroll {
    private static final clampApplyScroll toString = new clampApplyScroll();
    private final isViewValidAsAnchor ah$a;
    private final resetInternal values;

    private clampApplyScroll() {
        resetInternal valueOf = resetInternal.valueOf();
        isViewValidAsAnchor ag$a = isViewValidAsAnchor.ag$a();
        this.values = valueOf;
        this.ah$a = ag$a;
    }

    public static clampApplyScroll ag$a() {
        return toString;
    }

    public final void ag$a(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.getStatusCode());
        edit.putString("statusMessage", status.getStatusMessage());
        edit.putLong("timestamp", DefaultClock.getInstance().currentTimeMillis());
        edit.commit();
    }

    public final void valueOf(FirebaseAuth firebaseAuth) {
        this.values.values(firebaseAuth);
    }

    public final void values(Context context) {
        this.values.ag$a(context);
    }
}
