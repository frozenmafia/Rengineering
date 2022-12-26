package o;

import android.view.KeyEvent;
import com.dreampay.commons.constants.Constants;
import com.dreampay.commons.wallets.Wallet;
import org.apache.http.message.TokenParser;
/* loaded from: classes4.dex */
public final class EmojiButton$HaptikSDK$b extends EmojiButton {
    private static int HaptikSDK$a = 0;
    private static char HaptikSDK$b = 40001;
    private static char HaptikSDK$c = 5097;
    private static int HaptikSDK$e = 1;
    private static char ah$b = 47868;
    private static char invoke = 37425;
    private final String ag$a;
    private final String ah$a;
    private final Wallet toString;
    private final String valueOf;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            int i = HaptikSDK$e + 79;
            HaptikSDK$a = i % 128;
            int i2 = i % 2;
            return true;
        }
        if ((!(obj instanceof EmojiButton$HaptikSDK$b) ? '0' : TokenParser.CR) != '\r') {
            return false;
        }
        EmojiButton$HaptikSDK$b emojiButton$HaptikSDK$b = (EmojiButton$HaptikSDK$b) obj;
        if (this.toString != emojiButton$HaptikSDK$b.toString) {
            return false;
        }
        if (!runAnimators.values((Object) this.values, (Object) emojiButton$HaptikSDK$b.values)) {
            int i3 = HaptikSDK$a + 25;
            HaptikSDK$e = i3 % 128;
            return i3 % 2 == 0;
        }
        try {
            if (!runAnimators.values((Object) this.ah$a, (Object) emojiButton$HaptikSDK$b.ah$a)) {
                int i4 = HaptikSDK$e + 117;
                HaptikSDK$a = i4 % 128;
                int i5 = i4 % 2;
                return false;
            } else if (runAnimators.values((Object) this.valueOf, (Object) emojiButton$HaptikSDK$b.valueOf)) {
                try {
                    if (runAnimators.values((Object) this.ag$a, (Object) emojiButton$HaptikSDK$b.ag$a)) {
                        return true;
                    }
                    int i6 = HaptikSDK$e + 83;
                    HaptikSDK$a = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = HaptikSDK$e + 105;
                    HaptikSDK$a = i8 % 128;
                    int i9 = i8 % 2;
                    return false;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                return false;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public int hashCode() {
        int i = HaptikSDK$e + 107;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        try {
            try {
                int hashCode = (((((((this.toString.hashCode() * 31) + this.values.hashCode()) * 31) + this.ah$a.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.ag$a.hashCode();
                int i3 = HaptikSDK$e + 13;
                HaptikSDK$a = i3 % 128;
                if (!(i3 % 2 == 0)) {
                    int i4 = 57 / 0;
                    return hashCode;
                }
                return hashCode;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String toString() {
        String str = "WalletVerifyInputFragmentArguments(wallet=" + this.toString + ", base64Request=" + this.values + ", checksum=" + this.ah$a + ", mobileNumber=" + this.valueOf + ", validateToken=" + this.ag$a + ')';
        int i = HaptikSDK$a + 25;
        HaptikSDK$e = i % 128;
        if (!(i % 2 == 0)) {
            return str;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return str;
    }

    public final Wallet HaptikSDK$c() {
        try {
            int i = HaptikSDK$e + 55;
            HaptikSDK$a = i % 128;
            int i2 = i % 2;
            Wallet wallet = this.toString;
            int i3 = HaptikSDK$a + 15;
            HaptikSDK$e = i3 % 128;
            if ((i3 % 2 == 0 ? '`' : (char) 3) != 3) {
                Object[] objArr = null;
                int length = objArr.length;
                return wallet;
            }
            return wallet;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String ag$a() {
        int i = HaptikSDK$a + 11;
        HaptikSDK$e = i % 128;
        int i2 = i % 2;
        String str = this.values;
        int i3 = HaptikSDK$e + 49;
        HaptikSDK$a = i3 % 128;
        if ((i3 % 2 != 0 ? '6' : 'R') != 'R') {
            Object obj = null;
            super.hashCode();
            return str;
        }
        return str;
    }

    public final String ah$a() {
        int i = HaptikSDK$a + 121;
        HaptikSDK$e = i % 128;
        int i2 = i % 2;
        String str = this.ah$a;
        try {
            int i3 = HaptikSDK$a + 89;
            try {
                HaptikSDK$e = i3 % 128;
                int i4 = i3 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String valueOf() {
        int i = HaptikSDK$a + 123;
        HaptikSDK$e = i % 128;
        int i2 = i % 2;
        String str = this.valueOf;
        int i3 = HaptikSDK$a + 19;
        HaptikSDK$e = i3 % 128;
        if ((i3 % 2 == 0 ? '!' : '/') != '!') {
            return str;
        }
        int i4 = 76 / 0;
        return str;
    }

    public final String values() {
        int i = HaptikSDK$e + 7;
        HaptikSDK$a = i % 128;
        if (i % 2 != 0) {
            String str = this.ag$a;
            Object obj = null;
            super.hashCode();
            return str;
        }
        return this.ag$a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiButton$HaptikSDK$b(Wallet wallet, String str, String str2, String str3, String str4) {
        super(null);
        runAnimators.ag$a(wallet, values(new char[]{23421, 9046, 38203, 10896, 4326, 11367}, KeyEvent.getDeadChar(0, 0) + 6).intern());
        runAnimators.ag$a(str, "base64Request");
        runAnimators.ag$a(str2, Constants.Navigation.CHECKSUM);
        runAnimators.ag$a(str3, "mobileNumber");
        runAnimators.ag$a(str4, "validateToken");
        this.toString = wallet;
        this.values = str;
        this.ah$a = str2;
        this.valueOf = str3;
        this.ag$a = str4;
    }

    private static String values(char[] cArr, int i) {
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
                    cArr3[1] = (char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + invoke)) ^ ((cArr3[0] >>> 5) + ah$b)));
                    cArr3[0] = (char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + HaptikSDK$b)) ^ ((cArr3[1] >>> 5) + HaptikSDK$c)));
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
