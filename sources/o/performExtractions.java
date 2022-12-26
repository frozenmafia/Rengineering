package o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes4.dex */
public class performExtractions extends Binder implements IInterface {
    /* JADX INFO: Access modifiers changed from: protected */
    public performExtractions() {
        attachInterface(this, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return valueOf(i, parcel, parcel2);
    }

    protected boolean valueOf(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        throw null;
    }
}
