package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes4.dex */
public abstract class getZipCrc implements IInterface {
    private final IBinder toString;
    private final String values;

    /* JADX INFO: Access modifiers changed from: protected */
    public getZipCrc(IBinder iBinder, String str) {
        this.toString = iBinder;
        this.values = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.toString;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Parcel ag$a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.values);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ag$a(int i, Parcel parcel) throws RemoteException {
        try {
            this.toString.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
