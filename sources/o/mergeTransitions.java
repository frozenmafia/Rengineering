package o;

import android.view.View;
/* loaded from: classes4.dex */
public interface mergeTransitions<T extends View> {
    void setBorderless(T t, boolean z);

    void setEnabled(T t, boolean z);

    void setExclusive(T t, boolean z);

    void setForeground(T t, boolean z);

    void setRippleColor(T t, Integer num);

    void setRippleRadius(T t, int i);

    void setTouchSoundDisabled(T t, boolean z);
}
