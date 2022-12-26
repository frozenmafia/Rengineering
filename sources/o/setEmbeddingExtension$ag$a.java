package o;

import android.os.Process;
import android.view.ViewConfiguration;
import java.io.IOException;
import java.util.List;
import okhttp3.internal.http2.ErrorCode;
/* loaded from: classes5.dex */
public final class setEmbeddingExtension$ag$a {
    private setEmbeddingExtension$ag$a() {
    }

    public /* synthetic */ setEmbeddingExtension$ag$a(getTargetTypes gettargettypes) {
        this();
    }

    /* loaded from: classes5.dex */
    static final class valueOf implements setEmbeddingExtension {
        private static int ag$a = 1;
        private static int ah$a = 199;
        private static int toString;

        @Override // o.setEmbeddingExtension
        public void ag$a(int i, ErrorCode errorCode) {
            try {
                int i2 = toString + 17;
                ag$a = i2 % 128;
                int i3 = i2 % 2;
                runAnimators.ag$a(errorCode, "errorCode");
                int i4 = toString + 15;
                ag$a = i4 % 128;
                int i5 = i4 % 2;
            } catch (Exception e) {
                throw e;
            }
        }

        @Override // o.setEmbeddingExtension
        public boolean ah$a(int i, List<setEmbeddingRules> list, boolean z) {
            int i2 = toString + 63;
            ag$a = i2 % 128;
            if (!(i2 % 2 != 0)) {
                try {
                    runAnimators.ag$a(list, "responseHeaders");
                } catch (Exception e) {
                    throw e;
                }
            } else {
                runAnimators.ag$a(list, "responseHeaders");
            }
            int i3 = toString + 85;
            ag$a = i3 % 128;
            if ((i3 % 2 == 0 ? (char) 22 : '6') != '6') {
                Object obj = null;
                super.hashCode();
                return true;
            }
            return true;
        }

        @Override // o.setEmbeddingExtension
        public boolean values(int i, List<setEmbeddingRules> list) {
            int i2 = ag$a + 33;
            toString = i2 % 128;
            if (!(i2 % 2 != 0)) {
                try {
                    runAnimators.ag$a(list, "requestHeaders");
                } catch (Exception e) {
                    throw e;
                }
            } else {
                try {
                    runAnimators.ag$a(list, "requestHeaders");
                } catch (Exception e2) {
                    throw e2;
                }
            }
            return true;
        }

        @Override // o.setEmbeddingExtension
        public boolean toString(int i, parseSplitActivityRule parsesplitactivityrule, int i2, boolean z) throws IOException {
            int i3 = ag$a + 41;
            toString = i3 % 128;
            int i4 = i3 % 2;
            runAnimators.ag$a(parsesplitactivityrule, ah$a((Process.myPid() >> 22) + 5, 308 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), false, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 6, new char[]{2, '\b', 5, 65526, 65528, 6}).intern());
            parsesplitactivityrule.HaptikSDK$a(i2);
            int i5 = ag$a + 7;
            toString = i5 % 128;
            if (i5 % 2 != 0) {
                Object[] objArr = null;
                int length = objArr.length;
                return true;
            }
            return true;
        }

        private static String ah$a(int i, int i2, boolean z, int i3, char[] cArr) {
            String str;
            synchronized (isAfterLast.valueOf) {
                char[] cArr2 = new char[i3];
                isAfterLast.values = 0;
                while (isAfterLast.values < i3) {
                    isAfterLast.ag$a = cArr[isAfterLast.values];
                    cArr2[isAfterLast.values] = (char) (isAfterLast.ag$a + i2);
                    int i4 = isAfterLast.values;
                    cArr2[i4] = (char) (cArr2[i4] - ah$a);
                    isAfterLast.values++;
                }
                if (i > 0) {
                    isAfterLast.toString = i;
                    char[] cArr3 = new char[i3];
                    System.arraycopy(cArr2, 0, cArr3, 0, i3);
                    System.arraycopy(cArr3, 0, cArr2, i3 - isAfterLast.toString, isAfterLast.toString);
                    System.arraycopy(cArr3, isAfterLast.toString, cArr2, 0, i3 - isAfterLast.toString);
                }
                if (z) {
                    char[] cArr4 = new char[i3];
                    isAfterLast.values = 0;
                    while (isAfterLast.values < i3) {
                        cArr4[isAfterLast.values] = cArr2[(i3 - isAfterLast.values) - 1];
                        isAfterLast.values++;
                    }
                    cArr2 = cArr4;
                }
                str = new String(cArr2);
            }
            return str;
        }
    }
}
