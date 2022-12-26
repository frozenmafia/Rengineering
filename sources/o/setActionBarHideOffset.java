package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.chat.viewmodels.BaseChatWindowVM;
/* loaded from: classes2.dex */
public class setActionBarHideOffset extends setHasNonEmbeddedTabs {
    private static final ViewDataBinding.IncludedLayouts ah$a = null;
    private static final SparseIntArray toString = null;
    private final ImageView ah$b;
    private final LinearLayout valueOf;
    private long values;

    public setActionBarHideOffset(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, ah$a, toString));
    }

    private setActionBarHideOffset(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1);
        this.values = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.valueOf = linearLayout;
        linearLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[1];
        this.ah$b = imageView;
        imageView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.values = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.values != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        if (263 == i) {
            ah$a((BaseChatWindowVM) obj);
            return true;
        }
        return false;
    }

    public void ah$a(BaseChatWindowVM baseChatWindowVM) {
        updateRegistration(0, baseChatWindowVM);
        this.ag$a = baseChatWindowVM;
        synchronized (this) {
            this.values |= 1;
        }
        notifyPropertyChanged(263);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return valueOf((BaseChatWindowVM) obj, i2);
    }

    private boolean valueOf(BaseChatWindowVM baseChatWindowVM, int i) {
        if (i == 0) {
            synchronized (this) {
                this.values |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.values;
            this.values = 0L;
        }
        BaseChatWindowVM baseChatWindowVM = this.ag$a;
        int i = 0;
        int i2 = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        if (i2 != 0 && baseChatWindowVM != null) {
            i = baseChatWindowVM.getEmptyStateResourceId();
        }
        if (i2 != 0) {
            addCapabilityBinding.values(this.ah$b, i);
        }
    }
}
