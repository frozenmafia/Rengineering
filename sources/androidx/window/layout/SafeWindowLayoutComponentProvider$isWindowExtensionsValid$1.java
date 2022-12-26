package androidx.window.layout;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class SafeWindowLayoutComponentProvider$isWindowExtensionsValid$1 extends Lambda implements Styleable.ArcMotion<Boolean> {
    final /* synthetic */ ClassLoader $classLoader;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeWindowLayoutComponentProvider$isWindowExtensionsValid$1(ClassLoader classLoader) {
        super(0);
        this.$classLoader = classLoader;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final Boolean invoke() {
        Class windowExtensionsClass;
        Class windowLayoutComponentClass;
        boolean isPublic;
        boolean doesReturn;
        windowExtensionsClass = SafeWindowLayoutComponentProvider.INSTANCE.windowExtensionsClass(this.$classLoader);
        boolean z = false;
        Method method = windowExtensionsClass.getMethod("getWindowLayoutComponent", new Class[0]);
        windowLayoutComponentClass = SafeWindowLayoutComponentProvider.INSTANCE.windowLayoutComponentClass(this.$classLoader);
        SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
        runAnimators.ah$a(method, "getWindowLayoutComponentMethod");
        isPublic = safeWindowLayoutComponentProvider.isPublic(method);
        if (isPublic) {
            SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider2 = SafeWindowLayoutComponentProvider.INSTANCE;
            runAnimators.ah$a(windowLayoutComponentClass, "windowLayoutComponentClass");
            doesReturn = safeWindowLayoutComponentProvider2.doesReturn(method, windowLayoutComponentClass);
            if (doesReturn) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
