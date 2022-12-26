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
public class layoutVertical extends isMeasureWithLargestChildEnabled {
    private static final ViewDataBinding.IncludedLayouts aj$a = null;
    private static final SparseIntArray isLogoutPending;
    private long a;

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
        sparseIntArray.put(com.app.dream11Pro.R.id.imgAdvertisementIcon, 3);
        sparseIntArray.put(com.app.dream11Pro.R.id.forwardRewindCustomBtn, 4);
        sparseIntArray.put(com.app.dream11Pro.R.id.tv_current_time, 5);
        sparseIntArray.put(com.app.dream11Pro.R.id.guide_bottom, 6);
        sparseIntArray.put(com.app.dream11Pro.R.id.guide_end, 7);
        sparseIntArray.put(com.app.dream11Pro.R.id.player_seek_bar, 8);
        sparseIntArray.put(com.app.dream11Pro.R.id.goLiveButton, 9);
        sparseIntArray.put(com.app.dream11Pro.R.id.liveVideoTv, 10);
        sparseIntArray.put(com.app.dream11Pro.R.id.liveButtonBarrier, 11);
        sparseIntArray.put(com.app.dream11Pro.R.id.muteUnMuteBtn, 12);
        sparseIntArray.put(com.app.dream11Pro.R.id.fullScreenCustomBtn, 13);
        sparseIntArray.put(com.app.dream11Pro.R.id.imgQualityControlsIcon, 14);
        sparseIntArray.put(com.app.dream11Pro.R.id.closeBtn, 15);
        sparseIntArray.put(com.app.dream11Pro.R.id.noDvrViews, 16);
    }

    public layoutVertical(androidx.databinding.DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 17, aj$a, isLogoutPending));
    }

    private layoutVertical(androidx.databinding.DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (Button) objArr[1], (Button) objArr[15], (Button) objArr[2], (Button) objArr[4], (Button) objArr[13], (Button) objArr[9], (androidx.constraintlayout.widget.Guideline) objArr[6], (androidx.constraintlayout.widget.Guideline) objArr[7], (ImageView) objArr[3], (Button) objArr[14], (androidx.constraintlayout.widget.Barrier) objArr[11], (ImageView) objArr[10], (Button) objArr[12], (androidx.constraintlayout.widget.Group) objArr[16], (DefaultTimeBar) objArr[8], (TextView) objArr[5], (FrameLayout) objArr[0]);
        this.a = -1L;
        this.onXdkEvent.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.a = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.a != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.a = 0L;
        }
    }
}
