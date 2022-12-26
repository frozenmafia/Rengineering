package com.app.dream11.chat.presenters;

import com.app.dream11.chat.helpers.DynamicContestCardHelper;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes.dex */
final class BaseChatWindowPresenter$dynamicContestCardHelper$2 extends Lambda implements Styleable.ArcMotion<DynamicContestCardHelper> {
    public static final BaseChatWindowPresenter$dynamicContestCardHelper$2 INSTANCE = new BaseChatWindowPresenter$dynamicContestCardHelper$2();

    BaseChatWindowPresenter$dynamicContestCardHelper$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final DynamicContestCardHelper invoke() {
        return new DynamicContestCardHelper();
    }
}
