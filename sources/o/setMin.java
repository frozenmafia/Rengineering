package o;
/* loaded from: classes5.dex */
final class setMin extends setDefaultValues {
    private final int ah$a;
    private final boolean valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ setMin(int i, boolean z, setSeekBarIncrement setseekbarincrement) {
        this.ah$a = i;
        this.valueOf = z;
    }

    @Override // o.setDefaultValues
    public final int ah$a() {
        return this.ah$a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof setDefaultValues) {
            setDefaultValues setdefaultvalues = (setDefaultValues) obj;
            return this.ah$a == setdefaultvalues.ah$a() && this.valueOf == setdefaultvalues.values();
        }
        return false;
    }

    public final int hashCode() {
        return ((this.ah$a ^ 1000003) * 1000003) ^ (true != this.valueOf ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.ah$a;
        boolean z = this.valueOf;
        return "AppUpdateOptions{appUpdateType=" + i + ", allowAssetPackDeletion=" + z + "}";
    }

    @Override // o.setDefaultValues
    public final boolean values() {
        return this.valueOf;
    }
}
