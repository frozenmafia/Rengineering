package o;
/* loaded from: classes7.dex */
public class jumpToPositionForSmoothScroller implements offsetChildrenHorizontal {
    private final offsetChildrenHorizontal[] toString;
    private final int valueOf;
    private final isLayoutSuppressed values;

    public jumpToPositionForSmoothScroller(int i, offsetChildrenHorizontal... offsetchildrenhorizontalArr) {
        this.valueOf = i;
        this.toString = offsetchildrenhorizontalArr;
        this.values = new isLayoutSuppressed(i);
    }

    @Override // o.offsetChildrenHorizontal
    public StackTraceElement[] ag$a(StackTraceElement[] stackTraceElementArr) {
        offsetChildrenHorizontal[] offsetchildrenhorizontalArr;
        if (stackTraceElementArr.length <= this.valueOf) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (offsetChildrenHorizontal offsetchildrenhorizontal : this.toString) {
            if (stackTraceElementArr2.length <= this.valueOf) {
                break;
            }
            stackTraceElementArr2 = offsetchildrenhorizontal.ag$a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.valueOf ? this.values.ag$a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
