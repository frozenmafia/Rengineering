package o;
/* loaded from: classes3.dex */
public final class SparseLongArrayKt$valueIterator$1 {
    public final int ag$a;
    public final String ah$a;
    public final int toString;

    public static SparseLongArrayKt$valueIterator$1 toString(C$default$setContentDescription c$default$setContentDescription) {
        String str;
        c$default$setContentDescription.HaptikSDK$a(2);
        int extraCallbackWithResult = c$default$setContentDescription.extraCallbackWithResult();
        int i = extraCallbackWithResult >> 1;
        int extraCallbackWithResult2 = ((c$default$setContentDescription.extraCallbackWithResult() >> 3) & 31) | ((extraCallbackWithResult & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(extraCallbackWithResult2 >= 10 ? "." : ".0");
        sb.append(extraCallbackWithResult2);
        return new SparseLongArrayKt$valueIterator$1(i, extraCallbackWithResult2, sb.toString());
    }

    private SparseLongArrayKt$valueIterator$1(int i, int i2, String str) {
        this.ag$a = i;
        this.toString = i2;
        this.ah$a = str;
    }
}
