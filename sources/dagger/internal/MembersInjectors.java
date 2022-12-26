package dagger.internal;

import java.util.Objects;
/* loaded from: classes7.dex */
public final class MembersInjectors {

    /* loaded from: classes7.dex */
    enum NoOpMembersInjector {
        INSTANCE;

        public void injectMembers(Object obj) {
            Objects.requireNonNull(obj, "Cannot inject members into a null reference");
        }
    }
}
