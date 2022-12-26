package o;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
/* loaded from: classes4.dex */
public class onStartIntentSenderFromFragment extends onRequestPermissionsFromFragment {
    public onStartIntentSenderFromFragment(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
    }

    @Override // o.onRequestPermissionsFromFragment, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("RoundedNinePatchDrawable#draw");
        }
        if (!values()) {
            super.draw(canvas);
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
                return;
            }
            return;
        }
        ag$a();
        valueOf();
        canvas.clipPath(this.HaptikWebView);
        super.draw(canvas);
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
    }
}
