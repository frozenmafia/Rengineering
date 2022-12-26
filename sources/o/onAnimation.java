package o;

import com.google.firebase.installations.remote.TokenResult;
import com.google.firebase.installations.remote.TokenResult$ah$a;
/* loaded from: classes7.dex */
final class onAnimation extends TokenResult {
    private final String ag$a;
    private final TokenResult.ResponseCode ah$a;
    private final long toString;

    private onAnimation(String str, long j, TokenResult.ResponseCode responseCode) {
        this.ag$a = str;
        this.toString = j;
        this.ah$a = responseCode;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public String ag$a() {
        return this.ag$a;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public long values() {
        return this.toString;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public TokenResult.ResponseCode ah$a() {
        return this.ah$a;
    }

    public String toString() {
        return "TokenResult{token=" + this.ag$a + ", tokenExpirationTimestamp=" + this.toString + ", responseCode=" + this.ah$a + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TokenResult) {
            TokenResult tokenResult = (TokenResult) obj;
            String str = this.ag$a;
            if (str != null ? str.equals(tokenResult.ag$a()) : tokenResult.ag$a() == null) {
                if (this.toString == tokenResult.values()) {
                    TokenResult.ResponseCode responseCode = this.ah$a;
                    if (responseCode == null) {
                        if (tokenResult.ah$a() == null) {
                            return true;
                        }
                    } else if (responseCode.equals(tokenResult.ah$a())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.ag$a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.toString;
        int i = (int) (j ^ (j >>> 32));
        TokenResult.ResponseCode responseCode = this.ah$a;
        return ((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ (responseCode != null ? responseCode.hashCode() : 0);
    }

    /* loaded from: classes7.dex */
    public static final class values extends TokenResult$ah$a {
        private TokenResult.ResponseCode ah$a;
        private Long toString;
        private String values;

        @Override // com.google.firebase.installations.remote.TokenResult$ah$a
        public TokenResult$ah$a valueOf(String str) {
            this.values = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult$ah$a
        public TokenResult$ah$a ag$a(long j) {
            this.toString = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult$ah$a
        public TokenResult$ah$a ag$a(TokenResult.ResponseCode responseCode) {
            this.ah$a = responseCode;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult$ah$a
        public TokenResult ah$a() {
            String str = "";
            if (this.toString == null) {
                str = " tokenExpirationTimestamp";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new onAnimation(this.values, this.toString.longValue(), this.ah$a);
        }
    }
}
