package o;

import android.os.Bundle;
import android.os.Parcel;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
/* loaded from: classes3.dex */
public final class tryWrite {
    public ImmutableList<isCompatTintEnabled> ag$a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return isHardwareDetected.ah$a(isCompatTintEnabled.ah$a, (ArrayList) FingerprintManagerCompat.toString(readBundle.getParcelableArrayList("c")));
    }
}
