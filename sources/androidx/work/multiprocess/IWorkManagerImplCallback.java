package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes6.dex */
public interface IWorkManagerImplCallback extends IInterface {

    /* loaded from: classes6.dex */
    public static class Default implements IWorkManagerImplCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.work.multiprocess.IWorkManagerImplCallback
        public void onFailure(String str) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImplCallback
        public void onSuccess(byte[] bArr) throws RemoteException {
        }
    }

    void onFailure(String str) throws RemoteException;

    void onSuccess(byte[] bArr) throws RemoteException;

    /* loaded from: classes6.dex */
    public static abstract class Stub extends Binder implements IWorkManagerImplCallback {
        private static final String DESCRIPTOR = "androidx.work.multiprocess.IWorkManagerImplCallback";
        static final int TRANSACTION_onFailure = 2;
        static final int TRANSACTION_onSuccess = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IWorkManagerImplCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IWorkManagerImplCallback)) {
                return (IWorkManagerImplCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onSuccess(parcel.createByteArray());
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onFailure(parcel.readString());
                return true;
            } else if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static class Proxy implements IWorkManagerImplCallback {
            public static IWorkManagerImplCallback sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // androidx.work.multiprocess.IWorkManagerImplCallback
            public void onSuccess(byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    if (this.mRemote.transact(1, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onSuccess(bArr);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImplCallback
            public void onFailure(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (this.mRemote.transact(2, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onFailure(str);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IWorkManagerImplCallback iWorkManagerImplCallback) {
            if (Proxy.sDefaultImpl == null) {
                if (iWorkManagerImplCallback != null) {
                    Proxy.sDefaultImpl = iWorkManagerImplCallback;
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("setDefaultImpl() called twice");
        }

        public static IWorkManagerImplCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
