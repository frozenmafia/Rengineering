package o;

import com.facebook.react.bridge.ReadableType;
/* loaded from: classes6.dex */
public final /* synthetic */ class getFrameTime {
    public static final /* synthetic */ int[] toString;
    public static final /* synthetic */ int[] valueOf;

    static {
        int[] iArr = new int[ReadableType.values().length];
        valueOf = iArr;
        iArr[ReadableType.Null.ordinal()] = 1;
        iArr[ReadableType.Boolean.ordinal()] = 2;
        iArr[ReadableType.Number.ordinal()] = 3;
        iArr[ReadableType.String.ordinal()] = 4;
        iArr[ReadableType.Map.ordinal()] = 5;
        iArr[ReadableType.Array.ordinal()] = 6;
        int[] iArr2 = new int[ReadableType.values().length];
        toString = iArr2;
        iArr2[ReadableType.Array.ordinal()] = 1;
        iArr2[ReadableType.Boolean.ordinal()] = 2;
        iArr2[ReadableType.Null.ordinal()] = 3;
        iArr2[ReadableType.Number.ordinal()] = 4;
        iArr2[ReadableType.String.ordinal()] = 5;
        iArr2[ReadableType.Map.ordinal()] = 6;
    }
}
