package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.apps.nbu.paisa.inapp.aidl.IsReadyToPayRequest;
import o.MultiDexExtractor;
/* loaded from: classes4.dex */
public interface findCentralDirectory extends IInterface {
    void values(IsReadyToPayRequest isReadyToPayRequest, MultiDexExtractor.ExtractedDex extractedDex) throws RemoteException;

    /* loaded from: classes4.dex */
    public static abstract class values extends loadExistingExtractions implements findCentralDirectory {
        public values() {
            super("com.google.android.apps.nbu.paisa.inapp.aidl.IIsReadyToPayService");
        }

        public static findCentralDirectory ah$a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.nbu.paisa.inapp.aidl.IIsReadyToPayService");
            if (queryLocalInterface instanceof findCentralDirectory) {
                return (findCentralDirectory) queryLocalInterface;
            }
            return new findCentralDirectory$values$ah$a(iBinder);
        }
    }
}
