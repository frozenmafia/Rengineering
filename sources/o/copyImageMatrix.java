package o;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes5.dex */
public interface copyImageMatrix extends IInterface {

    /* loaded from: classes5.dex */
    public static abstract class valueOf extends Binder implements copyImageMatrix {

        /* renamed from: o.copyImageMatrix$valueOf$valueOf  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static class C0341valueOf implements copyImageMatrix {
            public static copyImageMatrix valueOf;
            private IBinder ag$a;

            C0341valueOf(IBinder iBinder) {
                this.ag$a = iBinder;
            }

            @Override // o.copyImageMatrix
            public Bundle ag$a(Bundle bundle, String str, String str2, String str3) throws RemoteException {
                Bundle bundle2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("k");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (this.ag$a.transact(4, obtain, obtain2, 0) || valueOf == null) {
                        obtain2.readException();
                        bundle2 = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                    } else {
                        bundle2 = valueOf.ag$a(bundle, str, str2, str3);
                    }
                    return bundle2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // o.copyImageMatrix
            public Bundle ah$a() throws RemoteException {
                Bundle bundle;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("k");
                    if (this.ag$a.transact(5, obtain, obtain2, 0) || valueOf == null) {
                        obtain2.readException();
                        bundle = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                    } else {
                        bundle = valueOf.ah$a();
                    }
                    return bundle;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.ag$a;
            }

            @Override // o.copyImageMatrix
            public Bundle toString(Bundle bundle, String str, String[] strArr) throws RemoteException {
                Bundle bundle2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("k");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    if (this.ag$a.transact(1, obtain, obtain2, 0) || valueOf == null) {
                        obtain2.readException();
                        bundle2 = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                    } else {
                        bundle2 = valueOf.toString(bundle, str, strArr);
                    }
                    return bundle2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // o.copyImageMatrix
            public Bundle valueOf(Bundle bundle, String str) throws RemoteException {
                Bundle bundle2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("k");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (this.ag$a.transact(3, obtain, obtain2, 0) || valueOf == null) {
                        obtain2.readException();
                        bundle2 = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                    } else {
                        bundle2 = valueOf.valueOf(bundle, str);
                    }
                    return bundle2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // o.copyImageMatrix
            public Bundle values(Bundle bundle, String str, String[] strArr) throws RemoteException {
                Bundle bundle2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("k");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    if (this.ag$a.transact(2, obtain, obtain2, 0) || valueOf == null) {
                        obtain2.readException();
                        bundle2 = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                    } else {
                        bundle2 = valueOf.values(bundle, str, strArr);
                    }
                    return bundle2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static copyImageMatrix toString(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("k");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof copyImageMatrix)) ? new C0341valueOf(iBinder) : (copyImageMatrix) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("k");
                Bundle valueof = toString(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.createStringArray());
                parcel2.writeNoException();
                if (valueof != null) {
                    parcel2.writeInt(1);
                    valueof.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("k");
                Bundle values = values(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.createStringArray());
                parcel2.writeNoException();
                if (values != null) {
                    parcel2.writeInt(1);
                    values.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("k");
                Bundle valueOf = valueOf(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                parcel2.writeNoException();
                if (valueOf != null) {
                    parcel2.writeInt(1);
                    valueOf.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i == 4) {
                parcel.enforceInterface("k");
                Bundle ag$a = ag$a(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                if (ag$a != null) {
                    parcel2.writeInt(1);
                    ag$a.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i != 5) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("k");
                return true;
            } else {
                parcel.enforceInterface("k");
                Bundle ah$a = ah$a();
                parcel2.writeNoException();
                if (ah$a != null) {
                    parcel2.writeInt(1);
                    ah$a.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            }
        }
    }

    Bundle ag$a(Bundle bundle, String str, String str2, String str3) throws RemoteException;

    Bundle ah$a() throws RemoteException;

    Bundle toString(Bundle bundle, String str, String[] strArr) throws RemoteException;

    Bundle valueOf(Bundle bundle, String str) throws RemoteException;

    Bundle values(Bundle bundle, String str, String[] strArr) throws RemoteException;
}
