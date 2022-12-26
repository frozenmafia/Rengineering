package o;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class printField {
    private final LinkedHashMap<Uri, byte[]> ah$a;

    public printField(final int i) {
        final int i2 = i + 1;
        this.ah$a = new LinkedHashMap<Uri, byte[]>(i2, 1.0f, false) { // from class: com.appsamurai.storyly.exoplayer2.hls.FullSegmentEncryptionKeyCache$1
            @Override // java.util.LinkedHashMap
            protected boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
                return size() > i;
            }
        };
    }

    public byte[] ag$a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.ah$a.get(uri);
    }

    public byte[] ag$a(Uri uri, byte[] bArr) {
        return this.ah$a.put((Uri) FingerprintManagerCompat.toString(uri), (byte[]) FingerprintManagerCompat.toString(bArr));
    }

    public byte[] values(Uri uri) {
        return this.ah$a.remove(FingerprintManagerCompat.toString(uri));
    }
}
