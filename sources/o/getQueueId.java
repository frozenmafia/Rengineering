package o;

import com.airbnb.lottie.LottieDrawable;
import o.MediaSessionCompat;
/* loaded from: classes.dex */
public class getQueueId implements MediaSessionCompat.MediaSessionImplBase.MessageHandler {
    private final MediaSessionCompat.MediaSessionImplBase.AnonymousClass1<Float, Float> ah$a;
    private final String valueOf;

    public getQueueId(String str, MediaSessionCompat.MediaSessionImplBase.AnonymousClass1<Float, Float> anonymousClass1) {
        this.valueOf = str;
        this.ah$a = anonymousClass1;
    }

    public String ah$a() {
        return this.valueOf;
    }

    public MediaSessionCompat.MediaSessionImplBase.AnonymousClass1<Float, Float> valueOf() {
        return this.ah$a;
    }

    @Override // o.MediaSessionCompat.MediaSessionImplBase.MessageHandler
    public onPlay toString(LottieDrawable lottieDrawable, MediaSessionCompat.QueueItem.Api21Impl api21Impl) {
        return new onSetShuffleMode(lottieDrawable, api21Impl, this);
    }
}
