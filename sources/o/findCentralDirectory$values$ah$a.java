package o;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.apps.nbu.paisa.inapp.aidl.IsReadyToPayRequest;
import o.MultiDexExtractor;
/* loaded from: classes4.dex */
public class findCentralDirectory$values$ah$a extends getZipCrc implements findCentralDirectory {
    /* JADX INFO: Access modifiers changed from: package-private */
    public findCentralDirectory$values$ah$a(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.nbu.paisa.inapp.aidl.IIsReadyToPayService");
    }

    @Override // o.findCentralDirectory
    public void values(IsReadyToPayRequest isReadyToPayRequest, MultiDexExtractor.ExtractedDex extractedDex) throws RemoteException {
        Parcel ag$a = ag$a();
        MultiDexExtractor.AnonymousClass1.values(ag$a, isReadyToPayRequest);
        MultiDexExtractor.AnonymousClass1.ah$a(ag$a, extractedDex);
        ag$a(1, ag$a);
    }
}
