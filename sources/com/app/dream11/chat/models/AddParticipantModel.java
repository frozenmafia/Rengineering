package com.app.dream11.chat.models;

import java.io.Serializable;
import o.runAnimators;
/* loaded from: classes.dex */
public final class AddParticipantModel implements Serializable {
    private final boolean isContactsListItem;
    private final String name;
    private final String profilePic;
    private final int userId;

    public static /* synthetic */ AddParticipantModel copy$default(AddParticipantModel addParticipantModel, int i, String str, String str2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = addParticipantModel.userId;
        }
        if ((i2 & 2) != 0) {
            str = addParticipantModel.name;
        }
        if ((i2 & 4) != 0) {
            str2 = addParticipantModel.profilePic;
        }
        if ((i2 & 8) != 0) {
            z = addParticipantModel.isContactsListItem;
        }
        return addParticipantModel.copy(i, str, str2, z);
    }

    public final int component1() {
        return this.userId;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.profilePic;
    }

    public final boolean component4() {
        return this.isContactsListItem;
    }

    public final AddParticipantModel copy(int i, String str, String str2, boolean z) {
        runAnimators.ag$a(str, "name");
        runAnimators.ag$a(str2, "profilePic");
        return new AddParticipantModel(i, str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AddParticipantModel) {
            AddParticipantModel addParticipantModel = (AddParticipantModel) obj;
            return this.userId == addParticipantModel.userId && runAnimators.values((Object) this.name, (Object) addParticipantModel.name) && runAnimators.values((Object) this.profilePic, (Object) addParticipantModel.profilePic) && this.isContactsListItem == addParticipantModel.isContactsListItem;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i = this.userId;
        int hashCode = this.name.hashCode();
        int hashCode2 = this.profilePic.hashCode();
        boolean z = this.isContactsListItem;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return (((((i * 31) + hashCode) * 31) + hashCode2) * 31) + i2;
    }

    public String toString() {
        int i = this.userId;
        String str = this.name;
        String str2 = this.profilePic;
        boolean z = this.isContactsListItem;
        return "AddParticipantModel(userId=" + i + ", name=" + str + ", profilePic=" + str2 + ", isContactsListItem=" + z + ")";
    }

    public AddParticipantModel(int i, String str, String str2, boolean z) {
        runAnimators.ag$a(str, "name");
        runAnimators.ag$a(str2, "profilePic");
        this.userId = i;
        this.name = str;
        this.profilePic = str2;
        this.isContactsListItem = z;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProfilePic() {
        return this.profilePic;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final boolean isContactsListItem() {
        return this.isContactsListItem;
    }
}
