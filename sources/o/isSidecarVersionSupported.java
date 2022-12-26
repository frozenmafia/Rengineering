package o;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import o.getWindowExtension;
import okhttp3.ResponseBody;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class isSidecarVersionSupported extends getWindowExtension.toString {
    static final getWindowExtension.toString ah$a = new isSidecarVersionSupported();

    isSidecarVersionSupported() {
    }

    @Override // o.getWindowExtension.toString
    public getWindowExtension<ResponseBody, ?> values(Type type, Annotation[] annotationArr, WindowInfoTracker windowInfoTracker) {
        Class<?> sidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$ExternalSyntheticLambda0;
        sidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$ExternalSyntheticLambda0 = SidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$ExternalSyntheticLambda0.toString(type);
        if (sidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$ExternalSyntheticLambda0 != Optional.class) {
            return null;
        }
        final getWindowExtension values = windowInfoTracker.values(valueOf(0, (ParameterizedType) type), annotationArr);
        return new getWindowExtension<ResponseBody, Optional<T>>(values) { // from class: o.isSidecarVersionSupported$ah$a
            final getWindowExtension<ResponseBody, T> ah$a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.ah$a = values;
            }

            @Override // o.getWindowExtension
            /* renamed from: ah$a */
            public Optional<T> ag$a(ResponseBody responseBody) throws IOException {
                return Optional.ofNullable(this.ah$a.ag$a(responseBody));
            }
        };
    }
}
