package o;

import java.io.IOException;
import java.util.Arrays;
/* loaded from: classes3.dex */
public interface dirTypeForward {
    void ag$a(createFromIcon createfromicon);

    void ah$a(C$default$setContentDescription c$default$setContentDescription, int i, int i2);

    void toString(C$default$setContentDescription c$default$setContentDescription, int i);

    int valueOf(unwrapCryptoObject unwrapcryptoobject, int i, boolean z) throws IOException;

    void valueOf(long j, int i, int i2, int i3, toString tostring);

    int values(unwrapCryptoObject unwrapcryptoobject, int i, boolean z, int i2) throws IOException;

    /* loaded from: classes3.dex */
    public static final class toString {
        public final int ag$a;
        public final int ah$a;
        public final int toString;
        public final byte[] valueOf;

        public toString(int i, byte[] bArr, int i2, int i3) {
            this.ah$a = i;
            this.valueOf = bArr;
            this.toString = i2;
            this.ag$a = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            toString tostring = (toString) obj;
            return this.ah$a == tostring.ah$a && this.toString == tostring.toString && this.ag$a == tostring.ag$a && Arrays.equals(this.valueOf, tostring.valueOf);
        }

        public int hashCode() {
            int i = this.ah$a;
            return (((((i * 31) + Arrays.hashCode(this.valueOf)) * 31) + this.toString) * 31) + this.ag$a;
        }
    }
}
