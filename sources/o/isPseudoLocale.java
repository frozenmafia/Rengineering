package o;

import com.appsamurai.storyly.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public final class isPseudoLocale {
    private boolean toString;
    private long valueOf;
    private long values;

    public void valueOf() {
        this.values = 0L;
        this.valueOf = 0L;
        this.toString = false;
    }

    public long toString(createFromIcon createfromicon, DecoderInputBuffer decoderInputBuffer) {
        if (this.valueOf == 0) {
            this.values = decoderInputBuffer.values;
        }
        if (this.toString) {
            return decoderInputBuffer.values;
        }
        ByteBuffer byteBuffer = (ByteBuffer) FingerprintManagerCompat.toString(decoderInputBuffer.toString);
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i = (i << 8) | (byteBuffer.get(i2) & 255);
        }
        int values = SubscriptionManagerCompat.values(i);
        if (values == -1) {
            this.toString = true;
            this.valueOf = 0L;
            this.values = decoderInputBuffer.values;
            SupportMenuItem.toString("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return decoderInputBuffer.values;
        }
        long ispseudolocale = toString(createfromicon.onMessageChannelReady);
        this.valueOf += values;
        return ispseudolocale;
    }

    public long ah$a(createFromIcon createfromicon) {
        return toString(createfromicon.onMessageChannelReady);
    }

    private long toString(long j) {
        return this.values + Math.max(0L, ((this.valueOf - 529) * 1000000) / j);
    }
}
