package o;

import com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor;
import com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor$ag$a;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public final class BuildCompat extends setThreadStatsTag {
    private int HaptikSDK$a;
    private byte[] HaptikSDK$b;
    private byte[] HaptikSDK$c;
    private final short HaptikSDK$d;
    private int HaptikSDK$e;
    private int HaptikWebView;
    private boolean ag$a;
    private final long ah$b;
    private long getInitSettings;
    private final long getSignupData;
    private boolean invoke;
    private int valueOf;

    public BuildCompat() {
        this(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US, SilenceSkippingAudioProcessor.DEFAULT_SILENCE_THRESHOLD_LEVEL);
    }

    public BuildCompat(long j, long j2, short s) {
        FingerprintManagerCompat.toString(j2 <= j);
        this.ah$b = j;
        this.getSignupData = j2;
        this.HaptikSDK$d = s;
        this.HaptikSDK$b = getElevationDegrees.values;
        this.HaptikSDK$c = getElevationDegrees.values;
    }

    public void toString(boolean z) {
        this.ag$a = z;
    }

    public long getInitSettings() {
        return this.getInitSettings;
    }

    @Override // o.setThreadStatsTag
    public AudioProcessor$ag$a values(AudioProcessor$ag$a audioProcessor$ag$a) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioProcessor$ag$a.ah$a == 2) {
            return this.ag$a ? audioProcessor$ag$a : AudioProcessor$ag$a.valueOf;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioProcessor$ag$a);
    }

    @Override // o.setThreadStatsTag, com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor
    public boolean ah$a() {
        return this.ag$a;
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor
    public void ag$a(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !HaptikSDK$c()) {
            int i = this.HaptikWebView;
            if (i == 0) {
                HaptikSDK$a(byteBuffer);
            } else if (i == 1) {
                values(byteBuffer);
            } else if (i == 2) {
                HaptikSDK$b(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // o.setThreadStatsTag
    protected void invoke() {
        int i = this.HaptikSDK$a;
        if (i > 0) {
            ag$a(this.HaptikSDK$b, i);
        }
        if (this.invoke) {
            return;
        }
        this.getInitSettings += this.HaptikSDK$e / this.valueOf;
    }

    @Override // o.setThreadStatsTag
    protected void HaptikSDK$a() {
        if (this.ag$a) {
            this.valueOf = this.ah$a.values;
            int valueOf = valueOf(this.ah$b) * this.valueOf;
            if (this.HaptikSDK$b.length != valueOf) {
                this.HaptikSDK$b = new byte[valueOf];
            }
            int valueOf2 = valueOf(this.getSignupData) * this.valueOf;
            this.HaptikSDK$e = valueOf2;
            if (this.HaptikSDK$c.length != valueOf2) {
                this.HaptikSDK$c = new byte[valueOf2];
            }
        }
        this.HaptikWebView = 0;
        this.getInitSettings = 0L;
        this.HaptikSDK$a = 0;
        this.invoke = false;
    }

    @Override // o.setThreadStatsTag
    protected void HaptikSDK$e() {
        this.ag$a = false;
        this.HaptikSDK$e = 0;
        this.HaptikSDK$b = getElevationDegrees.values;
        this.HaptikSDK$c = getElevationDegrees.values;
    }

    private void HaptikSDK$a(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.HaptikSDK$b.length));
        int valueOf = valueOf(byteBuffer);
        if (valueOf == byteBuffer.position()) {
            this.HaptikWebView = 1;
        } else {
            byteBuffer.limit(valueOf);
            toString(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    private void values(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int ah$a = ah$a(byteBuffer);
        int position = ah$a - byteBuffer.position();
        byte[] bArr = this.HaptikSDK$b;
        int length = bArr.length;
        int i = this.HaptikSDK$a;
        int i2 = length - i;
        if (ah$a < limit && position < i2) {
            ag$a(bArr, i);
            this.HaptikSDK$a = 0;
            this.HaptikWebView = 0;
            return;
        }
        int min = Math.min(position, i2);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.HaptikSDK$b, this.HaptikSDK$a, min);
        int i3 = this.HaptikSDK$a + min;
        this.HaptikSDK$a = i3;
        byte[] bArr2 = this.HaptikSDK$b;
        if (i3 == bArr2.length) {
            if (this.invoke) {
                ag$a(bArr2, this.HaptikSDK$e);
                this.getInitSettings += (this.HaptikSDK$a - (this.HaptikSDK$e * 2)) / this.valueOf;
            } else {
                this.getInitSettings += (i3 - this.HaptikSDK$e) / this.valueOf;
            }
            toString(byteBuffer, this.HaptikSDK$b, this.HaptikSDK$a);
            this.HaptikSDK$a = 0;
            this.HaptikWebView = 2;
        }
        byteBuffer.limit(limit);
    }

    private void HaptikSDK$b(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int ah$a = ah$a(byteBuffer);
        byteBuffer.limit(ah$a);
        this.getInitSettings += byteBuffer.remaining() / this.valueOf;
        toString(byteBuffer, this.HaptikSDK$c, this.HaptikSDK$e);
        if (ah$a < limit) {
            ag$a(this.HaptikSDK$c, this.HaptikSDK$e);
            this.HaptikWebView = 0;
            byteBuffer.limit(limit);
        }
    }

    private void ag$a(byte[] bArr, int i) {
        ah$a(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.invoke = true;
        }
    }

    private void toString(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        ah$a(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.invoke = true;
        }
    }

    private void toString(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.HaptikSDK$e);
        int i2 = this.HaptikSDK$e - min;
        System.arraycopy(bArr, i - i2, this.HaptikSDK$c, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.HaptikSDK$c, i2, min);
    }

    private int valueOf(long j) {
        return (int) ((j * this.ah$a.toString) / 1000000);
    }

    private int ah$a(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.HaptikSDK$d) {
                int i = this.valueOf;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    private int valueOf(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        while (true) {
            limit -= 2;
            if (limit >= byteBuffer.position()) {
                if (Math.abs((int) byteBuffer.getShort(limit)) > this.HaptikSDK$d) {
                    int i = this.valueOf;
                    return ((limit / i) * i) + i;
                }
            } else {
                return byteBuffer.position();
            }
        }
    }
}
