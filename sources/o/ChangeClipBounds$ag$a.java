package o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes5.dex */
public abstract class ChangeClipBounds$ag$a extends Binder implements ChangeClipBounds {
    public static ChangeClipBounds values(final IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.phonepe.app.external.sdksupport.MerchantBridge");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof ChangeClipBounds)) ? new ChangeClipBounds(iBinder) { // from class: o.ChangeClipBounds$ag$a$ag$a
            public IBinder ag$a;

            {
                this.ag$a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.ag$a;
            }

            @Override // o.ChangeClipBounds
            public String toString(String str, String str2, String str3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.phonepe.app.external.sdksupport.MerchantBridge");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.ag$a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        } : (ChangeClipBounds) queryLocalInterface;
    }
}
