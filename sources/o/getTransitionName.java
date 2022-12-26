package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes3.dex */
public final class getTransitionName implements getTranslationY {
    private final valueOf ag$a;
    private final ConnectivityManager ah$a;
    private final Context values;

    public getTransitionName(Context context, ConnectivityManager connectivityManager, Transition<? super Boolean, ? super String, setAnimationMatrix> transition) {
        runAnimators.valueOf(context, "context");
        runAnimators.valueOf(connectivityManager, "cm");
        this.values = context;
        this.ah$a = connectivityManager;
        this.ag$a = new valueOf(transition);
    }

    private final NetworkInfo ag$a() {
        try {
            return this.ah$a.getActiveNetworkInfo();
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // o.getTranslationY
    public void ah$a() {
        hasExplicitFocusable.ag$a(this.values, this.ag$a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), null, 4, null);
    }

    @Override // o.getTranslationY
    public boolean valueOf() {
        NetworkInfo ag$a = ag$a();
        if (ag$a != null) {
            return ag$a.isConnectedOrConnecting();
        }
        return false;
    }

    @Override // o.getTranslationY
    public String values() {
        NetworkInfo ag$a = ag$a();
        Integer valueOf2 = ag$a != null ? Integer.valueOf(ag$a.getType()) : null;
        return valueOf2 == null ? "none" : valueOf2.intValue() == 1 ? "wifi" : valueOf2.intValue() == 9 ? "ethernet" : "cellular";
    }

    /* loaded from: classes3.dex */
    final class valueOf extends BroadcastReceiver {
        private final Transition<Boolean, String, setAnimationMatrix> ag$a;
        private final AtomicBoolean toString = new AtomicBoolean(false);

        /* JADX WARN: Multi-variable type inference failed */
        public valueOf(Transition<? super Boolean, ? super String, setAnimationMatrix> transition) {
            this.ag$a = transition;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Transition<Boolean, String, setAnimationMatrix> transition;
            runAnimators.valueOf(context, "context");
            runAnimators.valueOf(intent, "intent");
            if (!this.toString.getAndSet(true) || (transition = this.ag$a) == null) {
                return;
            }
            transition.invoke(Boolean.valueOf(getTransitionName.this.valueOf()), getTransitionName.this.values());
        }
    }
}
