package o;

import android.graphics.PointF;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.net.MalformedURLException;
import java.net.URL;
import o.AutoScrollHelper;
/* loaded from: classes4.dex */
public class scrollTargetBy implements AutoScrollHelper {
    private static int ag$a = 36;
    private static short[] ah$a = null;
    private static int ah$b = 0;
    private static int invoke = 1;
    private static byte[] toString = {-31, -96, -103, -99, -87};
    private static int valueOf = -962526794;
    private static int values = 653816325;

    @Override // o.AutoScrollHelper
    public void ah$a() {
        try {
            int i = ah$b + 113;
            invoke = i % 128;
            int i2 = i % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // o.AutoScrollHelper
    public void ag$a(String str, String str2, String str3, String str4, int i, requestPermission requestpermission) {
        try {
            if (!new URL(str2).getProtocol().equals(values((byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-37) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + (-653816221), (short) (99 - (ViewConfiguration.getTouchSlop() >> 8)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 962526794).intern())) {
                int i2 = ah$b + 123;
                invoke = i2 % 128;
                int i3 = i2 % 2;
                requestpermission.valueOf(false, "plaintext connections not allowed");
                return;
            }
            AutoScrollHelper.ClampedScroller clampedScroller = new AutoScrollHelper.ClampedScroller();
            clampedScroller.ah$a(str, str2, str3, str4, i, requestpermission);
            new Thread(clampedScroller).start();
            int i4 = ah$b + 121;
            invoke = i4 % 128;
            if (!(i4 % 2 == 0)) {
                return;
            }
            Object obj = null;
            super.hashCode();
        } catch (MalformedURLException e) {
            if (requestpermission != null) {
                requestpermission.valueOf(false, e.toString());
            }
        }
    }

    private static String values(byte b2, int i, int i2, short s, int i3) {
        String obj;
        synchronized (moveToLast.ah$a) {
            StringBuilder sb = new StringBuilder();
            int i4 = i + ag$a;
            boolean z = i4 == -1;
            if (z) {
                if (toString != null) {
                    i4 = (byte) (toString[valueOf + i3] + ag$a);
                } else {
                    i4 = (short) (ah$a[valueOf + i3] + ag$a);
                }
            }
            if (i4 > 0) {
                moveToLast.values = ((i3 + i4) - 2) + valueOf + (z ? 1 : 0);
                moveToLast.ag$a = (char) (i2 + values);
                sb.append(moveToLast.ag$a);
                moveToLast.toString = moveToLast.ag$a;
                moveToLast.valueOf = 1;
                while (moveToLast.valueOf < i4) {
                    if (toString != null) {
                        byte[] bArr = toString;
                        int i5 = moveToLast.values;
                        moveToLast.values = i5 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((byte) (bArr[i5] + s)) ^ b2));
                    } else {
                        short[] sArr = ah$a;
                        int i6 = moveToLast.values;
                        moveToLast.values = i6 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((short) (sArr[i6] + s)) ^ b2));
                    }
                    sb.append(moveToLast.ag$a);
                    moveToLast.toString = moveToLast.ag$a;
                    moveToLast.valueOf++;
                }
            }
            obj = sb.toString();
        }
        return obj;
    }
}
