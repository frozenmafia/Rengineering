package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
/* loaded from: classes3.dex */
final class usedInFix {
    private final Context ag$a;
    private boolean toString;
    private final valueOf valueOf;

    /* loaded from: classes3.dex */
    public interface toString {
        void valueOf();
    }

    public usedInFix(Context context, Handler handler, toString tostring) {
        this.ag$a = context.getApplicationContext();
        this.valueOf = new valueOf(handler, tostring);
    }

    public void toString(boolean z) {
        if (z && !this.toString) {
            this.ag$a.registerReceiver(this.valueOf, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.toString = true;
        } else if (z || !this.toString) {
        } else {
            this.ag$a.unregisterReceiver(this.valueOf);
            this.toString = false;
        }
    }

    /* loaded from: classes3.dex */
    final class valueOf extends BroadcastReceiver implements Runnable {
        private final Handler ah$a;
        private final toString values;

        public valueOf(Handler handler, toString tostring) {
            this.ah$a = handler;
            this.values = tostring;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.ah$a.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (usedInFix.this.toString) {
                this.values.valueOf();
            }
        }
    }
}
