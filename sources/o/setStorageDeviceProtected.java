package o;

import android.os.IBinder;
import o.PreferenceManager;
/* loaded from: classes5.dex */
final class setStorageDeviceProtected extends setStorageDefault {
    final /* synthetic */ arePreferenceContentsTheSame toString;
    final /* synthetic */ IBinder valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setStorageDeviceProtected(arePreferenceContentsTheSame arepreferencecontentsthesame, IBinder iBinder) {
        this.toString = arepreferencecontentsthesame;
        this.valueOf = iBinder;
    }

    @Override // o.setStorageDefault
    public final void valueOf() {
        PreferenceManager.OnPreferenceTreeClickListener.ag$a(this.toString.values, getOnPreferenceTreeClickListener.ag$a(this.valueOf));
        PreferenceManager.OnPreferenceTreeClickListener.HaptikSDK$a(this.toString.values);
        PreferenceManager.OnPreferenceTreeClickListener.valueOf(this.toString.values, false);
        for (Runnable runnable : PreferenceManager.OnPreferenceTreeClickListener.values(this.toString.values)) {
            runnable.run();
        }
        PreferenceManager.OnPreferenceTreeClickListener.values(this.toString.values).clear();
    }
}
