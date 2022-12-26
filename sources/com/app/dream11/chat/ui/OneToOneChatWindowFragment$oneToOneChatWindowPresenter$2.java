package com.app.dream11.chat.ui;

import com.app.dream11.chat.presenters.OneToOneChatWindowPresenter;
import kotlin.jvm.internal.Lambda;
import o.ActionMenuItem;
import o.Styleable;
/* loaded from: classes.dex */
final class OneToOneChatWindowFragment$oneToOneChatWindowPresenter$2 extends Lambda implements Styleable.ArcMotion<OneToOneChatWindowPresenter> {
    public static final OneToOneChatWindowFragment$oneToOneChatWindowPresenter$2 INSTANCE = new OneToOneChatWindowFragment$oneToOneChatWindowPresenter$2();

    OneToOneChatWindowFragment$oneToOneChatWindowPresenter$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final OneToOneChatWindowPresenter invoke() {
        return ActionMenuItem.valueOf().getExtras();
    }
}
