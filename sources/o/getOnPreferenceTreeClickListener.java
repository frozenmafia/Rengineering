package o;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes5.dex */
public abstract class getOnPreferenceTreeClickListener extends getPreferenceComparisonCallback implements getSharedPreferencesName {
    public static getSharedPreferencesName ag$a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return queryLocalInterface instanceof getSharedPreferencesName ? (getSharedPreferencesName) queryLocalInterface : new getSharedPreferencesMode(iBinder);
    }
}
