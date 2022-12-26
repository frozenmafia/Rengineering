package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import com.swmansion.rnscreens.CustomSearchView;
import o.isPrimaryKey;
import o.runAnimators;
/* loaded from: classes5.dex */
public final class CustomSearchView extends SearchView {
    private View.OnClickListener ag$a;
    private final isPrimaryKey ah$a;
    private SearchView.OnCloseListener valueOf;
    private OnBackPressedCallback values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomSearchView(Context context, Fragment fragment) {
        super(context);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(fragment, "fragment");
        toString tostring = new toString();
        this.values = tostring;
        this.ah$a = new isPrimaryKey(fragment, tostring);
        super.setOnSearchClickListener(new View.OnClickListener() { // from class: o.TableInfo.Column
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomSearchView.toString(CustomSearchView.this, view);
            }
        });
        super.setOnCloseListener(new SearchView.OnCloseListener() { // from class: o.readForeignKeyFieldMappings
            @Override // androidx.appcompat.widget.SearchView.OnCloseListener
            public final boolean onClose() {
                boolean ah$a;
                ah$a = CustomSearchView.ah$a(CustomSearchView.this);
                return ah$a;
            }
        });
        setMaxWidth(Integer.MAX_VALUE);
    }

    /* loaded from: classes5.dex */
    public static final class toString extends OnBackPressedCallback {
        toString() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            CustomSearchView.this.setIconified(true);
        }
    }

    public final void setOverrideBackAction(boolean z) {
        this.ah$a.values(z);
    }

    public final void valueOf() {
        setIconified(false);
        requestFocusFromTouch();
    }

    @Override // androidx.appcompat.widget.SearchView
    public void setOnCloseListener(SearchView.OnCloseListener onCloseListener) {
        this.valueOf = onCloseListener;
    }

    @Override // androidx.appcompat.widget.SearchView
    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.ag$a = onClickListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isIconified()) {
            return;
        }
        this.ah$a.valueOf();
    }

    @Override // androidx.appcompat.widget.SearchView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.ah$a.ah$a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toString(CustomSearchView customSearchView, View view) {
        runAnimators.ag$a(customSearchView, "this$0");
        View.OnClickListener onClickListener = customSearchView.ag$a;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        customSearchView.ah$a.valueOf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ah$a(CustomSearchView customSearchView) {
        runAnimators.ag$a(customSearchView, "this$0");
        SearchView.OnCloseListener onCloseListener = customSearchView.valueOf;
        boolean onClose = onCloseListener == null ? false : onCloseListener.onClose();
        customSearchView.ah$a.ah$a();
        return onClose;
    }
}
