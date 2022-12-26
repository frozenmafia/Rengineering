package o;

import kotlinx.coroutines.channels.BufferOverflow;
/* loaded from: classes7.dex */
public final class flushField {
    public static final fakeDragBy valueOf = new fakeDragBy("NO_VALUE");

    public static final /* synthetic */ Object ag$a(Object[] objArr, long j) {
        return valueOf(objArr, j);
    }

    public static final /* synthetic */ void ah$a(Object[] objArr, long j, Object obj) {
        values(objArr, j, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object valueOf(Object[] objArr, long j) {
        return objArr[(objArr.length - 1) & ((int) j)];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void values(Object[] objArr, long j, Object obj) {
        objArr[(objArr.length - 1) & ((int) j)] = obj;
    }

    public static final <T> writeByteArray<T> values(VersionedParcelParcel<? extends T> versionedParcelParcel, PropertyValuesHolderUtils propertyValuesHolderUtils, int i, BufferOverflow bufferOverflow) {
        if ((i == 0 || i == -3) && bufferOverflow == BufferOverflow.SUSPEND) {
            return versionedParcelParcel;
        }
        return new setDrawFullUnderline(versionedParcelParcel, propertyValuesHolderUtils, i, bufferOverflow);
    }
}
