package com.fancode.payment.components.fcPasses;

import android.app.Dialog;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.putStringSet;
/* loaded from: classes6.dex */
final class FCPassesBottomSheetDialog$bottomSheetDialog$2 extends Lambda implements Styleable.ArcMotion<putStringSet> {
    final /* synthetic */ FCPassesBottomSheetDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FCPassesBottomSheetDialog$bottomSheetDialog$2(FCPassesBottomSheetDialog fCPassesBottomSheetDialog) {
        super(0);
        this.this$0 = fCPassesBottomSheetDialog;
    }

    @Override // o.Styleable.ArcMotion
    public final putStringSet invoke() {
        Dialog dialog = this.this$0.getDialog();
        Objects.requireNonNull(dialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        return (putStringSet) dialog;
    }
}
