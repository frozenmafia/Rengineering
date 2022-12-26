package androidx.window.layout;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class SafeWindowLayoutComponentProvider$isWindowLayoutProviderValid$1 extends Lambda implements Styleable.ArcMotion<Boolean> {
    final /* synthetic */ ClassLoader $classLoader;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeWindowLayoutComponentProvider$isWindowLayoutProviderValid$1(ClassLoader classLoader) {
        super(0);
        this.$classLoader = classLoader;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final Boolean invoke() {
        Class windowExtensionsProviderClass;
        Class windowExtensionsClass;
        boolean doesReturn;
        boolean isPublic;
        windowExtensionsProviderClass = SafeWindowLayoutComponentProvider.INSTANCE.windowExtensionsProviderClass(this.$classLoader);
        boolean z = false;
        Method declaredMethod = windowExtensionsProviderClass.getDeclaredMethod("getWindowExtensions", new Class[0]);
        windowExtensionsClass = SafeWindowLayoutComponentProvider.INSTANCE.windowExtensionsClass(this.$classLoader);
        SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
        runAnimators.ah$a(declaredMethod, "getWindowExtensionsMethod");
        runAnimators.ah$a(windowExtensionsClass, "windowExtensionsClass");
        doesReturn = safeWindowLayoutComponentProvider.doesReturn(declaredMethod, windowExtensionsClass);
        if (doesReturn) {
            isPublic = SafeWindowLayoutComponentProvider.INSTANCE.isPublic(declaredMethod);
            if (isPublic) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
