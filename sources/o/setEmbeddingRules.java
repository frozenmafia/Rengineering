package o;

import com.sendbird.android.shadow.okhttp3.internal.http2.Header;
import okio.ByteString;
/* loaded from: classes5.dex */
public final class setEmbeddingRules {
    public final ByteString HaptikSDK$a;
    public final ByteString HaptikSDK$b;
    public final int HaptikSDK$c;
    public static final values valueOf = new values(null);
    public static final ByteString toString = ByteString.Companion.ag$a(":");
    public static final ByteString ah$a = ByteString.Companion.ag$a(Header.RESPONSE_STATUS_UTF8);
    public static final ByteString values = ByteString.Companion.ag$a(Header.TARGET_METHOD_UTF8);
    public static final ByteString invoke = ByteString.Companion.ag$a(Header.TARGET_PATH_UTF8);
    public static final ByteString ah$b = ByteString.Companion.ag$a(Header.TARGET_SCHEME_UTF8);
    public static final ByteString ag$a = ByteString.Companion.ag$a(Header.TARGET_AUTHORITY_UTF8);

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof setEmbeddingRules) {
                setEmbeddingRules setembeddingrules = (setEmbeddingRules) obj;
                return runAnimators.values(this.HaptikSDK$b, setembeddingrules.HaptikSDK$b) && runAnimators.values(this.HaptikSDK$a, setembeddingrules.HaptikSDK$a);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        ByteString byteString = this.HaptikSDK$b;
        int hashCode = byteString != null ? byteString.hashCode() : 0;
        ByteString byteString2 = this.HaptikSDK$a;
        return (hashCode * 31) + (byteString2 != null ? byteString2.hashCode() : 0);
    }

    public final ByteString valueOf() {
        return this.HaptikSDK$b;
    }

    public final ByteString values() {
        return this.HaptikSDK$a;
    }

    public setEmbeddingRules(ByteString byteString, ByteString byteString2) {
        runAnimators.ag$a(byteString, "name");
        runAnimators.ag$a(byteString2, "value");
        this.HaptikSDK$b = byteString;
        this.HaptikSDK$a = byteString2;
        this.HaptikSDK$c = byteString.size() + 32 + byteString2.size();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public setEmbeddingRules(String str, String str2) {
        this(ByteString.Companion.ag$a(str), ByteString.Companion.ag$a(str2));
        runAnimators.ag$a(str, "name");
        runAnimators.ag$a(str2, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public setEmbeddingRules(ByteString byteString, String str) {
        this(byteString, ByteString.Companion.ag$a(str));
        runAnimators.ag$a(byteString, "name");
        runAnimators.ag$a(str, "value");
    }

    public String toString() {
        return this.HaptikSDK$b.utf8() + ": " + this.HaptikSDK$a.utf8();
    }

    /* loaded from: classes5.dex */
    public static final class values {
        private values() {
        }

        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }
    }
}
