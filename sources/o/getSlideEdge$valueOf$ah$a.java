package o;

import kotlin.io.FileWalkDirection;
/* loaded from: classes5.dex */
public final /* synthetic */ class getSlideEdge$valueOf$ah$a {
    public static final /* synthetic */ int[] ah$a;

    static {
        int[] iArr = new int[FileWalkDirection.values().length];
        try {
            iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        ah$a = iArr;
    }
}
