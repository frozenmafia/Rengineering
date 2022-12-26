package o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes4.dex */
public abstract class loadExistingExtractions extends Binder implements IInterface {
    private static ZipUtil toString;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    protected boolean valueOf(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public loadExistingExtractions(String str) {
        attachInterface(this, str);
    }

    protected boolean toString(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i > 16777215) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.enforceInterface(getInterfaceDescriptor());
        return false;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (toString(i, parcel, parcel2, i2)) {
            return true;
        }
        ZipUtil zipUtil = toString;
        if (zipUtil == null) {
            return valueOf(i, parcel, parcel2, i2);
        }
        return zipUtil.values(this, i, parcel, parcel2, i2);
    }
}
