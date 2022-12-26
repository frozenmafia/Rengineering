package o;

import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
/* loaded from: classes7.dex */
final class syncCheckboxView extends NetworkConnectionInfo {
    private final NetworkConnectionInfo.MobileSubtype ag$a;
    private final NetworkConnectionInfo.NetworkType values;

    private syncCheckboxView(NetworkConnectionInfo.NetworkType networkType, NetworkConnectionInfo.MobileSubtype mobileSubtype) {
        this.values = networkType;
        this.ag$a = mobileSubtype;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    public NetworkConnectionInfo.NetworkType valueOf() {
        return this.values;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    public NetworkConnectionInfo.MobileSubtype ah$a() {
        return this.ag$a;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.values + ", mobileSubtype=" + this.ag$a + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NetworkConnectionInfo) {
            NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
            NetworkConnectionInfo.NetworkType networkType = this.values;
            if (networkType != null ? networkType.equals(networkConnectionInfo.valueOf()) : networkConnectionInfo.valueOf() == null) {
                NetworkConnectionInfo.MobileSubtype mobileSubtype = this.ag$a;
                if (mobileSubtype == null) {
                    if (networkConnectionInfo.ah$a() == null) {
                        return true;
                    }
                } else if (mobileSubtype.equals(networkConnectionInfo.ah$a())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        NetworkConnectionInfo.NetworkType networkType = this.values;
        int hashCode = networkType == null ? 0 : networkType.hashCode();
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.ag$a;
        return ((hashCode ^ 1000003) * 1000003) ^ (mobileSubtype != null ? mobileSubtype.hashCode() : 0);
    }

    /* loaded from: classes7.dex */
    public static final class valueOf extends NetworkConnectionInfo.values {
        private NetworkConnectionInfo.MobileSubtype valueOf;
        private NetworkConnectionInfo.NetworkType values;

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.values
        public NetworkConnectionInfo.values toString(NetworkConnectionInfo.NetworkType networkType) {
            this.values = networkType;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.values
        public NetworkConnectionInfo.values ah$a(NetworkConnectionInfo.MobileSubtype mobileSubtype) {
            this.valueOf = mobileSubtype;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.values
        public NetworkConnectionInfo ag$a() {
            return new syncCheckboxView(this.values, this.valueOf);
        }
    }
}
