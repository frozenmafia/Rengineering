package com.app.dream11.contest;

import o.AlertController;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class ContestSectionDetailsSortType {
    private static final /* synthetic */ ContestSectionDetailsSortType[] $VALUES;
    public static final ContestSectionDetailsSortType ENTRY_ASC;
    public static final ContestSectionDetailsSortType ENTRY_DESC;
    public static final ContestSectionDetailsSortType NONE;
    public static final ContestSectionDetailsSortType PRIZE_ASC;
    public static final ContestSectionDetailsSortType PRIZE_DESC;
    public static final ContestSectionDetailsSortType SPOT_ASC;
    public static final ContestSectionDetailsSortType SPOT_DESC;
    public static final ContestSectionDetailsSortType WINNERS_ASC;
    public static final ContestSectionDetailsSortType WINNERS_DESC;

    /* synthetic */ ContestSectionDetailsSortType(String str, int i, AlertController.AlertParams alertParams) {
        this(str, i);
    }

    public abstract boolean isDesc();

    private ContestSectionDetailsSortType(String str, int i) {
    }

    public static ContestSectionDetailsSortType valueOf(String str) {
        return (ContestSectionDetailsSortType) Enum.valueOf(ContestSectionDetailsSortType.class, str);
    }

    public static ContestSectionDetailsSortType[] values() {
        return (ContestSectionDetailsSortType[]) $VALUES.clone();
    }

    /* renamed from: com.app.dream11.contest.ContestSectionDetailsSortType$1  reason: invalid class name */
    /* loaded from: classes.dex */
    enum AnonymousClass1 extends ContestSectionDetailsSortType {
        @Override // com.app.dream11.contest.ContestSectionDetailsSortType
        public boolean isDesc() {
            return false;
        }

        private AnonymousClass1(String str, int i) {
            super(str, i, null);
        }
    }

    static {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1("NONE", 0);
        NONE = anonymousClass1;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2("PRIZE_ASC", 1);
        PRIZE_ASC = anonymousClass2;
        AnonymousClass3 anonymousClass3 = new AnonymousClass3("PRIZE_DESC", 2);
        PRIZE_DESC = anonymousClass3;
        AnonymousClass4 anonymousClass4 = new AnonymousClass4("SPOT_ASC", 3);
        SPOT_ASC = anonymousClass4;
        AnonymousClass5 anonymousClass5 = new AnonymousClass5("SPOT_DESC", 4);
        SPOT_DESC = anonymousClass5;
        AnonymousClass6 anonymousClass6 = new AnonymousClass6("WINNERS_ASC", 5);
        WINNERS_ASC = anonymousClass6;
        AnonymousClass7 anonymousClass7 = new AnonymousClass7("WINNERS_DESC", 6);
        WINNERS_DESC = anonymousClass7;
        AnonymousClass8 anonymousClass8 = new AnonymousClass8("ENTRY_ASC", 7);
        ENTRY_ASC = anonymousClass8;
        AnonymousClass9 anonymousClass9 = new AnonymousClass9("ENTRY_DESC", 8);
        ENTRY_DESC = anonymousClass9;
        $VALUES = new ContestSectionDetailsSortType[]{anonymousClass1, anonymousClass2, anonymousClass3, anonymousClass4, anonymousClass5, anonymousClass6, anonymousClass7, anonymousClass8, anonymousClass9};
    }

    /* renamed from: com.app.dream11.contest.ContestSectionDetailsSortType$2  reason: invalid class name */
    /* loaded from: classes.dex */
    enum AnonymousClass2 extends ContestSectionDetailsSortType {
        @Override // com.app.dream11.contest.ContestSectionDetailsSortType
        public boolean isDesc() {
            return false;
        }

        private AnonymousClass2(String str, int i) {
            super(str, i, null);
        }
    }

    /* renamed from: com.app.dream11.contest.ContestSectionDetailsSortType$3  reason: invalid class name */
    /* loaded from: classes.dex */
    enum AnonymousClass3 extends ContestSectionDetailsSortType {
        @Override // com.app.dream11.contest.ContestSectionDetailsSortType
        public boolean isDesc() {
            return true;
        }

        private AnonymousClass3(String str, int i) {
            super(str, i, null);
        }
    }

    /* renamed from: com.app.dream11.contest.ContestSectionDetailsSortType$4  reason: invalid class name */
    /* loaded from: classes.dex */
    enum AnonymousClass4 extends ContestSectionDetailsSortType {
        @Override // com.app.dream11.contest.ContestSectionDetailsSortType
        public boolean isDesc() {
            return false;
        }

        private AnonymousClass4(String str, int i) {
            super(str, i, null);
        }
    }

    /* renamed from: com.app.dream11.contest.ContestSectionDetailsSortType$5  reason: invalid class name */
    /* loaded from: classes.dex */
    enum AnonymousClass5 extends ContestSectionDetailsSortType {
        @Override // com.app.dream11.contest.ContestSectionDetailsSortType
        public boolean isDesc() {
            return true;
        }

        private AnonymousClass5(String str, int i) {
            super(str, i, null);
        }
    }

    /* renamed from: com.app.dream11.contest.ContestSectionDetailsSortType$6  reason: invalid class name */
    /* loaded from: classes.dex */
    enum AnonymousClass6 extends ContestSectionDetailsSortType {
        @Override // com.app.dream11.contest.ContestSectionDetailsSortType
        public boolean isDesc() {
            return false;
        }

        private AnonymousClass6(String str, int i) {
            super(str, i, null);
        }
    }

    /* renamed from: com.app.dream11.contest.ContestSectionDetailsSortType$7  reason: invalid class name */
    /* loaded from: classes.dex */
    enum AnonymousClass7 extends ContestSectionDetailsSortType {
        @Override // com.app.dream11.contest.ContestSectionDetailsSortType
        public boolean isDesc() {
            return true;
        }

        private AnonymousClass7(String str, int i) {
            super(str, i, null);
        }
    }

    /* renamed from: com.app.dream11.contest.ContestSectionDetailsSortType$8  reason: invalid class name */
    /* loaded from: classes.dex */
    enum AnonymousClass8 extends ContestSectionDetailsSortType {
        @Override // com.app.dream11.contest.ContestSectionDetailsSortType
        public boolean isDesc() {
            return false;
        }

        private AnonymousClass8(String str, int i) {
            super(str, i, null);
        }
    }

    /* renamed from: com.app.dream11.contest.ContestSectionDetailsSortType$9  reason: invalid class name */
    /* loaded from: classes.dex */
    enum AnonymousClass9 extends ContestSectionDetailsSortType {
        @Override // com.app.dream11.contest.ContestSectionDetailsSortType
        public boolean isDesc() {
            return true;
        }

        private AnonymousClass9(String str, int i) {
            super(str, i, null);
        }
    }

    public boolean isPriceSort() {
        return this == PRIZE_ASC || this == PRIZE_DESC;
    }

    public boolean isSpotSort() {
        return this == SPOT_ASC || this == SPOT_DESC;
    }

    public boolean isWinnersSort() {
        return this == WINNERS_ASC || this == WINNERS_DESC;
    }

    public boolean isEntrySort() {
        return this == ENTRY_ASC || this == ENTRY_DESC;
    }
}
