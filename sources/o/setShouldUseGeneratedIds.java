package o;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.install.InstallState;
/* loaded from: classes5.dex */
public final class setShouldUseGeneratedIds extends setSharedPreferencesMode {
    public setShouldUseGeneratedIds(Context context) {
        super(new setPreferences("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setSharedPreferencesMode
    public final void ag$a(Context context, Intent intent) {
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            this.valueOf.valueOf("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        this.valueOf.valueOf("List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            this.valueOf.valueOf("Key: %s; value: %s", str, intent.getExtras().get(str));
        }
        InstallState installState = InstallState.toString(intent, this.valueOf);
        this.valueOf.valueOf("ListenerRegistryBroadcastReceiver.onReceive: %s", installState);
        ag$a(installState);
    }
}
