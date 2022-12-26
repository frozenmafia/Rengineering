package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.teamselection.playerinfo.vm.PlayerPointsInMatchVM;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public abstract class setImageDrawable extends androidx.databinding.ViewDataBinding {
    public final CustomTextView HaptikSDK$b;
    public final ImageView ag$a;
    @androidx.databinding.Bindable
    protected PlayerPointsInMatchVM ah$a;
    public final CustomTextView toString;
    public final CustomTextView valueOf;
    public final CustomTextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setImageDrawable(Object obj, View view, int i, CustomTextView customTextView, ImageView imageView, CustomTextView customTextView2, CustomTextView customTextView3, CustomTextView customTextView4) {
        super(obj, view, i);
        this.values = customTextView;
        this.ag$a = imageView;
        this.toString = customTextView2;
        this.valueOf = customTextView3;
        this.HaptikSDK$b = customTextView4;
    }
}
