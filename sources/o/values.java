package o;

import android.os.IBinder;
import android.os.IInterface;
import o.copyImageMatrix;
/* loaded from: classes.dex */
public class values extends ArrayCreatingInputMerger<copyImageMatrix> {
    private static final String ag$a = "ab";

    public values() {
        putEncryptedObject.valueOf(ag$a, "ThirdPartyAuthorizationServiceInterface created");
    }

    @Override // o.ArrayCreatingInputMerger
    public IInterface valueOf(IBinder iBinder) {
        return copyImageMatrix.valueOf.toString(iBinder);
    }

    @Override // o.ArrayCreatingInputMerger
    public Class<copyImageMatrix> values() {
        return copyImageMatrix.class;
    }
}
