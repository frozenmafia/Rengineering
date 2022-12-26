package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes5.dex */
public abstract class setOnDisplayPreferenceDialogListener extends getPreferenceComparisonCallback implements isStorageDefault {
    public setOnDisplayPreferenceDialogListener() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    @Override // o.getPreferenceComparisonCallback
    protected final boolean ah$a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            inflateFromResource.values(parcel);
            ah$a((Bundle) inflateFromResource.toString(parcel, Bundle.CREATOR));
            return true;
        } else if (i != 3) {
            return false;
        } else {
            inflateFromResource.values(parcel);
            ag$a((Bundle) inflateFromResource.toString(parcel, Bundle.CREATOR));
            return true;
        }
    }
}
