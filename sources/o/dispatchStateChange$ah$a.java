package o;

import android.content.Context;
/* loaded from: classes4.dex */
public final class dispatchStateChange$ah$a {
    public /* synthetic */ dispatchStateChange$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    private dispatchStateChange$ah$a() {
    }

    public final dispatchStateChange values(Context context, String str, String str2) {
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(str, "url");
        runAnimators.ag$a(str2, "expectedRedirectUrl");
        beginTransaction$ah$a begintransaction_ah_a = beginTransaction.values;
        beginTransaction.values.toString(context);
        return new dispatchStateChange(context, str, str2, null);
    }
}
