package com.app.dream11.preview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.apxor.androidsdk.core.ce.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import o.runAnimators;
/* loaded from: classes3.dex */
public abstract class BasePreviewContentComponent<T> extends FrameLayout {
    public Map<Integer, View> valueOf;

    public View ah$a(int i) {
        Map<Integer, View> map = this.valueOf;
        View view = map.get(Integer.valueOf(i));
        if (view == null) {
            View findViewById = findViewById(i);
            if (findViewById == null) {
                return null;
            }
            map.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }
        return view;
    }

    public abstract void setDataForComponent(T t);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePreviewContentComponent(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.valueOf = new LinkedHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePreviewContentComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, Constants.META_ATTRIBUTES);
        this.valueOf = new LinkedHashMap();
    }
}
