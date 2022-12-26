package androidx.core.graphics;

import android.graphics.Matrix;
import android.graphics.Shader;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class ShaderKt {
    public static final void transform(Shader shader, Styleable.ChangeBounds<? super Matrix, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(shader, "<this>");
        runAnimators.ag$a(changeBounds, "block");
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        changeBounds.invoke(matrix);
        shader.setLocalMatrix(matrix);
    }
}
