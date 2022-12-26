package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes4.dex */
public class dispatchDestroyView implements dispatchLowMemory {
    private final List<dispatchLowMemory> toString;

    public dispatchDestroyView(dispatchLowMemory... dispatchlowmemoryArr) {
        ArrayList arrayList = new ArrayList(dispatchlowmemoryArr.length);
        this.toString = arrayList;
        Collections.addAll(arrayList, dispatchlowmemoryArr);
    }

    public void valueOf(dispatchLowMemory dispatchlowmemory) {
        synchronized (this) {
            this.toString.add(dispatchlowmemory);
        }
    }

    public void values(dispatchLowMemory dispatchlowmemory) {
        synchronized (this) {
            this.toString.remove(dispatchlowmemory);
        }
    }

    @Override // o.dispatchLowMemory
    public void ah$a(String str, int i, boolean z, String str2) {
        synchronized (this) {
            int size = this.toString.size();
            for (int i2 = 0; i2 < size; i2++) {
                dispatchLowMemory dispatchlowmemory = this.toString.get(i2);
                if (dispatchlowmemory != null) {
                    try {
                        dispatchlowmemory.ah$a(str, i, z, str2);
                    } catch (Exception e) {
                        FragmentActivity.valueOf("ForwardingImageOriginListener", "InternalListener exception in onImageLoaded", (Throwable) e);
                    }
                }
            }
        }
    }
}
