package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.app.dream11.teamselection.newcreateteamfilter.CreateTeamFilerDialogItemVM;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public abstract class sort extends androidx.databinding.ViewDataBinding {
    public final CustomTextView ag$a;
    @androidx.databinding.Bindable
    protected CreateTeamFilerDialogItemVM ah$a;
    public final CustomTextView toString;
    public final LinearLayout valueOf;
    public final ImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public sort(Object obj, View view, int i, CustomTextView customTextView, CustomTextView customTextView2, ImageView imageView, LinearLayout linearLayout) {
        super(obj, view, i);
        this.ag$a = customTextView;
        this.toString = customTextView2;
        this.values = imageView;
        this.valueOf = linearLayout;
    }
}
