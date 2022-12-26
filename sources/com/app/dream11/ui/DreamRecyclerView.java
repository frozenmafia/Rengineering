package com.app.dream11.ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.app.dream11.dream11.DreamApplication;
import com.dream11.androidhelpers.adapters.BaseAdapter;
import o.gravityToString;
import o.loadFont;
/* loaded from: classes3.dex */
public class DreamRecyclerView extends RecyclerView {
    private DreamRecyclerView$ag$a ah$a;
    private RecyclerView.OnScrollListener valueOf;
    private boolean values;

    public DreamRecyclerView(Context context) {
        super(context);
        this.values = false;
        this.valueOf = new RecyclerView.OnScrollListener() { // from class: com.app.dream11.ui.DreamRecyclerView.2
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                try {
                    if (DreamRecyclerView.this.values) {
                        loadFont.values(recyclerView.getContext());
                    }
                    DreamRecyclerView.this.values(i);
                } catch (Exception unused) {
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (DreamRecyclerView.this.ah$a != null) {
                    RecyclerView.LayoutManager layoutManager = DreamRecyclerView.this.getLayoutManager();
                    if (layoutManager instanceof LinearLayoutManager) {
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                        DreamRecyclerView.this.ah$a.onRecyclerScrolled(linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findLastCompletelyVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition(), i2, i);
                    }
                }
            }
        };
        setOverScrollMode(2);
    }

    public DreamRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.values = false;
        this.valueOf = new RecyclerView.OnScrollListener() { // from class: com.app.dream11.ui.DreamRecyclerView.2
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                try {
                    if (DreamRecyclerView.this.values) {
                        loadFont.values(recyclerView.getContext());
                    }
                    DreamRecyclerView.this.values(i);
                } catch (Exception unused) {
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (DreamRecyclerView.this.ah$a != null) {
                    RecyclerView.LayoutManager layoutManager = DreamRecyclerView.this.getLayoutManager();
                    if (layoutManager instanceof LinearLayoutManager) {
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                        DreamRecyclerView.this.ah$a.onRecyclerScrolled(linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findLastCompletelyVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition(), i2, i);
                    }
                }
            }
        };
        setOverScrollMode(2);
    }

    public DreamRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.values = false;
        this.valueOf = new RecyclerView.OnScrollListener() { // from class: com.app.dream11.ui.DreamRecyclerView.2
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                try {
                    if (DreamRecyclerView.this.values) {
                        loadFont.values(recyclerView.getContext());
                    }
                    DreamRecyclerView.this.values(i2);
                } catch (Exception unused) {
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i2, int i22) {
                super.onScrolled(recyclerView, i2, i22);
                if (DreamRecyclerView.this.ah$a != null) {
                    RecyclerView.LayoutManager layoutManager = DreamRecyclerView.this.getLayoutManager();
                    if (layoutManager instanceof LinearLayoutManager) {
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                        DreamRecyclerView.this.ah$a.onRecyclerScrolled(linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findLastCompletelyVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition(), i22, i2);
                    }
                }
            }
        };
        setOverScrollMode(2);
    }

    public void setUiScrollCallback(DreamRecyclerView$ag$a dreamRecyclerView$ag$a) {
        this.ah$a = dreamRecyclerView$ag$a;
    }

    public void values() {
        this.values = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void values(int i) {
        if (this.ah$a == null || i != 0) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            this.ah$a.onRecyclerScrollStateChanged(linearLayoutManager.findFirstCompletelyVisibleItemPosition(), linearLayoutManager.findLastCompletelyVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        addOnScrollListener(this.valueOf);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeOnScrollListener(this.valueOf);
        super.onDetachedFromWindow();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        if (adapter instanceof BaseAdapter) {
            ((BaseAdapter) adapter).ah$a(ag$a());
        }
        super.setAdapter(adapter);
    }

    protected gravityToString ag$a() {
        return DreamApplication.valueOf().ak();
    }

    public static void setScrollListener(DreamRecyclerView dreamRecyclerView, DreamRecyclerView$ag$a dreamRecyclerView$ag$a) {
        if (dreamRecyclerView == null || dreamRecyclerView$ag$a == null) {
            return;
        }
        dreamRecyclerView.setUiScrollCallback(dreamRecyclerView$ag$a);
    }
}
