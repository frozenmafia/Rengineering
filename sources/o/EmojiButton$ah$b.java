package o;

import android.graphics.Color;
import android.view.ViewConfiguration;
import com.dreampay.commons.constants.Constants;
import com.dreampay.commons.wallets.Wallet;
import org.apache.commons.codec.language.Soundex;
/* loaded from: classes4.dex */
public final class EmojiButton$ah$b extends EmojiButton {
    private static char HaptikSDK$b = 0;
    private static int HaptikSDK$c = 0;
    private static long ah$a = 6820994488047213054L;
    private static int ah$b = 1;
    private static int invoke;
    private final String ag$a;
    private final String toString;
    private final Wallet valueOf;
    private final boolean values;

    public boolean equals(Object obj) {
        if (this == obj) {
            int i = ah$b + 13;
            HaptikSDK$c = i % 128;
            int i2 = i % 2;
            return true;
        } else if (!(obj instanceof EmojiButton$ah$b)) {
            try {
                int i3 = HaptikSDK$c + 19;
                ah$b = i3 % 128;
                return i3 % 2 == 0;
            } catch (Exception e) {
                throw e;
            }
        } else {
            EmojiButton$ah$b emojiButton$ah$b = (EmojiButton$ah$b) obj;
            if ((this.valueOf != emojiButton$ah$b.valueOf ? '_' : 'b') != 'b') {
                return false;
            }
            if (!(runAnimators.values((Object) this.toString, (Object) emojiButton$ah$b.toString))) {
                return false;
            }
            if ((!runAnimators.values((Object) this.ag$a, (Object) emojiButton$ah$b.ag$a) ? 'P' : (char) 1) != 'P') {
                return this.values == emojiButton$ah$b.values;
            }
            int i4 = HaptikSDK$c + 69;
            ah$b = i4 % 128;
            return i4 % 2 == 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public int hashCode() {
        int i = HaptikSDK$c + 11;
        ah$b = i % 128;
        int i2 = i % 2;
        int hashCode = this.valueOf.hashCode();
        int hashCode2 = this.toString.hashCode();
        int hashCode3 = this.ag$a.hashCode();
        int i3 = this.values;
        if (i3 != 0) {
            int i4 = ah$b + 73;
            HaptikSDK$c = i4 % 128;
            int i5 = i4 % 2;
            i3 = 1;
        }
        int i6 = (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i3;
        int i7 = ah$b + 99;
        HaptikSDK$c = i7 % 128;
        if (!(i7 % 2 != 0)) {
            return i6;
        }
        Object obj = null;
        super.hashCode();
        return i6;
    }

    public String toString() {
        String str = "WalletCredentialInputFragmentArguments(wallet=" + this.valueOf + ", base64Request=" + this.toString + ", checksum=" + this.ag$a + ", credentialEditable=" + this.values + ')';
        int i = ah$b + 41;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        return str;
    }

    public final Wallet ag$a() {
        try {
            int i = ah$b + 3;
            HaptikSDK$c = i % 128;
            int i2 = i % 2;
            Wallet wallet = this.valueOf;
            int i3 = HaptikSDK$c + 1;
            ah$b = i3 % 128;
            if (i3 % 2 != 0) {
                return wallet;
            }
            int i4 = 61 / 0;
            return wallet;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String values() {
        try {
            int i = ah$b + 125;
            try {
                HaptikSDK$c = i % 128;
                if ((i % 2 != 0 ? ']' : (char) 24) != ']') {
                    return this.toString;
                }
                String str = this.toString;
                Object[] objArr = null;
                int length = objArr.length;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String valueOf() {
        int i = ah$b + 65;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        String str = this.ag$a;
        int i3 = ah$b + 47;
        HaptikSDK$c = i3 % 128;
        if ((i3 % 2 != 0 ? Soundex.SILENT_MARKER : 'E') != '-') {
            return str;
        }
        int i4 = 48 / 0;
        return str;
    }

    public final boolean ah$a() {
        try {
            int i = HaptikSDK$c + 89;
            ah$b = i % 128;
            int i2 = i % 2;
            boolean z = this.values;
            int i3 = ah$b + 91;
            HaptikSDK$c = i3 % 128;
            int i4 = i3 % 2;
            return z;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiButton$ah$b(Wallet wallet, String str, String str2, boolean z) {
        super(null);
        runAnimators.ag$a(wallet, ah$a(Color.argb(0, 0, 0, 0), new char[]{15917, 37930, 23114, 31879}, new char[]{39422, 755, 2649, 24233}, (char) (34651 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), new char[]{13371, 3696, 32420, 10873, 54692, 14355}).intern());
        runAnimators.ag$a(str, "base64Request");
        runAnimators.ag$a(str2, Constants.Navigation.CHECKSUM);
        this.valueOf = wallet;
        this.toString = str;
        this.ag$a = str2;
        this.values = z;
    }

    private static String ah$a(int i, char[] cArr, char[] cArr2, char c, char[] cArr3) {
        String str;
        synchronized (getShort.toString) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            getShort.valueOf = 0;
            while (getShort.valueOf < length) {
                int i2 = (getShort.valueOf + 2) % 4;
                int i3 = (getShort.valueOf + 3) % 4;
                getShort.values = (char) (((cArr4[getShort.valueOf % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = getShort.values;
                cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ ah$a) ^ invoke) ^ HaptikSDK$b);
                getShort.valueOf++;
            }
            str = new String(cArr6);
        }
        return str;
    }
}
