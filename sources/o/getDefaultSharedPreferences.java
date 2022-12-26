package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes5.dex */
public class getDefaultSharedPreferences implements IInterface {
    private final IBinder ah$a;
    private final String valueOf = "com.google.android.play.core.appupdate.protocol.IAppUpdateService";

    /* JADX INFO: Access modifiers changed from: protected */
    public getDefaultSharedPreferences(IBinder iBinder, String str) {
        this.ah$a = iBinder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ah$a(int i, Parcel parcel) throws RemoteException {
        try {
            this.ah$a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.ah$a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel valueOf() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.valueOf);
        return obtain;
    }
}
