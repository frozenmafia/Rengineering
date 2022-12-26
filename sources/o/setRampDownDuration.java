package o;

import android.content.Context;
import android.content.SharedPreferences;
/* loaded from: classes4.dex */
public class setRampDownDuration implements computeTargetVelocity {
    private Context toString;

    public setRampDownDuration(Context context) {
        this.toString = null;
        this.toString = context;
    }

    @Override // o.computeTargetVelocity
    public void ah$a(String str, String str2, String str3, requestPermission requestpermission) {
        SharedPreferences.Editor edit = this.toString.getSharedPreferences(str, 0).edit();
        edit.putString(str2, str3);
        if (edit.commit()) {
            requestpermission.valueOf(true, str3);
        } else {
            requestpermission.valueOf(false, "Failed to write data");
        }
    }

    @Override // o.computeTargetVelocity
    public void ag$a(String str, String str2, requestPermission requestpermission) {
        try {
            requestpermission.valueOf(true, this.toString.getSharedPreferences(str, 0).getString(str2, null));
        } catch (Exception e) {
            requestpermission.valueOf(false, e.toString());
        }
    }

    @Override // o.computeTargetVelocity
    public void valueOf() {
        this.toString = null;
    }
}
