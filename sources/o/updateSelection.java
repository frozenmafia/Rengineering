package o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
/* loaded from: classes4.dex */
public class updateSelection {
    private static updateSelection toString;
    private updateSelection$ag$a ag$a;
    private updateSelection$ag$a valueOf;
    private final Object values = new Object();
    private final Handler ah$a = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: o.updateSelection.4
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            updateSelection.this.ah$a((updateSelection$ag$a) message.obj);
            return true;
        }
    });

    /* loaded from: classes4.dex */
    public interface valueOf {
        void ah$a();

        void ah$a(int i);
    }

    public static updateSelection ag$a() {
        if (toString == null) {
            toString = new updateSelection();
        }
        return toString;
    }

    private updateSelection() {
    }

    public void values(int i, valueOf valueof) {
        synchronized (this.values) {
            if (!HaptikSDK$a(valueof)) {
                if (!ah$b(valueof)) {
                    this.valueOf = new updateSelection$ag$a(i, valueof);
                } else {
                    this.valueOf.ah$a = i;
                }
                updateSelection$ag$a updateselection_ag_a = this.ag$a;
                if (updateselection_ag_a == null || !ag$a(updateselection_ag_a, 4)) {
                    this.ag$a = null;
                    values();
                    return;
                }
                return;
            }
            this.ag$a.ah$a = i;
            this.ah$a.removeCallbacksAndMessages(this.ag$a);
            ag$a(this.ag$a);
        }
    }

    public void ah$a(valueOf valueof, int i) {
        synchronized (this.values) {
            if (HaptikSDK$a(valueof)) {
                ag$a(this.ag$a, i);
            } else if (ah$b(valueof)) {
                ag$a(this.valueOf, i);
            }
        }
    }

    public void toString(valueOf valueof) {
        synchronized (this.values) {
            if (HaptikSDK$a(valueof)) {
                this.ag$a = null;
                if (this.valueOf != null) {
                    values();
                }
            }
        }
    }

    public void ag$a(valueOf valueof) {
        synchronized (this.values) {
            if (HaptikSDK$a(valueof)) {
                ag$a(this.ag$a);
            }
        }
    }

    public void values(valueOf valueof) {
        synchronized (this.values) {
            if (HaptikSDK$a(valueof)) {
                this.ah$a.removeCallbacksAndMessages(this.ag$a);
            }
        }
    }

    public void ah$a(valueOf valueof) {
        synchronized (this.values) {
            if (HaptikSDK$a(valueof)) {
                ag$a(this.ag$a);
            }
        }
    }

    public boolean valueOf(valueOf valueof) {
        boolean z;
        synchronized (this.values) {
            z = HaptikSDK$a(valueof) || ah$b(valueof);
        }
        return z;
    }

    private void values() {
        WeakReference weakReference;
        updateSelection$ag$a updateselection_ag_a = this.valueOf;
        if (updateselection_ag_a != null) {
            this.ag$a = updateselection_ag_a;
            this.valueOf = null;
            weakReference = updateselection_ag_a.toString;
            valueOf valueof = (valueOf) weakReference.get();
            if (valueof != null) {
                valueof.ah$a();
            } else {
                this.ag$a = null;
            }
        }
    }

    private boolean ag$a(updateSelection$ag$a updateselection_ag_a, int i) {
        WeakReference weakReference;
        weakReference = updateselection_ag_a.toString;
        valueOf valueof = (valueOf) weakReference.get();
        if (valueof != null) {
            valueof.ah$a(i);
            return true;
        }
        return false;
    }

    private boolean HaptikSDK$a(valueOf valueof) {
        updateSelection$ag$a updateselection_ag_a = this.ag$a;
        return updateselection_ag_a != null && updateselection_ag_a.valueOf(valueof);
    }

    private boolean ah$b(valueOf valueof) {
        updateSelection$ag$a updateselection_ag_a = this.valueOf;
        return updateselection_ag_a != null && updateselection_ag_a.valueOf(valueof);
    }

    private void ag$a(updateSelection$ag$a updateselection_ag_a) {
        int i;
        int i2;
        int i3;
        i = updateselection_ag_a.ah$a;
        if (i == -2) {
            return;
        }
        int i4 = 6000;
        i2 = updateselection_ag_a.ah$a;
        if (i2 > 0) {
            i4 = updateselection_ag_a.ah$a;
        } else {
            i3 = updateselection_ag_a.ah$a;
            if (i3 == -1) {
                i4 = 3000;
            }
        }
        this.ah$a.removeCallbacksAndMessages(updateselection_ag_a);
        Handler handler = this.ah$a;
        handler.sendMessageDelayed(Message.obtain(handler, 0, updateselection_ag_a), i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah$a(updateSelection$ag$a updateselection_ag_a) {
        synchronized (this.values) {
            if (this.ag$a == updateselection_ag_a || this.valueOf == updateselection_ag_a) {
                ag$a(updateselection_ag_a, 2);
            }
        }
    }
}
