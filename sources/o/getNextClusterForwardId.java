package o;

import com.bugsnag.android.TaskType;
/* loaded from: classes3.dex */
public final /* synthetic */ class getNextClusterForwardId {
    public static final /* synthetic */ int[] toString;

    static {
        int[] iArr = new int[TaskType.values().length];
        toString = iArr;
        iArr[TaskType.ERROR_REQUEST.ordinal()] = 1;
        iArr[TaskType.SESSION_REQUEST.ordinal()] = 2;
        iArr[TaskType.IO.ordinal()] = 3;
        iArr[TaskType.INTERNAL_REPORT.ordinal()] = 4;
        iArr[TaskType.DEFAULT.ordinal()] = 5;
    }
}
