package o;

import java.util.HashMap;
/* loaded from: classes7.dex */
public class offsetChildrenVertical implements offsetChildrenHorizontal {
    private final int valueOf;

    public offsetChildrenVertical() {
        this(1);
    }

    public offsetChildrenVertical(int i) {
        this.valueOf = i;
    }

    @Override // o.offsetChildrenHorizontal
    public StackTraceElement[] ag$a(StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] valueOf = valueOf(stackTraceElementArr, this.valueOf);
        return valueOf.length < stackTraceElementArr.length ? valueOf : stackTraceElementArr;
    }

    private static StackTraceElement[] valueOf(StackTraceElement[] stackTraceElementArr, int i) {
        int i2;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i3 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i3];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num == null || !valueOf(stackTraceElementArr, num.intValue(), i3)) {
                stackTraceElementArr2[i4] = stackTraceElementArr[i3];
                i4++;
                i2 = i3;
                i5 = 1;
            } else {
                int intValue = i3 - num.intValue();
                if (i5 < i) {
                    System.arraycopy(stackTraceElementArr, i3, stackTraceElementArr2, i4, intValue);
                    i4 += intValue;
                    i5++;
                }
                i2 = (intValue - 1) + i3;
            }
            hashMap.put(stackTraceElement, Integer.valueOf(i3));
            i3 = i2 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i4];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i4);
        return stackTraceElementArr3;
    }

    private static boolean valueOf(StackTraceElement[] stackTraceElementArr, int i, int i2) {
        int i3 = i2 - i;
        if (i2 + i3 > stackTraceElementArr.length) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!stackTraceElementArr[i + i4].equals(stackTraceElementArr[i2 + i4])) {
                return false;
            }
        }
        return true;
    }
}
