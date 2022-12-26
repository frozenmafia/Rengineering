package o;

import o.CheckBoxPreference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class syncViewIfAccessibilityEnabled extends CheckBoxPreference.Listener {
    private final long valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public syncViewIfAccessibilityEnabled(long j) {
        this.valueOf = j;
    }

    @Override // o.CheckBoxPreference.Listener
    public long ag$a() {
        return this.valueOf;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.valueOf + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof CheckBoxPreference.Listener) && this.valueOf == ((CheckBoxPreference.Listener) obj).ag$a();
    }

    public int hashCode() {
        long j = this.valueOf;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }
}
