package androidx.core.content;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.exifinterface.media.ExifInterface;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes5.dex */
public final class ContextKt {
    public static final /* synthetic */ <T> T getSystemService(Context context) {
        runAnimators.ag$a(context, "<this>");
        runAnimators.values(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) ContextCompat.getSystemService(context, Object.class);
    }

    public static /* synthetic */ void withStyledAttributes$default(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, Styleable.ChangeBounds changeBounds, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            attributeSet = null;
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        runAnimators.ag$a(context, "<this>");
        runAnimators.ag$a(iArr, "attrs");
        runAnimators.ag$a(changeBounds, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        runAnimators.ah$a(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        changeBounds.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static final void withStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, Styleable.ChangeBounds<? super TypedArray, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(context, "<this>");
        runAnimators.ag$a(iArr, "attrs");
        runAnimators.ag$a(changeBounds, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        runAnimators.ah$a(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        changeBounds.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static final void withStyledAttributes(Context context, int i, int[] iArr, Styleable.ChangeBounds<? super TypedArray, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(context, "<this>");
        runAnimators.ag$a(iArr, "attrs");
        runAnimators.ag$a(changeBounds, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, iArr);
        runAnimators.ah$a(obtainStyledAttributes, "obtainStyledAttributes(resourceId, attrs)");
        changeBounds.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}
