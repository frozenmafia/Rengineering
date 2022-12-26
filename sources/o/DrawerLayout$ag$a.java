package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import o.getWindowExtension;
import okhttp3.ResponseBody;
/* loaded from: classes4.dex */
public final class DrawerLayout$ag$a extends getWindowExtension.toString {
    public final DrawerLayout$ag$a values() {
        return this;
    }

    /* loaded from: classes4.dex */
    public static final class toString implements getWindowExtension<ResponseBody, Object> {
        final /* synthetic */ WindowInfoTracker ag$a;
        private final getWindowExtension<ResponseBody, Object> ah$a;
        final /* synthetic */ Annotation[] valueOf;
        final /* synthetic */ Type values;

        toString(WindowInfoTracker windowInfoTracker, Type type, Annotation[] annotationArr) {
            this.ag$a = windowInfoTracker;
            this.values = type;
            this.valueOf = annotationArr;
            this.ah$a = windowInfoTracker.toString(DrawerLayout$ag$a.this.values(), type, annotationArr);
        }

        @Override // o.getWindowExtension
        /* renamed from: valueOf */
        public Object ag$a(ResponseBody responseBody) {
            runAnimators.valueOf(responseBody, "value");
            if (responseBody.contentLength() != 0) {
                return this.ah$a.ag$a(responseBody);
            }
            return null;
        }
    }

    @Override // o.getWindowExtension.toString
    /* renamed from: toString */
    public toString values(Type type, Annotation[] annotationArr, WindowInfoTracker windowInfoTracker) {
        runAnimators.valueOf(type, "type");
        runAnimators.valueOf(annotationArr, "annotations");
        runAnimators.valueOf(windowInfoTracker, "retrofit");
        return new toString(windowInfoTracker, type, annotationArr);
    }
}
