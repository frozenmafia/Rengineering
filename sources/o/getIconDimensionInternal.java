package o;

import android.content.Context;
import com.app.dream11.ui.D11BackgroundColorChip;
/* loaded from: classes3.dex */
public final class getIconDimensionInternal {
    @androidx.databinding.BindingAdapter({"chipBackground"})
    public static final void values(D11BackgroundColorChip d11BackgroundColorChip, boolean z) {
        Context context;
        if (d11BackgroundColorChip == null || (context = d11BackgroundColorChip.getContext()) == null) {
            return;
        }
        if (z) {
            d11BackgroundColorChip.setChipBackgroundColor(androidx.core.content.ContextCompat.getColorStateList(context, com.app.dream11Pro.R.color.nero_black));
            d11BackgroundColorChip.setChipStrokeColor(androidx.core.content.ContextCompat.getColorStateList(context, com.app.dream11Pro.R.color.nero_black));
            return;
        }
        d11BackgroundColorChip.setChipStrokeColor(androidx.core.content.ContextCompat.getColorStateList(context, com.app.dream11Pro.R.color.gray_12));
        d11BackgroundColorChip.setChipBackgroundColor(androidx.core.content.ContextCompat.getColorStateList(context, com.app.dream11Pro.R.color.res_0x7f0605d5));
    }

    @androidx.databinding.BindingAdapter({"chipTextColor"})
    public static final void toString(D11BackgroundColorChip d11BackgroundColorChip, boolean z) {
        Context context;
        if (d11BackgroundColorChip == null || (context = d11BackgroundColorChip.getContext()) == null) {
            return;
        }
        if (z) {
            d11BackgroundColorChip.setTextColor(androidx.core.content.ContextCompat.getColorStateList(context, com.app.dream11Pro.R.color.res_0x7f0605d5));
        } else {
            d11BackgroundColorChip.setTextColor(androidx.core.content.ContextCompat.getColorStateList(context, com.app.dream11Pro.R.color.nero_black));
        }
    }
}
