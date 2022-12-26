package com.app.dream11.halloffame.flowstates;

import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import java.util.ArrayList;
import o.getTargetTypes;
/* loaded from: classes3.dex */
public final class HallOfFameFlowState extends FlowState {
    private static final String ARG_TOUR_ID = "tour_filter";
    public static final toString Companion = new toString(null);
    public static final String TOUR_ID = "tourId";

    public HallOfFameFlowState() {
        this(null, 1, null);
    }

    public HallOfFameFlowState(ArrayList<Integer> arrayList) {
        super(FlowStates.HALL_OF_FAME_MATCHES, null, 2, null);
        if (arrayList == null) {
            return;
        }
        setTourList(arrayList);
    }

    public /* synthetic */ HallOfFameFlowState(ArrayList arrayList, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : arrayList);
    }

    private final void setTourList(ArrayList<Integer> arrayList) {
        putExtra(ARG_TOUR_ID, arrayList);
    }

    public final ArrayList<Integer> getTourList() {
        int int$default = FlowState.getInt$default(this, "tourId", 0, 2, null);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(int$default));
        return arrayList;
    }

    public final boolean isFromDeepLink() {
        return containsKey("tourID");
    }

    /* loaded from: classes3.dex */
    public static final class toString {
        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }

        private toString() {
        }
    }
}
