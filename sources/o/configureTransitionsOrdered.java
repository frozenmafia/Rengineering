package o;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
/* loaded from: classes4.dex */
public interface configureTransitionsOrdered<T extends View> {
    void setColors(T t, ReadableArray readableArray);

    void setEnabled(T t, boolean z);

    void setNativeRefreshing(T t, boolean z);

    void setProgressBackgroundColor(T t, Integer num);

    void setProgressViewOffset(T t, float f);

    void setRefreshing(T t, boolean z);

    void setSize(T t, String str);
}
