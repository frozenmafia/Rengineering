package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.chat.viewmodels.ChatEmptyStateVM;
import com.app.dream11.ui.pagerAnimation.Dream11PagerAnimationView;
/* loaded from: classes2.dex */
public abstract class positionSelectorLikeTouchCompat extends androidx.databinding.ViewDataBinding {
    public final androidx.constraintlayout.widget.ConstraintLayout HaptikSDK$a;
    @androidx.databinding.Bindable
    protected ChatEmptyStateVM HaptikSDK$b;
    public final ImageView HaptikSDK$c;
    public final androidx.constraintlayout.widget.ConstraintLayout ag$a;
    public final ImageView ah$a;
    public final androidx.constraintlayout.widget.ConstraintLayout ah$b;
    public final androidx.constraintlayout.widget.Guideline toString;
    public final ImageView valueOf;
    public final Dream11PagerAnimationView values;

    public abstract void ag$a(ChatEmptyStateVM chatEmptyStateVM);

    /* JADX INFO: Access modifiers changed from: protected */
    public positionSelectorLikeTouchCompat(Object obj, View view, int i, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, Dream11PagerAnimationView dream11PagerAnimationView, androidx.constraintlayout.widget.Guideline guideline, ImageView imageView, ImageView imageView2, ImageView imageView3, androidx.constraintlayout.widget.ConstraintLayout constraintLayout2, androidx.constraintlayout.widget.ConstraintLayout constraintLayout3) {
        super(obj, view, i);
        this.ag$a = constraintLayout;
        this.values = dream11PagerAnimationView;
        this.toString = guideline;
        this.ah$a = imageView;
        this.valueOf = imageView2;
        this.HaptikSDK$c = imageView3;
        this.HaptikSDK$a = constraintLayout2;
        this.ah$b = constraintLayout3;
    }
}
