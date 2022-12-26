package o;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
/* loaded from: classes5.dex */
public interface getWindowExtension<F, T> {
    T ag$a(F f) throws IOException;

    /* loaded from: classes5.dex */
    public static abstract class toString {
        public getWindowExtension<?, RequestBody> toString(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, WindowInfoTracker windowInfoTracker) {
            return null;
        }

        public getWindowExtension<?, String> valueOf(Type type, Annotation[] annotationArr, WindowInfoTracker windowInfoTracker) {
            return null;
        }

        public getWindowExtension<ResponseBody, ?> values(Type type, Annotation[] annotationArr, WindowInfoTracker windowInfoTracker) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public static Type valueOf(int i, ParameterizedType parameterizedType) {
            return SidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$ExternalSyntheticLambda0.ag$a(i, parameterizedType);
        }
    }
}
