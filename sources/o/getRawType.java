package o;
/* loaded from: classes.dex */
public final class getRawType {
    private final String ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getRawType) && runAnimators.values((Object) this.ah$a, (Object) ((getRawType) obj).ah$a);
    }

    public int hashCode() {
        return this.ah$a.hashCode();
    }

    public String toString() {
        return "__Screen_Name_String_(value=" + this.ah$a + ')';
    }

    public getRawType(String str) {
        runAnimators.ag$a(str, "value");
        this.ah$a = str;
    }

    public final String ag$a() {
        return this.ah$a;
    }
}
