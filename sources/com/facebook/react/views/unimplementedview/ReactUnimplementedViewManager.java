package com.facebook.react.views.unimplementedview;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import o.FragmentStateManager;
@FragmentStateManager.AnonymousClass1(values = ReactUnimplementedViewManager.REACT_CLASS)
/* loaded from: classes4.dex */
public class ReactUnimplementedViewManager extends ViewGroupManager<ReactUnimplementedView> {
    public static final String REACT_CLASS = "UnimplementedNativeView";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ReactUnimplementedView createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactUnimplementedView(themedReactContext);
    }

    @ReactProp(name = "name")
    public void setName(ReactUnimplementedView reactUnimplementedView, String str) {
        reactUnimplementedView.setName(str);
    }
}
