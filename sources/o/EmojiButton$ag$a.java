package o;

import com.dreampay.commons.constants.Constants;
/* loaded from: classes4.dex */
public final class EmojiButton$ag$a extends EmojiButton {
    private final String ag$a;
    private final int ah$a;
    private final Integer valueOf;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmojiButton$ag$a) {
            EmojiButton$ag$a emojiButton$ag$a = (EmojiButton$ag$a) obj;
            return this.ah$a == emojiButton$ag$a.ah$a && runAnimators.values((Object) this.values, (Object) emojiButton$ag$a.values) && runAnimators.values((Object) this.ag$a, (Object) emojiButton$ag$a.ag$a) && runAnimators.values(this.valueOf, emojiButton$ag$a.valueOf);
        }
        return false;
    }

    public int hashCode() {
        int i = this.ah$a;
        int hashCode = this.values.hashCode();
        int hashCode2 = this.ag$a.hashCode();
        Integer num = this.valueOf;
        return (((((i * 31) + hashCode) * 31) + hashCode2) * 31) + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "AddCardFragmentArguments(flow=" + this.ah$a + ", base64Request=" + this.values + ", checksum=" + this.ag$a + ", requestCode=" + this.valueOf + ')';
    }

    public final Integer ag$a() {
        return this.valueOf;
    }

    public final int ah$a() {
        return this.ah$a;
    }

    public final String valueOf() {
        return this.values;
    }

    public final String values() {
        return this.ag$a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiButton$ag$a(int i, String str, String str2, Integer num) {
        super(null);
        runAnimators.ag$a(str, "base64Request");
        runAnimators.ag$a(str2, Constants.Navigation.CHECKSUM);
        this.ah$a = i;
        this.values = str;
        this.ag$a = str2;
        this.valueOf = num;
    }
}
