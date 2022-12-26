package com.app.dream11.chat.groups;

import com.app.dream11.chat.models.AddParticipantModel;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes.dex */
final class CreateGroupPresenter$sendCreateGroupConfirmClickedEvent$1$noOfContactsAdded$1 extends Lambda implements Styleable.ChangeBounds<AddParticipantModel, Boolean> {
    public static final CreateGroupPresenter$sendCreateGroupConfirmClickedEvent$1$noOfContactsAdded$1 INSTANCE = new CreateGroupPresenter$sendCreateGroupConfirmClickedEvent$1$noOfContactsAdded$1();

    CreateGroupPresenter$sendCreateGroupConfirmClickedEvent$1$noOfContactsAdded$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final Boolean invoke(AddParticipantModel addParticipantModel) {
        return Boolean.valueOf(addParticipantModel.isContactsListItem());
    }
}
