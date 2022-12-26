package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import o.MediaSessionCompat;
/* loaded from: classes.dex */
public class equals extends MediaSessionCompat.QueueItem.Api21Impl {
    @Override // o.MediaSessionCompat.QueueItem.Api21Impl
    void ag$a(Canvas canvas, Matrix matrix, int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public equals(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.Layer layer) {
        super(lottieDrawable, layer);
    }

    @Override // o.MediaSessionCompat.QueueItem.Api21Impl, o.onPrepareFromMediaId
    public void ah$a(RectF rectF, Matrix matrix, boolean z) {
        super.ah$a(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
