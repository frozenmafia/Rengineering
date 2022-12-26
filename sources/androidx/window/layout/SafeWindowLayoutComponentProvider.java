package androidx.window.layout;

import android.os.Build;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import o.Styleable;
import o.copyViewImage;
import o.runAnimators;
import o.setIdentityTransforms;
/* loaded from: classes6.dex */
public final class SafeWindowLayoutComponentProvider {
    public static final SafeWindowLayoutComponentProvider INSTANCE = new SafeWindowLayoutComponentProvider();
    private static final setIdentityTransforms windowLayoutComponent$delegate = runAnimators.ag$a(SafeWindowLayoutComponentProvider$windowLayoutComponent$2.INSTANCE, "initializer");

    private SafeWindowLayoutComponentProvider() {
    }

    public final WindowLayoutComponent getWindowLayoutComponent() {
        return (WindowLayoutComponent) windowLayoutComponent$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canUseWindowLayoutComponent(ClassLoader classLoader) {
        return Build.VERSION.SDK_INT >= 24 && isWindowLayoutProviderValid(classLoader) && isWindowExtensionsValid(classLoader) && isWindowLayoutComponentValid(classLoader) && isFoldingFeatureValid(classLoader);
    }

    private final boolean isWindowLayoutProviderValid(ClassLoader classLoader) {
        return validate(new SafeWindowLayoutComponentProvider$isWindowLayoutProviderValid$1(classLoader));
    }

    private final boolean isWindowExtensionsValid(ClassLoader classLoader) {
        return validate(new SafeWindowLayoutComponentProvider$isWindowExtensionsValid$1(classLoader));
    }

    private final boolean isFoldingFeatureValid(ClassLoader classLoader) {
        return validate(new SafeWindowLayoutComponentProvider$isFoldingFeatureValid$1(classLoader));
    }

    private final boolean isWindowLayoutComponentValid(ClassLoader classLoader) {
        return validate(new SafeWindowLayoutComponentProvider$isWindowLayoutComponentValid$1(classLoader));
    }

    private final boolean validate(Styleable.ArcMotion<Boolean> arcMotion) {
        try {
            return arcMotion.invoke().booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPublic(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean doesReturn(Method method, copyViewImage<?> copyviewimage) {
        return doesReturn(method, Styleable.ChangeTransform.ah$a(copyviewimage));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean doesReturn(Method method, Class<?> cls) {
        return method.getReturnType().equals(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> windowExtensionsProviderClass(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> windowExtensionsClass(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensions");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> foldingFeatureClass(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> windowLayoutComponentClass(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
    }
}
