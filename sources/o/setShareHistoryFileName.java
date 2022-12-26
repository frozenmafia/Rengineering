package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.app.dream11.chat.groupshare.model.SelectGroupVM;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.DreamRecyclerView;
/* loaded from: classes2.dex */
public abstract class setShareHistoryFileName extends androidx.databinding.ViewDataBinding {
    public final ProgressBar HaptikSDK$a;
    public final DreamRecyclerView HaptikSDK$b;
    public final CustomTextView HaptikSDK$c;
    public final CustomTextView HaptikSDK$d;
    public final LinearLayout HaptikSDK$e;
    public final ImageView ag$a;
    public final androidx.constraintlayout.widget.ConstraintLayout ah$a;
    public final androidx.appcompat.widget.Toolbar ah$b;
    public final CustomTextView invoke;
    public final updateIntent toString;
    public final ImageView valueOf;
    @androidx.databinding.Bindable
    protected SelectGroupVM values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setShareHistoryFileName(Object obj, View view, int i, updateIntent updateintent, ImageView imageView, ImageView imageView2, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, ProgressBar progressBar, DreamRecyclerView dreamRecyclerView, androidx.appcompat.widget.Toolbar toolbar, CustomTextView customTextView, CustomTextView customTextView2, CustomTextView customTextView3, LinearLayout linearLayout) {
        super(obj, view, i);
        this.toString = updateintent;
        this.ag$a = imageView;
        this.valueOf = imageView2;
        this.ah$a = constraintLayout;
        this.HaptikSDK$a = progressBar;
        this.HaptikSDK$b = dreamRecyclerView;
        this.ah$b = toolbar;
        this.HaptikSDK$c = customTextView;
        this.invoke = customTextView2;
        this.HaptikSDK$d = customTextView3;
        this.HaptikSDK$e = linearLayout;
    }
}
