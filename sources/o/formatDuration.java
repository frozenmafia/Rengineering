package o;

import com.appsamurai.storyly.exoplayer2.common.ParserException;
import java.util.Collections;
import java.util.List;
import o.SparseIntArrayKt$keyIterator$1;
/* loaded from: classes3.dex */
public final class formatDuration {
    public final List<byte[]> ag$a;
    public final float ah$a;
    public final int ah$b;
    public final int toString;
    public final int valueOf;
    public final String values;

    public static formatDuration values(C$default$setContentDescription c$default$setContentDescription) throws ParserException {
        int i;
        int i2;
        SparseIntArrayKt$keyIterator$1.values valueOf;
        try {
            c$default$setContentDescription.HaptikSDK$a(21);
            int extraCallbackWithResult = c$default$setContentDescription.extraCallbackWithResult();
            int extraCallbackWithResult2 = c$default$setContentDescription.extraCallbackWithResult();
            int valueOf2 = c$default$setContentDescription.valueOf();
            int i3 = 0;
            for (int i4 = 0; i4 < extraCallbackWithResult2; i4++) {
                c$default$setContentDescription.HaptikSDK$a(1);
                int ICustomTabsCallback$Default = c$default$setContentDescription.ICustomTabsCallback$Default();
                for (int i5 = 0; i5 < ICustomTabsCallback$Default; i5++) {
                    int ICustomTabsCallback$Default2 = c$default$setContentDescription.ICustomTabsCallback$Default();
                    i3 += ICustomTabsCallback$Default2 + 4;
                    c$default$setContentDescription.HaptikSDK$a(ICustomTabsCallback$Default2);
                }
            }
            c$default$setContentDescription.HaptikSDK$b(valueOf2);
            byte[] bArr = new byte[i3];
            String str = null;
            int i6 = 0;
            int i7 = -1;
            int i8 = -1;
            float f = 1.0f;
            for (int i9 = 0; i9 < extraCallbackWithResult2; i9++) {
                int extraCallbackWithResult3 = c$default$setContentDescription.extraCallbackWithResult() & 127;
                int ICustomTabsCallback$Default3 = c$default$setContentDescription.ICustomTabsCallback$Default();
                int i10 = 0;
                while (i10 < ICustomTabsCallback$Default3) {
                    int ICustomTabsCallback$Default4 = c$default$setContentDescription.ICustomTabsCallback$Default();
                    int i11 = extraCallbackWithResult2;
                    System.arraycopy(SparseIntArrayKt$keyIterator$1.ag$a, 0, bArr, i6, SparseIntArrayKt$keyIterator$1.ag$a.length);
                    int length = i6 + SparseIntArrayKt$keyIterator$1.ag$a.length;
                    System.arraycopy(c$default$setContentDescription.ah$a(), c$default$setContentDescription.valueOf(), bArr, length, ICustomTabsCallback$Default4);
                    if (extraCallbackWithResult3 == 33 && i10 == 0) {
                        valueOf = SparseIntArrayKt$keyIterator$1.valueOf(bArr, length + 2, length + ICustomTabsCallback$Default4);
                        int i12 = valueOf.ah$b;
                        i8 = valueOf.invoke;
                        f = valueOf.HaptikSDK$b;
                        i = extraCallbackWithResult3;
                        i2 = ICustomTabsCallback$Default3;
                        i7 = i12;
                        str = authenticate.toString(valueOf.ah$a, valueOf.HaptikSDK$a, valueOf.valueOf, valueOf.values, valueOf.ag$a, valueOf.toString);
                    } else {
                        i = extraCallbackWithResult3;
                        i2 = ICustomTabsCallback$Default3;
                    }
                    i6 = length + ICustomTabsCallback$Default4;
                    c$default$setContentDescription.HaptikSDK$a(ICustomTabsCallback$Default4);
                    i10++;
                    extraCallbackWithResult2 = i11;
                    extraCallbackWithResult3 = i;
                    ICustomTabsCallback$Default3 = i2;
                }
            }
            return new formatDuration(i3 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), (extraCallbackWithResult & 3) + 1, i7, i8, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.createForMalformedContainer("Error parsing HEVC config", e);
        }
    }

    private formatDuration(List<byte[]> list, int i, int i2, int i3, float f, String str) {
        this.ag$a = list;
        this.valueOf = i;
        this.ah$b = i2;
        this.toString = i3;
        this.ah$a = f;
        this.values = str;
    }
}
