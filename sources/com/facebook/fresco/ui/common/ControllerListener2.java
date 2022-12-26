package com.facebook.fresco.ui.common;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes4.dex */
public interface ControllerListener2<INFO> {
    void onFailure(String str, Throwable th, Extras extras);

    void onFinalImageSet(String str, INFO info, Extras extras);

    void onIntermediateImageFailed(String str);

    void onIntermediateImageSet(String str, INFO info);

    void onRelease(String str, Extras extras);

    void onSubmit(String str, Object obj, Extras extras);

    /* loaded from: classes4.dex */
    public static class Extras {
        public Object callerContext;
        public Map<String, Object> componentExtras;
        public Map<String, Object> datasourceExtras;
        public Map<String, Object> imageExtras;
        public Uri mainUri;
        public Object scaleType;
        public Map<String, Object> shortcutExtras;
        public int viewportWidth = -1;
        public int viewportHeight = -1;
        public float focusX = -1.0f;
        public float focusY = -1.0f;

        public static Extras of(Map<String, Object> map) {
            Extras extras = new Extras();
            extras.componentExtras = map;
            return extras;
        }

        public Extras makeExtrasCopy() {
            Extras extras = new Extras();
            extras.componentExtras = copyMap(this.componentExtras);
            extras.shortcutExtras = copyMap(this.shortcutExtras);
            extras.datasourceExtras = copyMap(this.datasourceExtras);
            extras.imageExtras = copyMap(this.imageExtras);
            extras.callerContext = this.callerContext;
            extras.mainUri = this.mainUri;
            extras.viewportWidth = this.viewportWidth;
            extras.viewportHeight = this.viewportHeight;
            extras.scaleType = this.scaleType;
            extras.focusX = this.focusX;
            extras.focusY = this.focusY;
            return extras;
        }

        private static Map<String, Object> copyMap(Map<String, Object> map) {
            if (map == null) {
                return null;
            }
            return new ConcurrentHashMap(map);
        }
    }
}
