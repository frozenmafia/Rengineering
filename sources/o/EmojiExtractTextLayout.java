package o;

import com.dreampay.commons.constants.Constants;
/* loaded from: classes4.dex */
public abstract class EmojiExtractTextLayout {
    public /* synthetic */ EmojiExtractTextLayout(getTargetTypes gettargettypes) {
        this();
    }

    private EmojiExtractTextLayout() {
    }

    /* loaded from: classes4.dex */
    public static final class toString extends EmojiExtractTextLayout {
        private final String ag$a;
        private final String ah$a;
        private final String valueOf;
        private final String values;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof toString) {
                toString tostring = (toString) obj;
                return runAnimators.values((Object) this.ag$a, (Object) tostring.ag$a) && runAnimators.values((Object) this.ah$a, (Object) tostring.ah$a) && runAnimators.values((Object) this.values, (Object) tostring.values) && runAnimators.values((Object) this.valueOf, (Object) tostring.valueOf);
            }
            return false;
        }

        public int hashCode() {
            return (((((this.ag$a.hashCode() * 31) + this.ah$a.hashCode()) * 31) + this.values.hashCode()) * 31) + this.valueOf.hashCode();
        }

        public String toString() {
            return "VerifyCredential(base64Request=" + this.ag$a + ", checksum=" + this.ah$a + ", mobileNumber=" + this.values + ", validateToken=" + this.valueOf + ')';
        }

        public final String ah$a() {
            return this.values;
        }

        public final String valueOf() {
            return this.valueOf;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public toString(String str, String str2, String str3, String str4) {
            super(null);
            runAnimators.ag$a(str, "base64Request");
            runAnimators.ag$a(str2, Constants.Navigation.CHECKSUM);
            runAnimators.ag$a(str3, "mobileNumber");
            runAnimators.ag$a(str4, "validateToken");
            this.ag$a = str;
            this.ah$a = str2;
            this.values = str3;
            this.valueOf = str4;
        }
    }
}
