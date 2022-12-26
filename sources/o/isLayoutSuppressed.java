package o;
/* loaded from: classes7.dex */
public class isLayoutSuppressed implements offsetChildrenHorizontal {
    private final int toString;

    public isLayoutSuppressed(int i) {
        this.toString = i;
    }

    @Override // o.offsetChildrenHorizontal
    public StackTraceElement[] ag$a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.toString;
        if (length <= i) {
            return stackTraceElementArr;
        }
        int i2 = i / 2;
        int i3 = i - i2;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i3);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i2, stackTraceElementArr2, i3, i2);
        return stackTraceElementArr2;
    }
}
