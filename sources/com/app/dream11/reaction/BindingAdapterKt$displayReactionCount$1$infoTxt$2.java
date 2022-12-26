package com.app.dream11.reaction;

import android.content.Context;
import android.text.SpannableString;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11Pro.R;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getBStar;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class BindingAdapterKt$displayReactionCount$1$infoTxt$2 extends Lambda implements Styleable.ArcMotion<SpannableString> {
    final /* synthetic */ int $totalCount;
    final /* synthetic */ CustomTextView $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BindingAdapterKt$displayReactionCount$1$infoTxt$2(CustomTextView customTextView, int i) {
        super(0);
        this.$view = customTextView;
        this.$totalCount = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final SpannableString invoke() {
        Context context = this.$view.getContext();
        runAnimators.ah$a(context, "view.context");
        String quantityString = this.$view.getContext().getResources().getQuantityString(R.plurals.res_0x7f100027, this.$totalCount);
        runAnimators.ah$a(quantityString, "view.context.resources.g…ls.reaction, totalCount )");
        return getBStar.ag$a(context, quantityString);
    }
}
