package o;

import com.appsamurai.storyly.exoplayer2.common.ParserException;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public final class SparseLongArrayKt$keyIterator$1 {
    public final int HaptikSDK$c;
    public final List<byte[]> ag$a;
    public final float ah$a;
    public final int toString;
    public final int valueOf;
    public final String values;

    public static SparseLongArrayKt$keyIterator$1 ah$a(C$default$setContentDescription c$default$setContentDescription) throws ParserException {
        String str;
        int i;
        int i2;
        float f;
        try {
            c$default$setContentDescription.HaptikSDK$a(4);
            int extraCallbackWithResult = (c$default$setContentDescription.extraCallbackWithResult() & 3) + 1;
            if (extraCallbackWithResult == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int extraCallbackWithResult2 = c$default$setContentDescription.extraCallbackWithResult() & 31;
            for (int i3 = 0; i3 < extraCallbackWithResult2; i3++) {
                arrayList.add(toString(c$default$setContentDescription));
            }
            int extraCallbackWithResult3 = c$default$setContentDescription.extraCallbackWithResult();
            for (int i4 = 0; i4 < extraCallbackWithResult3; i4++) {
                arrayList.add(toString(c$default$setContentDescription));
            }
            if (extraCallbackWithResult2 > 0) {
                SparseIntArrayKt$keyIterator$1$ah$a sparseIntArrayKt$keyIterator$1 = SparseIntArrayKt$keyIterator$1.toString((byte[]) arrayList.get(0), extraCallbackWithResult, ((byte[]) arrayList.get(0)).length);
                int i5 = sparseIntArrayKt$keyIterator$1.getInitSettings;
                int i6 = sparseIntArrayKt$keyIterator$1.ah$a;
                float f2 = sparseIntArrayKt$keyIterator$1.HaptikSDK$c;
                str = authenticate.valueOf(sparseIntArrayKt$keyIterator$1.getSignupData, sparseIntArrayKt$keyIterator$1.toString, sparseIntArrayKt$keyIterator$1.HaptikSDK$a);
                i = i5;
                i2 = i6;
                f = f2;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                f = 1.0f;
            }
            return new SparseLongArrayKt$keyIterator$1(arrayList, extraCallbackWithResult, i, i2, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.createForMalformedContainer("Error parsing AVC config", e);
        }
    }

    private SparseLongArrayKt$keyIterator$1(List<byte[]> list, int i, int i2, int i3, float f, String str) {
        this.ag$a = list;
        this.valueOf = i;
        this.HaptikSDK$c = i2;
        this.toString = i3;
        this.ah$a = f;
        this.values = str;
    }

    private static byte[] toString(C$default$setContentDescription c$default$setContentDescription) {
        int ICustomTabsCallback$Default = c$default$setContentDescription.ICustomTabsCallback$Default();
        int valueOf = c$default$setContentDescription.valueOf();
        c$default$setContentDescription.HaptikSDK$a(ICustomTabsCallback$Default);
        return authenticate.values(c$default$setContentDescription.ah$a(), valueOf, ICustomTabsCallback$Default);
    }
}
