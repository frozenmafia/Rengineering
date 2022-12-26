package com.app.dream11.playerpoints;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public abstract class PlayerPointsSortType {
    private static final /* synthetic */ PlayerPointsSortType[] $VALUES;
    public static final PlayerPointsSortType PLAYER_ASC;
    public static final PlayerPointsSortType PLAYER_DESC;
    public static final PlayerPointsSortType POINTS_ASC;
    public static final PlayerPointsSortType POINTS_DESC;
    public static final PlayerPointsSortType SELECTED_BY_ASC;
    public static final PlayerPointsSortType SELECTED_BY_DESC;

    public abstract boolean isDesc();

    private PlayerPointsSortType(String str, int i) {
    }

    public static PlayerPointsSortType valueOf(String str) {
        return (PlayerPointsSortType) Enum.valueOf(PlayerPointsSortType.class, str);
    }

    public static PlayerPointsSortType[] values() {
        return (PlayerPointsSortType[]) $VALUES.clone();
    }

    /* renamed from: com.app.dream11.playerpoints.PlayerPointsSortType$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    enum AnonymousClass1 extends PlayerPointsSortType {
        @Override // com.app.dream11.playerpoints.PlayerPointsSortType
        public boolean isDesc() {
            return false;
        }

        private AnonymousClass1(String str, int i) {
            super(str, i);
        }
    }

    static {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1("PLAYER_ASC", 0);
        PLAYER_ASC = anonymousClass1;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2("PLAYER_DESC", 1);
        PLAYER_DESC = anonymousClass2;
        AnonymousClass3 anonymousClass3 = new AnonymousClass3("SELECTED_BY_ASC", 2);
        SELECTED_BY_ASC = anonymousClass3;
        AnonymousClass4 anonymousClass4 = new AnonymousClass4("SELECTED_BY_DESC", 3);
        SELECTED_BY_DESC = anonymousClass4;
        AnonymousClass5 anonymousClass5 = new AnonymousClass5("POINTS_ASC", 4);
        POINTS_ASC = anonymousClass5;
        AnonymousClass6 anonymousClass6 = new AnonymousClass6("POINTS_DESC", 5);
        POINTS_DESC = anonymousClass6;
        $VALUES = new PlayerPointsSortType[]{anonymousClass1, anonymousClass2, anonymousClass3, anonymousClass4, anonymousClass5, anonymousClass6};
    }

    /* renamed from: com.app.dream11.playerpoints.PlayerPointsSortType$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    enum AnonymousClass2 extends PlayerPointsSortType {
        @Override // com.app.dream11.playerpoints.PlayerPointsSortType
        public boolean isDesc() {
            return true;
        }

        private AnonymousClass2(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: com.app.dream11.playerpoints.PlayerPointsSortType$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    enum AnonymousClass3 extends PlayerPointsSortType {
        @Override // com.app.dream11.playerpoints.PlayerPointsSortType
        public boolean isDesc() {
            return false;
        }

        private AnonymousClass3(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: com.app.dream11.playerpoints.PlayerPointsSortType$4  reason: invalid class name */
    /* loaded from: classes6.dex */
    enum AnonymousClass4 extends PlayerPointsSortType {
        @Override // com.app.dream11.playerpoints.PlayerPointsSortType
        public boolean isDesc() {
            return true;
        }

        private AnonymousClass4(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: com.app.dream11.playerpoints.PlayerPointsSortType$5  reason: invalid class name */
    /* loaded from: classes6.dex */
    enum AnonymousClass5 extends PlayerPointsSortType {
        @Override // com.app.dream11.playerpoints.PlayerPointsSortType
        public boolean isDesc() {
            return false;
        }

        private AnonymousClass5(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: com.app.dream11.playerpoints.PlayerPointsSortType$6  reason: invalid class name */
    /* loaded from: classes6.dex */
    enum AnonymousClass6 extends PlayerPointsSortType {
        @Override // com.app.dream11.playerpoints.PlayerPointsSortType
        public boolean isDesc() {
            return true;
        }

        private AnonymousClass6(String str, int i) {
            super(str, i);
        }
    }

    public boolean isPlayerSort() {
        return this == PLAYER_ASC || this == PLAYER_DESC;
    }

    public boolean isSelectedBySort() {
        return this == SELECTED_BY_ASC || this == SELECTED_BY_DESC;
    }

    public boolean isPointsSort() {
        return this == POINTS_ASC || this == POINTS_DESC;
    }
}
