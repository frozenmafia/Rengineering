package o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.login.LoginTargetApp;
import o.beginTransaction;
/* loaded from: classes4.dex */
public final class beginTransaction$ah$a {
    public /* synthetic */ beginTransaction$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    private beginTransaction$ah$a() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void toString(Context context) {
        int i;
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if ((applicationInfo == null ? null : applicationInfo.metaData) == null) {
                return;
            }
            i = beginTransaction.ah$a;
            if (i == 0) {
                ag$a(applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final beginTransaction ag$a(Context context, String str, Bundle bundle, int i, beginTransaction.values valuesVar) {
        runAnimators.ag$a(context, "context");
        beginTransaction.values.toString(context);
        return new beginTransaction(context, str, bundle, i, LoginTargetApp.FACEBOOK, valuesVar, null);
    }

    public final beginTransaction valueOf(Context context, String str, Bundle bundle, int i, LoginTargetApp loginTargetApp, beginTransaction.values valuesVar) {
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(loginTargetApp, "targetApp");
        beginTransaction.values.toString(context);
        return new beginTransaction(context, str, bundle, i, loginTargetApp, valuesVar, null);
    }

    public final int ag$a() {
        int i;
        attachController attachcontroller = attachController.toString;
        attachController.values();
        i = beginTransaction.ah$a;
        return i;
    }

    public final void ag$a(int i) {
        if (i == 0) {
            i = beginTransaction.valueOf;
        }
        beginTransaction.ah$a = i;
    }
}
