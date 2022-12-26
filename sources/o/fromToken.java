package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import java.util.Collections;
import java.util.List;
import o.MediaSessionCompat;
/* loaded from: classes.dex */
public class fromToken extends MediaSessionCompat.QueueItem.Api21Impl {
    private final onPlayFromUri HaptikSDK$c;
    private final MediaSessionCompat.ResultReceiverWrapper ah$b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public fromToken(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.Layer layer, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) {
        super(lottieDrawable, layer);
        this.ah$b = resultReceiverWrapper;
        onPlayFromUri onplayfromuri = new onPlayFromUri(lottieDrawable, this, new createQueueItem("__container", layer.HaptikWebView(), false));
        this.HaptikSDK$c = onplayfromuri;
        onplayfromuri.valueOf(Collections.emptyList(), Collections.emptyList());
    }

    @Override // o.MediaSessionCompat.QueueItem.Api21Impl
    void ag$a(Canvas canvas, Matrix matrix, int i) {
        this.HaptikSDK$c.valueOf(canvas, matrix, i);
    }

    @Override // o.MediaSessionCompat.QueueItem.Api21Impl, o.onPrepareFromMediaId
    public void ah$a(RectF rectF, Matrix matrix, boolean z) {
        super.ah$a(rectF, matrix, z);
        this.HaptikSDK$c.ah$a(rectF, this.valueOf, z);
    }

    @Override // o.MediaSessionCompat.QueueItem.Api21Impl
    public onVolumeChanged values() {
        onVolumeChanged values = super.values();
        return values != null ? values : this.ah$b.values();
    }

    @Override // o.MediaSessionCompat.QueueItem.Api21Impl
    public getErrorCode ag$a() {
        getErrorCode ag$a = super.ag$a();
        return ag$a != null ? ag$a : this.ah$b.ag$a();
    }

    @Override // o.MediaSessionCompat.QueueItem.Api21Impl
    protected void ag$a(MediaSessionCompat.MediaSessionImplApi28 mediaSessionImplApi28, int i, List<MediaSessionCompat.MediaSessionImplApi28> list, MediaSessionCompat.MediaSessionImplApi28 mediaSessionImplApi282) {
        this.HaptikSDK$c.valueOf(mediaSessionImplApi28, i, list, mediaSessionImplApi282);
    }
}
