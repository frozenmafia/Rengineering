package o;

import java.util.Arrays;
/* loaded from: classes7.dex */
final class onSetInitialValue extends provideSummary {
    private final Iterable<setDialogTitle> ag$a;
    private final byte[] toString;

    private onSetInitialValue(Iterable<setDialogTitle> iterable, byte[] bArr) {
        this.ag$a = iterable;
        this.toString = bArr;
    }

    @Override // o.provideSummary
    public Iterable<setDialogTitle> ag$a() {
        return this.ag$a;
    }

    @Override // o.provideSummary
    public byte[] ah$a() {
        return this.toString;
    }

    public String toString() {
        return "BackendRequest{events=" + this.ag$a + ", extras=" + Arrays.toString(this.toString) + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof provideSummary) {
            provideSummary providesummary = (provideSummary) obj;
            if (this.ag$a.equals(providesummary.ag$a())) {
                if (Arrays.equals(this.toString, providesummary instanceof onSetInitialValue ? ((onSetInitialValue) providesummary).toString : providesummary.ah$a())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.ag$a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.toString);
    }
}
