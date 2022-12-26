package com.dreampay.commons;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.Glide;
import com.dreampay.commons.constants.Constants;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class DreamPayLogo extends AppCompatImageView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DreamPayLogo(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        loadImage(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DreamPayLogo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        loadImage(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DreamPayLogo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        runAnimators.ag$a(context, "context");
        loadImage(context);
    }

    private final void loadImage(Context context) {
        Glide.valueOf(context).valueOf(runAnimators.values("https://www.dreampay.tech/public/imgs/dp2x.png?t=", (Object) Constants.INSTANCE.getCURRENT_DATE())).ag$a(this);
    }
}
