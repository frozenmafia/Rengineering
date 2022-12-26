package com.app.dream11.chat.viewmodels;

import com.app.dream11.chat.viewmodels.SelectedContactItemVm;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SelectedContactItemVm$onCancelClicked$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ SelectedContactItemVm this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectedContactItemVm$onCancelClicked$1(SelectedContactItemVm selectedContactItemVm) {
        super(0);
        this.this$0 = selectedContactItemVm;
    }

    @Override // o.Styleable.ArcMotion
    public final setAnimationMatrix invoke() {
        SelectedContactItemVm.SelectedContactListener handler = this.this$0.getHandler();
        if (handler == null) {
            return null;
        }
        handler.onCancelClicked(this.this$0);
        return setAnimationMatrix.ag$a;
    }
}
