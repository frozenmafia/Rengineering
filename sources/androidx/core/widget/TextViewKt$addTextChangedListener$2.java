package androidx.core.widget;

import kotlin.jvm.internal.Lambda;
import o.captureHierarchy;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class TextViewKt$addTextChangedListener$2 extends Lambda implements captureHierarchy<CharSequence, Integer, Integer, Integer, setAnimationMatrix> {
    public static final TextViewKt$addTextChangedListener$2 INSTANCE = new TextViewKt$addTextChangedListener$2();

    public TextViewKt$addTextChangedListener$2() {
        super(4);
    }

    public final void invoke(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // o.captureHierarchy
    public /* synthetic */ setAnimationMatrix invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
        invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
        return setAnimationMatrix.ag$a;
    }
}
