package o;

import com.airbnb.lottie.LottieDrawable;
import java.util.Arrays;
import java.util.List;
import o.MediaSessionCompat;
/* loaded from: classes.dex */
public class createQueueItem implements MediaSessionCompat.MediaSessionImplBase.MessageHandler {
    private final List<MediaSessionCompat.MediaSessionImplBase.MessageHandler> ah$a;
    private final boolean toString;
    private final String valueOf;

    public createQueueItem(String str, List<MediaSessionCompat.MediaSessionImplBase.MessageHandler> list, boolean z) {
        this.valueOf = str;
        this.ah$a = list;
        this.toString = z;
    }

    public String values() {
        return this.valueOf;
    }

    public List<MediaSessionCompat.MediaSessionImplBase.MessageHandler> valueOf() {
        return this.ah$a;
    }

    public boolean ag$a() {
        return this.toString;
    }

    @Override // o.MediaSessionCompat.MediaSessionImplBase.MessageHandler
    public onPlay toString(LottieDrawable lottieDrawable, MediaSessionCompat.QueueItem.Api21Impl api21Impl) {
        return new onPlayFromUri(lottieDrawable, api21Impl, this);
    }

    public String toString() {
        return "ShapeGroup{name='" + this.valueOf + "' Shapes: " + Arrays.toString(this.ah$a.toArray()) + '}';
    }
}
