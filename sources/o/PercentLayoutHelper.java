package o;

import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.ClientInfo$ah$a;
import o.PercentLayoutHelper;
/* loaded from: classes7.dex */
public interface PercentLayoutHelper {
    void ag$a(Exception exc);

    /* loaded from: classes7.dex */
    final class PercentLayoutParams extends ClientInfo {
        private final PercentMarginLayoutParams ag$a;
        private final ClientInfo.ClientType valueOf;

        private PercentLayoutParams(ClientInfo.ClientType clientType, PercentMarginLayoutParams percentMarginLayoutParams) {
            this.valueOf = clientType;
            this.ag$a = percentMarginLayoutParams;
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo
        public ClientInfo.ClientType ag$a() {
            return this.valueOf;
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo
        public PercentMarginLayoutParams values() {
            return this.ag$a;
        }

        public String toString() {
            return "ClientInfo{clientType=" + this.valueOf + ", androidClientInfo=" + this.ag$a + "}";
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof ClientInfo) {
                ClientInfo clientInfo = (ClientInfo) obj;
                ClientInfo.ClientType clientType = this.valueOf;
                if (clientType != null ? clientType.equals(clientInfo.ag$a()) : clientInfo.ag$a() == null) {
                    PercentMarginLayoutParams percentMarginLayoutParams = this.ag$a;
                    if (percentMarginLayoutParams == null) {
                        if (clientInfo.values() == null) {
                            return true;
                        }
                    } else if (percentMarginLayoutParams.equals(clientInfo.values())) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            ClientInfo.ClientType clientType = this.valueOf;
            int hashCode = clientType == null ? 0 : clientType.hashCode();
            PercentMarginLayoutParams percentMarginLayoutParams = this.ag$a;
            return ((hashCode ^ 1000003) * 1000003) ^ (percentMarginLayoutParams != null ? percentMarginLayoutParams.hashCode() : 0);
        }

        /* loaded from: classes7.dex */
        public static final class valueOf extends ClientInfo$ah$a {
            private PercentMarginLayoutParams valueOf;
            private ClientInfo.ClientType values;

            @Override // com.google.android.datatransport.cct.internal.ClientInfo$ah$a
            public ClientInfo$ah$a ah$a(ClientInfo.ClientType clientType) {
                this.values = clientType;
                return this;
            }

            @Override // com.google.android.datatransport.cct.internal.ClientInfo$ah$a
            public ClientInfo$ah$a toString(PercentMarginLayoutParams percentMarginLayoutParams) {
                this.valueOf = percentMarginLayoutParams;
                return this;
            }

            @Override // com.google.android.datatransport.cct.internal.ClientInfo$ah$a
            public ClientInfo ag$a() {
                return new PercentLayoutParams(this.values, this.valueOf);
            }
        }
    }

    /* loaded from: classes7.dex */
    public final class PercentLayoutInfo {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static String toString(String str, String str2) {
            int length = str.length() - str2.length();
            if (length < 0 || length > 1) {
                throw new IllegalArgumentException("Invalid input received");
            }
            StringBuilder sb = new StringBuilder(str.length() + str2.length());
            for (int i = 0; i < str.length(); i++) {
                sb.append(str.charAt(i));
                if (str2.length() > i) {
                    sb.append(str2.charAt(i));
                }
            }
            return sb.toString();
        }
    }

    /* loaded from: classes7.dex */
    public abstract class PercentMarginLayoutParams {
        public abstract String HaptikSDK$a();

        public abstract String HaptikSDK$b();

        public abstract String HaptikSDK$c();

        public abstract String HaptikSDK$d();

        public abstract String HaptikSDK$e();

        public abstract String ag$a();

        public abstract String ah$a();

        public abstract String ah$b();

        public abstract String getInitSettings();

        public abstract Integer getSignupData();

        public abstract String invoke();

        public abstract String valueOf();

        public static PercentLayoutHelper$PercentMarginLayoutParams$ah$a values() {
            return new PercentLayoutHelper$PercentMarginLayoutParams$ah$a() { // from class: o.restoreMarginLayoutParams$ag$a
                private String HaptikSDK$a;
                private String HaptikSDK$b;
                private String HaptikSDK$c;
                private String HaptikSDK$d;
                private Integer HaptikSDK$e;
                private String ag$a;
                private String ah$a;
                private String ah$b;
                private String invoke;
                private String toString;
                private String valueOf;
                private String values;

                @Override // o.PercentLayoutHelper$PercentMarginLayoutParams$ah$a
                public PercentLayoutHelper$PercentMarginLayoutParams$ah$a values(Integer num) {
                    this.HaptikSDK$e = num;
                    return this;
                }

                @Override // o.PercentLayoutHelper$PercentMarginLayoutParams$ah$a
                public PercentLayoutHelper$PercentMarginLayoutParams$ah$a ah$b(String str) {
                    this.HaptikSDK$b = str;
                    return this;
                }

                @Override // o.PercentLayoutHelper$PercentMarginLayoutParams$ah$a
                public PercentLayoutHelper$PercentMarginLayoutParams$ah$a ah$a(String str) {
                    this.ah$a = str;
                    return this;
                }

                @Override // o.PercentLayoutHelper$PercentMarginLayoutParams$ah$a
                public PercentLayoutHelper$PercentMarginLayoutParams$ah$a ag$a(String str) {
                    this.ag$a = str;
                    return this;
                }

                @Override // o.PercentLayoutHelper$PercentMarginLayoutParams$ah$a
                public PercentLayoutHelper$PercentMarginLayoutParams$ah$a HaptikSDK$e(String str) {
                    this.HaptikSDK$d = str;
                    return this;
                }

                @Override // o.PercentLayoutHelper$PercentMarginLayoutParams$ah$a
                public PercentLayoutHelper$PercentMarginLayoutParams$ah$a HaptikSDK$c(String str) {
                    this.ah$b = str;
                    return this;
                }

                @Override // o.PercentLayoutHelper$PercentMarginLayoutParams$ah$a
                public PercentLayoutHelper$PercentMarginLayoutParams$ah$a HaptikSDK$a(String str) {
                    this.invoke = str;
                    return this;
                }

                @Override // o.PercentLayoutHelper$PercentMarginLayoutParams$ah$a
                public PercentLayoutHelper$PercentMarginLayoutParams$ah$a values(String str) {
                    this.valueOf = str;
                    return this;
                }

                @Override // o.PercentLayoutHelper$PercentMarginLayoutParams$ah$a
                public PercentLayoutHelper$PercentMarginLayoutParams$ah$a HaptikSDK$b(String str) {
                    this.HaptikSDK$c = str;
                    return this;
                }

                @Override // o.PercentLayoutHelper$PercentMarginLayoutParams$ah$a
                public PercentLayoutHelper$PercentMarginLayoutParams$ah$a valueOf(String str) {
                    this.toString = str;
                    return this;
                }

                @Override // o.PercentLayoutHelper$PercentMarginLayoutParams$ah$a
                public PercentLayoutHelper$PercentMarginLayoutParams$ah$a invoke(String str) {
                    this.HaptikSDK$a = str;
                    return this;
                }

                @Override // o.PercentLayoutHelper$PercentMarginLayoutParams$ah$a
                public PercentLayoutHelper$PercentMarginLayoutParams$ah$a toString(String str) {
                    this.values = str;
                    return this;
                }

                @Override // o.PercentLayoutHelper$PercentMarginLayoutParams$ah$a
                public PercentLayoutHelper.PercentMarginLayoutParams ag$a() {
                    return new restoreMarginLayoutParams(this.HaptikSDK$e, this.HaptikSDK$b, this.ah$a, this.ag$a, this.HaptikSDK$d, this.ah$b, this.invoke, this.valueOf, this.HaptikSDK$c, this.toString, this.HaptikSDK$a, this.values);
                }
            };
        }
    }
}
