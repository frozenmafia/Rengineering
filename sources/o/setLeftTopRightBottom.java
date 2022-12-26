package o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import irjuc.irjuc.cqqlq.irjuc.jmjou.jmjou;
import o.ChangeBounds;
/* loaded from: classes5.dex */
public class setLeftTopRightBottom implements handleException {
    public ChangeBounds.ViewBounds ag$a;
    public jmjou ah$a;
    public Context valueOf;

    @Override // o.handleException
    public boolean isCachingAllowed() {
        return true;
    }

    public String valueOf() {
        try {
            ApplicationInfo applicationInfo = values().getPackageManager().getApplicationInfo(values().getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                return applicationInfo.metaData.getString("com.phonepe.android.sdk.AppId");
            }
        } catch (Exception unused) {
        }
        return "";
    }

    @Override // o.handleException
    public void init(jmjou jmjouVar, jmjou.chmha chmhaVar) {
        jmjouVar.getClass();
        this.valueOf = jmjou.valueOf;
        this.ag$a = (ChangeBounds.ViewBounds) jmjouVar.values(ChangeBounds.ViewBounds.class);
        this.ah$a = jmjouVar;
    }

    public Context values() {
        if (this.valueOf == null) {
            this.ah$a.getClass();
            this.valueOf = jmjou.valueOf;
        }
        return this.valueOf;
    }
}
