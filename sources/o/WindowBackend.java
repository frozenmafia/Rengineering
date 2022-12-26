package o;

import java.lang.annotation.Annotation;
/* loaded from: classes5.dex */
final class WindowBackend implements InterfaceC0398windowLayoutInfo {
    private static final InterfaceC0398windowLayoutInfo toString = new WindowBackend();

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    WindowBackend() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Annotation[] ag$a(Annotation[] annotationArr) {
        if (SidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$ExternalSyntheticLambda0.ag$a(annotationArr, InterfaceC0398windowLayoutInfo.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = toString;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return InterfaceC0398windowLayoutInfo.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof InterfaceC0398windowLayoutInfo;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + InterfaceC0398windowLayoutInfo.class.getName() + "()";
    }
}
