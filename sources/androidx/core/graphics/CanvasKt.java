package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import o.Styleable;
import o.isTransitionRequired;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class CanvasKt {
    public static final void withSave(Canvas canvas, Styleable.ChangeBounds<? super Canvas, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(canvas, "<this>");
        runAnimators.ag$a(changeBounds, "block");
        int save = canvas.save();
        try {
            changeBounds.invoke(canvas);
        } finally {
            isTransitionRequired.toString(1);
            canvas.restoreToCount(save);
            isTransitionRequired.values(1);
        }
    }

    public static /* synthetic */ void withTranslation$default(Canvas canvas, float f, float f2, Styleable.ChangeBounds changeBounds, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        runAnimators.ag$a(canvas, "<this>");
        runAnimators.ag$a(changeBounds, "block");
        int save = canvas.save();
        canvas.translate(f, f2);
        try {
            changeBounds.invoke(canvas);
        } finally {
            isTransitionRequired.toString(1);
            canvas.restoreToCount(save);
            isTransitionRequired.values(1);
        }
    }

    public static final void withTranslation(Canvas canvas, float f, float f2, Styleable.ChangeBounds<? super Canvas, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(canvas, "<this>");
        runAnimators.ag$a(changeBounds, "block");
        int save = canvas.save();
        canvas.translate(f, f2);
        try {
            changeBounds.invoke(canvas);
        } finally {
            isTransitionRequired.toString(1);
            canvas.restoreToCount(save);
            isTransitionRequired.values(1);
        }
    }

    public static /* synthetic */ void withRotation$default(Canvas canvas, float f, float f2, float f3, Styleable.ChangeBounds changeBounds, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        runAnimators.ag$a(canvas, "<this>");
        runAnimators.ag$a(changeBounds, "block");
        int save = canvas.save();
        canvas.rotate(f, f2, f3);
        try {
            changeBounds.invoke(canvas);
        } finally {
            isTransitionRequired.toString(1);
            canvas.restoreToCount(save);
            isTransitionRequired.values(1);
        }
    }

    public static final void withRotation(Canvas canvas, float f, float f2, float f3, Styleable.ChangeBounds<? super Canvas, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(canvas, "<this>");
        runAnimators.ag$a(changeBounds, "block");
        int save = canvas.save();
        canvas.rotate(f, f2, f3);
        try {
            changeBounds.invoke(canvas);
        } finally {
            isTransitionRequired.toString(1);
            canvas.restoreToCount(save);
            isTransitionRequired.values(1);
        }
    }

    public static /* synthetic */ void withScale$default(Canvas canvas, float f, float f2, float f3, float f4, Styleable.ChangeBounds changeBounds, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        runAnimators.ag$a(canvas, "<this>");
        runAnimators.ag$a(changeBounds, "block");
        int save = canvas.save();
        canvas.scale(f, f2, f3, f4);
        try {
            changeBounds.invoke(canvas);
        } finally {
            isTransitionRequired.toString(1);
            canvas.restoreToCount(save);
            isTransitionRequired.values(1);
        }
    }

    public static final void withScale(Canvas canvas, float f, float f2, float f3, float f4, Styleable.ChangeBounds<? super Canvas, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(canvas, "<this>");
        runAnimators.ag$a(changeBounds, "block");
        int save = canvas.save();
        canvas.scale(f, f2, f3, f4);
        try {
            changeBounds.invoke(canvas);
        } finally {
            isTransitionRequired.toString(1);
            canvas.restoreToCount(save);
            isTransitionRequired.values(1);
        }
    }

    public static /* synthetic */ void withSkew$default(Canvas canvas, float f, float f2, Styleable.ChangeBounds changeBounds, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        runAnimators.ag$a(canvas, "<this>");
        runAnimators.ag$a(changeBounds, "block");
        int save = canvas.save();
        canvas.skew(f, f2);
        try {
            changeBounds.invoke(canvas);
        } finally {
            isTransitionRequired.toString(1);
            canvas.restoreToCount(save);
            isTransitionRequired.values(1);
        }
    }

    public static final void withSkew(Canvas canvas, float f, float f2, Styleable.ChangeBounds<? super Canvas, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(canvas, "<this>");
        runAnimators.ag$a(changeBounds, "block");
        int save = canvas.save();
        canvas.skew(f, f2);
        try {
            changeBounds.invoke(canvas);
        } finally {
            isTransitionRequired.toString(1);
            canvas.restoreToCount(save);
            isTransitionRequired.values(1);
        }
    }

    public static /* synthetic */ void withMatrix$default(Canvas canvas, Matrix matrix, Styleable.ChangeBounds changeBounds, int i, Object obj) {
        if ((i & 1) != 0) {
            matrix = new Matrix();
        }
        runAnimators.ag$a(canvas, "<this>");
        runAnimators.ag$a(matrix, "matrix");
        runAnimators.ag$a(changeBounds, "block");
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            changeBounds.invoke(canvas);
        } finally {
            isTransitionRequired.toString(1);
            canvas.restoreToCount(save);
            isTransitionRequired.values(1);
        }
    }

    public static final void withMatrix(Canvas canvas, Matrix matrix, Styleable.ChangeBounds<? super Canvas, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(canvas, "<this>");
        runAnimators.ag$a(matrix, "matrix");
        runAnimators.ag$a(changeBounds, "block");
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            changeBounds.invoke(canvas);
        } finally {
            isTransitionRequired.toString(1);
            canvas.restoreToCount(save);
            isTransitionRequired.values(1);
        }
    }

    public static final void withClip(Canvas canvas, Rect rect, Styleable.ChangeBounds<? super Canvas, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(canvas, "<this>");
        runAnimators.ag$a(rect, "clipRect");
        runAnimators.ag$a(changeBounds, "block");
        int save = canvas.save();
        canvas.clipRect(rect);
        try {
            changeBounds.invoke(canvas);
        } finally {
            isTransitionRequired.toString(1);
            canvas.restoreToCount(save);
            isTransitionRequired.values(1);
        }
    }

    public static final void withClip(Canvas canvas, RectF rectF, Styleable.ChangeBounds<? super Canvas, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(canvas, "<this>");
        runAnimators.ag$a(rectF, "clipRect");
        runAnimators.ag$a(changeBounds, "block");
        int save = canvas.save();
        canvas.clipRect(rectF);
        try {
            changeBounds.invoke(canvas);
        } finally {
            isTransitionRequired.toString(1);
            canvas.restoreToCount(save);
            isTransitionRequired.values(1);
        }
    }

    public static final void withClip(Canvas canvas, int i, int i2, int i3, int i4, Styleable.ChangeBounds<? super Canvas, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(canvas, "<this>");
        runAnimators.ag$a(changeBounds, "block");
        int save = canvas.save();
        canvas.clipRect(i, i2, i3, i4);
        try {
            changeBounds.invoke(canvas);
        } finally {
            isTransitionRequired.toString(1);
            canvas.restoreToCount(save);
            isTransitionRequired.values(1);
        }
    }

    public static final void withClip(Canvas canvas, float f, float f2, float f3, float f4, Styleable.ChangeBounds<? super Canvas, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(canvas, "<this>");
        runAnimators.ag$a(changeBounds, "block");
        int save = canvas.save();
        canvas.clipRect(f, f2, f3, f4);
        try {
            changeBounds.invoke(canvas);
        } finally {
            isTransitionRequired.toString(1);
            canvas.restoreToCount(save);
            isTransitionRequired.values(1);
        }
    }

    public static final void withClip(Canvas canvas, Path path, Styleable.ChangeBounds<? super Canvas, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(canvas, "<this>");
        runAnimators.ag$a(path, "clipPath");
        runAnimators.ag$a(changeBounds, "block");
        int save = canvas.save();
        canvas.clipPath(path);
        try {
            changeBounds.invoke(canvas);
        } finally {
            isTransitionRequired.toString(1);
            canvas.restoreToCount(save);
            isTransitionRequired.values(1);
        }
    }
}
