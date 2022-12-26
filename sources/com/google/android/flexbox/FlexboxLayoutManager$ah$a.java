package com.google.android.flexbox;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import o.setViewId;
/* loaded from: classes5.dex */
class FlexboxLayoutManager$ah$a {
    private boolean HaptikSDK$a;
    private int HaptikSDK$b;
    private int HaptikSDK$c;
    private int ag$a;
    private int ah$a;
    private int ah$b;
    private int invoke;
    private boolean toString;
    private int valueOf;
    private int values;

    private FlexboxLayoutManager$ah$a() {
        this.values = 1;
        this.HaptikSDK$b = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int ag$a(FlexboxLayoutManager$ah$a flexboxLayoutManager$ah$a) {
        int i = flexboxLayoutManager$ah$a.ah$a;
        flexboxLayoutManager$ah$a.ah$a = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int invoke(FlexboxLayoutManager$ah$a flexboxLayoutManager$ah$a) {
        int i = flexboxLayoutManager$ah$a.ah$a;
        flexboxLayoutManager$ah$a.ah$a = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean valueOf(RecyclerView.State state, List<setViewId> list) {
        int i;
        int i2 = this.HaptikSDK$c;
        return i2 >= 0 && i2 < state.getItemCount() && (i = this.ah$a) >= 0 && i < list.size();
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.valueOf + ", mFlexLinePosition=" + this.ah$a + ", mPosition=" + this.HaptikSDK$c + ", mOffset=" + this.ah$b + ", mScrollingOffset=" + this.invoke + ", mLastScrollDelta=" + this.ag$a + ", mItemDirection=" + this.values + ", mLayoutDirection=" + this.HaptikSDK$b + '}';
    }
}
