package o;

import android.view.View;
import android.widget.FrameLayout;
import com.app.dream11.chat.viewmodels.BaseChatWindowVM;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.DreamRecyclerView;
import com.dream11.design.textview.D11TextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
/* loaded from: classes3.dex */
public abstract class obtainStyledAttributes extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$b;
    public final CustomTextView HaptikSDK$c;
    public final updateHomeAccessibility ag$a;
    public final FrameLayout ah$a;
    public final updateHomeAccessibility ah$b;
    public final DreamRecyclerView toString;
    @androidx.databinding.Bindable
    protected BaseChatWindowVM valueOf;
    public final FloatingActionButton values;

    public abstract void values(BaseChatWindowVM baseChatWindowVM);

    /* JADX INFO: Access modifiers changed from: protected */
    public obtainStyledAttributes(Object obj, View view, int i, updateHomeAccessibility updatehomeaccessibility, FloatingActionButton floatingActionButton, FrameLayout frameLayout, DreamRecyclerView dreamRecyclerView, updateHomeAccessibility updatehomeaccessibility2, D11TextView d11TextView, CustomTextView customTextView) {
        super(obj, view, i);
        this.ag$a = updatehomeaccessibility;
        this.values = floatingActionButton;
        this.ah$a = frameLayout;
        this.toString = dreamRecyclerView;
        this.ah$b = updatehomeaccessibility2;
        this.HaptikSDK$b = d11TextView;
        this.HaptikSDK$c = customTextView;
    }
}
