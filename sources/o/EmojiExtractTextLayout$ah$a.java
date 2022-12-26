package o;

import com.dreampay.commons.constants.Constants;
/* loaded from: classes4.dex */
public final class EmojiExtractTextLayout$ah$a extends EmojiExtractTextLayout {
    private final String ag$a;
    private final String ah$a;
    private final boolean toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmojiExtractTextLayout$ah$a) {
            EmojiExtractTextLayout$ah$a emojiExtractTextLayout$ah$a = (EmojiExtractTextLayout$ah$a) obj;
            return runAnimators.values((Object) this.ag$a, (Object) emojiExtractTextLayout$ah$a.ag$a) && runAnimators.values((Object) this.ah$a, (Object) emojiExtractTextLayout$ah$a.ah$a) && this.toString == emojiExtractTextLayout$ah$a.toString;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.ag$a.hashCode();
        int hashCode2 = this.ah$a.hashCode();
        boolean z = this.toString;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public String toString() {
        return "CredentialInput(base64Request=" + this.ag$a + ", checksum=" + this.ah$a + ", credentialEditable=" + this.toString + ')';
    }

    public final String values() {
        return this.ag$a;
    }

    public final String ah$a() {
        return this.ah$a;
    }

    public final boolean valueOf() {
        return this.toString;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiExtractTextLayout$ah$a(String str, String str2, boolean z) {
        super(null);
        runAnimators.ag$a(str, "base64Request");
        runAnimators.ag$a(str2, Constants.Navigation.CHECKSUM);
        this.ag$a = str;
        this.ah$a = str2;
        this.toString = z;
    }
}
