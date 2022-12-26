package com.facebook.react.views.text;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import o.FragmentStateManager;
import o.createViewModelLazy;
@FragmentStateManager.AnonymousClass1(values = ReactVirtualTextViewManager.REACT_CLASS)
/* loaded from: classes4.dex */
public class ReactVirtualTextViewManager extends BaseViewManager<View, createViewModelLazy> {
    public static final String REACT_CLASS = "RCTVirtualText";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(ThemedReactContext themedReactContext) {
        throw new IllegalStateException("Attempt to create a native view for RCTVirtualText");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<createViewModelLazy> getShadowNodeClass() {
        return createViewModelLazy.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public createViewModelLazy createShadowNodeInstance() {
        return new createViewModelLazy();
    }
}
