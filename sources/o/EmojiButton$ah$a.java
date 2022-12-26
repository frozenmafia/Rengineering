package o;

import com.dreampay.commons.constants.Constants;
/* loaded from: classes4.dex */
public final class EmojiButton$ah$a extends EmojiButton {
    private final int HaptikSDK$a;
    private final int HaptikSDK$c;
    private final boolean ag$a;
    private final String ah$a;
    private final boolean toString;
    private final String valueOf;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmojiButton$ah$a) {
            EmojiButton$ah$a emojiButton$ah$a = (EmojiButton$ah$a) obj;
            return runAnimators.values((Object) this.ah$a, (Object) emojiButton$ah$a.ah$a) && runAnimators.values((Object) this.valueOf, (Object) emojiButton$ah$a.valueOf) && this.HaptikSDK$a == emojiButton$ah$a.HaptikSDK$a && runAnimators.values((Object) this.values, (Object) emojiButton$ah$a.values) && this.ag$a == emojiButton$ah$a.ag$a && this.toString == emojiButton$ah$a.toString && this.HaptikSDK$c == emojiButton$ah$a.HaptikSDK$c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.ah$a.hashCode();
        int hashCode2 = this.valueOf.hashCode();
        int i = this.HaptikSDK$a;
        int hashCode3 = this.values.hashCode();
        boolean z = this.ag$a;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        boolean z2 = this.toString;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + i) * 31) + hashCode3) * 31) + i2) * 31) + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.HaptikSDK$c;
    }

    public String toString() {
        return "CvvFragmentArguments(base64Request=" + this.ah$a + ", checksum=" + this.valueOf + ", requestCode=" + this.HaptikSDK$a + ", cardToken=" + this.values + ", isSFAEligible=" + this.ag$a + ", isSFAEnrolled=" + this.toString + ", maxSFAEligibleAmount=" + this.HaptikSDK$c + ')';
    }

    public final String valueOf() {
        return this.ah$a;
    }

    public final String ah$a() {
        return this.valueOf;
    }

    public final int HaptikSDK$c() {
        return this.HaptikSDK$a;
    }

    public final String ag$a() {
        return this.values;
    }

    public final boolean HaptikSDK$b() {
        return this.ag$a;
    }

    public final boolean invoke() {
        return this.toString;
    }

    public final int values() {
        return this.HaptikSDK$c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiButton$ah$a(String str, String str2, int i, String str3, boolean z, boolean z2, int i2) {
        super(null);
        runAnimators.ag$a(str, "base64Request");
        runAnimators.ag$a(str2, Constants.Navigation.CHECKSUM);
        runAnimators.ag$a(str3, "cardToken");
        this.ah$a = str;
        this.valueOf = str2;
        this.HaptikSDK$a = i;
        this.values = str3;
        this.ag$a = z;
        this.toString = z2;
        this.HaptikSDK$c = i2;
    }
}
