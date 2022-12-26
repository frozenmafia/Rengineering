package o;

import com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor;
import com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor$ag$a;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public final class tagSocket extends setThreadStatsTag {
    private static final int valueOf = Float.floatToIntBits(Float.NaN);

    @Override // o.setThreadStatsTag
    public AudioProcessor$ag$a values(AudioProcessor$ag$a audioProcessor$ag$a) throws AudioProcessor.UnhandledAudioFormatException {
        int i = audioProcessor$ag$a.ah$a;
        if (getElevationDegrees.HaptikSDK$c(i)) {
            if (i != 4) {
                return new AudioProcessor$ag$a(audioProcessor$ag$a.toString, audioProcessor$ag$a.ag$a, 4);
            }
            return AudioProcessor$ag$a.valueOf;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioProcessor$ag$a);
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor
    public void ag$a(ByteBuffer byteBuffer) {
        ByteBuffer ah$a;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.ah$a.ah$a;
        if (i2 == 536870912) {
            ah$a = ah$a((i / 3) * 4);
            while (position < limit) {
                valueOf(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), ah$a);
                position += 3;
            }
        } else if (i2 == 805306368) {
            ah$a = ah$a(i);
            while (position < limit) {
                valueOf((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), ah$a);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        ah$a.flip();
    }

    private static void valueOf(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i * 4.656612875245797E-10d));
        if (floatToIntBits == valueOf) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }
}
