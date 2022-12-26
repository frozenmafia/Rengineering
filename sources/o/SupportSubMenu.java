package o;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import o.FingerprintManagerCompat;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SupportSubMenu implements FingerprintManagerCompat.CryptoObject {
    private static final List<values> toString = new ArrayList(50);
    private final Handler ag$a;

    public SupportSubMenu(Handler handler) {
        this.ag$a = handler;
    }

    @Override // o.FingerprintManagerCompat.CryptoObject
    public boolean values(int i) {
        return this.ag$a.hasMessages(i);
    }

    @Override // o.FingerprintManagerCompat.CryptoObject
    public FingerprintManagerCompat.CryptoObject.valueOf ah$a(int i) {
        return ag$a().ag$a(this.ag$a.obtainMessage(i), this);
    }

    @Override // o.FingerprintManagerCompat.CryptoObject
    public FingerprintManagerCompat.CryptoObject.valueOf valueOf(int i, Object obj) {
        return ag$a().ag$a(this.ag$a.obtainMessage(i, obj), this);
    }

    @Override // o.FingerprintManagerCompat.CryptoObject
    public FingerprintManagerCompat.CryptoObject.valueOf toString(int i, int i2, int i3) {
        return ag$a().ag$a(this.ag$a.obtainMessage(i, i2, i3), this);
    }

    @Override // o.FingerprintManagerCompat.CryptoObject
    public FingerprintManagerCompat.CryptoObject.valueOf ah$a(int i, int i2, int i3, Object obj) {
        return ag$a().ag$a(this.ag$a.obtainMessage(i, i2, i3, obj), this);
    }

    @Override // o.FingerprintManagerCompat.CryptoObject
    public boolean values(FingerprintManagerCompat.CryptoObject.valueOf valueof) {
        return ((values) valueof).ah$a(this.ag$a);
    }

    @Override // o.FingerprintManagerCompat.CryptoObject
    public boolean valueOf(int i) {
        return this.ag$a.sendEmptyMessage(i);
    }

    @Override // o.FingerprintManagerCompat.CryptoObject
    public boolean ag$a(int i, long j) {
        return this.ag$a.sendEmptyMessageAtTime(i, j);
    }

    @Override // o.FingerprintManagerCompat.CryptoObject
    public void toString(int i) {
        this.ag$a.removeMessages(i);
    }

    @Override // o.FingerprintManagerCompat.CryptoObject
    public void toString(Object obj) {
        this.ag$a.removeCallbacksAndMessages(obj);
    }

    @Override // o.FingerprintManagerCompat.CryptoObject
    public boolean ag$a(Runnable runnable) {
        return this.ag$a.post(runnable);
    }

    private static values ag$a() {
        values remove;
        List<values> list = toString;
        synchronized (list) {
            if (list.isEmpty()) {
                remove = new values();
            } else {
                remove = list.remove(list.size() - 1);
            }
        }
        return remove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ag$a(values valuesVar) {
        List<values> list = toString;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(valuesVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class values implements FingerprintManagerCompat.CryptoObject.valueOf {
        private SupportSubMenu ag$a;
        private Message toString;

        private values() {
        }

        public values ag$a(Message message, SupportSubMenu supportSubMenu) {
            this.toString = message;
            this.ag$a = supportSubMenu;
            return this;
        }

        public boolean ah$a(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) FingerprintManagerCompat.toString(this.toString));
            values();
            return sendMessageAtFrontOfQueue;
        }

        @Override // o.FingerprintManagerCompat.CryptoObject.valueOf
        public void ag$a() {
            ((Message) FingerprintManagerCompat.toString(this.toString)).sendToTarget();
            values();
        }

        private void values() {
            this.toString = null;
            this.ag$a = null;
            SupportSubMenu.ag$a(this);
        }
    }
}
