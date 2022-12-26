package o;

import android.view.View;
import com.app.dream11.chat.viewmodels.ExitOrContinueGroupVM;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes3.dex */
public abstract class setTrackTintList extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected ExitOrContinueGroupVM ah$a;
    public final CustomTextView toString;
    public final CustomTextView valueOf;
    public final CustomTextView values;

    public abstract void ag$a(ExitOrContinueGroupVM exitOrContinueGroupVM);

    /* JADX INFO: Access modifiers changed from: protected */
    public setTrackTintList(Object obj, View view, int i, CustomTextView customTextView, CustomTextView customTextView2, CustomTextView customTextView3) {
        super(obj, view, i);
        this.values = customTextView;
        this.valueOf = customTextView2;
        this.toString = customTextView3;
    }
}
