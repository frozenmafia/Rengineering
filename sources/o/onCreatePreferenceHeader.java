package o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
/* loaded from: classes5.dex */
public class onCreatePreferenceHeader {
    private static onCreatePreferenceHeader toString;
    private values ah$a;
    private values values;
    private final Object ag$a = new Object();
    private final Handler valueOf = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: o.onCreatePreferenceHeader.5
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            onCreatePreferenceHeader.this.valueOf((values) message.obj);
            return true;
        }
    });

    /* loaded from: classes5.dex */
    public interface valueOf {
        void ah$a(int i);

        void values();
    }

    public static onCreatePreferenceHeader ag$a() {
        if (toString == null) {
            toString = new onCreatePreferenceHeader();
        }
        return toString;
    }

    private onCreatePreferenceHeader() {
    }

    public void valueOf(int i, valueOf valueof) {
        synchronized (this.ag$a) {
            if (HaptikSDK$a(valueof)) {
                this.ah$a.values = i;
                this.valueOf.removeCallbacksAndMessages(this.ah$a);
                ag$a(this.ah$a);
                return;
            }
            if (invoke(valueof)) {
                this.values.values = i;
            } else {
                this.values = new values(i, valueof);
            }
            values valuesVar = this.ah$a;
            if (valuesVar == null || !toString(valuesVar, 4)) {
                this.ah$a = null;
                valueOf();
            }
        }
    }

    public void values(valueOf valueof, int i) {
        synchronized (this.ag$a) {
            if (HaptikSDK$a(valueof)) {
                toString(this.ah$a, i);
            } else if (invoke(valueof)) {
                toString(this.values, i);
            }
        }
    }

    public void values(valueOf valueof) {
        synchronized (this.ag$a) {
            if (HaptikSDK$a(valueof)) {
                this.ah$a = null;
                if (this.values != null) {
                    valueOf();
                }
            }
        }
    }

    public void ag$a(valueOf valueof) {
        synchronized (this.ag$a) {
            if (HaptikSDK$a(valueof)) {
                ag$a(this.ah$a);
            }
        }
    }

    public void ah$a(valueOf valueof) {
        synchronized (this.ag$a) {
            if (HaptikSDK$a(valueof) && !this.ah$a.valueOf) {
                this.ah$a.valueOf = true;
                this.valueOf.removeCallbacksAndMessages(this.ah$a);
            }
        }
    }

    public void toString(valueOf valueof) {
        synchronized (this.ag$a) {
            if (HaptikSDK$a(valueof) && this.ah$a.valueOf) {
                this.ah$a.valueOf = false;
                ag$a(this.ah$a);
            }
        }
    }

    public boolean valueOf(valueOf valueof) {
        boolean z;
        synchronized (this.ag$a) {
            z = HaptikSDK$a(valueof) || invoke(valueof);
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class values {
        final WeakReference<valueOf> ah$a;
        boolean valueOf;
        int values;

        values(int i, valueOf valueof) {
            this.ah$a = new WeakReference<>(valueof);
            this.values = i;
        }

        boolean values(valueOf valueof) {
            return valueof != null && this.ah$a.get() == valueof;
        }
    }

    private void valueOf() {
        values valuesVar = this.values;
        if (valuesVar != null) {
            this.ah$a = valuesVar;
            this.values = null;
            valueOf valueof = valuesVar.ah$a.get();
            if (valueof != null) {
                valueof.values();
            } else {
                this.ah$a = null;
            }
        }
    }

    private boolean toString(values valuesVar, int i) {
        valueOf valueof = valuesVar.ah$a.get();
        if (valueof != null) {
            this.valueOf.removeCallbacksAndMessages(valuesVar);
            valueof.ah$a(i);
            return true;
        }
        return false;
    }

    private boolean HaptikSDK$a(valueOf valueof) {
        values valuesVar = this.ah$a;
        return valuesVar != null && valuesVar.values(valueof);
    }

    private boolean invoke(valueOf valueof) {
        values valuesVar = this.values;
        return valuesVar != null && valuesVar.values(valueof);
    }

    private void ag$a(values valuesVar) {
        if (valuesVar.values == -2) {
            return;
        }
        int i = 2750;
        if (valuesVar.values > 0) {
            i = valuesVar.values;
        } else if (valuesVar.values == -1) {
            i = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        }
        this.valueOf.removeCallbacksAndMessages(valuesVar);
        Handler handler = this.valueOf;
        handler.sendMessageDelayed(Message.obtain(handler, 0, valuesVar), i);
    }

    void valueOf(values valuesVar) {
        synchronized (this.ag$a) {
            if (this.ah$a == valuesVar || this.values == valuesVar) {
                toString(valuesVar, 2);
            }
        }
    }
}
