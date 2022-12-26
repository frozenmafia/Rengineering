package com.facebook.react.views.text.frescosupport;

import android.view.View;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import o.FragmentStateManager;
import o.attachHost;
import o.getListAdapter;
@FragmentStateManager.AnonymousClass1(values = FrescoBasedReactTextInlineImageViewManager.REACT_CLASS)
/* loaded from: classes4.dex */
public class FrescoBasedReactTextInlineImageViewManager extends BaseViewManager<View, getListAdapter> {
    public static final String REACT_CLASS = "RCTTextInlineImage";
    private final Object mCallerContext;
    private final AbstractDraweeControllerBuilder mDraweeControllerBuilder;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }

    public FrescoBasedReactTextInlineImageViewManager() {
        this(null, null);
    }

    public FrescoBasedReactTextInlineImageViewManager(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, Object obj) {
        this.mDraweeControllerBuilder = abstractDraweeControllerBuilder;
        this.mCallerContext = obj;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(ThemedReactContext themedReactContext) {
        throw new IllegalStateException("RCTTextInlineImage doesn't map into a native view");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public getListAdapter createShadowNodeInstance() {
        AbstractDraweeControllerBuilder abstractDraweeControllerBuilder = this.mDraweeControllerBuilder;
        if (abstractDraweeControllerBuilder == null) {
            abstractDraweeControllerBuilder = attachHost.valueOf();
        }
        return new getListAdapter(abstractDraweeControllerBuilder, this.mCallerContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<getListAdapter> getShadowNodeClass() {
        return getListAdapter.class;
    }
}
