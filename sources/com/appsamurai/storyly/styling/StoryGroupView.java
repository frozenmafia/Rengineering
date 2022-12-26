package com.appsamurai.storyly.styling;

import android.content.Context;
import android.widget.FrameLayout;
import o.PathParser;
import o.runAnimators;
/* loaded from: classes3.dex */
public abstract class StoryGroupView extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryGroupView(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
    }

    public abstract void ag$a(PathParser.PathDataNode pathDataNode);
}
