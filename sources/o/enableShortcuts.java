package o;

import com.app.dream11.ui.CustomRadioButton;
/* loaded from: classes3.dex */
public final class enableShortcuts {
    @androidx.databinding.BindingAdapter({"typeface"})
    public static final void valueOf(CustomRadioButton customRadioButton, String str) {
        if (customRadioButton == null || str == null) {
            return;
        }
        if (str.length() == 0) {
            return;
        }
        customRadioButton.setFont(str);
        customRadioButton.setTypeFace$app_proProdRelease();
    }
}
