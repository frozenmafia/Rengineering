package androidx.window.layout;

import android.graphics.Rect;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setPropagation;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class SafeWindowLayoutComponentProvider$isFoldingFeatureValid$1 extends Lambda implements Styleable.ArcMotion<Boolean> {
    final /* synthetic */ ClassLoader $classLoader;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeWindowLayoutComponentProvider$isFoldingFeatureValid$1(ClassLoader classLoader) {
        super(0);
        this.$classLoader = classLoader;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final Boolean invoke() {
        Class foldingFeatureClass;
        boolean doesReturn;
        boolean isPublic;
        boolean doesReturn2;
        boolean isPublic2;
        boolean doesReturn3;
        boolean isPublic3;
        foldingFeatureClass = SafeWindowLayoutComponentProvider.INSTANCE.foldingFeatureClass(this.$classLoader);
        boolean z = false;
        Method method = foldingFeatureClass.getMethod("getBounds", new Class[0]);
        Method method2 = foldingFeatureClass.getMethod("getType", new Class[0]);
        Method method3 = foldingFeatureClass.getMethod("getState", new Class[0]);
        SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
        runAnimators.ah$a(method, "getBoundsMethod");
        doesReturn = safeWindowLayoutComponentProvider.doesReturn(method, setPropagation.values(Rect.class));
        if (doesReturn) {
            isPublic = SafeWindowLayoutComponentProvider.INSTANCE.isPublic(method);
            if (isPublic) {
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider2 = SafeWindowLayoutComponentProvider.INSTANCE;
                runAnimators.ah$a(method2, "getTypeMethod");
                doesReturn2 = safeWindowLayoutComponentProvider2.doesReturn(method2, setPropagation.values(Integer.TYPE));
                if (doesReturn2) {
                    isPublic2 = SafeWindowLayoutComponentProvider.INSTANCE.isPublic(method2);
                    if (isPublic2) {
                        SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider3 = SafeWindowLayoutComponentProvider.INSTANCE;
                        runAnimators.ah$a(method3, "getStateMethod");
                        doesReturn3 = safeWindowLayoutComponentProvider3.doesReturn(method3, setPropagation.values(Integer.TYPE));
                        if (doesReturn3) {
                            isPublic3 = SafeWindowLayoutComponentProvider.INSTANCE.isPublic(method3);
                            if (isPublic3) {
                                z = true;
                            }
                        }
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
