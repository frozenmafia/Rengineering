package o;

import java.security.MessageDigest;
import java.util.Map;
import java.util.Objects;
import o.WindowInsetsControllerCompat;
/* loaded from: classes3.dex */
class ViewKt$doOnDetach$1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r9v0, types: [o.ViewKt$doOnAttach$1] */
    public ViewKt$doOnAttach$1 values(final Object obj, final getDescendants getdescendants, final int i, final int i2, final Map<Class<?>, ViewGroupKt$iterator$1<?>> map, final Class<?> cls, final Class<?> cls2, final setMargins setmargins) {
        return new getDescendants(obj, getdescendants, i, i2, map, cls, cls2, setmargins) { // from class: o.ViewKt$doOnAttach$1
            private final Class<?> HaptikSDK$a;
            private final Map<Class<?>, ViewGroupKt$iterator$1<?>> HaptikSDK$b;
            private final Class<?> HaptikSDK$c;
            private final int ag$a;
            private final Object ah$a;
            private final getDescendants ah$b;
            private final int invoke;
            private int toString;
            private final setMargins values;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.ah$a = WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(obj);
                this.ah$b = (getDescendants) Objects.requireNonNull(getdescendants, "Signature must not be null");
                this.invoke = i;
                this.ag$a = i2;
                this.HaptikSDK$b = (Map) WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(map);
                this.HaptikSDK$c = (Class) Objects.requireNonNull(cls, "Resource class must not be null");
                this.HaptikSDK$a = (Class) Objects.requireNonNull(cls2, "Transcode class must not be null");
                this.values = (setMargins) WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(setmargins);
            }

            @Override // o.getDescendants
            public boolean equals(Object obj2) {
                if (obj2 instanceof ViewKt$doOnAttach$1) {
                    ViewKt$doOnAttach$1 viewKt$doOnAttach$1 = (ViewKt$doOnAttach$1) obj2;
                    if (this.ah$a.equals(viewKt$doOnAttach$1.ah$a) && this.ah$b.equals(viewKt$doOnAttach$1.ah$b) && this.ag$a == viewKt$doOnAttach$1.ag$a && this.invoke == viewKt$doOnAttach$1.invoke && this.HaptikSDK$b.equals(viewKt$doOnAttach$1.HaptikSDK$b) && this.HaptikSDK$c.equals(viewKt$doOnAttach$1.HaptikSDK$c) && this.HaptikSDK$a.equals(viewKt$doOnAttach$1.HaptikSDK$a) && this.values.equals(viewKt$doOnAttach$1.values)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // o.getDescendants
            public int hashCode() {
                if (this.toString == 0) {
                    int hashCode = this.ah$a.hashCode();
                    this.toString = hashCode;
                    int hashCode2 = (hashCode * 31) + this.ah$b.hashCode();
                    this.toString = hashCode2;
                    int i3 = (hashCode2 * 31) + this.invoke;
                    this.toString = i3;
                    int i4 = (i3 * 31) + this.ag$a;
                    this.toString = i4;
                    int hashCode3 = (i4 * 31) + this.HaptikSDK$b.hashCode();
                    this.toString = hashCode3;
                    int hashCode4 = (hashCode3 * 31) + this.HaptikSDK$c.hashCode();
                    this.toString = hashCode4;
                    int hashCode5 = (hashCode4 * 31) + this.HaptikSDK$a.hashCode();
                    this.toString = hashCode5;
                    this.toString = (hashCode5 * 31) + this.values.hashCode();
                }
                return this.toString;
            }

            public String toString() {
                return "EngineKey{model=" + this.ah$a + ", width=" + this.invoke + ", height=" + this.ag$a + ", resourceClass=" + this.HaptikSDK$c + ", transcodeClass=" + this.HaptikSDK$a + ", signature=" + this.ah$b + ", hashCode=" + this.toString + ", transformations=" + this.HaptikSDK$b + ", options=" + this.values + '}';
            }

            @Override // o.getDescendants
            public void ag$a(MessageDigest messageDigest) {
                throw new UnsupportedOperationException();
            }
        };
    }
}
