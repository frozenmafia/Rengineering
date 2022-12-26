package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes3.dex */
public abstract class ViewStubCompat extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$a;
    public final View HaptikSDK$b;
    public final D11TextView HaptikSDK$c;
    public final ImageView ag$a;
    public final D11TextView ah$a;
    public final D11TextView ah$b;
    public final ImageView toString;
    @androidx.databinding.Bindable
    protected createView valueOf;
    public final androidx.cardview.widget.CardView values;

    public abstract void ah$a(createView createview);

    /* loaded from: classes3.dex */
    public class OnInflateListener extends onInflate {
        private static final SparseIntArray HaptikSDK$a;
        private static final ViewDataBinding.IncludedLayouts invoke = null;
        private long HaptikSDK$c;

        @Override // androidx.databinding.ViewDataBinding
        public boolean onFieldChange(int i, Object obj, int i2) {
            return false;
        }

        @Override // androidx.databinding.ViewDataBinding
        public boolean setVariable(int i, Object obj) {
            return true;
        }

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            HaptikSDK$a = sparseIntArray;
            sparseIntArray.put(com.app.dream11Pro.R.id.ic_quickjoin, 1);
            sparseIntArray.put(com.app.dream11Pro.R.id.quick_join_title, 2);
            sparseIntArray.put(com.app.dream11Pro.R.id.ic_info_quick_join, 3);
            sparseIntArray.put(com.app.dream11Pro.R.id.separator_quick_join_mode, 4);
            sparseIntArray.put(com.app.dream11Pro.R.id.join_with_lbl, 5);
            sparseIntArray.put(com.app.dream11Pro.R.id.team_name_tv, 6);
        }

        public OnInflateListener(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
            this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 7, invoke, HaptikSDK$a));
        }

        private OnInflateListener(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
            super(dataBindingComponent, view, 0, (androidx.cardview.widget.CardView) objArr[0], (ImageView) objArr[3], (ImageView) objArr[1], (D11TextView) objArr[5], (D11TextView) objArr[2], (View) objArr[4], (D11TextView) objArr[6]);
            this.HaptikSDK$c = -1L;
            this.ah$a.setTag(null);
            setRootTag(view);
            invalidateAll();
        }

        @Override // androidx.databinding.ViewDataBinding
        public void invalidateAll() {
            synchronized (this) {
                this.HaptikSDK$c = 1L;
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
        public void executeBindings() {
            synchronized (this) {
                this.HaptikSDK$c = 0L;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ViewStubCompat(Object obj, View view, int i, androidx.cardview.widget.CardView cardView, ImageView imageView, ImageView imageView2, D11TextView d11TextView, D11TextView d11TextView2, View view2, D11TextView d11TextView3, D11TextView d11TextView4) {
        super(obj, view, i);
        this.values = cardView;
        this.toString = imageView;
        this.ag$a = imageView2;
        this.ah$a = d11TextView;
        this.ah$b = d11TextView2;
        this.HaptikSDK$b = view2;
        this.HaptikSDK$a = d11TextView3;
        this.HaptikSDK$c = d11TextView4;
    }
}
