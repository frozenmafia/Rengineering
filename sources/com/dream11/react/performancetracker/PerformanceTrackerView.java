package com.dream11.react.performancetracker;

import android.content.Context;
import android.graphics.Canvas;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.views.view.ReactViewGroup;
import java.util.HashMap;
import o.isCallbackDue;
import o.runAnimators;
/* loaded from: classes.dex */
public final class PerformanceTrackerView extends ReactViewGroup {
    private ReadableMap ag$a;
    private int ah$a;
    private boolean invoke;
    private String toString;
    private boolean valueOf;
    private boolean values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformanceTrackerView(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.valueOf = true;
        this.toString = "ComponentLoaded";
    }

    public final void setIndex(int i) {
        this.ah$a = i;
    }

    public final void setData(ReadableMap readableMap) {
        this.ag$a = readableMap;
    }

    public final void setTagEnable(boolean z) {
        this.values = z;
    }

    public final void setFlag(boolean z) {
        this.valueOf = z;
    }

    public final void setEventName(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.toString = str;
    }

    public final void setLogAll(boolean z) {
        this.invoke = z;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        CharSequence contentDescription;
        String obj;
        HashMap<String, Object> hashMap;
        String str;
        super.onDraw(canvas);
        if ((this.valueOf || this.invoke) && this.values && (contentDescription = getContentDescription()) != null && (obj = contentDescription.toString()) != null) {
            String str2 = obj;
            if (str2 == null || str2.length() == 0) {
                return;
            }
            this.valueOf = false;
            Context context = getContext();
            runAnimators.ah$a(context, "context");
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof isCallbackDue)) {
                applicationContext = null;
            }
            isCallbackDue iscallbackdue = (isCallbackDue) applicationContext;
            if (iscallbackdue != null) {
                CharSequence contentDescription2 = getContentDescription();
                if (contentDescription2 == null || (str = contentDescription2.toString()) == null) {
                    str = "_visible_" + this.ah$a;
                }
                iscallbackdue.valueOf(str, System.currentTimeMillis());
            }
            ReadableMap readableMap = this.ag$a;
            if (readableMap == null || (hashMap = readableMap.toHashMap()) == null) {
                return;
            }
            Context context2 = getContext();
            runAnimators.ah$a(context2, "context");
            Context applicationContext2 = context2.getApplicationContext();
            isCallbackDue iscallbackdue2 = applicationContext2 instanceof isCallbackDue ? applicationContext2 : null;
            if (iscallbackdue2 != null) {
                String str3 = this.toString;
                CharSequence contentDescription3 = getContentDescription();
                String str4 = (contentDescription3 == null || (str4 = contentDescription3.toString()) == null) ? "" : "";
                runAnimators.ah$a(hashMap, "it");
                iscallbackdue2.valueOf(str3, str4, hashMap);
            }
        }
    }

    public final void setEventData(ReadableMap readableMap) {
        runAnimators.ag$a(readableMap, "data");
        this.ag$a = readableMap;
    }
}
