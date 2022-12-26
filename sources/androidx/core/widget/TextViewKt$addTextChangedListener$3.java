package androidx.core.widget;

import android.text.Editable;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class TextViewKt$addTextChangedListener$3 extends Lambda implements Styleable.ChangeBounds<Editable, setAnimationMatrix> {
    public static final TextViewKt$addTextChangedListener$3 INSTANCE = new TextViewKt$addTextChangedListener$3();

    public TextViewKt$addTextChangedListener$3() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Editable editable) {
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Editable editable) {
        invoke2(editable);
        return setAnimationMatrix.ag$a;
    }
}
