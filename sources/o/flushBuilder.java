package o;

import java.util.List;
import o.readText;
/* loaded from: classes3.dex */
public final class flushBuilder extends readBytes {
    private final ObjectsCompat valueOf;

    public flushBuilder(List<byte[]> list) {
        super("DvbDecoder");
        C$default$setContentDescription c$default$setContentDescription = new C$default$setContentDescription(list.get(0));
        this.valueOf = new ObjectsCompat(c$default$setContentDescription.ICustomTabsCallback$Default(), c$default$setContentDescription.ICustomTabsCallback$Default());
    }

    @Override // o.readBytes
    protected readText.Cdefault valueOf(byte[] bArr, int i, boolean z) {
        if (z) {
            this.valueOf.valueOf();
        }
        return new PairKt(this.valueOf.ah$a(bArr, i));
    }
}
