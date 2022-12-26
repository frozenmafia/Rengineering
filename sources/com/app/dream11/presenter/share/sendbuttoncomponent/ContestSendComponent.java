package com.app.dream11.presenter.share.sendbuttoncomponent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.app.dream11Pro.R;
import java.util.LinkedHashMap;
import java.util.Map;
import o.AbstractResolvableFuture;
import o.ActionMenuItem;
import o.CoordinatorLayout;
import o.casWaiters;
import o.getChildRect;
import o.getDependencySortedChildren;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class ContestSendComponent extends FrameLayout {
    public Map<Integer, View> toString;
    private final casWaiters<CoordinatorLayout.AnonymousClass1> values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContestSendComponent(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.toString = new LinkedHashMap();
        this.values = new values();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContestSendComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, "attrs");
        this.toString = new LinkedHashMap();
        this.values = new values();
    }

    /* loaded from: classes6.dex */
    public static final class values extends casWaiters<CoordinatorLayout.AnonymousClass1> {
        @Override // o.casWaiters
        public int getBindingVariableId() {
            return 51;
        }

        @Override // o.casWaiters
        public int getLayout() {
            return R.layout.res_0x7f0d018f;
        }

        values() {
            super(ContestSendComponent.this);
        }

        @Override // o.casWaiters
        /* renamed from: values */
        public getDependencySortedChildren getScreenPresenter() {
            getDependencySortedChildren onNavigationEvent = ActionMenuItem.valueOf().onNavigationEvent();
            runAnimators.ah$a(onNavigationEvent, "getInstance().contestSendPresenter");
            return onNavigationEvent;
        }
    }

    public final void setContestSendData(getChildRect getchildrect) {
        runAnimators.ag$a(getchildrect, "contestSendData");
        AbstractResolvableFuture.Failure<CoordinatorLayout.AnonymousClass1> presenter = this.values.getPresenter();
        getDependencySortedChildren getdependencysortedchildren = presenter instanceof getDependencySortedChildren ? (getDependencySortedChildren) presenter : null;
        if (getdependencysortedchildren == null) {
            return;
        }
        getdependencysortedchildren.toString(getchildrect);
    }
}
