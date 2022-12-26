package com.fancode.core.ui.baseui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fancode.core.ui.androidhelpers.adapters.BaseAdapter;
import com.fancode.core.ui.baseui.FanCodeRecylerView;
import o.GeneratedAdapter;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class FanCodeRecylerView extends RecyclerView {
    private GeneratedAdapter HaptikSDK$a;
    private final RecyclerView.OnScrollListener ag$a;
    private toString ah$a;
    private boolean toString;
    private FanCodeRecylerView$ag$a valueOf;
    private values values;

    /* loaded from: classes6.dex */
    public interface toString {
        void toString(int i);
    }

    /* loaded from: classes6.dex */
    public interface values {
        void values(int i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FanCodeRecylerView(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.ag$a = new RecyclerView.OnScrollListener() { // from class: com.fancode.core.ui.baseui.FanCodeRecylerView$ah$a
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                boolean unused;
                runAnimators.ag$a(recyclerView, "recyclerView");
                try {
                    unused = FanCodeRecylerView.this.toString;
                } catch (Exception unused2) {
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                FanCodeRecylerView.values valuesVar;
                FanCodeRecylerView.values valuesVar2;
                runAnimators.ag$a(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, i, i2);
                valuesVar = FanCodeRecylerView.this.values;
                if (valuesVar != null) {
                    RecyclerView.LayoutManager layoutManager = FanCodeRecylerView.this.getLayoutManager();
                    if (layoutManager instanceof LinearLayoutManager) {
                        int findLastCompletelyVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
                        valuesVar2 = FanCodeRecylerView.this.values;
                        runAnimators.toString(valuesVar2);
                        valuesVar2.values(findLastCompletelyVisibleItemPosition);
                    }
                }
            }
        };
        setOverScrollMode(2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FanCodeRecylerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, "attrs");
        this.ag$a = new RecyclerView.OnScrollListener() { // from class: com.fancode.core.ui.baseui.FanCodeRecylerView$ah$a
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                boolean unused;
                runAnimators.ag$a(recyclerView, "recyclerView");
                try {
                    unused = FanCodeRecylerView.this.toString;
                } catch (Exception unused2) {
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                FanCodeRecylerView.values valuesVar;
                FanCodeRecylerView.values valuesVar2;
                runAnimators.ag$a(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, i, i2);
                valuesVar = FanCodeRecylerView.this.values;
                if (valuesVar != null) {
                    RecyclerView.LayoutManager layoutManager = FanCodeRecylerView.this.getLayoutManager();
                    if (layoutManager instanceof LinearLayoutManager) {
                        int findLastCompletelyVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
                        valuesVar2 = FanCodeRecylerView.this.values;
                        runAnimators.toString(valuesVar2);
                        valuesVar2.values(findLastCompletelyVisibleItemPosition);
                    }
                }
            }
        };
        setOverScrollMode(2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FanCodeRecylerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, "attrs");
        this.ag$a = new RecyclerView.OnScrollListener() { // from class: com.fancode.core.ui.baseui.FanCodeRecylerView$ah$a
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                boolean unused;
                runAnimators.ag$a(recyclerView, "recyclerView");
                try {
                    unused = FanCodeRecylerView.this.toString;
                } catch (Exception unused2) {
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i2, int i22) {
                FanCodeRecylerView.values valuesVar;
                FanCodeRecylerView.values valuesVar2;
                runAnimators.ag$a(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, i2, i22);
                valuesVar = FanCodeRecylerView.this.values;
                if (valuesVar != null) {
                    RecyclerView.LayoutManager layoutManager = FanCodeRecylerView.this.getLayoutManager();
                    if (layoutManager instanceof LinearLayoutManager) {
                        int findLastCompletelyVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
                        valuesVar2 = FanCodeRecylerView.this.values;
                        runAnimators.toString(valuesVar2);
                        valuesVar2.values(findLastCompletelyVisibleItemPosition);
                    }
                }
            }
        };
        setOverScrollMode(2);
    }

    public final void setUiScrollCallback(values valuesVar) {
        runAnimators.ag$a(valuesVar, "uiScrollCallback");
        this.values = valuesVar;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [com.fancode.core.ui.baseui.FanCodeRecylerView$ag$a] */
    public final void setOnLoadMoreListener(toString tostring, final int i) {
        runAnimators.ag$a(tostring, "onLoadMoreListener");
        this.ah$a = tostring;
        FanCodeRecylerView$ag$a fanCodeRecylerView$ag$a = this.valueOf;
        if (fanCodeRecylerView$ag$a != null) {
            ?? r2 = new RecyclerView.OnScrollListener(i) { // from class: com.fancode.core.ui.baseui.FanCodeRecylerView$ag$a
                private int toString;

                {
                    this.toString = i;
                }

                public final void values(int i2) {
                    this.toString = i2;
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                    FanCodeRecylerView.toString tostring2;
                    FanCodeRecylerView.toString tostring3;
                    runAnimators.ag$a(recyclerView, "recyclerView");
                    super.onScrolled(recyclerView, i2, i3);
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    runAnimators.toString(layoutManager);
                    int itemCount = layoutManager.getItemCount();
                    if (itemCount <= ag$a(layoutManager) + this.toString) {
                        tostring2 = FanCodeRecylerView.this.ah$a;
                        if (tostring2 != null) {
                            tostring3 = FanCodeRecylerView.this.ah$a;
                            if (tostring3 == null) {
                                runAnimators.valueOf("mLoadMoreListener");
                                tostring3 = null;
                            }
                            tostring3.toString(itemCount);
                        }
                    }
                }

                private final int ag$a(RecyclerView.LayoutManager layoutManager) {
                    if (layoutManager instanceof LinearLayoutManager) {
                        return ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
                    }
                    if (layoutManager instanceof GridLayoutManager) {
                        return ((GridLayoutManager) layoutManager).findLastVisibleItemPosition();
                    }
                    return -1;
                }
            };
            this.valueOf = r2;
            addOnScrollListener((RecyclerView.OnScrollListener) r2);
            return;
        }
        if (fanCodeRecylerView$ag$a == null) {
            runAnimators.valueOf("fcScrollListener");
            fanCodeRecylerView$ag$a = null;
        }
        fanCodeRecylerView$ag$a.values(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        addOnScrollListener(this.ag$a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeOnScrollListener(this.ag$a);
        super.onDetachedFromWindow();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter<?> adapter) {
        if (adapter instanceof BaseAdapter) {
            BaseAdapter baseAdapter = (BaseAdapter) adapter;
            GeneratedAdapter generatedAdapter = this.HaptikSDK$a;
            if (generatedAdapter == null) {
                runAnimators.valueOf("viewHolderFactory");
                generatedAdapter = null;
            }
            baseAdapter.toString(generatedAdapter);
        }
        super.setAdapter(adapter);
    }

    public final void setViewHolderFactory(GeneratedAdapter generatedAdapter) {
        runAnimators.ag$a(generatedAdapter, "viewHolderFactory");
        this.HaptikSDK$a = generatedAdapter;
    }

    @BindingAdapter({"app:onScrolled"})
    public final void setScrollListener(FanCodeRecylerView fanCodeRecylerView, values valuesVar) {
        runAnimators.ag$a(fanCodeRecylerView, "rv");
        if (valuesVar != null) {
            fanCodeRecylerView.setUiScrollCallback(valuesVar);
        }
    }
}
