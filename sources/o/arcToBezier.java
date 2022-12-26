package o;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.appsamurai.storyly.StoryComponentType;
import java.util.List;
import o.PathParser;
/* loaded from: classes3.dex */
public final class arcToBezier extends PathParser.ExtractFloatResult {
    private static int HaptikSDK$b = 1;
    private static char ah$b = 2;
    private static int invoke;
    private static char[] valueOf = {13811, 13812, 13822, 13813};
    private final String ag$a;
    private final int ah$a;
    private final String toString;
    private final List<String> values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arcToBezier(String str, List<String> list, int i, String str2) {
        super(str, StoryComponentType.Emoji);
        runAnimators.ag$a(str, valueOf((byte) (TextUtils.getCapsMode("", 0, 0) + 11), new char[]{2, 0}, 2 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern());
        runAnimators.ag$a(list, "emojiCodes");
        this.ag$a = str;
        this.values = list;
        this.ah$a = i;
        this.toString = str2;
    }

    public final int HaptikSDK$b() {
        int i = invoke + 13;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        int i3 = this.ah$a;
        int i4 = invoke + 121;
        HaptikSDK$b = i4 % 128;
        if ((i4 % 2 == 0 ? 'a' : (char) 7) != 7) {
            Object obj = null;
            super.hashCode();
            return i3;
        }
        return i3;
    }

    @Override // o.PathParser.ExtractFloatResult
    public String ag$a() {
        String str;
        try {
            int i = invoke + 91;
            HaptikSDK$b = i % 128;
            if ((i % 2 == 0 ? (char) 15 : (char) 4) != 4) {
                str = this.ag$a;
                Object[] objArr = null;
                int length = objArr.length;
            } else {
                str = this.ag$a;
            }
            int i2 = HaptikSDK$b + 7;
            invoke = i2 % 128;
            int i3 = i2 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final List<String> ah$a() {
        List<String> list;
        int i = invoke + 35;
        HaptikSDK$b = i % 128;
        if ((i % 2 == 0 ? (char) 23 : (char) 2) != 2) {
            list = this.values;
            Object obj = null;
            super.hashCode();
        } else {
            try {
                list = this.values;
            } catch (Exception e) {
                throw e;
            }
        }
        try {
            int i2 = HaptikSDK$b + 89;
            invoke = i2 % 128;
            int i3 = i2 % 2;
            return list;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if ((!(obj instanceof arcToBezier) ? '/' : '\b') == '/') {
                int i = invoke + 25;
                HaptikSDK$b = i % 128;
                return i % 2 == 0;
            }
            arcToBezier arctobezier = (arcToBezier) obj;
            try {
                if ((!runAnimators.values((Object) ag$a(), (Object) arctobezier.ag$a()) ? '@' : '*') == '@') {
                    int i2 = invoke + 15;
                    HaptikSDK$b = i2 % 128;
                    int i3 = i2 % 2;
                    return false;
                }
                if (runAnimators.values(this.values, arctobezier.values)) {
                    if (this.ah$a != arctobezier.ah$a) {
                        int i4 = HaptikSDK$b + 113;
                        invoke = i4 % 128;
                        return i4 % 2 != 0;
                    } else if (!runAnimators.values((Object) this.toString, (Object) arctobezier.toString)) {
                        int i5 = invoke + 55;
                        HaptikSDK$b = i5 % 128;
                        int i6 = i5 % 2;
                        return false;
                    } else {
                        int i7 = invoke + 65;
                        HaptikSDK$b = i7 % 128;
                        if ((i7 % 2 == 0 ? '&' : 'R') != 'R') {
                            Object[] objArr = null;
                            int length = objArr.length;
                            return true;
                        }
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public int hashCode() {
        int i = invoke + 21;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        int hashCode = ag$a().hashCode();
        int hashCode2 = this.values.hashCode();
        int i3 = this.ah$a;
        String str = this.toString;
        int i4 = 0;
        if (str == null) {
            int i5 = invoke + 113;
            HaptikSDK$b = i5 % 128;
            int i6 = i5 % 2;
            int i7 = HaptikSDK$b + 13;
            invoke = i7 % 128;
            int i8 = i7 % 2;
        } else {
            i4 = str.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + i3) * 31) + i4;
    }

    public String toString() {
        String str = "StoryEmojiComponent(id=" + ag$a() + ", emojiCodes=" + this.values + ", selectedEmojiIndex=" + this.ah$a + ", customPayload=" + ((Object) this.toString) + ')';
        int i = invoke + 13;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        return str;
    }

    public final String valueOf() {
        int i = HaptikSDK$b + 107;
        invoke = i % 128;
        if ((i % 2 != 0 ? (char) 15 : '_') != 15) {
            try {
                return this.toString;
            } catch (Exception e) {
                throw e;
            }
        }
        try {
            String str = this.toString;
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String valueOf(byte b2, char[] cArr, int i) {
        int i2;
        String str;
        synchronized (isFirst.HaptikSDK$b) {
            char[] cArr2 = valueOf;
            char c = ah$b;
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
