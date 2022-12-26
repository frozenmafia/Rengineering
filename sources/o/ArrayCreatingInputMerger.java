package o;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.amazon.identity.auth.device.AuthError;
/* loaded from: classes5.dex */
public abstract class ArrayCreatingInputMerger<T> implements ServiceConnection {
    private static final String ag$a = "u";
    protected IInterface ah$a = null;
    protected matchesIntent toString;

    protected boolean ag$a(IBinder iBinder) {
        try {
            return iBinder.getInterfaceDescriptor().equals(values().getName());
        } catch (Exception e) {
            String str = ag$a;
            putEncryptedObject.values(str, "" + e.getMessage(), e);
            return false;
        }
    }

    public void ah$a(matchesIntent matchesintent) {
        if (matchesintent == null) {
            throw new IllegalArgumentException("listener cannot be null!");
        }
        this.toString = matchesintent;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        putEncryptedObject.valueOf(ag$a, "onServiceConnected called");
        if (!ag$a(iBinder)) {
            this.toString.values(new AuthError("Returned service's interface doesn't match authorization service", AuthError.ERROR_TYPE.ERROR_UNKNOWN));
            return;
        }
        IInterface valueOf = valueOf(iBinder);
        this.ah$a = valueOf;
        this.toString.ag$a(valueOf);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        putEncryptedObject.valueOf(ag$a, "onServiceDisconnected called");
        this.ah$a = null;
    }

    public abstract IInterface valueOf(IBinder iBinder);

    public abstract Class<T> values();
}
