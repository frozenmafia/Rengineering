package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes5.dex */
public final class getSharedPreferencesMode extends getDefaultSharedPreferences implements getSharedPreferencesName {
    /* JADX INFO: Access modifiers changed from: package-private */
    public getSharedPreferencesMode(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    @Override // o.getSharedPreferencesName
    public final void toString(String str, Bundle bundle, isStorageDefault isstoragedefault) throws RemoteException {
        Parcel valueOf = valueOf();
        valueOf.writeString(str);
        inflateFromResource.values(valueOf, bundle);
        valueOf.writeStrongBinder(isstoragedefault);
        ah$a(3, valueOf);
    }

    @Override // o.getSharedPreferencesName
    public final void values(String str, Bundle bundle, isStorageDefault isstoragedefault) throws RemoteException {
        Parcel valueOf = valueOf();
        valueOf.writeString(str);
        inflateFromResource.values(valueOf, bundle);
        valueOf.writeStrongBinder(isstoragedefault);
        ah$a(2, valueOf);
    }
}
