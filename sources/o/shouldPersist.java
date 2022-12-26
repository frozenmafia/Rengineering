package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes5.dex */
public interface shouldPersist extends IInterface {

    /* loaded from: classes5.dex */
    public static abstract class values extends performExtractions implements shouldPersist {

        /* loaded from: classes5.dex */
        public static class toString extends putStoredApkInfo implements shouldPersist {
            toString(IBinder iBinder) {
                super(iBinder);
            }

            @Override // o.shouldPersist
            public final Bundle ag$a(Bundle bundle) throws RemoteException {
                Parcel valueOf = valueOf();
                isModified.ag$a(valueOf, bundle);
                Parcel ag$a = ag$a(valueOf);
                Bundle bundle2 = (Bundle) isModified.toString(ag$a, Bundle.CREATOR);
                ag$a.recycle();
                return bundle2;
            }
        }

        public static shouldPersist ah$a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface instanceof shouldPersist) {
                return (shouldPersist) queryLocalInterface;
            }
            return new toString(iBinder);
        }

        @Override // o.performExtractions
        protected final boolean valueOf(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
            if (i == 1) {
                Bundle ag$a = ag$a((Bundle) isModified.toString(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                isModified.ah$a(parcel2, ag$a);
                return true;
            }
            return false;
        }
    }

    Bundle ag$a(Bundle bundle) throws RemoteException;
}
