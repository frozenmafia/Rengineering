package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import o.getWindowExtension;
import okhttp3.ResponseBody;
/* loaded from: classes4.dex */
public final class AnimationHandler$FrameCallbackProvider16$1$ah$a extends getWindowExtension.toString {
    public final AnimationHandler$FrameCallbackProvider16$1$ah$a ah$a() {
        return this;
    }

    /* loaded from: classes4.dex */
    public static final class toString implements getWindowExtension<ResponseBody, Object> {
        final /* synthetic */ WindowInfoTracker ag$a;
        final /* synthetic */ AnimationHandler$FrameCallbackProvider16$1$ah$a ah$a;
        private final getWindowExtension<ResponseBody, Object> toString;
        final /* synthetic */ Type valueOf;
        final /* synthetic */ Annotation[] values;

        toString(WindowInfoTracker windowInfoTracker, AnimationHandler$FrameCallbackProvider16$1$ah$a animationHandler$FrameCallbackProvider16$1$ah$a, Type type, Annotation[] annotationArr) {
            this.ag$a = windowInfoTracker;
            this.ah$a = animationHandler$FrameCallbackProvider16$1$ah$a;
            this.valueOf = type;
            this.values = annotationArr;
            this.toString = windowInfoTracker.toString(animationHandler$FrameCallbackProvider16$1$ah$a.ah$a(), type, annotationArr);
        }

        @Override // o.getWindowExtension
        /* renamed from: valueOf */
        public Object ag$a(ResponseBody responseBody) {
            runAnimators.ag$a(responseBody, "value");
            if (responseBody.contentLength() != 0) {
                return this.toString.ag$a(responseBody);
            }
            return null;
        }
    }

    @Override // o.getWindowExtension.toString
    public getWindowExtension<ResponseBody, Object> values(Type type, Annotation[] annotationArr, WindowInfoTracker windowInfoTracker) {
        runAnimators.ag$a(type, "type");
        runAnimators.ag$a(annotationArr, "annotations");
        runAnimators.ag$a(windowInfoTracker, "retrofit");
        return new toString(windowInfoTracker, this, type, annotationArr);
    }
}
