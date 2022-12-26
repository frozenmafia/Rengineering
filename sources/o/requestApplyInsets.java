package o;

import java.util.Map;
import java.util.Objects;
/* loaded from: classes6.dex */
public final class requestApplyInsets implements Map.Entry<String, String> {
    private final String ag$a;
    private final String valueOf;

    public requestApplyInsets(String str, String str2) {
        Objects.requireNonNull(str, "FeatureFlags cannot have null name");
        this.ag$a = str;
        this.valueOf = str2;
    }

    @Override // java.util.Map.Entry
    /* renamed from: valueOf */
    public String getKey() {
        return this.ag$a;
    }

    @Override // java.util.Map.Entry
    /* renamed from: ah$a */
    public String getValue() {
        return this.valueOf;
    }

    @Override // java.util.Map.Entry
    /* renamed from: values */
    public String setValue(String str) {
        throw new UnsupportedOperationException("FeatureFlag is immutable");
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return getKey().hashCode() ^ (getValue() == null ? 0 : getValue().hashCode());
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (getKey().equals(entry.getKey())) {
                if (getValue() == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (getValue().equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public String toString() {
        return "FeatureFlag{name='" + this.ag$a + "', variant='" + this.valueOf + "'}";
    }
}
