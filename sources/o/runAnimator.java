package o;

import java.util.NoSuchElementException;
import o.FragmentTransitionSupport;
/* loaded from: classes7.dex */
final class runAnimator extends FragmentTransitionSupport.AnonymousClass3 {
    private int ah$a;
    private final char[] toString;

    public runAnimator(char[] cArr) {
        runAnimators.ag$a(cArr, "array");
        this.toString = cArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.ah$a < this.toString.length;
    }

    @Override // o.FragmentTransitionSupport.AnonymousClass3
    public char valueOf() {
        try {
            char[] cArr = this.toString;
            int i = this.ah$a;
            this.ah$a = i + 1;
            return cArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.ah$a--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
