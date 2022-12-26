package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import o.Styleable;
import o.captureHierarchy;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class TextViewKt$addTextChangedListener$textWatcher$1 implements TextWatcher {
    final /* synthetic */ Styleable.ChangeBounds<Editable, setAnimationMatrix> $afterTextChanged;
    final /* synthetic */ captureHierarchy<CharSequence, Integer, Integer, Integer, setAnimationMatrix> $beforeTextChanged;
    final /* synthetic */ captureHierarchy<CharSequence, Integer, Integer, Integer, setAnimationMatrix> $onTextChanged;

    /* JADX WARN: Multi-variable type inference failed */
    public TextViewKt$addTextChangedListener$textWatcher$1(Styleable.ChangeBounds<? super Editable, setAnimationMatrix> changeBounds, captureHierarchy<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, setAnimationMatrix> capturehierarchy, captureHierarchy<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, setAnimationMatrix> capturehierarchy2) {
        this.$afterTextChanged = changeBounds;
        this.$beforeTextChanged = capturehierarchy;
        this.$onTextChanged = capturehierarchy2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.$afterTextChanged.invoke(editable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.$beforeTextChanged.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.$onTextChanged.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }
}
