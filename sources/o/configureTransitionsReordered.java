package o;

import android.view.View;
/* loaded from: classes4.dex */
public interface configureTransitionsReordered<T extends View> {
    void setDisabled(T t, boolean z);

    void setEnabled(T t, boolean z);

    void setNativeValue(T t, boolean z);

    void setOn(T t, boolean z);

    void setThumbColor(T t, Integer num);

    void setThumbTintColor(T t, Integer num);

    void setTrackColorForFalse(T t, Integer num);

    void setTrackColorForTrue(T t, Integer num);

    void setTrackTintColor(T t, Integer num);

    void setValue(T t, boolean z);
}
