package com.facebook.react.uimanager;

import android.os.Trace;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.systrace.Systrace;
import java.util.List;
@Deprecated
/* loaded from: classes.dex */
public class UIImplementationProvider {
    public UIImplementation createUIImplementation(ReactApplicationContext reactApplicationContext, ViewManagerResolver viewManagerResolver, EventDispatcher eventDispatcher, int i) {
        Trace.beginSection("UIImplementationProvider.createUIImplementation[1]");
        try {
            return new UIImplementation(reactApplicationContext, viewManagerResolver, eventDispatcher, i);
        } finally {
            Systrace.valueOf(0L);
        }
    }

    public UIImplementation createUIImplementation(ReactApplicationContext reactApplicationContext, List<ViewManager> list, EventDispatcher eventDispatcher, int i) {
        Trace.beginSection("UIImplementationProvider.createUIImplementation[2]");
        try {
            return new UIImplementation(reactApplicationContext, list, eventDispatcher, i);
        } finally {
            Systrace.valueOf(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UIImplementation createUIImplementation(ReactApplicationContext reactApplicationContext, ViewManagerRegistry viewManagerRegistry, EventDispatcher eventDispatcher, int i) {
        Trace.beginSection("UIImplementationProvider.createUIImplementation[3]");
        try {
            return new UIImplementation(reactApplicationContext, viewManagerRegistry, eventDispatcher, i);
        } finally {
            Systrace.valueOf(0L);
        }
    }
}
