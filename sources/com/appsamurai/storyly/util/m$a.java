package com.appsamurai.storyly.util;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.addKeyboardNavigationClusters;
import o.cancelDragAndDrop;
/* loaded from: classes3.dex */
public final class m$a extends Lambda implements Styleable.ArcMotion<addKeyboardNavigationClusters> {
    public final /* synthetic */ cancelDragAndDrop a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m$a(cancelDragAndDrop canceldraganddrop) {
        super(0);
        this.a = canceldraganddrop;
    }

    @Override // o.Styleable.ArcMotion
    public addKeyboardNavigationClusters invoke() {
        return new addKeyboardNavigationClusters(this.a, this.a.toString.getMainLooper());
    }
}
