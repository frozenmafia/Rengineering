package com.app.dream11.core.service.graphql.api.type;

import java.util.List;
import o.ComponentActivity;
import o.OnBackPressedCallback;
import o.remove;
import o.remove$ah$a;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class AwardMarkAsSeen implements ComponentActivity.AnonymousClass6 {
    private final List<SeenEntity> seenEntity;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AwardMarkAsSeen copy$default(AwardMarkAsSeen awardMarkAsSeen, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = awardMarkAsSeen.seenEntity;
        }
        return awardMarkAsSeen.copy(list);
    }

    public final List<SeenEntity> component1() {
        return this.seenEntity;
    }

    public final AwardMarkAsSeen copy(List<SeenEntity> list) {
        runAnimators.ag$a(list, "seenEntity");
        return new AwardMarkAsSeen(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AwardMarkAsSeen) && runAnimators.values(this.seenEntity, ((AwardMarkAsSeen) obj).seenEntity);
    }

    public int hashCode() {
        return this.seenEntity.hashCode();
    }

    public String toString() {
        List<SeenEntity> list = this.seenEntity;
        return "AwardMarkAsSeen(seenEntity=" + list + ")";
    }

    public AwardMarkAsSeen(List<SeenEntity> list) {
        runAnimators.ag$a(list, "seenEntity");
        this.seenEntity = list;
    }

    public final List<SeenEntity> getSeenEntity() {
        return this.seenEntity;
    }

    @Override // o.ComponentActivity.AnonymousClass6
    public remove marshaller() {
        remove$ah$a remove_ah_a = remove.ag$a;
        return new remove() { // from class: com.app.dream11.core.service.graphql.api.type.AwardMarkAsSeen$marshaller$$inlined$invoke$1
            @Override // o.remove
            public void marshal(OnBackPressedCallback onBackPressedCallback) {
                runAnimators.valueOf(onBackPressedCallback, "writer");
                onBackPressedCallback.ah$a("seenEntity", new AwardMarkAsSeen$marshaller$1$1(AwardMarkAsSeen.this));
            }
        };
    }
}
