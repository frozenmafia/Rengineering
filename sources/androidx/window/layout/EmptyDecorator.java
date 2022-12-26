package androidx.window.layout;

import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class EmptyDecorator implements WindowInfoTrackerDecorator {
    public static final EmptyDecorator INSTANCE = new EmptyDecorator();

    @Override // androidx.window.layout.WindowInfoTrackerDecorator
    public WindowInfoTracker decorate(WindowInfoTracker windowInfoTracker) {
        runAnimators.ag$a(windowInfoTracker, "tracker");
        return windowInfoTracker;
    }

    private EmptyDecorator() {
    }
}
