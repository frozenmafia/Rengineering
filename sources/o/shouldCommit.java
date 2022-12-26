package o;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
import o.PreferenceManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class shouldCommit extends setStorageDefault {
    final /* synthetic */ PreferenceManager.OnPreferenceTreeClickListener ah$a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public shouldCommit(PreferenceManager.OnPreferenceTreeClickListener onPreferenceTreeClickListener) {
        this.ah$a = onPreferenceTreeClickListener;
    }

    @Override // o.setStorageDefault
    public final void valueOf() {
        IInterface iInterface;
        setPreferences setpreferences;
        Context context;
        ServiceConnection serviceConnection;
        PreferenceManager.OnPreferenceTreeClickListener onPreferenceTreeClickListener = this.ah$a;
        iInterface = onPreferenceTreeClickListener.getSignupData;
        if (iInterface != null) {
            setpreferences = onPreferenceTreeClickListener.ag$a;
            setpreferences.values("Unbind from service.", new Object[0]);
            PreferenceManager.OnPreferenceTreeClickListener onPreferenceTreeClickListener2 = this.ah$a;
            context = onPreferenceTreeClickListener2.ah$a;
            serviceConnection = onPreferenceTreeClickListener2.HaptikWebView;
            context.unbindService(serviceConnection);
            this.ah$a.HaptikSDK$a = false;
            this.ah$a.getSignupData = null;
            this.ah$a.HaptikWebView = null;
        }
        this.ah$a.valueOf();
    }
}
