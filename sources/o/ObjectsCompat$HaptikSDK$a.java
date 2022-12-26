package o;

import android.util.SparseArray;
import o.ObjectsCompat;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ObjectsCompat$HaptikSDK$a {
    public final int HaptikSDK$a;
    public final int HaptikSDK$b;
    public final int HaptikSDK$c;
    public final int ag$a;
    public final int ah$a;
    public final SparseArray<ObjectsCompat.invoke> ah$b;
    public final int getInitSettings;
    public final int invoke;
    public final boolean toString;
    public final int valueOf;
    public final int values;

    public ObjectsCompat$HaptikSDK$a(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<ObjectsCompat.invoke> sparseArray) {
        this.ag$a = i;
        this.toString = z;
        this.getInitSettings = i2;
        this.ah$a = i3;
        this.invoke = i4;
        this.valueOf = i5;
        this.values = i6;
        this.HaptikSDK$c = i7;
        this.HaptikSDK$a = i8;
        this.HaptikSDK$b = i9;
        this.ah$b = sparseArray;
    }

    public void toString(ObjectsCompat$HaptikSDK$a objectsCompat$HaptikSDK$a) {
        SparseArray<ObjectsCompat.invoke> sparseArray = objectsCompat$HaptikSDK$a.ah$b;
        for (int i = 0; i < sparseArray.size(); i++) {
            this.ah$b.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
        }
    }
}
