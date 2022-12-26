package com.facebook.drawee.view;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import o.FragmentLayoutInflaterFactory;
import o.FragmentLifecycleCallbacksDispatcher;
import o.dispatchOnFragmentActivityCreated;
/* loaded from: classes4.dex */
public class GenericDraweeView extends DraweeView<dispatchOnFragmentActivityCreated> {
    public GenericDraweeView(Context context, dispatchOnFragmentActivityCreated dispatchonfragmentactivitycreated) {
        super(context);
        setHierarchy(dispatchonfragmentactivitycreated);
    }

    public GenericDraweeView(Context context) {
        super(context);
        inflateHierarchy(context, null);
    }

    public GenericDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflateHierarchy(context, attributeSet);
    }

    public GenericDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflateHierarchy(context, attributeSet);
    }

    public GenericDraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        inflateHierarchy(context, attributeSet);
    }

    protected void inflateHierarchy(Context context, AttributeSet attributeSet) {
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("GenericDraweeView#inflateHierarchy");
        }
        FragmentLayoutInflaterFactory valueOf = FragmentLifecycleCallbacksDispatcher.valueOf(context, attributeSet);
        setAspectRatio(valueOf.HaptikSDK$c());
        setHierarchy(valueOf.valueOf());
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
    }
}
