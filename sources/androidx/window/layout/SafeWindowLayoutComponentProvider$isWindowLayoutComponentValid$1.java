package androidx.window.layout;

import android.app.Activity;
import java.lang.reflect.Method;
import java.util.function.Consumer;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class SafeWindowLayoutComponentProvider$isWindowLayoutComponentValid$1 extends Lambda implements Styleable.ArcMotion<Boolean> {
    final /* synthetic */ ClassLoader $classLoader;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeWindowLayoutComponentProvider$isWindowLayoutComponentValid$1(ClassLoader classLoader) {
        super(0);
        this.$classLoader = classLoader;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final Boolean invoke() {
        Class windowLayoutComponentClass;
        boolean isPublic;
        boolean isPublic2;
        windowLayoutComponentClass = SafeWindowLayoutComponentProvider.INSTANCE.windowLayoutComponentClass(this.$classLoader);
        boolean z = false;
        Method method = windowLayoutComponentClass.getMethod("addWindowLayoutInfoListener", Activity.class, Consumer.class);
        Method method2 = windowLayoutComponentClass.getMethod("removeWindowLayoutInfoListener", Consumer.class);
        SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
        runAnimators.ah$a(method, "addListenerMethod");
        isPublic = safeWindowLayoutComponentProvider.isPublic(method);
        if (isPublic) {
            SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider2 = SafeWindowLayoutComponentProvider.INSTANCE;
            runAnimators.ah$a(method2, "removeListenerMethod");
            isPublic2 = safeWindowLayoutComponentProvider2.isPublic(method2);
            if (isPublic2) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
