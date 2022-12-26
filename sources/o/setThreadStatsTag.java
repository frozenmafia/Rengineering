package o;

import com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor;
import com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor$ag$a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes3.dex */
public abstract class setThreadStatsTag implements AudioProcessor {
    private boolean valueOf;
    private ByteBuffer ag$a = toString;
    private ByteBuffer HaptikSDK$a = toString;
    private AudioProcessor$ag$a HaptikSDK$b = AudioProcessor$ag$a.valueOf;
    private AudioProcessor$ag$a HaptikSDK$c = AudioProcessor$ag$a.valueOf;
    protected AudioProcessor$ag$a ah$a = AudioProcessor$ag$a.valueOf;
    protected AudioProcessor$ag$a values = AudioProcessor$ag$a.valueOf;

    protected void HaptikSDK$a() {
    }

    protected void HaptikSDK$e() {
    }

    protected void invoke() {
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor
    public final AudioProcessor$ag$a toString(AudioProcessor$ag$a audioProcessor$ag$a) throws AudioProcessor.UnhandledAudioFormatException {
        this.HaptikSDK$b = audioProcessor$ag$a;
        this.HaptikSDK$c = values(audioProcessor$ag$a);
        return ah$a() ? this.HaptikSDK$c : AudioProcessor$ag$a.valueOf;
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor
    public boolean ah$a() {
        return this.HaptikSDK$c != AudioProcessor$ag$a.valueOf;
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor
    public final void ah$b() {
        this.valueOf = true;
        invoke();
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor
    public ByteBuffer values() {
        ByteBuffer byteBuffer = this.HaptikSDK$a;
        this.HaptikSDK$a = toString;
        return byteBuffer;
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor
    public boolean valueOf() {
        return this.valueOf && this.HaptikSDK$a == toString;
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor
    public final void ag$a() {
        this.HaptikSDK$a = toString;
        this.valueOf = false;
        this.ah$a = this.HaptikSDK$b;
        this.values = this.HaptikSDK$c;
        HaptikSDK$a();
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor
    public final void HaptikSDK$b() {
        ag$a();
        this.ag$a = toString;
        this.HaptikSDK$b = AudioProcessor$ag$a.valueOf;
        this.HaptikSDK$c = AudioProcessor$ag$a.valueOf;
        this.ah$a = AudioProcessor$ag$a.valueOf;
        this.values = AudioProcessor$ag$a.valueOf;
        HaptikSDK$e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ByteBuffer ah$a(int i) {
        if (this.ag$a.capacity() < i) {
            this.ag$a = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.ag$a.clear();
        }
        ByteBuffer byteBuffer = this.ag$a;
        this.HaptikSDK$a = byteBuffer;
        return byteBuffer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean HaptikSDK$c() {
        return this.HaptikSDK$a.hasRemaining();
    }

    protected AudioProcessor$ag$a values(AudioProcessor$ag$a audioProcessor$ag$a) throws AudioProcessor.UnhandledAudioFormatException {
        return AudioProcessor$ag$a.valueOf;
    }
}
