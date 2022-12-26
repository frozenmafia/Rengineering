package o;

import com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor;
import com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor$ag$a;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public final class toUri extends setThreadStatsTag {
    private int HaptikSDK$a;
    private int HaptikSDK$b;
    private long HaptikSDK$c;
    private byte[] ag$a = getElevationDegrees.values;
    private boolean ah$b;
    private int invoke;
    private int valueOf;

    public void ag$a(int i, int i2) {
        this.HaptikSDK$a = i;
        this.invoke = i2;
    }

    public void HaptikWebView() {
        this.HaptikSDK$c = 0L;
    }

    public long HaptikSDK$d() {
        return this.HaptikSDK$c;
    }

    @Override // o.setThreadStatsTag
    public AudioProcessor$ag$a values(AudioProcessor$ag$a audioProcessor$ag$a) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioProcessor$ag$a.ah$a != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioProcessor$ag$a);
        }
        this.ah$b = true;
        return (this.HaptikSDK$a == 0 && this.invoke == 0) ? AudioProcessor$ag$a.valueOf : audioProcessor$ag$a;
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor
    public void ag$a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.HaptikSDK$b);
        this.HaptikSDK$c += min / this.ah$a.values;
        this.HaptikSDK$b -= min;
        byteBuffer.position(position + min);
        if (this.HaptikSDK$b > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.valueOf + i2) - this.ag$a.length;
        ByteBuffer ah$a = ah$a(length);
        int ah$a2 = getElevationDegrees.ah$a(length, 0, this.valueOf);
        ah$a.put(this.ag$a, 0, ah$a2);
        int ah$a3 = getElevationDegrees.ah$a(length - ah$a2, 0, i2);
        byteBuffer.limit(byteBuffer.position() + ah$a3);
        ah$a.put(byteBuffer);
        byteBuffer.limit(limit);
        int i3 = i2 - ah$a3;
        int i4 = this.valueOf - ah$a2;
        this.valueOf = i4;
        byte[] bArr = this.ag$a;
        System.arraycopy(bArr, ah$a2, bArr, 0, i4);
        byteBuffer.get(this.ag$a, this.valueOf, i3);
        this.valueOf += i3;
        ah$a.flip();
    }

    @Override // o.setThreadStatsTag, com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor
    public ByteBuffer values() {
        int i;
        if (super.valueOf() && (i = this.valueOf) > 0) {
            ah$a(i).put(this.ag$a, 0, this.valueOf).flip();
            this.valueOf = 0;
        }
        return super.values();
    }

    @Override // o.setThreadStatsTag, com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor
    public boolean valueOf() {
        return super.valueOf() && this.valueOf == 0;
    }

    @Override // o.setThreadStatsTag
    protected void invoke() {
        int i;
        if (this.ah$b) {
            if (this.valueOf > 0) {
                this.HaptikSDK$c += i / this.ah$a.values;
            }
            this.valueOf = 0;
        }
    }

    @Override // o.setThreadStatsTag
    protected void HaptikSDK$a() {
        if (this.ah$b) {
            this.ah$b = false;
            this.ag$a = new byte[this.invoke * this.ah$a.values];
            this.HaptikSDK$b = this.HaptikSDK$a * this.ah$a.values;
        }
        this.valueOf = 0;
    }

    @Override // o.setThreadStatsTag
    protected void HaptikSDK$e() {
        this.ag$a = getElevationDegrees.values;
    }
}
