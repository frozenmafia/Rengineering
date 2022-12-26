package o;

import android.view.KeyEvent;
import com.appsamurai.storyly.StoryComponentType;
import o.PathParser;
/* loaded from: classes3.dex */
public final class getEndFraction extends PathParser.ExtractFloatResult {
    private static int HaptikSDK$c = 0;
    private static char ag$a = 10385;
    private static char ah$a = 26563;
    private static int ah$b = 1;
    private static char invoke = 63942;
    private static char valueOf = 49570;
    private final String toString;
    private final String values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getEndFraction(String str, String str2) {
        super(str, StoryComponentType.PromoCode);
        runAnimators.ag$a(str, ag$a(new char[]{22939, 22131}, (KeyEvent.getMaxKeyCode() >> 16) + 2).intern());
        runAnimators.ag$a(str2, "text");
        this.values = str;
        this.toString = str2;
    }

    @Override // o.PathParser.ExtractFloatResult
    public String ag$a() {
        int i = HaptikSDK$c + 103;
        ah$b = i % 128;
        if ((i % 2 == 0 ? ')' : '$') != '$') {
            try {
                int i2 = 33 / 0;
                return this.values;
            } catch (Exception e) {
                throw e;
            }
        }
        return this.values;
    }

    public final String ah$a() {
        int i = HaptikSDK$c + 97;
        ah$b = i % 128;
        int i2 = i % 2;
        String str = this.toString;
        int i3 = ah$b + 101;
        HaptikSDK$c = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            int i = HaptikSDK$c + 95;
            ah$b = i % 128;
            return (i % 2 == 0 ? '7' : '?') == '?';
        }
        if (!(obj instanceof getEndFraction)) {
            int i2 = HaptikSDK$c + 3;
            ah$b = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        getEndFraction getendfraction = (getEndFraction) obj;
        if (!runAnimators.values((Object) ag$a(), (Object) getendfraction.ag$a())) {
            int i4 = HaptikSDK$c + 49;
            ah$b = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if ((!runAnimators.values((Object) this.toString, (Object) getendfraction.toString) ? '<' : (char) 11) != '<') {
            return true;
        }
        int i6 = ah$b + 19;
        HaptikSDK$c = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = HaptikSDK$c + 119;
        ah$b = i % 128;
        if ((i % 2 == 0 ? (char) 11 : 'a') != 11) {
            try {
                return (ag$a().hashCode() * 31) + this.toString.hashCode();
            } catch (Exception e) {
                throw e;
            }
        }
        try {
            return (ag$a().hashCode() / 98) * this.toString.hashCode();
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String toString() {
        String str = "StoryPromoCodeComponent(id=" + ag$a() + ", text=" + this.toString + ')';
        try {
            int i = HaptikSDK$c + 27;
            try {
                ah$b = i % 128;
                int i2 = i % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String ag$a(char[] cArr, int i) {
        String str;
        synchronized (moveToFirst.ah$a) {
            char[] cArr2 = new char[cArr.length];
            moveToFirst.values = 0;
            char[] cArr3 = new char[2];
            while (moveToFirst.values < cArr.length) {
                cArr3[0] = cArr[moveToFirst.values];
                cArr3[1] = cArr[moveToFirst.values + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    cArr3[1] = (char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + ag$a)) ^ ((cArr3[0] >>> 5) + invoke)));
                    cArr3[0] = (char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + ah$a)) ^ ((cArr3[1] >>> 5) + valueOf)));
                    i2 -= 40503;
                }
                cArr2[moveToFirst.values] = cArr3[0];
                cArr2[moveToFirst.values + 1] = cArr3[1];
                moveToFirst.values += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
