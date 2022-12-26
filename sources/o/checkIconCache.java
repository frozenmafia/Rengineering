package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public class checkIconCache extends getActivityIcon {
    private static final ViewDataBinding.IncludedLayouts HaptikSDK$a = null;
    private static final SparseIntArray ah$b;
    private final RelativeLayout HaptikSDK$b;
    private long HaptikSDK$c;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ah$b = sparseIntArray;
        sparseIntArray.put(com.app.dream11Pro.R.id.logo_txn_stmt_emailed, 2);
        sparseIntArray.put(com.app.dream11Pro.R.id.text_txn_email_success, 3);
        sparseIntArray.put(com.app.dream11Pro.R.id.action_txn_stmt_my_account, 4);
    }

    public checkIconCache(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, HaptikSDK$a, ah$b));
    }

    private checkIconCache(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CustomTextView) objArr[4], (ImageView) objArr[2], (CustomTextView) objArr[3], (CustomTextView) objArr[1]);
        this.HaptikSDK$c = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.HaptikSDK$b = relativeLayout;
        relativeLayout.setTag(null);
        this.ag$a.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.HaptikSDK$c = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.HaptikSDK$c != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        if (79 == i) {
            toString((String) obj);
            return true;
        }
        return false;
    }

    @Override // o.getActivityIcon
    public void toString(String str) {
        this.valueOf = str;
        synchronized (this) {
            this.HaptikSDK$c |= 1;
        }
        notifyPropertyChanged(79);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.HaptikSDK$c;
            this.HaptikSDK$c = 0L;
        }
        String str = this.valueOf;
        if ((j & 3) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.ag$a, str);
        }
    }
}
