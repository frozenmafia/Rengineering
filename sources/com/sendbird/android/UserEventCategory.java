package com.sendbird.android;
/* loaded from: classes5.dex */
enum UserEventCategory {
    CATEGORY_NONE(0),
    USER_UNBLOCK(20000),
    USER_BLOCK(20001),
    FRIEND_DISCOVERED(20900);
    
    private final int category;

    UserEventCategory(int i) {
        this.category = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static UserEventCategory from(int i) {
        UserEventCategory[] values;
        for (UserEventCategory userEventCategory : values()) {
            if (userEventCategory.category == i) {
                return userEventCategory;
            }
        }
        return CATEGORY_NONE;
    }

    public int getCategory() {
        return this.category;
    }
}
