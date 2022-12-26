package o;
/* loaded from: classes4.dex */
public final class getMetadataVersion {
    private final String ah$a;
    private final boolean valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getMetadataVersion) {
            getMetadataVersion getmetadataversion = (getMetadataVersion) obj;
            return runAnimators.values((Object) this.ah$a, (Object) getmetadataversion.ah$a) && this.valueOf == getmetadataversion.valueOf;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.ah$a.hashCode();
        boolean z = this.valueOf;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return (hashCode * 31) + i;
    }

    public String toString() {
        return "BulletPoint(text=" + this.ah$a + ", symbolRequired=" + this.valueOf + ')';
    }

    public getMetadataVersion(String str, boolean z) {
        runAnimators.ag$a(str, "text");
        this.ah$a = str;
        this.valueOf = z;
    }

    public /* synthetic */ getMetadataVersion(String str, boolean z, int i, getTargetTypes gettargettypes) {
        this(str, (i & 2) != 0 ? false : z);
    }

    public final String ah$a() {
        return this.ah$a;
    }

    public final boolean valueOf() {
        return this.valueOf;
    }
}
