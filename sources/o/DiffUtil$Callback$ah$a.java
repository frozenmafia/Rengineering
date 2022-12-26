package o;

import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.util.Arrays;
/* loaded from: classes7.dex */
public final class DiffUtil$Callback$ah$a<P> {
    private final P ag$a;
    private final int ah$a;
    private final KeyStatusType toString;
    private final byte[] valueOf;
    private final OutputPrefixType values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DiffUtil$Callback$ah$a(P p, byte[] bArr, KeyStatusType keyStatusType, OutputPrefixType outputPrefixType, int i) {
        this.ag$a = p;
        this.valueOf = Arrays.copyOf(bArr, bArr.length);
        this.toString = keyStatusType;
        this.values = outputPrefixType;
        this.ah$a = i;
    }

    public P valueOf() {
        return this.ag$a;
    }

    public KeyStatusType ag$a() {
        return this.toString;
    }

    public OutputPrefixType ah$a() {
        return this.values;
    }

    public final byte[] values() {
        byte[] bArr = this.valueOf;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
