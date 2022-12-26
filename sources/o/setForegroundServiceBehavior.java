package o;

import com.app.dream11.chat.models.FullScreenImagePreviewData;
/* loaded from: classes3.dex */
public final class setForegroundServiceBehavior extends androidx.databinding.BaseObservable {
    private FullScreenImagePreviewData ag$a;

    public setForegroundServiceBehavior(FullScreenImagePreviewData fullScreenImagePreviewData) {
        runAnimators.ag$a(fullScreenImagePreviewData, "imagePreviewData");
        this.ag$a = fullScreenImagePreviewData;
    }

    public final FullScreenImagePreviewData valueOf() {
        return this.ag$a;
    }
}
