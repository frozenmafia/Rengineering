package o;

import android.content.Context;
import android.os.Bundle;
import com.facebook.login.LoginClient;
/* loaded from: classes4.dex */
public final class setFragmentFactory extends addFragment {
    @Override // o.addFragment
    protected void ah$a(Bundle bundle) {
        runAnimators.ag$a(bundle, "data");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setFragmentFactory(Context context, LoginClient.Request request) {
        super(context, 65536, 65537, 20121101, request.ag$a(), request.HaptikSDK$d());
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(request, "request");
    }
}
