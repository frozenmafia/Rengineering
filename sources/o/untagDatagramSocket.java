package o;

import com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor;
import com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor$ag$a;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public final class untagDatagramSocket extends setThreadStatsTag {
    private int[] ag$a;
    private int[] valueOf;

    public void values(int[] iArr) {
        this.ag$a = iArr;
    }

    @Override // o.setThreadStatsTag
    public AudioProcessor$ag$a values(AudioProcessor$ag$a audioProcessor$ag$a) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.ag$a;
        if (iArr == null) {
            return AudioProcessor$ag$a.valueOf;
        }
        if (audioProcessor$ag$a.ah$a != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioProcessor$ag$a);
        }
        boolean z = audioProcessor$ag$a.ag$a != iArr.length;
        int i = 0;
        while (i < iArr.length) {
            int i2 = iArr[i];
            if (i2 >= audioProcessor$ag$a.ag$a) {
                throw new AudioProcessor.UnhandledAudioFormatException(audioProcessor$ag$a);
            }
            z |= i2 != i;
            i++;
        }
        if (z) {
            return new AudioProcessor$ag$a(audioProcessor$ag$a.toString, iArr.length, 2);
        }
        return AudioProcessor$ag$a.valueOf;
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor
    public void ag$a(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) FingerprintManagerCompat.toString(this.valueOf);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer ah$a = ah$a(((limit - position) / this.ah$a.values) * this.values.values);
        while (position < limit) {
            for (int i : iArr) {
                ah$a.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.ah$a.values;
        }
        byteBuffer.position(limit);
        ah$a.flip();
    }

    @Override // o.setThreadStatsTag
    protected void HaptikSDK$a() {
        this.valueOf = this.ag$a;
    }

    @Override // o.setThreadStatsTag
    protected void HaptikSDK$e() {
        this.valueOf = null;
        this.ag$a = null;
    }
}
