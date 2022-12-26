package o;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;
/* loaded from: classes3.dex */
public final class SupportMenu {
    public static void toString(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap(list.get(i)));
        }
    }

    public static void toString(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void ag$a(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    public static void values(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void ag$a(MediaFormat mediaFormat, hasBasebandCn0DbHz hasbasebandcn0dbhz) {
        if (hasbasebandcn0dbhz != null) {
            toString(mediaFormat, "color-transfer", hasbasebandcn0dbhz.ah$a);
            toString(mediaFormat, "color-standard", hasbasebandcn0dbhz.ag$a);
            toString(mediaFormat, "color-range", hasbasebandcn0dbhz.toString);
            values(mediaFormat, "hdr-static-info", hasbasebandcn0dbhz.values);
        }
    }
}
