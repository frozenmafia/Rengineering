package o;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import o.FragmentManager;
/* loaded from: classes4.dex */
public abstract class FragmentManager$FragmentLifecycleCallbacks$ag$a extends Binder implements FragmentManager.FragmentLifecycleCallbacks {
    public FragmentManager$FragmentLifecycleCallbacks$ag$a() {
        attachInterface(this, "com.facebook.ppml.receiver.IReceiverService");
    }

    public static FragmentManager.FragmentLifecycleCallbacks toString(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
        if (queryLocalInterface != null && (queryLocalInterface instanceof FragmentManager.FragmentLifecycleCallbacks)) {
            return (FragmentManager.FragmentLifecycleCallbacks) queryLocalInterface;
        }
        return new values(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i == 1598968902) {
                parcel2.writeString("com.facebook.ppml.receiver.IReceiverService");
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.enforceInterface("com.facebook.ppml.receiver.IReceiverService");
        int fragmentManager$FragmentLifecycleCallbacks$ag$a = toString(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
        parcel2.writeNoException();
        parcel2.writeInt(fragmentManager$FragmentLifecycleCallbacks$ag$a);
        return true;
    }

    /* loaded from: classes4.dex */
    static class values implements FragmentManager.FragmentLifecycleCallbacks {
        public static FragmentManager.FragmentLifecycleCallbacks valueOf;
        private IBinder ah$a;

        values(IBinder iBinder) {
            this.ah$a = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.ah$a;
        }

        @Override // o.FragmentManager.FragmentLifecycleCallbacks
        public int toString(Bundle bundle) throws RemoteException {
            int readInt;
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                if (bundle != null) {
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                } else {
                    obtain.writeInt(0);
                }
                if (this.ah$a.transact(1, obtain, obtain2, 0) || valueOf == null) {
                    obtain2.readException();
                    readInt = obtain2.readInt();
                } else {
                    readInt = valueOf.toString(bundle);
                }
                return readInt;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }
}
