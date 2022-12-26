package o;
/* loaded from: classes4.dex */
public final class EmojiTextWatcher {
    private final String ag$a;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmojiTextWatcher) {
            EmojiTextWatcher emojiTextWatcher = (EmojiTextWatcher) obj;
            return runAnimators.values((Object) this.values, (Object) emojiTextWatcher.values) && runAnimators.values((Object) this.ag$a, (Object) emojiTextWatcher.ag$a);
        }
        return false;
    }

    public int hashCode() {
        return (this.values.hashCode() * 31) + this.ag$a.hashCode();
    }

    public String toString() {
        return "Base64NChecksumModel(base64String=" + this.values + ", checksumString=" + this.ag$a + ')';
    }

    public EmojiTextWatcher(String str, String str2) {
        runAnimators.ag$a(str, "base64String");
        runAnimators.ag$a(str2, "checksumString");
        this.values = str;
        this.ag$a = str2;
    }

    public final String ah$a() {
        return this.ag$a;
    }

    public final String valueOf() {
        return this.values;
    }
}
