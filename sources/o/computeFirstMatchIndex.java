package o;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public interface computeFirstMatchIndex {

    /* loaded from: classes3.dex */
    public interface values {
        void ah$a(computeFirstMatchIndex computefirstmatchindex, long j, long j2);
    }

    void HaptikSDK$c();

    int ag$a();

    ByteBuffer ag$a(int i);

    void ag$a(int i, int i2, int i3, long j, int i4);

    MediaFormat ah$a();

    ByteBuffer ah$a(int i);

    void ah$a(int i, long j);

    void toString(values valuesVar, Handler handler);

    int valueOf(MediaCodec.BufferInfo bufferInfo);

    void valueOf();

    void valueOf(int i);

    void valueOf(int i, int i2, getIconView geticonview, long j, int i3);

    void valueOf(int i, boolean z);

    void valueOf(Bundle bundle);

    void valueOf(Surface surface);

    boolean values();

    /* loaded from: classes3.dex */
    public static final class toString {
        public final Surface HaptikSDK$a;
        public final MediaCrypto ag$a;
        public final MessageCompat ah$a;
        public final createFromIcon toString;
        public final int valueOf;
        public final MediaFormat values;

        public static toString toString(MessageCompat messageCompat, MediaFormat mediaFormat, createFromIcon createfromicon, MediaCrypto mediaCrypto) {
            return new toString(messageCompat, mediaFormat, createfromicon, null, mediaCrypto, 0);
        }

        public static toString ah$a(MessageCompat messageCompat, MediaFormat mediaFormat, createFromIcon createfromicon, Surface surface, MediaCrypto mediaCrypto) {
            return new toString(messageCompat, mediaFormat, createfromicon, surface, mediaCrypto, 0);
        }

        private toString(MessageCompat messageCompat, MediaFormat mediaFormat, createFromIcon createfromicon, Surface surface, MediaCrypto mediaCrypto, int i) {
            this.ah$a = messageCompat;
            this.values = mediaFormat;
            this.toString = createfromicon;
            this.HaptikSDK$a = surface;
            this.ag$a = mediaCrypto;
            this.valueOf = i;
        }
    }
}
