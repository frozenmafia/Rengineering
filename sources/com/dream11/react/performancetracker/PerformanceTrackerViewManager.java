package com.dream11.react.performancetracker;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import o.runAnimators;
/* loaded from: classes.dex */
public final class PerformanceTrackerViewManager extends ViewGroupManager<PerformanceTrackerView> {
    private final String REACT_CLASS;
    private final ReactApplicationContext context;

    public PerformanceTrackerViewManager(ReactApplicationContext reactApplicationContext) {
        runAnimators.ag$a(reactApplicationContext, "context");
        this.context = reactApplicationContext;
        this.REACT_CLASS = "PerformanceTrackerView";
    }

    public final ReactApplicationContext getContext() {
        return this.context;
    }

    public final String getREACT_CLASS() {
        return this.REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return this.REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public PerformanceTrackerView createViewInstance(ThemedReactContext themedReactContext) {
        runAnimators.ag$a(themedReactContext, "reactContext");
        return new PerformanceTrackerView(themedReactContext);
    }

    @ReactProp(name = "contentDescription")
    public final void setContentDescription(PerformanceTrackerView performanceTrackerView, String str) {
        runAnimators.ag$a(performanceTrackerView, "performanceTrackerView");
        runAnimators.ag$a(str, "tag");
        performanceTrackerView.setContentDescription(str);
    }

    @ReactProp(name = "index")
    public final void setViewIndex(PerformanceTrackerView performanceTrackerView, Integer num) {
        runAnimators.ag$a(performanceTrackerView, "performanceTrackerView");
        performanceTrackerView.setIndex(num != null ? num.intValue() : 0);
    }

    @ReactProp(name = "eventMap")
    public final void setEventMap(PerformanceTrackerView performanceTrackerView, ReadableMap readableMap) {
        runAnimators.ag$a(performanceTrackerView, "performanceTrackerView");
        runAnimators.ag$a(readableMap, "eventMap");
        performanceTrackerView.setEventData(readableMap);
    }

    @ReactProp(name = "isEnable")
    public final void setIsTagEnable(PerformanceTrackerView performanceTrackerView, boolean z) {
        runAnimators.ag$a(performanceTrackerView, "performanceTrackerView");
        performanceTrackerView.setTagEnable(z);
    }

    @ReactProp(name = "eventName")
    public final void setEventName(PerformanceTrackerView performanceTrackerView, String str) {
        runAnimators.ag$a(performanceTrackerView, "performanceTrackerView");
        runAnimators.ag$a(str, "eventName");
        performanceTrackerView.setEventName(str);
    }

    @ReactProp(name = "logAll")
    public final void setLogAll(PerformanceTrackerView performanceTrackerView, boolean z) {
        runAnimators.ag$a(performanceTrackerView, "performanceTrackerView");
        performanceTrackerView.setLogAll(z);
    }
}
