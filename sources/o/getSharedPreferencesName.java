package o;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
/* loaded from: classes5.dex */
public interface getSharedPreferencesName extends IInterface {
    void toString(String str, Bundle bundle, isStorageDefault isstoragedefault) throws RemoteException;

    void values(String str, Bundle bundle, isStorageDefault isstoragedefault) throws RemoteException;
}
