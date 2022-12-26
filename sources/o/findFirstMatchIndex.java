package o;

import com.appsamurai.storyly.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public final class findFirstMatchIndex extends DecoderInputBuffer {
    private int HaptikSDK$b;
    private int HaptikSDK$c;
    private long ah$b;

    public findFirstMatchIndex() {
        super(2);
        this.HaptikSDK$b = 32;
    }

    @Override // com.appsamurai.storyly.exoplayer2.decoder.DecoderInputBuffer, o.get_splashScreenView
    public void values() {
        super.values();
        this.HaptikSDK$c = 0;
    }

    public void valueOf(int i) {
        FingerprintManagerCompat.toString(i > 0);
        this.HaptikSDK$b = i;
    }

    public long ag$a() {
        return this.values;
    }

    public long valueOf() {
        return this.ah$b;
    }

    public int ah$a() {
        return this.HaptikSDK$c;
    }

    public boolean HaptikSDK$a() {
        return this.HaptikSDK$c > 0;
    }

    public boolean toString(DecoderInputBuffer decoderInputBuffer) {
        FingerprintManagerCompat.toString(!decoderInputBuffer.HaptikWebView());
        FingerprintManagerCompat.toString(!decoderInputBuffer.ah$b());
        FingerprintManagerCompat.toString(!decoderInputBuffer.invoke());
        if (values(decoderInputBuffer)) {
            int i = this.HaptikSDK$c;
            this.HaptikSDK$c = i + 1;
            if (i == 0) {
                this.values = decoderInputBuffer.values;
                if (decoderInputBuffer.HaptikSDK$e()) {
                    HaptikSDK$b(1);
                }
            }
            if (decoderInputBuffer.HaptikSDK$b()) {
                HaptikSDK$b(Integer.MIN_VALUE);
            }
            ByteBuffer byteBuffer = decoderInputBuffer.toString;
            if (byteBuffer != null) {
                toString(byteBuffer.remaining());
                this.toString.put(byteBuffer);
            }
            this.ah$b = decoderInputBuffer.values;
            return true;
        }
        return false;
    }

    private boolean values(DecoderInputBuffer decoderInputBuffer) {
        if (HaptikSDK$a()) {
            if (this.HaptikSDK$c < this.HaptikSDK$b && decoderInputBuffer.HaptikSDK$b() == HaptikSDK$b()) {
                ByteBuffer byteBuffer = decoderInputBuffer.toString;
                return byteBuffer == null || this.toString == null || this.toString.position() + byteBuffer.remaining() <= 3072000;
            }
            return false;
        }
        return true;
    }
}
