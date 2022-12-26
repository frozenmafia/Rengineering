package o;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.concurrent.atomic.AtomicBoolean;
import o.ViewCompat;
/* loaded from: classes3.dex */
public final class getTranslationX implements getTranslationY {
    private final values ag$a;
    private final ConnectivityManager values;

    public getTranslationX(ConnectivityManager connectivityManager, Transition<? super Boolean, ? super String, setAnimationMatrix> transition) {
        runAnimators.valueOf(connectivityManager, "cm");
        this.values = connectivityManager;
        this.ag$a = new values(transition);
    }

    @Override // o.getTranslationY
    public void ah$a() {
        this.values.registerDefaultNetworkCallback(this.ag$a);
    }

    @Override // o.getTranslationY
    public boolean valueOf() {
        return this.values.getActiveNetwork() != null;
    }

    @Override // o.getTranslationY
    public String values() {
        Network activeNetwork = this.values.getActiveNetwork();
        NetworkCapabilities networkCapabilities = activeNetwork != null ? this.values.getNetworkCapabilities(activeNetwork) : null;
        return networkCapabilities == null ? "none" : networkCapabilities.hasTransport(1) ? "wifi" : networkCapabilities.hasTransport(3) ? "ethernet" : networkCapabilities.hasTransport(0) ? "cellular" : "unknown";
    }

    /* loaded from: classes3.dex */
    public static final class values extends ConnectivityManager.NetworkCallback {
        private final AtomicBoolean toString = new AtomicBoolean(false);
        private final Transition<Boolean, String, setAnimationMatrix> valueOf;

        /* JADX WARN: Multi-variable type inference failed */
        public values(Transition<? super Boolean, ? super String, setAnimationMatrix> transition) {
            this.valueOf = transition;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            super.onUnavailable();
            ah$a(false);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            runAnimators.valueOf(network, "network");
            super.onAvailable(network);
            ah$a(true);
        }

        private final void ah$a(boolean z) {
            Transition<Boolean, String, setAnimationMatrix> transition;
            if (!this.toString.getAndSet(true) || (transition = this.valueOf) == null) {
                return;
            }
            transition.invoke(Boolean.valueOf(z), ViewCompat.Api15Impl.values.values());
        }
    }
}
