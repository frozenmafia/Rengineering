package o;

import java.util.Arrays;
/* loaded from: classes5.dex */
public final class PageTransformerAdapter extends handlesGetAccessibilityClassName<char[]> {
    private int toString;
    private char[] valueOf;

    public PageTransformerAdapter(char[] cArr) {
        runAnimators.ag$a(cArr, "bufferWithData");
        this.valueOf = cArr;
        this.toString = cArr.length;
        values(10);
    }

    @Override // o.handlesGetAccessibilityClassName
    public int ag$a() {
        return this.toString;
    }

    @Override // o.handlesGetAccessibilityClassName
    public void values(int i) {
        char[] cArr = this.valueOf;
        if (cArr.length < i) {
            char[] copyOf = Arrays.copyOf(cArr, addTransitionInternal.ah$a(i, cArr.length * 2));
            runAnimators.ah$a(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.valueOf = copyOf;
        }
    }

    public final void toString(char c) {
        handlesGetAccessibilityClassName.toString(this, 0, 1, null);
        char[] cArr = this.valueOf;
        int ag$a = ag$a();
        this.toString = ag$a + 1;
        cArr[ag$a] = c;
    }

    @Override // o.handlesGetAccessibilityClassName
    /* renamed from: ah$a */
    public char[] valueOf() {
        char[] copyOf = Arrays.copyOf(this.valueOf, ag$a());
        runAnimators.ah$a(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }
}
