package o;
/* loaded from: classes7.dex */
public final class writeSerializable$ah$a extends writeSerializable$ag$a {
    public final Throwable ah$a;

    public writeSerializable$ah$a(Throwable th) {
        this.ah$a = th;
    }

    public boolean equals(Object obj) {
        return (obj instanceof writeSerializable$ah$a) && runAnimators.values(this.ah$a, ((writeSerializable$ah$a) obj).ah$a);
    }

    public int hashCode() {
        Throwable th = this.ah$a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // o.writeSerializable$ag$a
    public String toString() {
        return "Closed(" + this.ah$a + ')';
    }
}
