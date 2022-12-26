package com.app.dream11.ui.picker;

import com.app.dream11.ui.picker.PickerModel;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class PickerModel$onItemClick$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ PickerModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickerModel$onItemClick$1(PickerModel pickerModel) {
        super(0);
        this.this$0 = pickerModel;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PickerModel.valueOf listener = this.this$0.getListener();
        if (listener == null) {
            return;
        }
        listener.valueOf(this.this$0);
    }
}
