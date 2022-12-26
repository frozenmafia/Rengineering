package o;

import com.google.android.datatransport.Priority;
import java.util.Arrays;
import java.util.Objects;
import o.findPreference;
/* loaded from: classes7.dex */
final class getDialogTitle extends findPreference {
    private final byte[] toString;
    private final Priority valueOf;
    private final String values;

    private getDialogTitle(String str, byte[] bArr, Priority priority) {
        this.values = str;
        this.toString = bArr;
        this.valueOf = priority;
    }

    @Override // o.findPreference
    public String ah$a() {
        return this.values;
    }

    @Override // o.findPreference
    public byte[] ag$a() {
        return this.toString;
    }

    @Override // o.findPreference
    public Priority values() {
        return this.valueOf;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof findPreference) {
            findPreference findpreference = (findPreference) obj;
            if (this.values.equals(findpreference.ah$a())) {
                if (Arrays.equals(this.toString, findpreference instanceof getDialogTitle ? ((getDialogTitle) findpreference).toString : findpreference.ag$a()) && this.valueOf.equals(findpreference.values())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.values.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.toString)) * 1000003) ^ this.valueOf.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class valueOf extends findPreference.toString {
        private String ah$a;
        private byte[] valueOf;
        private Priority values;

        @Override // o.findPreference.toString
        public findPreference.toString values(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.ah$a = str;
            return this;
        }

        @Override // o.findPreference.toString
        public findPreference.toString toString(byte[] bArr) {
            this.valueOf = bArr;
            return this;
        }

        @Override // o.findPreference.toString
        public findPreference.toString ag$a(Priority priority) {
            Objects.requireNonNull(priority, "Null priority");
            this.values = priority;
            return this;
        }

        @Override // o.findPreference.toString
        public findPreference values() {
            String str = "";
            if (this.ah$a == null) {
                str = " backendName";
            }
            if (this.values == null) {
                str = str + " priority";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new getDialogTitle(this.ah$a, this.valueOf, this.values);
        }
    }
}
