package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import com.facebook.shimmer.ShimmerFrameLayout;
import o.ArchTaskExecutor;
/* loaded from: classes3.dex */
public class newThread extends ArchTaskExecutor.AnonymousClass2 {
    private static final SparseIntArray HaptikSDK$a;
    private static final ViewDataBinding.IncludedLayouts invoke = null;
    private long HaptikSDK$c;
    private final ShimmerFrameLayout ah$b;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        HaptikSDK$a = sparseIntArray;
        sparseIntArray.put(com.app.dream11Pro.R.id.imgLeftFlag, 1);
        sparseIntArray.put(com.app.dream11Pro.R.id.team1, 2);
        sparseIntArray.put(com.app.dream11Pro.R.id.team2, 3);
        sparseIntArray.put(com.app.dream11Pro.R.id.imgLeftFlag2, 4);
    }

    public newThread(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, invoke, HaptikSDK$a));
    }

    private newThread(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[1], (ImageView) objArr[4], (View) objArr[2], (View) objArr[3]);
        this.HaptikSDK$c = -1L;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) objArr[0];
        this.ah$b = shimmerFrameLayout;
        shimmerFrameLayout.setTag(null);
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
        if (177 == i) {
            toString((Boolean) obj);
            return true;
        }
        return false;
    }

    @Override // o.ArchTaskExecutor.AnonymousClass2
    public void toString(Boolean bool) {
        this.toString = bool;
        synchronized (this) {
            this.HaptikSDK$c |= 1;
        }
        notifyPropertyChanged(177);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.HaptikSDK$c;
            this.HaptikSDK$c = 0L;
        }
        Boolean bool = this.toString;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        boolean safeUnbox = i != 0 ? androidx.databinding.ViewDataBinding.safeUnbox(bool) : false;
        if (i != 0) {
            addCapabilityBinding.ah$a(this.ah$b, safeUnbox);
            addCapabilityBinding.valueOf(this.ah$b, bool);
        }
    }
}
