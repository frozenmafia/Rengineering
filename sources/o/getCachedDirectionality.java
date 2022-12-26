package o;

import com.appsamurai.storyly.exoplayer2.common.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;
/* loaded from: classes3.dex */
public final class getCachedDirectionality {
    private final C$default$setContentDescription ah$a = new C$default$setContentDescription(10);

    public Metadata ag$a(getExitDir getexitdir, finishWrite$ah$a finishwrite_ah_a) throws IOException {
        Metadata metadata = null;
        int i = 0;
        while (true) {
            try {
                getexitdir.ag$a(this.ah$a.ah$a(), 0, 10);
                this.ah$a.HaptikSDK$b(0);
                if (this.ah$a.onRelationshipValidationResult() != 4801587) {
                    break;
                }
                this.ah$a.HaptikSDK$a(3);
                int ICustomTabsCallback = this.ah$a.ICustomTabsCallback();
                int i2 = ICustomTabsCallback + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.ah$a.ah$a(), 0, bArr, 0, 10);
                    getexitdir.ag$a(bArr, 10, ICustomTabsCallback);
                    metadata = new finishWrite(finishwrite_ah_a).ah$a(bArr, i2);
                } else {
                    getexitdir.ah$a(ICustomTabsCallback);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        getexitdir.valueOf();
        getexitdir.ah$a(i);
        return metadata;
    }
}
