package com.facebook.react.turbomodule.core;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.soloader.SoLoader;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public abstract class TurboModuleManagerDelegate {
    private static volatile boolean sIsSoLibraryLoaded;
    private final HybridData mHybridData;

    public abstract CxxModuleWrapper getLegacyCxxModule(String str);

    public abstract TurboModule getModule(String str);

    protected abstract HybridData initHybrid();

    protected TurboModuleManagerDelegate() {
        maybeLoadOtherSoLibraries();
        maybeLoadSoLibrary();
        this.mHybridData = initHybrid();
    }

    public List<String> getEagerInitModuleNames() {
        return new ArrayList();
    }

    private static void maybeLoadSoLibrary() {
        synchronized (TurboModuleManagerDelegate.class) {
            if (!sIsSoLibraryLoaded) {
                SoLoader.values("turbomodulejsijni");
                sIsSoLibraryLoaded = true;
            }
        }
    }

    protected void maybeLoadOtherSoLibraries() {
        synchronized (this) {
        }
    }
}
