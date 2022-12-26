package o;

import java.util.Objects;
import o.ZipUtil;
/* loaded from: classes7.dex */
final class getNegativeButtonText extends DropDownPreference {
    private final String ag$a;
    private final shouldHandleMeasuredWidthTooSmall<?> ah$a;
    private final fetchWidthAndHeight<?, byte[]> toString;
    private final findPreference valueOf;
    private final ZipUtil.CentralDirectory values;

    private getNegativeButtonText(findPreference findpreference, String str, shouldHandleMeasuredWidthTooSmall<?> shouldhandlemeasuredwidthtoosmall, fetchWidthAndHeight<?, byte[]> fetchwidthandheight, ZipUtil.CentralDirectory centralDirectory) {
        this.valueOf = findpreference;
        this.ag$a = str;
        this.ah$a = shouldhandlemeasuredwidthtoosmall;
        this.toString = fetchwidthandheight;
        this.values = centralDirectory;
    }

    @Override // o.DropDownPreference
    public findPreference ah$a() {
        return this.valueOf;
    }

    @Override // o.DropDownPreference
    public String ah$b() {
        return this.ag$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.DropDownPreference
    public shouldHandleMeasuredWidthTooSmall<?> valueOf() {
        return this.ah$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.DropDownPreference
    public fetchWidthAndHeight<?, byte[]> ag$a() {
        return this.toString;
    }

    @Override // o.DropDownPreference
    public ZipUtil.CentralDirectory values() {
        return this.values;
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.valueOf + ", transportName=" + this.ag$a + ", event=" + this.ah$a + ", transformer=" + this.toString + ", encoding=" + this.values + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DropDownPreference) {
            DropDownPreference dropDownPreference = (DropDownPreference) obj;
            return this.valueOf.equals(dropDownPreference.ah$a()) && this.ag$a.equals(dropDownPreference.ah$b()) && this.ah$a.equals(dropDownPreference.valueOf()) && this.toString.equals(dropDownPreference.ag$a()) && this.values.equals(dropDownPreference.values());
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.valueOf.hashCode();
        int hashCode2 = this.ag$a.hashCode();
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ this.ah$a.hashCode()) * 1000003) ^ this.toString.hashCode()) * 1000003) ^ this.values.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class toString extends DropDownPreference$ah$a {
        private fetchWidthAndHeight<?, byte[]> ag$a;
        private ZipUtil.CentralDirectory ah$a;
        private String toString;
        private shouldHandleMeasuredWidthTooSmall<?> valueOf;
        private findPreference values;

        @Override // o.DropDownPreference$ah$a
        public DropDownPreference$ah$a toString(findPreference findpreference) {
            Objects.requireNonNull(findpreference, "Null transportContext");
            this.values = findpreference;
            return this;
        }

        @Override // o.DropDownPreference$ah$a
        public DropDownPreference$ah$a valueOf(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.toString = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.DropDownPreference$ah$a
        public DropDownPreference$ah$a toString(shouldHandleMeasuredWidthTooSmall<?> shouldhandlemeasuredwidthtoosmall) {
            Objects.requireNonNull(shouldhandlemeasuredwidthtoosmall, "Null event");
            this.valueOf = shouldhandlemeasuredwidthtoosmall;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.DropDownPreference$ah$a
        public DropDownPreference$ah$a values(fetchWidthAndHeight<?, byte[]> fetchwidthandheight) {
            Objects.requireNonNull(fetchwidthandheight, "Null transformer");
            this.ag$a = fetchwidthandheight;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.DropDownPreference$ah$a
        public DropDownPreference$ah$a values(ZipUtil.CentralDirectory centralDirectory) {
            Objects.requireNonNull(centralDirectory, "Null encoding");
            this.ah$a = centralDirectory;
            return this;
        }

        @Override // o.DropDownPreference$ah$a
        public DropDownPreference valueOf() {
            String str = "";
            if (this.values == null) {
                str = " transportContext";
            }
            if (this.toString == null) {
                str = str + " transportName";
            }
            if (this.valueOf == null) {
                str = str + " event";
            }
            if (this.ag$a == null) {
                str = str + " transformer";
            }
            if (this.ah$a == null) {
                str = str + " encoding";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new getNegativeButtonText(this.values, this.toString, this.valueOf, this.ag$a, this.ah$a);
        }
    }
}
