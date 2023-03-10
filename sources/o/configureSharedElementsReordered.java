package o;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
/* loaded from: classes4.dex */
public interface configureSharedElementsReordered<T extends View> {
    void setAnimated(T t, boolean z);

    void setAnimationType(T t, String str);

    void setHardwareAccelerated(T t, boolean z);

    void setIdentifier(T t, int i);

    void setPresentationStyle(T t, String str);

    void setStatusBarTranslucent(T t, boolean z);

    void setSupportedOrientations(T t, ReadableArray readableArray);

    void setTransparent(T t, boolean z);

    void setVisible(T t, boolean z);
}
