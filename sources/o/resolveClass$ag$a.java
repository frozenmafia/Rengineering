package o;

import kotlinx.coroutines.channels.BufferOverflow;
/* loaded from: classes7.dex */
public final /* synthetic */ class resolveClass$ag$a {
    public static final /* synthetic */ int[] values;

    static {
        int[] iArr = new int[BufferOverflow.values().length];
        iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
        iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
        iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
        values = iArr;
    }
}
