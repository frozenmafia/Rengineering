package o;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import o.MediaSessionCompat;
/* loaded from: classes.dex */
public class fromQueueItemList implements MediaSessionCompat.MediaSessionImplBase.MessageHandler {
    private final sendMetadata HaptikSDK$b;
    private final Path.FillType ag$a;
    private final boolean ah$a;
    private final boolean toString;
    private final String valueOf;
    private final sendQueueTitle values;

    public fromQueueItemList(String str, boolean z, Path.FillType fillType, sendQueueTitle sendqueuetitle, sendMetadata sendmetadata, boolean z2) {
        this.valueOf = str;
        this.ah$a = z;
        this.ag$a = fillType;
        this.values = sendqueuetitle;
        this.HaptikSDK$b = sendmetadata;
        this.toString = z2;
    }

    public String ag$a() {
        return this.valueOf;
    }

    public sendQueueTitle ah$a() {
        return this.values;
    }

    public sendMetadata valueOf() {
        return this.HaptikSDK$b;
    }

    public Path.FillType values() {
        return this.ag$a;
    }

    public boolean HaptikSDK$c() {
        return this.toString;
    }

    @Override // o.MediaSessionCompat.MediaSessionImplBase.MessageHandler
    public onPlay toString(LottieDrawable lottieDrawable, MediaSessionCompat.QueueItem.Api21Impl api21Impl) {
        return new onPrepare(lottieDrawable, api21Impl, this);
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.ah$a + '}';
    }
}
