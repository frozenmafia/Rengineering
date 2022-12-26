package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Picture;
import o.Styleable;
import o.isTransitionRequired;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class PictureKt {
    public static final Picture record(Picture picture, int i, int i2, Styleable.ChangeBounds<? super Canvas, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(picture, "<this>");
        runAnimators.ag$a(changeBounds, "block");
        Canvas beginRecording = picture.beginRecording(i, i2);
        runAnimators.ah$a(beginRecording, "beginRecording(width, height)");
        try {
            changeBounds.invoke(beginRecording);
            return picture;
        } finally {
            isTransitionRequired.toString(1);
            picture.endRecording();
            isTransitionRequired.values(1);
        }
    }
}
