package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.teamselection.newcreateteam.LineupStatusComponent;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes3.dex */
public class Renderer extends SuggestionHintConstants {
    private static final SparseIntArray valueOf = null;
    private static final ViewDataBinding.IncludedLayouts values = null;
    private final LinearLayout ag$a;
    private long ah$a;
    private final CustomTextView ah$b;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public Renderer(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, values, valueOf));
    }

    private Renderer(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.ah$a = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.ag$a = linearLayout;
        linearLayout.setTag(null);
        CustomTextView customTextView = (CustomTextView) objArr[1];
        this.ah$b = customTextView;
        customTextView.setTag(null);
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
        if (205 == i) {
            valueOf((LineupStatusComponent.valueOf) obj);
            return true;
        }
        return false;
    }

    @Override // o.SuggestionHintConstants
    public void valueOf(LineupStatusComponent.valueOf valueof) {
        this.toString = valueof;
        synchronized (this) {
            this.ah$a |= 1;
        }
        notifyPropertyChanged(205);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        String str;
        String str2;
        synchronized (this) {
            j = this.ah$a;
            this.ah$a = 0L;
        }
        LineupStatusComponent.valueOf valueof = this.toString;
        int i = 0;
        String str3 = null;
        int i2 = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        if (i2 != 0) {
            if (valueof != null) {
                String str4 = valueof.toString;
                str3 = valueof.valueOf;
                str2 = str4;
            } else {
                str2 = null;
            }
            boolean z = valueof != null;
            if (i2 != 0) {
                j |= z ? 8L : 4L;
            }
            str = String.format(this.ah$b.getResources().getString(com.app.dream11Pro.R.string.res_0x7f12037f), str2);
            if (!z) {
                i = 8;
            }
        } else {
            str = null;
        }
        if ((j & 3) != 0) {
            FullLifecycleObserverAdapter.toString(this.ag$a, i);
            LineupStatusComponent.setLineupTextColor(this.ah$b, str3);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.ah$b, str);
        }
    }
}
