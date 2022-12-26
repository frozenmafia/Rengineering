package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.ui.CustomRadioButton;
import com.app.dream11.ui.DreamRecyclerView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class isLandscapeMode extends androidx.databinding.ViewDataBinding {
    public final DreamRecyclerView HaptikSDK$a;
    public final D11TextView HaptikSDK$c;
    public final CustomRadioButton ag$a;
    @androidx.databinding.Bindable
    protected getExtrasWithoutDuplicateData ah$a;
    public final D11TextView ah$b;
    public final androidx.appcompat.widget.Toolbar toString;
    public final CustomRadioButton valueOf;
    public final ImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public isLandscapeMode(Object obj, View view, int i, ImageView imageView, androidx.appcompat.widget.Toolbar toolbar, CustomRadioButton customRadioButton, CustomRadioButton customRadioButton2, DreamRecyclerView dreamRecyclerView, D11TextView d11TextView, D11TextView d11TextView2) {
        super(obj, view, i);
        this.values = imageView;
        this.toString = toolbar;
        this.ag$a = customRadioButton;
        this.valueOf = customRadioButton2;
        this.HaptikSDK$a = dreamRecyclerView;
        this.HaptikSDK$c = d11TextView;
        this.ah$b = d11TextView2;
    }
}
