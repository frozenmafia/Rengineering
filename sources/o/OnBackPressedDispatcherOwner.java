package o;
/* loaded from: classes.dex */
public final class OnBackPressedDispatcherOwner {
    public static final OnBackPressedDispatcherOwner values = new OnBackPressedDispatcherOwner();

    private OnBackPressedDispatcherOwner() {
    }

    public final String ah$a(int i, int[] iArr, String[] strArr, int[] iArr2) {
        runAnimators.valueOf(iArr, "stack");
        runAnimators.valueOf(strArr, "pathNames");
        runAnimators.valueOf(iArr2, "pathIndices");
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                if (strArr[i2] != null) {
                    sb.append(strArr[i2]);
                }
            }
        }
        String sb2 = sb.toString();
        runAnimators.toString(sb2, "result.toString()");
        return sb2;
    }
}
