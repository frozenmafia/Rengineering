package o;

import java.util.Map;
import java.util.Objects;
import o.setDialogTitle;
/* loaded from: classes7.dex */
final class getDialogIcon extends setDialogTitle {
    private final long HaptikSDK$c;
    private final Integer ag$a;
    private final String ah$a;
    private final long toString;
    private final Map<String, String> valueOf;
    private final setDialogLayoutResource values;

    private getDialogIcon(String str, Integer num, setDialogLayoutResource setdialoglayoutresource, long j, long j2, Map<String, String> map) {
        this.ah$a = str;
        this.ag$a = num;
        this.values = setdialoglayoutresource;
        this.toString = j;
        this.HaptikSDK$c = j2;
        this.valueOf = map;
    }

    @Override // o.setDialogTitle
    public String ah$b() {
        return this.ah$a;
    }

    @Override // o.setDialogTitle
    public Integer ag$a() {
        return this.ag$a;
    }

    @Override // o.setDialogTitle
    public setDialogLayoutResource ah$a() {
        return this.values;
    }

    @Override // o.setDialogTitle
    public long values() {
        return this.toString;
    }

    @Override // o.setDialogTitle
    public long HaptikSDK$c() {
        return this.HaptikSDK$c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setDialogTitle
    public Map<String, String> valueOf() {
        return this.valueOf;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.ah$a + ", code=" + this.ag$a + ", encodedPayload=" + this.values + ", eventMillis=" + this.toString + ", uptimeMillis=" + this.HaptikSDK$c + ", autoMetadata=" + this.valueOf + "}";
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof setDialogTitle) {
            setDialogTitle setdialogtitle = (setDialogTitle) obj;
            return this.ah$a.equals(setdialogtitle.ah$b()) && ((num = this.ag$a) != null ? num.equals(setdialogtitle.ag$a()) : setdialogtitle.ag$a() == null) && this.values.equals(setdialogtitle.ah$a()) && this.toString == setdialogtitle.values() && this.HaptikSDK$c == setdialogtitle.HaptikSDK$c() && this.valueOf.equals(setdialogtitle.valueOf());
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.ah$a.hashCode();
        Integer num = this.ag$a;
        int hashCode2 = num == null ? 0 : num.hashCode();
        int hashCode3 = this.values.hashCode();
        long j = this.toString;
        long j2 = this.HaptikSDK$c;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.valueOf.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class toString extends setDialogTitle.values {
        private Integer ag$a;
        private String ah$a;
        private Long ah$b;
        private Long toString;
        private Map<String, String> valueOf;
        private setDialogLayoutResource values;

        @Override // o.setDialogTitle.values
        public setDialogTitle.values toString(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.ah$a = str;
            return this;
        }

        @Override // o.setDialogTitle.values
        public setDialogTitle.values toString(Integer num) {
            this.ag$a = num;
            return this;
        }

        @Override // o.setDialogTitle.values
        public setDialogTitle.values ah$a(setDialogLayoutResource setdialoglayoutresource) {
            Objects.requireNonNull(setdialoglayoutresource, "Null encodedPayload");
            this.values = setdialoglayoutresource;
            return this;
        }

        @Override // o.setDialogTitle.values
        public setDialogTitle.values ah$a(long j) {
            this.toString = Long.valueOf(j);
            return this;
        }

        @Override // o.setDialogTitle.values
        public setDialogTitle.values toString(long j) {
            this.ah$b = Long.valueOf(j);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.setDialogTitle.values
        public setDialogTitle.values ah$a(Map<String, String> map) {
            Objects.requireNonNull(map, "Null autoMetadata");
            this.valueOf = map;
            return this;
        }

        @Override // o.setDialogTitle.values
        protected Map<String, String> values() {
            Map<String, String> map = this.valueOf;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // o.setDialogTitle.values
        public setDialogTitle ag$a() {
            String str = "";
            if (this.ah$a == null) {
                str = " transportName";
            }
            if (this.values == null) {
                str = str + " encodedPayload";
            }
            if (this.toString == null) {
                str = str + " eventMillis";
            }
            if (this.ah$b == null) {
                str = str + " uptimeMillis";
            }
            if (this.valueOf == null) {
                str = str + " autoMetadata";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new getDialogIcon(this.ah$a, this.ag$a, this.values, this.toString.longValue(), this.ah$b.longValue(), this.valueOf);
        }
    }
}
