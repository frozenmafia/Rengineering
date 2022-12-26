package com.app.dream11.chat.presenters;

import com.app.dream11.chat.helpers.AutomaticContestHelper;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes.dex */
final class BaseChatWindowPresenter$automaticContestHelper$2 extends Lambda implements Styleable.ArcMotion<AutomaticContestHelper> {
    public static final BaseChatWindowPresenter$automaticContestHelper$2 INSTANCE = new BaseChatWindowPresenter$automaticContestHelper$2();

    BaseChatWindowPresenter$automaticContestHelper$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final AutomaticContestHelper invoke() {
        return new AutomaticContestHelper();
    }
}
