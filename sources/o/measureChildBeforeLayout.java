package o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
/* loaded from: classes2.dex */
public class measureChildBeforeLayout extends layoutHorizontal {
    private static final ViewDataBinding.IncludedLayouts a = null;
    private static final SparseIntArray isLogoutPending;
    private long ak;

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
        isLogoutPending = sparseIntArray;
        sparseIntArray.put(com.app.dream11Pro.R.id.backwardRewindCustomBtn, 1);
        sparseIntArray.put(com.app.dream11Pro.R.id.customPlayBtn, 2);
        sparseIntArray.put(com.app.dream11Pro.R.id.forwardRewindCustomBtn, 3);
        sparseIntArray.put(com.app.dream11Pro.R.id.tv_current_time, 4);
        sparseIntArray.put(com.app.dream11Pro.R.id.guide_bottom, 5);
        sparseIntArray.put(com.app.dream11Pro.R.id.player_seek_bar, 6);
        sparseIntArray.put(com.app.dream11Pro.R.id.goLiveButton, 7);
        sparseIntArray.put(com.app.dream11Pro.R.id.liveVideoTv, 8);
        sparseIntArray.put(com.app.dream11Pro.R.id.imgAdvertisementIcon, 9);
        sparseIntArray.put(com.app.dream11Pro.R.id.imgQualityControlsIcon, 10);
        sparseIntArray.put(com.app.dream11Pro.R.id.liveButtonBarrier, 11);
        sparseIntArray.put(com.app.dream11Pro.R.id.closeBtn, 12);
        sparseIntArray.put(com.app.dream11Pro.R.id.muteUnMuteBtn, 13);
        sparseIntArray.put(com.app.dream11Pro.R.id.fullScreenCustomBtn, 14);
        sparseIntArray.put(com.app.dream11Pro.R.id.noDvrViews, 15);
    }

    public measureChildBeforeLayout(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 16, a, isLogoutPending));
    }

    private measureChildBeforeLayout(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (Button) objArr[1], (Button) objArr[12], (Button) objArr[2], (Button) objArr[3], (Button) objArr[14], (Button) objArr[7], (androidx.constraintlayout.widget.Guideline) objArr[5], (ImageView) objArr[9], (Button) objArr[10], (androidx.constraintlayout.widget.Barrier) objArr[11], (ImageView) objArr[8], (Button) objArr[13], (androidx.constraintlayout.widget.Group) objArr[15], (DefaultTimeBar) objArr[6], (TextView) objArr[4], (FrameLayout) objArr[0]);
        this.ak = -1L;
        this.aj$a.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.ak = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.ak != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.ak = 0L;
        }
    }
}
