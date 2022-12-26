package o;

import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import java.util.Arrays;
import o.getDialogLayoutResource;
/* loaded from: classes7.dex */
final class AndroidResources extends getDialogLayoutResource {
    private final String HaptikSDK$b;
    private final long ag$a;
    private final Integer ah$a;
    private final long ah$b;
    private final NetworkConnectionInfo toString;
    private final byte[] valueOf;
    private final long values;

    private AndroidResources(long j, Integer num, long j2, byte[] bArr, String str, long j3, NetworkConnectionInfo networkConnectionInfo) {
        this.values = j;
        this.ah$a = num;
        this.ag$a = j2;
        this.valueOf = bArr;
        this.HaptikSDK$b = str;
        this.ah$b = j3;
        this.toString = networkConnectionInfo;
    }

    @Override // o.getDialogLayoutResource
    public long values() {
        return this.values;
    }

    @Override // o.getDialogLayoutResource
    public Integer valueOf() {
        return this.ah$a;
    }

    @Override // o.getDialogLayoutResource
    public long ah$a() {
        return this.ag$a;
    }

    @Override // o.getDialogLayoutResource
    public byte[] ah$b() {
        return this.valueOf;
    }

    @Override // o.getDialogLayoutResource
    public String invoke() {
        return this.HaptikSDK$b;
    }

    @Override // o.getDialogLayoutResource
    public long HaptikSDK$b() {
        return this.ah$b;
    }

    @Override // o.getDialogLayoutResource
    public NetworkConnectionInfo ag$a() {
        return this.toString;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.values + ", eventCode=" + this.ah$a + ", eventUptimeMs=" + this.ag$a + ", sourceExtension=" + Arrays.toString(this.valueOf) + ", sourceExtensionJsonProto3=" + this.HaptikSDK$b + ", timezoneOffsetSeconds=" + this.ah$b + ", networkConnectionInfo=" + this.toString + "}";
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof getDialogLayoutResource) {
            getDialogLayoutResource getdialoglayoutresource = (getDialogLayoutResource) obj;
            if (this.values == getdialoglayoutresource.values() && ((num = this.ah$a) != null ? num.equals(getdialoglayoutresource.valueOf()) : getdialoglayoutresource.valueOf() == null) && this.ag$a == getdialoglayoutresource.ah$a()) {
                if (Arrays.equals(this.valueOf, getdialoglayoutresource instanceof AndroidResources ? ((AndroidResources) getdialoglayoutresource).valueOf : getdialoglayoutresource.ah$b()) && ((str = this.HaptikSDK$b) != null ? str.equals(getdialoglayoutresource.invoke()) : getdialoglayoutresource.invoke() == null) && this.ah$b == getdialoglayoutresource.HaptikSDK$b()) {
                    NetworkConnectionInfo networkConnectionInfo = this.toString;
                    if (networkConnectionInfo == null) {
                        if (getdialoglayoutresource.ag$a() == null) {
                            return true;
                        }
                    } else if (networkConnectionInfo.equals(getdialoglayoutresource.ag$a())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        long j = this.values;
        int i = (int) (j ^ (j >>> 32));
        Integer num = this.ah$a;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.ag$a;
        int i2 = (int) (j2 ^ (j2 >>> 32));
        int hashCode2 = Arrays.hashCode(this.valueOf);
        String str = this.HaptikSDK$b;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.ah$b;
        int i3 = (int) (j3 ^ (j3 >>> 32));
        NetworkConnectionInfo networkConnectionInfo = this.toString;
        return ((((((((((hashCode ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ i2) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ i3) * 1000003) ^ (networkConnectionInfo != null ? networkConnectionInfo.hashCode() : 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class toString extends getDialogLayoutResource.valueOf {
        private String HaptikSDK$b;
        private Integer ag$a;
        private Long ah$a;
        private Long ah$b;
        private Long toString;
        private NetworkConnectionInfo valueOf;
        private byte[] values;

        @Override // o.getDialogLayoutResource.valueOf
        public getDialogLayoutResource.valueOf values(long j) {
            this.toString = Long.valueOf(j);
            return this;
        }

        @Override // o.getDialogLayoutResource.valueOf
        public getDialogLayoutResource.valueOf ah$a(Integer num) {
            this.ag$a = num;
            return this;
        }

        @Override // o.getDialogLayoutResource.valueOf
        public getDialogLayoutResource.valueOf ag$a(long j) {
            this.ah$a = Long.valueOf(j);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.getDialogLayoutResource.valueOf
        public getDialogLayoutResource.valueOf ag$a(byte[] bArr) {
            this.values = bArr;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.getDialogLayoutResource.valueOf
        public getDialogLayoutResource.valueOf ag$a(String str) {
            this.HaptikSDK$b = str;
            return this;
        }

        @Override // o.getDialogLayoutResource.valueOf
        public getDialogLayoutResource.valueOf ah$a(long j) {
            this.ah$b = Long.valueOf(j);
            return this;
        }

        @Override // o.getDialogLayoutResource.valueOf
        public getDialogLayoutResource.valueOf ah$a(NetworkConnectionInfo networkConnectionInfo) {
            this.valueOf = networkConnectionInfo;
            return this;
        }

        @Override // o.getDialogLayoutResource.valueOf
        public getDialogLayoutResource ag$a() {
            String str = "";
            if (this.toString == null) {
                str = " eventTimeMs";
            }
            if (this.ah$a == null) {
                str = str + " eventUptimeMs";
            }
            if (this.ah$b == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new AndroidResources(this.toString.longValue(), this.ag$a, this.ah$a.longValue(), this.values, this.HaptikSDK$b, this.ah$b.longValue(), this.valueOf);
        }
    }
}
