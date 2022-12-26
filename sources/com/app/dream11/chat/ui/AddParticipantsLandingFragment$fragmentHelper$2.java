package com.app.dream11.chat.ui;

import com.app.dream11Pro.R;
import kotlin.jvm.internal.Lambda;
import o.MenuPresenter;
import o.Styleable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AddParticipantsLandingFragment$fragmentHelper$2 extends Lambda implements Styleable.ArcMotion<MenuPresenter> {
    final /* synthetic */ AddParticipantsLandingFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddParticipantsLandingFragment$fragmentHelper$2(AddParticipantsLandingFragment addParticipantsLandingFragment) {
        super(0);
        this.this$0 = addParticipantsLandingFragment;
    }

    @Override // o.Styleable.ArcMotion
    public final MenuPresenter invoke() {
        return new MenuPresenter(this.this$0.getChildFragmentManager(), R.id.fl_tabs_container);
    }
}
