package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.model.PlayerPointsDetailItem;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes3.dex */
public class initMenuView extends startAnimation {
    private static final ViewDataBinding.IncludedLayouts ah$a = null;
    private static final SparseIntArray ah$b = null;
    private final LinearLayout HaptikSDK$a;
    private long HaptikSDK$b;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public initMenuView(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 4, ah$a, ah$b));
    }

    private initMenuView(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CustomTextView) objArr[2], (CustomTextView) objArr[1], (CustomTextView) objArr[3]);
        this.HaptikSDK$b = -1L;
        this.valueOf.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.HaptikSDK$a = linearLayout;
        linearLayout.setTag(null);
        this.toString.setTag(null);
        this.values.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.HaptikSDK$b = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.HaptikSDK$b != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        if (263 == i) {
            toString((PlayerPointsDetailItem) obj);
            return true;
        }
        return false;
    }

    public void toString(PlayerPointsDetailItem playerPointsDetailItem) {
        this.ag$a = playerPointsDetailItem;
        synchronized (this) {
            this.HaptikSDK$b |= 1;
        }
        notifyPropertyChanged(263);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        String str;
        String str2;
        synchronized (this) {
            j = this.HaptikSDK$b;
            this.HaptikSDK$b = 0L;
        }
        PlayerPointsDetailItem playerPointsDetailItem = this.ag$a;
        String str3 = null;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        if (i == 0 || playerPointsDetailItem == null) {
            str = null;
            str2 = null;
        } else {
            String title = playerPointsDetailItem.getTitle();
            str2 = playerPointsDetailItem.getValue();
            str = title;
            str3 = playerPointsDetailItem.getActual();
        }
        if (i != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.valueOf, str3);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.toString, str);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.values, str2);
        }
    }
}
