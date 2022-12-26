package o;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import o.PreferenceManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class arePreferenceContentsTheSame implements ServiceConnection {
    final /* synthetic */ PreferenceManager.OnPreferenceTreeClickListener values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ arePreferenceContentsTheSame(PreferenceManager.OnPreferenceTreeClickListener onPreferenceTreeClickListener, PreferenceManager.PreferenceComparisonCallback preferenceComparisonCallback) {
        this.values = onPreferenceTreeClickListener;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        PreferenceManager.OnPreferenceTreeClickListener.valueOf(this.values).values("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.values.values().post(new setStorageDeviceProtected(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        PreferenceManager.OnPreferenceTreeClickListener.valueOf(this.values).values("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.values.values().post(new PreferenceManager.OnDisplayPreferenceDialogListener(this));
    }
}
