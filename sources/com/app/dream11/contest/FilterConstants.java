package com.app.dream11.contest;

import androidx.exifinterface.media.ExifInterface;
import com.app.dream11.core.service.graphql.api.type.ContestFilter;
import com.app.dream11.core.service.graphql.api.type.ContestFilterValueInput;
import com.app.dream11Pro.R;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import o.ComponentActivity;
import o.getTargetTypes;
/* loaded from: classes.dex */
public final class FilterConstants {
    public static final FilterConstants ah$a = new FilterConstants();

    /* loaded from: classes.dex */
    public interface toString {
        int displayResId();

        String displayText();

        ContestFilter getFilterOption();

        ContestFilterValueInput getFilterValue();
    }

    private FilterConstants() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final abstract class EntryFilter implements toString {
        public static final EntryFilter ENTRY_1_50 = new ENTRY_1_50("ENTRY_1_50", 0);
        public static final EntryFilter ENTRY_51_100 = new ENTRY_51_100("ENTRY_51_100", 1);
        public static final EntryFilter ENTRY_101_1000 = new ENTRY_101_1000("ENTRY_101_1000", 2);
        public static final EntryFilter ENTRY_1001 = new ENTRY_1001("ENTRY_1001", 3);
        private static final /* synthetic */ EntryFilter[] $VALUES = $values();

        private static final /* synthetic */ EntryFilter[] $values() {
            return new EntryFilter[]{ENTRY_1_50, ENTRY_51_100, ENTRY_101_1000, ENTRY_1001};
        }

        public /* synthetic */ EntryFilter(String str, int i, getTargetTypes gettargettypes) {
            this(str, i);
        }

        public static EntryFilter valueOf(String str) {
            return (EntryFilter) Enum.valueOf(EntryFilter.class, str);
        }

        public static EntryFilter[] values() {
            return (EntryFilter[]) $VALUES.clone();
        }

        /* loaded from: classes.dex */
        static final class ENTRY_1_50 extends EntryFilter {
            @Override // com.app.dream11.contest.FilterConstants.toString
            public int displayResId() {
                return R.string.res_0x7f12042a;
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public String displayText() {
                return "₹1 - ₹50";
            }

            ENTRY_1_50(String str, int i) {
                super(str, i, null);
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public ContestFilterValueInput getFilterValue() {
                return new ContestFilterValueInput(null, null, ComponentActivity.AnonymousClass5.ag$a.toString("50"), ComponentActivity.AnonymousClass5.ag$a.toString(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE), null, 19, null);
            }
        }

        private EntryFilter(String str, int i) {
        }

        /* loaded from: classes.dex */
        static final class ENTRY_51_100 extends EntryFilter {
            @Override // com.app.dream11.contest.FilterConstants.toString
            public int displayResId() {
                return R.string.res_0x7f12042b;
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public String displayText() {
                return "₹51 - ₹100";
            }

            ENTRY_51_100(String str, int i) {
                super(str, i, null);
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public ContestFilterValueInput getFilterValue() {
                return new ContestFilterValueInput(null, null, ComponentActivity.AnonymousClass5.ag$a.toString("100"), ComponentActivity.AnonymousClass5.ag$a.toString("51"), null, 19, null);
            }
        }

        /* loaded from: classes.dex */
        static final class ENTRY_101_1000 extends EntryFilter {
            @Override // com.app.dream11.contest.FilterConstants.toString
            public int displayResId() {
                return R.string.res_0x7f120429;
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public String displayText() {
                return "₹101 - ₹1,000";
            }

            ENTRY_101_1000(String str, int i) {
                super(str, i, null);
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public ContestFilterValueInput getFilterValue() {
                return new ContestFilterValueInput(null, null, ComponentActivity.AnonymousClass5.ag$a.toString("1000"), ComponentActivity.AnonymousClass5.ag$a.toString("101"), null, 19, null);
            }
        }

        /* loaded from: classes.dex */
        static final class ENTRY_1001 extends EntryFilter {
            @Override // com.app.dream11.contest.FilterConstants.toString
            public int displayResId() {
                return R.string.res_0x7f120428;
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public String displayText() {
                return "₹1,001 & above";
            }

            ENTRY_1001(String str, int i) {
                super(str, i, null);
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public ContestFilterValueInput getFilterValue() {
                return new ContestFilterValueInput(null, null, null, ComponentActivity.AnonymousClass5.ag$a.toString("1001"), null, 23, null);
            }
        }

        @Override // com.app.dream11.contest.FilterConstants.toString
        public ContestFilter getFilterOption() {
            return ContestFilter.ENTRY_FEE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final abstract class SpotsFilter implements toString {
        public static final SpotsFilter SPOTS_2 = new SPOTS_2("SPOTS_2", 0);
        public static final SpotsFilter SPOTS_3_10 = new SPOTS_3_10("SPOTS_3_10", 1);
        public static final SpotsFilter SPOTS_11_100 = new SPOTS_11_100("SPOTS_11_100", 2);
        public static final SpotsFilter SPOTS_101_1000 = new SPOTS_101_1000("SPOTS_101_1000", 3);
        public static final SpotsFilter SPOTS_1001 = new SPOTS_1001("SPOTS_1001", 4);
        private static final /* synthetic */ SpotsFilter[] $VALUES = $values();

        private static final /* synthetic */ SpotsFilter[] $values() {
            return new SpotsFilter[]{SPOTS_2, SPOTS_3_10, SPOTS_11_100, SPOTS_101_1000, SPOTS_1001};
        }

        public /* synthetic */ SpotsFilter(String str, int i, getTargetTypes gettargettypes) {
            this(str, i);
        }

        public static SpotsFilter valueOf(String str) {
            return (SpotsFilter) Enum.valueOf(SpotsFilter.class, str);
        }

        public static SpotsFilter[] values() {
            return (SpotsFilter[]) $VALUES.clone();
        }

        /* loaded from: classes.dex */
        static final class SPOTS_2 extends SpotsFilter {
            @Override // com.app.dream11.contest.FilterConstants.toString
            public int displayResId() {
                return R.string.res_0x7f120bf9;
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public String displayText() {
                return ExifInterface.GPS_MEASUREMENT_2D;
            }

            SPOTS_2(String str, int i) {
                super(str, i, null);
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public ContestFilterValueInput getFilterValue() {
                return new ContestFilterValueInput(null, null, null, null, ComponentActivity.AnonymousClass5.ag$a.toString(ExifInterface.GPS_MEASUREMENT_2D), 15, null);
            }
        }

        private SpotsFilter(String str, int i) {
        }

        /* loaded from: classes.dex */
        static final class SPOTS_3_10 extends SpotsFilter {
            @Override // com.app.dream11.contest.FilterConstants.toString
            public int displayResId() {
                return R.string.res_0x7f120bfa;
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public String displayText() {
                return "3 - 10";
            }

            SPOTS_3_10(String str, int i) {
                super(str, i, null);
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public ContestFilterValueInput getFilterValue() {
                return new ContestFilterValueInput(null, null, ComponentActivity.AnonymousClass5.ag$a.toString("10"), ComponentActivity.AnonymousClass5.ag$a.toString(ExifInterface.GPS_MEASUREMENT_3D), null, 19, null);
            }
        }

        /* loaded from: classes.dex */
        static final class SPOTS_11_100 extends SpotsFilter {
            @Override // com.app.dream11.contest.FilterConstants.toString
            public int displayResId() {
                return R.string.res_0x7f120bf8;
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public String displayText() {
                return "11 - 100";
            }

            SPOTS_11_100(String str, int i) {
                super(str, i, null);
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public ContestFilterValueInput getFilterValue() {
                return new ContestFilterValueInput(null, null, ComponentActivity.AnonymousClass5.ag$a.toString("100"), ComponentActivity.AnonymousClass5.ag$a.toString("11"), null, 19, null);
            }
        }

        /* loaded from: classes.dex */
        static final class SPOTS_101_1000 extends SpotsFilter {
            @Override // com.app.dream11.contest.FilterConstants.toString
            public int displayResId() {
                return R.string.res_0x7f120bf7;
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public String displayText() {
                return "101 - 1,000";
            }

            SPOTS_101_1000(String str, int i) {
                super(str, i, null);
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public ContestFilterValueInput getFilterValue() {
                return new ContestFilterValueInput(null, null, ComponentActivity.AnonymousClass5.ag$a.toString("1000"), ComponentActivity.AnonymousClass5.ag$a.toString("101"), null, 19, null);
            }
        }

        /* loaded from: classes.dex */
        static final class SPOTS_1001 extends SpotsFilter {
            @Override // com.app.dream11.contest.FilterConstants.toString
            public int displayResId() {
                return R.string.res_0x7f120bf6;
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public String displayText() {
                return "1,001 & above";
            }

            SPOTS_1001(String str, int i) {
                super(str, i, null);
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public ContestFilterValueInput getFilterValue() {
                return new ContestFilterValueInput(null, null, null, ComponentActivity.AnonymousClass5.ag$a.toString("1001"), null, 23, null);
            }
        }

        @Override // com.app.dream11.contest.FilterConstants.toString
        public ContestFilter getFilterOption() {
            return ContestFilter.CONTEST_SIZE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final abstract class PrizeFilter implements toString {
        public static final PrizeFilter PRIZE_1_10K = new PRIZE_1_10K("PRIZE_1_10K", 0);
        public static final PrizeFilter PRIZE_10K_1L = new PRIZE_10K_1L("PRIZE_10K_1L", 1);
        public static final PrizeFilter PRIZE_1L_10L = new PRIZE_1L_10L("PRIZE_1L_10L", 2);
        public static final PrizeFilter PRIZE_10L_25L = new PRIZE_10L_25L("PRIZE_10L_25L", 3);
        public static final PrizeFilter PRIZE_25L = new PRIZE_25L("PRIZE_25L", 4);
        private static final /* synthetic */ PrizeFilter[] $VALUES = $values();

        private static final /* synthetic */ PrizeFilter[] $values() {
            return new PrizeFilter[]{PRIZE_1_10K, PRIZE_10K_1L, PRIZE_1L_10L, PRIZE_10L_25L, PRIZE_25L};
        }

        public /* synthetic */ PrizeFilter(String str, int i, getTargetTypes gettargettypes) {
            this(str, i);
        }

        public static PrizeFilter valueOf(String str) {
            return (PrizeFilter) Enum.valueOf(PrizeFilter.class, str);
        }

        public static PrizeFilter[] values() {
            return (PrizeFilter[]) $VALUES.clone();
        }

        /* loaded from: classes.dex */
        static final class PRIZE_1_10K extends PrizeFilter {
            @Override // com.app.dream11.contest.FilterConstants.toString
            public int displayResId() {
                return R.string.res_0x7f120a0a;
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public String displayText() {
                return "₹1 - ₹10,000";
            }

            PRIZE_1_10K(String str, int i) {
                super(str, i, null);
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public ContestFilterValueInput getFilterValue() {
                return new ContestFilterValueInput(null, null, ComponentActivity.AnonymousClass5.ag$a.toString("10000"), ComponentActivity.AnonymousClass5.ag$a.toString(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE), null, 19, null);
            }
        }

        private PrizeFilter(String str, int i) {
        }

        /* loaded from: classes.dex */
        static final class PRIZE_10K_1L extends PrizeFilter {
            @Override // com.app.dream11.contest.FilterConstants.toString
            public int displayResId() {
                return R.string.res_0x7f120a08;
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public String displayText() {
                return "₹10,000 - ₹1 Lakh";
            }

            PRIZE_10K_1L(String str, int i) {
                super(str, i, null);
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public ContestFilterValueInput getFilterValue() {
                return new ContestFilterValueInput(null, null, ComponentActivity.AnonymousClass5.ag$a.toString("100000"), ComponentActivity.AnonymousClass5.ag$a.toString("10000"), null, 19, null);
            }
        }

        /* loaded from: classes.dex */
        static final class PRIZE_1L_10L extends PrizeFilter {
            @Override // com.app.dream11.contest.FilterConstants.toString
            public int displayResId() {
                return R.string.res_0x7f120a0b;
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public String displayText() {
                return "₹1 Lakh - ₹10 Lakh";
            }

            PRIZE_1L_10L(String str, int i) {
                super(str, i, null);
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public ContestFilterValueInput getFilterValue() {
                return new ContestFilterValueInput(null, null, ComponentActivity.AnonymousClass5.ag$a.toString("1000000"), ComponentActivity.AnonymousClass5.ag$a.toString("100000"), null, 19, null);
            }
        }

        /* loaded from: classes.dex */
        static final class PRIZE_10L_25L extends PrizeFilter {
            @Override // com.app.dream11.contest.FilterConstants.toString
            public int displayResId() {
                return R.string.res_0x7f120a09;
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public String displayText() {
                return "₹10 Lakh - ₹25 Lakh";
            }

            PRIZE_10L_25L(String str, int i) {
                super(str, i, null);
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public ContestFilterValueInput getFilterValue() {
                return new ContestFilterValueInput(null, null, ComponentActivity.AnonymousClass5.ag$a.toString("2500000"), ComponentActivity.AnonymousClass5.ag$a.toString("1000000"), null, 19, null);
            }
        }

        /* loaded from: classes.dex */
        static final class PRIZE_25L extends PrizeFilter {
            @Override // com.app.dream11.contest.FilterConstants.toString
            public int displayResId() {
                return R.string.res_0x7f120a0c;
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public String displayText() {
                return "₹25 Lakh & above";
            }

            PRIZE_25L(String str, int i) {
                super(str, i, null);
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public ContestFilterValueInput getFilterValue() {
                return new ContestFilterValueInput(null, null, null, ComponentActivity.AnonymousClass5.ag$a.toString("2500000"), null, 23, null);
            }
        }

        @Override // com.app.dream11.contest.FilterConstants.toString
        public ContestFilter getFilterOption() {
            return ContestFilter.PRIZE_AMOUNT;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final abstract class ContestTypeFilter implements toString {
        public static final ContestTypeFilter SINGLE_ENTRY = new SINGLE_ENTRY("SINGLE_ENTRY", 0);
        public static final ContestTypeFilter MULTI_ENTRY = new MULTI_ENTRY("MULTI_ENTRY", 1);
        public static final ContestTypeFilter SINGLE_WINNER = new SINGLE_WINNER("SINGLE_WINNER", 2);
        public static final ContestTypeFilter MULTI_WINNER = new MULTI_WINNER("MULTI_WINNER", 3);
        public static final ContestTypeFilter CONFIRMED = new CONFIRMED("CONFIRMED", 4);
        public static final ContestTypeFilter FLEXIBLE = new FLEXIBLE("FLEXIBLE", 5);
        private static final /* synthetic */ ContestTypeFilter[] $VALUES = $values();

        private static final /* synthetic */ ContestTypeFilter[] $values() {
            return new ContestTypeFilter[]{SINGLE_ENTRY, MULTI_ENTRY, SINGLE_WINNER, MULTI_WINNER, CONFIRMED, FLEXIBLE};
        }

        public /* synthetic */ ContestTypeFilter(String str, int i, getTargetTypes gettargettypes) {
            this(str, i);
        }

        public static ContestTypeFilter valueOf(String str) {
            return (ContestTypeFilter) Enum.valueOf(ContestTypeFilter.class, str);
        }

        public static ContestTypeFilter[] values() {
            return (ContestTypeFilter[]) $VALUES.clone();
        }

        /* loaded from: classes.dex */
        static final class SINGLE_ENTRY extends ContestTypeFilter {
            @Override // com.app.dream11.contest.FilterConstants.toString
            public int displayResId() {
                return R.string.res_0x7f120ba8;
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public String displayText() {
                return "Single Entry";
            }

            SINGLE_ENTRY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public ContestFilterValueInput getFilterValue() {
                return new ContestFilterValueInput(null, null, null, null, ComponentActivity.AnonymousClass5.ag$a.toString("SINGLE_ENTRY"), 15, null);
            }
        }

        private ContestTypeFilter(String str, int i) {
        }

        /* loaded from: classes.dex */
        static final class MULTI_ENTRY extends ContestTypeFilter {
            @Override // com.app.dream11.contest.FilterConstants.toString
            public int displayResId() {
                return R.string.res_0x7f12085c;
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public String displayText() {
                return "Multi Entry";
            }

            MULTI_ENTRY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public ContestFilterValueInput getFilterValue() {
                return new ContestFilterValueInput(null, null, null, null, ComponentActivity.AnonymousClass5.ag$a.toString("MULTI_ENTRY"), 15, null);
            }
        }

        /* loaded from: classes.dex */
        static final class SINGLE_WINNER extends ContestTypeFilter {
            @Override // com.app.dream11.contest.FilterConstants.toString
            public int displayResId() {
                return R.string.res_0x7f120ba9;
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public String displayText() {
                return "Single Winner";
            }

            SINGLE_WINNER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public ContestFilterValueInput getFilterValue() {
                return new ContestFilterValueInput(null, null, null, null, ComponentActivity.AnonymousClass5.ag$a.toString("SINGLE_WINNER"), 15, null);
            }
        }

        /* loaded from: classes.dex */
        static final class MULTI_WINNER extends ContestTypeFilter {
            @Override // com.app.dream11.contest.FilterConstants.toString
            public int displayResId() {
                return R.string.res_0x7f12085d;
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public String displayText() {
                return "Multi Winner";
            }

            MULTI_WINNER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public ContestFilterValueInput getFilterValue() {
                return new ContestFilterValueInput(null, null, null, null, ComponentActivity.AnonymousClass5.ag$a.toString("MULTI_WINNER"), 15, null);
            }
        }

        /* loaded from: classes.dex */
        static final class CONFIRMED extends ContestTypeFilter {
            @Override // com.app.dream11.contest.FilterConstants.toString
            public int displayResId() {
                return R.string.res_0x7f1205a9;
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public String displayText() {
                return "Guaranteed";
            }

            CONFIRMED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public ContestFilterValueInput getFilterValue() {
                return new ContestFilterValueInput(null, null, null, null, ComponentActivity.AnonymousClass5.ag$a.toString("CONFIRMED"), 15, null);
            }
        }

        /* loaded from: classes.dex */
        static final class FLEXIBLE extends ContestTypeFilter {
            @Override // com.app.dream11.contest.FilterConstants.toString
            public int displayResId() {
                return R.string.res_0x7f120509;
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public String displayText() {
                return "Flexible";
            }

            FLEXIBLE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.app.dream11.contest.FilterConstants.toString
            public ContestFilterValueInput getFilterValue() {
                return new ContestFilterValueInput(null, null, null, null, ComponentActivity.AnonymousClass5.ag$a.toString("FLEXIBLE"), 15, null);
            }
        }

        @Override // com.app.dream11.contest.FilterConstants.toString
        public ContestFilter getFilterOption() {
            return ContestFilter.CONTEST_TYPE;
        }
    }
}
