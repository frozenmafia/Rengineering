package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes4.dex */
public class putStoredApkInfo implements IInterface {
    private final IBinder ag$a;
    private final String toString = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    /* JADX INFO: Access modifiers changed from: protected */
    public putStoredApkInfo(IBinder iBinder) {
        this.ag$a = iBinder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel ag$a(Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.ag$a.transact(1, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.ag$a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel valueOf() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.toString);
        return obtain;
    }
}
