package com.facebook.react.views.text;

import android.view.View;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManager;
import o.FragmentStateManager;
import o.FragmentTransitionImpl;
@FragmentStateManager.AnonymousClass1(values = ReactRawTextManager.REACT_CLASS)
/* loaded from: classes4.dex */
public class ReactRawTextManager extends ViewManager<View, FragmentTransitionImpl.AnonymousClass1> {
    public static final String REACT_CLASS = "RCTRawText";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(ThemedReactContext themedReactContext) {
        throw new IllegalStateException("Attempt to create a native view for RCTRawText");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends FragmentTransitionImpl.AnonymousClass1> getShadowNodeClass() {
        return FragmentTransitionImpl.AnonymousClass1.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public FragmentTransitionImpl.AnonymousClass1 createShadowNodeInstance() {
        return new FragmentTransitionImpl.AnonymousClass1();
    }
}
