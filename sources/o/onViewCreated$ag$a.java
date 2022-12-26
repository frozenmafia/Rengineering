package o;
/* loaded from: classes4.dex */
public final class onViewCreated$ag$a {
    public /* synthetic */ onViewCreated$ag$a(getTargetTypes gettargettypes) {
        this();
    }

    private onViewCreated$ag$a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int values(int[] iArr) {
        int i = 1;
        if (iArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int i2 = iArr[0];
        int values = getStartAlpha.values(iArr);
        if (1 <= values) {
            while (true) {
                i2 *= iArr[i];
                if (i == values) {
                    break;
                }
                i++;
            }
        }
        return i2;
    }
}
