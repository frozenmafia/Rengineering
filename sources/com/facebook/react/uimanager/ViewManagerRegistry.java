package com.facebook.react.uimanager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.destroyItem;
/* loaded from: classes4.dex */
public final class ViewManagerRegistry {
    private final ViewManagerResolver mViewManagerResolver;
    private final Map<String, ViewManager> mViewManagers;

    public ViewManagerRegistry(ViewManagerResolver viewManagerResolver) {
        this.mViewManagers = destroyItem.values();
        this.mViewManagerResolver = viewManagerResolver;
    }

    public ViewManagerRegistry(List<ViewManager> list) {
        HashMap values = destroyItem.values();
        for (ViewManager viewManager : list) {
            values.put(viewManager.getName(), viewManager);
        }
        this.mViewManagers = values;
        this.mViewManagerResolver = null;
    }

    public ViewManagerRegistry(Map<String, ViewManager> map) {
        this.mViewManagers = map == null ? destroyItem.values() : map;
        this.mViewManagerResolver = null;
    }

    public ViewManager get(String str) {
        ViewManager viewManager = this.mViewManagers.get(str);
        if (viewManager != null) {
            return viewManager;
        }
        if (this.mViewManagerResolver != null) {
            ViewManager viewManagerFromResolver = getViewManagerFromResolver(str);
            if (viewManagerFromResolver != null) {
                return viewManagerFromResolver;
            }
            throw new IllegalViewOperationException("ViewManagerResolver returned null for " + str + ", existing names are: " + this.mViewManagerResolver.getViewManagerNames());
        }
        throw new IllegalViewOperationException("No ViewManager found for class " + str);
    }

    private ViewManager getViewManagerFromResolver(String str) {
        ViewManager viewManager = this.mViewManagerResolver.getViewManager(str);
        if (viewManager != null) {
            this.mViewManagers.put(str, viewManager);
        }
        return viewManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewManager getViewManagerIfExists(String str) {
        ViewManager viewManager = this.mViewManagers.get(str);
        if (viewManager != null) {
            return viewManager;
        }
        if (this.mViewManagerResolver != null) {
            return getViewManagerFromResolver(str);
        }
        return null;
    }
}
