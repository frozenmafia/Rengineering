package o;

import android.text.TextUtils;
import okhttp3.Headers;
import org.apache.commons.codec.language.Soundex;
/* loaded from: classes5.dex */
public final class EmptyEmbeddingComponent {
    private static int HaptikSDK$c = 1;
    private static char[] ah$a;
    private static int ah$b;
    private static char valueOf;
    public static final values values;
    private long ag$a;
    private final parseSplitActivityRule toString;

    static {
        try {
            ag$a();
            Object obj = null;
            values = new values(null);
            int i = ah$b + 115;
            HaptikSDK$c = i % 128;
            if (i % 2 == 0) {
                super.hashCode();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    static void ag$a() {
        valueOf = (char) 3;
        ah$a = new char[]{2, 13801, 13807, 1, 13817, 13800, 13813, 3, 13823};
    }

    public EmptyEmbeddingComponent(parseSplitActivityRule parsesplitactivityrule) {
        runAnimators.ag$a(parsesplitactivityrule, ah$a((byte) (TextUtils.getOffsetAfter("", 0) + 73), new char[]{0, 7, 5, '\b', 5, 7}, 5 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern());
        this.toString = parsesplitactivityrule;
        this.ag$a = 262144;
    }

    public final String values() {
        try {
            int i = HaptikSDK$c + 17;
            try {
                ah$b = i % 128;
                int i2 = i % 2;
                String valueOf2 = this.toString.valueOf(this.ag$a);
                this.ag$a -= valueOf2.length();
                int i3 = ah$b + 71;
                HaptikSDK$c = i3 % 128;
                if (i3 % 2 == 0) {
                    Object[] objArr = null;
                    int length = objArr.length;
                    return valueOf2;
                }
                return valueOf2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final Headers valueOf() {
        boolean z;
        Headers build;
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String values2 = values();
            if ((values2.length() == 0 ? 'Y' : Soundex.SILENT_MARKER) != '-') {
                int i = ah$b + 99;
                HaptikSDK$c = i % 128;
                int i2 = i % 2;
                z = true;
                int i3 = HaptikSDK$c + 71;
                ah$b = i3 % 128;
                int i4 = i3 % 2;
            } else {
                z = false;
            }
            if (z) {
                try {
                    break;
                } catch (Exception e) {
                    throw e;
                }
            }
            try {
                builder.addLenient$okhttp(values2);
            } catch (Exception e2) {
                throw e2;
            }
            throw e2;
        }
        int i5 = ah$b + 89;
        HaptikSDK$c = i5 % 128;
        if ((i5 % 2 == 0 ? '_' : '2') != '2') {
            build = builder.build();
            Object[] objArr = null;
            int length = objArr.length;
        } else {
            build = builder.build();
        }
        int i6 = ah$b + 97;
        HaptikSDK$c = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 61 / 0;
            return build;
        }
        return build;
    }

    /* loaded from: classes5.dex */
    public static final class values {
        private values() {
        }

        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }
    }

    private static String ah$a(byte b2, char[] cArr, int i) {
        int i2;
        String str;
        synchronized (isFirst.HaptikSDK$b) {
            char[] cArr2 = ah$a;
            char c = valueOf;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr3[i2] = (char) (cArr[i2] - b2);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                isFirst.valueOf = 0;
                while (isFirst.valueOf < i2) {
                    isFirst.toString = cArr[isFirst.valueOf];
                    isFirst.ah$a = cArr[isFirst.valueOf + 1];
                    if (isFirst.toString == isFirst.ah$a) {
                        cArr3[isFirst.valueOf] = (char) (isFirst.toString - b2);
                        cArr3[isFirst.valueOf + 1] = (char) (isFirst.ah$a - b2);
                    } else {
                        isFirst.ag$a = isFirst.toString / c;
                        isFirst.invoke = isFirst.toString % c;
                        isFirst.values = isFirst.ah$a / c;
                        isFirst.ah$b = isFirst.ah$a % c;
                        if (isFirst.invoke == isFirst.ah$b) {
                            isFirst.ag$a = ((isFirst.ag$a + c) - 1) % c;
                            isFirst.values = ((isFirst.values + c) - 1) % c;
                            int i3 = (isFirst.ag$a * c) + isFirst.invoke;
                            int i4 = (isFirst.values * c) + isFirst.ah$b;
                            cArr3[isFirst.valueOf] = cArr2[i3];
                            cArr3[isFirst.valueOf + 1] = cArr2[i4];
                        } else if (isFirst.ag$a == isFirst.values) {
                            isFirst.invoke = ((isFirst.invoke + c) - 1) % c;
                            isFirst.ah$b = ((isFirst.ah$b + c) - 1) % c;
                            int i5 = (isFirst.ag$a * c) + isFirst.invoke;
                            int i6 = (isFirst.values * c) + isFirst.ah$b;
                            cArr3[isFirst.valueOf] = cArr2[i5];
                            cArr3[isFirst.valueOf + 1] = cArr2[i6];
                        } else {
                            int i7 = (isFirst.ag$a * c) + isFirst.ah$b;
                            int i8 = (isFirst.values * c) + isFirst.invoke;
                            cArr3[isFirst.valueOf] = cArr2[i7];
                            cArr3[isFirst.valueOf + 1] = cArr2[i8];
                        }
                    }
                    isFirst.valueOf += 2;
                }
            }
            for (int i9 = 0; i9 < i; i9++) {
                cArr3[i9] = (char) (cArr3[i9] ^ 13722);
            }
            str = new String(cArr3);
        }
        return str;
    }
}
