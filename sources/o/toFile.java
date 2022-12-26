package o;

import com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor;
import com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor$ag$a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
/* loaded from: classes3.dex */
public final class toFile implements AudioProcessor {
    private ByteBuffer HaptikSDK$b;
    private long HaptikSDK$c;
    private ShortBuffer HaptikSDK$d;
    private isAtLeastN HaptikSDK$e;
    private ByteBuffer ag$a;
    private long ah$a;
    private int getInitSettings;
    private boolean getSignupData;
    private boolean values;
    private float ak = 1.0f;
    private float HaptikWebView = 1.0f;
    private AudioProcessor$ag$a invoke = AudioProcessor$ag$a.valueOf;
    private AudioProcessor$ag$a HaptikSDK$a = AudioProcessor$ag$a.valueOf;
    private AudioProcessor$ag$a valueOf = AudioProcessor$ag$a.valueOf;
    private AudioProcessor$ag$a ah$b = AudioProcessor$ag$a.valueOf;

    public toFile() {
        ByteBuffer byteBuffer = toString;
        this.ag$a = byteBuffer;
        this.HaptikSDK$d = byteBuffer.asShortBuffer();
        this.HaptikSDK$b = toString;
        this.getInitSettings = -1;
    }

    public void values(float f) {
        if (this.ak != f) {
            this.ak = f;
            this.getSignupData = true;
        }
    }

    public void toString(float f) {
        if (this.HaptikWebView != f) {
            this.HaptikWebView = f;
            this.getSignupData = true;
        }
    }

    public long valueOf(long j) {
        if (this.HaptikSDK$c >= android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            long values = this.ah$a - ((isAtLeastN) FingerprintManagerCompat.toString(this.HaptikSDK$e)).values();
            if (this.ah$b.toString == this.valueOf.toString) {
                return getElevationDegrees.ag$a(j, values, this.HaptikSDK$c);
            }
            return getElevationDegrees.ag$a(j, values * this.ah$b.toString, this.HaptikSDK$c * this.valueOf.toString);
        }
        return (long) (this.ak * j);
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor
    public AudioProcessor$ag$a toString(AudioProcessor$ag$a audioProcessor$ag$a) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioProcessor$ag$a.ah$a != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioProcessor$ag$a);
        }
        int i = this.getInitSettings;
        if (i == -1) {
            i = audioProcessor$ag$a.toString;
        }
        this.invoke = audioProcessor$ag$a;
        AudioProcessor$ag$a audioProcessor$ag$a2 = new AudioProcessor$ag$a(i, audioProcessor$ag$a.ag$a, 2);
        this.HaptikSDK$a = audioProcessor$ag$a2;
        this.getSignupData = true;
        return audioProcessor$ag$a2;
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor
    public boolean ah$a() {
        return this.HaptikSDK$a.toString != -1 && (Math.abs(this.ak - 1.0f) >= 1.0E-4f || Math.abs(this.HaptikWebView - 1.0f) >= 1.0E-4f || this.HaptikSDK$a.toString != this.invoke.toString);
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor
    public void ag$a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.ah$a += remaining;
            ((isAtLeastN) FingerprintManagerCompat.toString(this.HaptikSDK$e)).values(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor
    public void ah$b() {
        isAtLeastN isatleastn = this.HaptikSDK$e;
        if (isatleastn != null) {
            isatleastn.ag$a();
        }
        this.values = true;
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor
    public ByteBuffer values() {
        int valueOf;
        isAtLeastN isatleastn = this.HaptikSDK$e;
        if (isatleastn != null && (valueOf = isatleastn.valueOf()) > 0) {
            if (this.ag$a.capacity() < valueOf) {
                ByteBuffer order = ByteBuffer.allocateDirect(valueOf).order(ByteOrder.nativeOrder());
                this.ag$a = order;
                this.HaptikSDK$d = order.asShortBuffer();
            } else {
                this.ag$a.clear();
                this.HaptikSDK$d.clear();
            }
            isatleastn.toString(this.HaptikSDK$d);
            this.HaptikSDK$c += valueOf;
            this.ag$a.limit(valueOf);
            this.HaptikSDK$b = this.ag$a;
        }
        ByteBuffer byteBuffer = this.HaptikSDK$b;
        this.HaptikSDK$b = toString;
        return byteBuffer;
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor
    public boolean valueOf() {
        isAtLeastN isatleastn;
        return this.values && ((isatleastn = this.HaptikSDK$e) == null || isatleastn.valueOf() == 0);
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor
    public void ag$a() {
        if (ah$a()) {
            AudioProcessor$ag$a audioProcessor$ag$a = this.invoke;
            this.valueOf = audioProcessor$ag$a;
            this.ah$b = this.HaptikSDK$a;
            if (this.getSignupData) {
                this.HaptikSDK$e = new isAtLeastN(audioProcessor$ag$a.toString, this.valueOf.ag$a, this.ak, this.HaptikWebView, this.ah$b.toString);
            } else {
                isAtLeastN isatleastn = this.HaptikSDK$e;
                if (isatleastn != null) {
                    isatleastn.ah$a();
                }
            }
        }
        this.HaptikSDK$b = toString;
        this.ah$a = 0L;
        this.HaptikSDK$c = 0L;
        this.values = false;
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.audio.AudioProcessor
    public void HaptikSDK$b() {
        this.ak = 1.0f;
        this.HaptikWebView = 1.0f;
        this.invoke = AudioProcessor$ag$a.valueOf;
        this.HaptikSDK$a = AudioProcessor$ag$a.valueOf;
        this.valueOf = AudioProcessor$ag$a.valueOf;
        this.ah$b = AudioProcessor$ag$a.valueOf;
        ByteBuffer byteBuffer = toString;
        this.ag$a = byteBuffer;
        this.HaptikSDK$d = byteBuffer.asShortBuffer();
        this.HaptikSDK$b = toString;
        this.getInitSettings = -1;
        this.getSignupData = false;
        this.HaptikSDK$e = null;
        this.ah$a = 0L;
        this.HaptikSDK$c = 0L;
        this.values = false;
    }
}
