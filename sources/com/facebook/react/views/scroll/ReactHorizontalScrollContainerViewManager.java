package com.facebook.react.views.scroll;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.view.ReactClippingViewManager;
import o.FragmentStateManager;
@FragmentStateManager.AnonymousClass1(values = ReactHorizontalScrollContainerViewManager.REACT_CLASS)
/* loaded from: classes4.dex */
public class ReactHorizontalScrollContainerViewManager extends ReactClippingViewManager<ReactHorizontalScrollContainerView> {
    public static final String REACT_CLASS = "AndroidHorizontalScrollContentView";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactHorizontalScrollContainerView createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactHorizontalScrollContainerView(themedReactContext);
    }
}
