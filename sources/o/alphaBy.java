package o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* loaded from: classes3.dex */
class alphaBy {
    private boolean ag$a;
    private final Handler values = new Handler(Looper.getMainLooper(), new toString());

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ag$a(ViewKt$postDelayed$runnable$1<?> viewKt$postDelayed$runnable$1, boolean z) {
        synchronized (this) {
            if (!this.ag$a && !z) {
                this.ag$a = true;
                viewKt$postDelayed$runnable$1.HaptikSDK$a();
                this.ag$a = false;
            }
            this.values.obtainMessage(1, viewKt$postDelayed$runnable$1).sendToTarget();
        }
    }

    /* loaded from: classes3.dex */
    static final class toString implements Handler.Callback {
        toString() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((ViewKt$postDelayed$runnable$1) message.obj).HaptikSDK$a();
                return true;
            }
            return false;
        }
    }
}
