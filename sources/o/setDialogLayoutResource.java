package o;

import java.util.Arrays;
import java.util.Objects;
import o.ZipUtil;
/* loaded from: classes7.dex */
public final class setDialogLayoutResource {
    private final byte[] ag$a;
    private final ZipUtil.CentralDirectory ah$a;

    public setDialogLayoutResource(ZipUtil.CentralDirectory centralDirectory, byte[] bArr) {
        Objects.requireNonNull(centralDirectory, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.ah$a = centralDirectory;
        this.ag$a = bArr;
    }

    public ZipUtil.CentralDirectory valueOf() {
        return this.ah$a;
    }

    public byte[] values() {
        return this.ag$a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof setDialogLayoutResource) {
            setDialogLayoutResource setdialoglayoutresource = (setDialogLayoutResource) obj;
            if (this.ah$a.equals(setdialoglayoutresource.ah$a)) {
                return Arrays.equals(this.ag$a, setdialoglayoutresource.ag$a);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.ah$a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.ag$a);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.ah$a + ", bytes=[...]}";
    }
}
