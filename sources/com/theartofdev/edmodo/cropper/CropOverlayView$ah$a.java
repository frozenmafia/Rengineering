package com.theartofdev.edmodo.cropper;

import android.graphics.RectF;
import android.view.ScaleGestureDetector;
import o.decryptKey;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class CropOverlayView$ah$a extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    final /* synthetic */ CropOverlayView ah$a;

    private CropOverlayView$ah$a(CropOverlayView cropOverlayView) {
        this.ah$a = cropOverlayView;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        decryptKey decryptkey;
        decryptKey decryptkey2;
        decryptKey decryptkey3;
        decryptKey decryptkey4;
        decryptkey = this.ah$a.getSignupData;
        RectF HaptikSDK$c = decryptkey.HaptikSDK$c();
        float focusX = scaleGestureDetector.getFocusX();
        float focusY = scaleGestureDetector.getFocusY();
        float currentSpanY = scaleGestureDetector.getCurrentSpanY() / 2.0f;
        float currentSpanX = scaleGestureDetector.getCurrentSpanX() / 2.0f;
        float f = focusY - currentSpanY;
        float f2 = focusX - currentSpanX;
        float f3 = focusX + currentSpanX;
        float f4 = focusY + currentSpanY;
        if (f2 >= f3 || f > f4 || f2 < 0.0f) {
            return true;
        }
        decryptkey2 = this.ah$a.getSignupData;
        if (f3 > decryptkey2.ah$a() || f < 0.0f) {
            return true;
        }
        decryptkey3 = this.ah$a.getSignupData;
        if (f4 <= decryptkey3.valueOf()) {
            HaptikSDK$c.set(f2, f, f3, f4);
            decryptkey4 = this.ah$a.getSignupData;
            decryptkey4.ah$a(HaptikSDK$c);
            this.ah$a.invalidate();
            return true;
        }
        return true;
    }
}
