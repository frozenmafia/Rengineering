package o;

import android.os.Bundle;
import android.text.TextUtils;
import com.app.dream11.dream11.DreamApplication;
import com.app.dream11.model.FlowState;
import java.io.Serializable;
import java.util.Map;
import org.apache.commons.codec.language.Soundex;
/* loaded from: classes2.dex */
public final class applyIconTint {
    private static char[] ag$a = null;
    public static final applyIconTint ah$a;
    private static int toString = 1;
    private static int valueOf;

    static {
        ah$a();
        ah$a = new applyIconTint();
        int i = toString + 113;
        valueOf = i % 128;
        int i2 = i % 2;
    }

    static void ah$a() {
        ag$a = new char[]{'e', 202, 208, 217, 216, 215};
    }

    private applyIconTint() {
    }

    public static final String ag$a(String str) {
        String str2;
        int i = toString + 75;
        valueOf = i % 128;
        try {
            if ((i % 2 != 0 ? ':' : (char) 25) != ':') {
                runAnimators.ag$a(str, "componentName");
                str2 = DreamApplication.valueOf().a().getInitSettings();
                runAnimators.ah$a(str2, "getInstance().device.deviceId");
            } else {
                runAnimators.ag$a(str, "componentName");
                str2 = DreamApplication.valueOf().a().getInitSettings();
                runAnimators.ah$a(str2, "getInstance().device.deviceId");
                Object[] objArr = null;
                int length = objArr.length;
            }
            int i2 = toString + 121;
            valueOf = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception unused) {
            str2 = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        return str + "_" + currentTimeMillis + "_" + str2;
    }

    public final String valueOf(FlowState flowState, Bundle bundle, String str) {
        Map<String, Serializable> extras;
        int i = valueOf + 77;
        toString = i % 128;
        int i2 = i % 2;
        String intern = toString(true, new int[]{0, 6, 102, 0}, new byte[]{1, 0, 1, 1, 0, 0}).intern();
        runAnimators.ag$a(str, "defaultString");
        if (((flowState == null) || (extras = flowState.getExtras()) == null || !extras.containsKey(intern)) ? false : true) {
            int i3 = valueOf + 77;
            toString = i3 % 128;
            int i4 = i3 % 2;
            if ((!TextUtils.isEmpty(String.valueOf(flowState.getExtras().get(intern))) ? '+' : Soundex.SILENT_MARKER) != '-') {
                return String.valueOf(flowState.getExtras().get(intern));
            }
        }
        if (bundle != null) {
            if (bundle.containsKey(intern)) {
                String string = bundle.getString(intern);
                return string == null ? "" : string;
            }
            return str;
        }
        return str;
    }

    private static String toString(boolean z, int[] iArr, byte[] bArr) {
        String str;
        synchronized (isClosed.ah$a) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(ag$a, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                isClosed.ag$a = 0;
                char c = 0;
                while (isClosed.ag$a < i2) {
                    if (bArr[isClosed.ag$a] == 1) {
                        cArr2[isClosed.ag$a] = (char) (((cArr[isClosed.ag$a] << 1) + 1) - c);
                    } else {
                        cArr2[isClosed.ag$a] = (char) ((cArr[isClosed.ag$a] << 1) - c);
                    }
                    c = cArr2[isClosed.ag$a];
                    isClosed.ag$a++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                isClosed.ag$a = 0;
                while (isClosed.ag$a < i2) {
                    cArr4[isClosed.ag$a] = cArr[(i2 - isClosed.ag$a) - 1];
                    isClosed.ag$a++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                isClosed.ag$a = 0;
                while (isClosed.ag$a < i2) {
                    cArr[isClosed.ag$a] = (char) (cArr[isClosed.ag$a] - iArr[2]);
                    isClosed.ag$a++;
                }
            }
            str = new String(cArr);
        }
        return str;
    }
}
