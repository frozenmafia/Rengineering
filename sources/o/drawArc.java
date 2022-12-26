package o;

import android.text.TextUtils;
import com.appsamurai.storyly.StoryComponentType;
import o.PathParser;
/* loaded from: classes3.dex */
public final class drawArc extends PathParser.ExtractFloatResult {
    private static int ah$b = 1;
    private static int invoke = 0;
    private static long toString = 4111723747082109160L;
    private final String ag$a;
    private final int ah$a;
    private final String valueOf;
    private final String values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drawArc(String str, String str2, int i, String str3) {
        super(str, StoryComponentType.Rating);
        runAnimators.ag$a(str, valueOf(new char[]{129, 4721}, 4861 - TextUtils.indexOf("", "")).intern());
        runAnimators.ag$a(str2, "emojiCode");
        this.ag$a = str;
        this.values = str2;
        this.ah$a = i;
        this.valueOf = str3;
    }

    public final int HaptikSDK$c() {
        int i = ah$b + 1;
        invoke = i % 128;
        int i2 = i % 2;
        int i3 = this.ah$a;
        int i4 = ah$b + 27;
        invoke = i4 % 128;
        if ((i4 % 2 != 0 ? '1' : '@') != '@') {
            Object obj = null;
            super.hashCode();
            return i3;
        }
        return i3;
    }

    @Override // o.PathParser.ExtractFloatResult
    public String ag$a() {
        int i = invoke + 37;
        ah$b = i % 128;
        if (i % 2 != 0) {
            return this.ag$a;
        }
        String str = this.ag$a;
        Object obj = null;
        super.hashCode();
        return str;
    }

    public final String ah$a() {
        String str;
        int i = invoke + 27;
        ah$b = i % 128;
        if (!(i % 2 != 0)) {
            try {
                str = this.valueOf;
                Object obj = null;
                super.hashCode();
            } catch (Exception e) {
                throw e;
            }
        } else {
            str = this.valueOf;
        }
        int i2 = ah$b + 47;
        invoke = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof drawArc) {
            drawArc drawarc = (drawArc) obj;
            if (runAnimators.values((Object) ag$a(), (Object) drawarc.ag$a())) {
                if ((!runAnimators.values((Object) this.values, (Object) drawarc.values) ? '=' : 'Z') != '=') {
                    if (this.ah$a != drawarc.ah$a) {
                        try {
                            int i = invoke + 5;
                            ah$b = i % 128;
                            int i2 = i % 2;
                            return false;
                        } catch (Exception e) {
                            throw e;
                        }
                    } else if (runAnimators.values((Object) this.valueOf, (Object) drawarc.valueOf)) {
                        int i3 = invoke + 33;
                        ah$b = i3 % 128;
                        int i4 = i3 % 2;
                        return true;
                    } else {
                        int i5 = invoke + 95;
                        ah$b = i5 % 128;
                        int i6 = i5 % 2;
                        return false;
                    }
                }
                int i7 = invoke + 79;
                ah$b = i7 % 128;
                if (i7 % 2 == 0) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i = invoke + 81;
        ah$b = i % 128;
        int i2 = i % 2;
        int hashCode = ag$a().hashCode();
        int hashCode2 = this.values.hashCode();
        int i3 = this.ah$a;
        String str = this.valueOf;
        int i4 = 0;
        if ((str == null ? 'T' : 'A') != 'A') {
            int i5 = ah$b + 33;
            invoke = i5 % 128;
            if (i5 % 2 != 0) {
            }
        } else {
            try {
                i4 = str.hashCode();
                int i6 = ah$b + 69;
                try {
                    invoke = i6 % 128;
                    int i7 = i6 % 2;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        return (((((hashCode * 31) + hashCode2) * 31) + i3) * 31) + i4;
    }

    public String toString() {
        String str = "StoryRatingComponent(id=" + ag$a() + ", emojiCode=" + this.values + ", rating=" + this.ah$a + ", customPayload=" + ((Object) this.valueOf) + ')';
        int i = ah$b + 121;
        invoke = i % 128;
        if (!(i % 2 != 0)) {
            return str;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return str;
    }

    public final String valueOf() {
        try {
            int i = invoke + 1;
            ah$b = i % 128;
            int i2 = i % 2;
            String str = this.values;
            int i3 = invoke + 69;
            ah$b = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String valueOf(char[] cArr, int i) {
        String str;
        synchronized (isBeforeFirst.toString) {
            isBeforeFirst.ah$a = i;
            char[] cArr2 = new char[cArr.length];
            isBeforeFirst.valueOf = 0;
            while (isBeforeFirst.valueOf < cArr.length) {
                cArr2[isBeforeFirst.valueOf] = (char) ((cArr[isBeforeFirst.valueOf] ^ (isBeforeFirst.valueOf * isBeforeFirst.ah$a)) ^ toString);
                isBeforeFirst.valueOf++;
            }
            str = new String(cArr2);
        }
        return str;
    }
}
