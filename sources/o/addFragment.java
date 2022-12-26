package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
/* loaded from: classes4.dex */
public abstract class addFragment implements ServiceConnection {
    private boolean HaptikSDK$a;
    private Messenger HaptikSDK$b;
    private final int HaptikSDK$c;
    private final Context ag$a;
    private final Handler ah$a;
    private final int ah$b;
    private final int invoke;
    private final String toString;
    private toString valueOf;
    private final String values;

    /* loaded from: classes4.dex */
    public interface toString {
        void toString(Bundle bundle);
    }

    protected abstract void ah$a(Bundle bundle);

    public addFragment(Context context, int i, int i2, int i3, String str, String str2) {
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(str, "applicationId");
        Context applicationContext = context.getApplicationContext();
        this.ag$a = applicationContext != null ? applicationContext : context;
        this.HaptikSDK$c = i;
        this.ah$b = i2;
        this.values = str;
        this.invoke = i3;
        this.toString = str2;
        this.ah$a = new Handler() { // from class: o.addFragment.5
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (isStateAtLeast.values(this)) {
                    return;
                }
                try {
                    if (isStateAtLeast.values(this)) {
                        return;
                    }
                    runAnimators.ag$a(message, "message");
                    addFragment.this.valueOf(message);
                } catch (Throwable th) {
                    isStateAtLeast.values(th, this);
                }
            }
        };
    }

    protected final Context ag$a() {
        return this.ag$a;
    }

    public final void toString(toString tostring) {
        this.valueOf = tostring;
    }

    public final boolean values() {
        synchronized (this) {
            boolean z = false;
            if (this.HaptikSDK$a) {
                return false;
            }
            addCancellationSignal addcancellationsignal = addCancellationSignal.ag$a;
            if (addCancellationSignal.ag$a(this.invoke) == -1) {
                return false;
            }
            addCancellationSignal addcancellationsignal2 = addCancellationSignal.ag$a;
            Intent valueOf = addCancellationSignal.valueOf(ag$a());
            if (valueOf != null) {
                this.HaptikSDK$a = true;
                ag$a().bindService(valueOf, this, 1);
                z = true;
            }
            return z;
        }
    }

    public final void ah$a() {
        this.HaptikSDK$a = false;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        runAnimators.ag$a(componentName, "name");
        runAnimators.ag$a(iBinder, androidx.core.app.NotificationCompat.CATEGORY_SERVICE);
        this.HaptikSDK$b = new Messenger(iBinder);
        valueOf();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        runAnimators.ag$a(componentName, "name");
        this.HaptikSDK$b = null;
        try {
            this.ag$a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        valueOf((Bundle) null);
    }

    private final void valueOf() {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.values);
        String str = this.toString;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        ah$a(bundle);
        Message obtain = Message.obtain((Handler) null, this.HaptikSDK$c);
        obtain.arg1 = this.invoke;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.ah$a);
        try {
            Messenger messenger = this.HaptikSDK$b;
            if (messenger == null) {
                return;
            }
            messenger.send(obtain);
        } catch (RemoteException unused) {
            valueOf((Bundle) null);
        }
    }

    protected final void valueOf(Message message) {
        runAnimators.ag$a(message, "message");
        if (message.what == this.ah$b) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                valueOf((Bundle) null);
            } else {
                valueOf(data);
            }
            try {
                this.ag$a.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    private final void valueOf(Bundle bundle) {
        if (this.HaptikSDK$a) {
            this.HaptikSDK$a = false;
            toString tostring = this.valueOf;
            if (tostring == null) {
                return;
            }
            tostring.toString(bundle);
        }
    }
}
