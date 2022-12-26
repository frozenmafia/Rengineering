package o;

import o.AutoClosingRoomOpenHelper;
/* loaded from: classes5.dex */
public class getDouble {
    public static final Object ag$a = new Object();
    public static int toString;
    public static int valueOf;
    public static int values;

    public static void values(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    public static int toString(int i) {
        AutoClosingRoomOpenHelper.KeepAliveCursor keepAliveCursor = AutoClosingRoomOpenHelper.KeepAliveCursor.ah$a;
        return ((keepAliveCursor.toString[0][i >>> 24] + keepAliveCursor.toString[1][(i >>> 16) & 255]) ^ keepAliveCursor.toString[2][(i >>> 8) & 255]) + keepAliveCursor.toString[3][i & 255];
    }
}
