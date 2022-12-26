package o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.facebook.shimmer.ShimmerFrameLayout;
/* loaded from: classes3.dex */
public abstract class DefaultTaskExecutor extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected Boolean ag$a;
    public final ShimmerFrameLayout toString;

    public abstract void values(Boolean bool);

    /* renamed from: o.DefaultTaskExecutor$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 extends DefaultTaskExecutor {
        private static final SparseIntArray valueOf = null;
        private static final ViewDataBinding.IncludedLayouts values = null;
        private long ah$a;

        @Override // androidx.databinding.ViewDataBinding
        public boolean onFieldChange(int i, Object obj, int i2) {
            return false;
        }

        public AnonymousClass1(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
            this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, values, valueOf));
        }

        private AnonymousClass1(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
            super(dataBindingComponent, view, 0, (ShimmerFrameLayout) objArr[0]);
            this.ah$a = -1L;
            this.toString.setTag(null);
            setRootTag(view);
            invalidateAll();
        }

        @Override // androidx.databinding.ViewDataBinding
        public void invalidateAll() {
            synchronized (this) {
                this.ah$a = 2L;
            }
            requestRebind();
        }

        @Override // androidx.databinding.ViewDataBinding
        public boolean hasPendingBindings() {
            synchronized (this) {
                return this.ah$a != 0;
            }
        }

        @Override // androidx.databinding.ViewDataBinding
        public boolean setVariable(int i, Object obj) {
            if (384 == i) {
                values((Boolean) obj);
                return true;
            }
            return false;
        }

        @Override // o.DefaultTaskExecutor
        public void values(Boolean bool) {
            this.ag$a = bool;
            synchronized (this) {
                this.ah$a |= 1;
            }
            notifyPropertyChanged(384);
            super.requestRebind();
        }

        @Override // androidx.databinding.ViewDataBinding
        public void executeBindings() {
            long j;
            synchronized (this) {
                j = this.ah$a;
                this.ah$a = 0L;
            }
            Boolean bool = this.ag$a;
            int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
            boolean safeUnbox = i != 0 ? androidx.databinding.ViewDataBinding.safeUnbox(bool) : false;
            if (i != 0) {
                addCapabilityBinding.valueOf(this.toString, bool);
                addCapabilityBinding.ah$a(this.toString, safeUnbox);
            }
        }
    }

    protected DefaultTaskExecutor(Object obj, View view, int i, ShimmerFrameLayout shimmerFrameLayout) {
        super(obj, view, i);
        this.toString = shimmerFrameLayout;
    }
}
