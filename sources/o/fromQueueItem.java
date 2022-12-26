package o;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import o.MediaSessionCompat;
/* loaded from: classes.dex */
public class fromQueueItem implements MediaSessionCompat.MediaSessionImplBase.MessageHandler {
    private final sendExtras ag$a;
    private final MediaSessionCompat.MediaSessionImplBase.AnonymousClass1<PointF, PointF> ah$a;
    private final String toString;
    private final MediaSessionCompat.MediaSessionImplBase.AnonymousClass1<PointF, PointF> valueOf;
    private final boolean values;

    public fromQueueItem(String str, MediaSessionCompat.MediaSessionImplBase.AnonymousClass1<PointF, PointF> anonymousClass1, MediaSessionCompat.MediaSessionImplBase.AnonymousClass1<PointF, PointF> anonymousClass12, sendExtras sendextras, boolean z) {
        this.toString = str;
        this.ah$a = anonymousClass1;
        this.valueOf = anonymousClass12;
        this.ag$a = sendextras;
        this.values = z;
    }

    public String values() {
        return this.toString;
    }

    public sendExtras ag$a() {
        return this.ag$a;
    }

    public MediaSessionCompat.MediaSessionImplBase.AnonymousClass1<PointF, PointF> ah$a() {
        return this.valueOf;
    }

    public MediaSessionCompat.MediaSessionImplBase.AnonymousClass1<PointF, PointF> valueOf() {
        return this.ah$a;
    }

    public boolean HaptikSDK$c() {
        return this.values;
    }

    @Override // o.MediaSessionCompat.MediaSessionImplBase.MessageHandler
    public onPlay toString(LottieDrawable lottieDrawable, MediaSessionCompat.QueueItem.Api21Impl api21Impl) {
        return new onSetPlaybackSpeed(lottieDrawable, api21Impl, this);
    }

    public String toString() {
        return "RectangleShape{position=" + this.ah$a + ", size=" + this.valueOf + '}';
    }
}
