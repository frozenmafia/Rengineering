package o;

import com.app.dream11.myprofile.profilerevamp.profilemapper.UserType;
/* loaded from: classes3.dex */
public final class createConstraintReference$ag$a {

    /* loaded from: classes3.dex */
    public final /* synthetic */ class values {
        public static final /* synthetic */ int[] ag$a;
        public static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[UserType.values().length];
            iArr[UserType.NORMAL.ordinal()] = 1;
            iArr[UserType.CELEBRITY.ordinal()] = 2;
            iArr[UserType.PAGE.ordinal()] = 3;
            iArr[UserType.SPORTAN.ordinal()] = 4;
            iArr[UserType.DELETED.ordinal()] = 5;
            ag$a = iArr;
            int[] iArr2 = new int[com.app.dream11.core.service.graphql.api.type.UserType.values().length];
            iArr2[com.app.dream11.core.service.graphql.api.type.UserType.NORMAL.ordinal()] = 1;
            iArr2[com.app.dream11.core.service.graphql.api.type.UserType.CELEBRITY.ordinal()] = 2;
            iArr2[com.app.dream11.core.service.graphql.api.type.UserType.PAGE.ordinal()] = 3;
            iArr2[com.app.dream11.core.service.graphql.api.type.UserType.SPORTAN.ordinal()] = 4;
            iArr2[com.app.dream11.core.service.graphql.api.type.UserType.DELETED.ordinal()] = 5;
            values = iArr2;
        }
    }

    public /* synthetic */ createConstraintReference$ag$a(getTargetTypes gettargettypes) {
        this();
    }

    private createConstraintReference$ag$a() {
    }

    public final com.app.dream11.core.service.graphql.api.type.UserType ag$a(UserType userType) {
        runAnimators.ag$a(userType, "userType");
        int i = values.ag$a[userType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return com.app.dream11.core.service.graphql.api.type.UserType.DELETED;
                        }
                        return com.app.dream11.core.service.graphql.api.type.UserType.UNKNOWN__;
                    }
                    return com.app.dream11.core.service.graphql.api.type.UserType.SPORTAN;
                }
                return com.app.dream11.core.service.graphql.api.type.UserType.PAGE;
            }
            return com.app.dream11.core.service.graphql.api.type.UserType.CELEBRITY;
        }
        return com.app.dream11.core.service.graphql.api.type.UserType.NORMAL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserType valueOf(com.app.dream11.core.service.graphql.api.type.UserType userType) {
        if (userType == null) {
            return null;
        }
        return createConstraintReference.valueOf.ag$a(userType);
    }

    private final UserType ag$a(com.app.dream11.core.service.graphql.api.type.UserType userType) {
        int i = values.values[userType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return UserType.DELETED;
                        }
                        return UserType.UNKNOWN;
                    }
                    return UserType.SPORTAN;
                }
                return UserType.PAGE;
            }
            return UserType.CELEBRITY;
        }
        return UserType.NORMAL;
    }
}
