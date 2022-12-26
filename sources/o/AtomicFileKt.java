package o;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes6.dex */
public final class AtomicFileKt {
    public byte[] ah$a(List<isCompatTintEnabled> list) {
        ArrayList<Bundle> valueOf = isHardwareDetected.valueOf(list);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", valueOf);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
