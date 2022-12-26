package com.app.dream11.model;

import com.app.dream11.core.service.graphql.api.type.ContestCategory;
import com.app.dream11.utils.FlowStates;
import com.sendbird.android.constant.StringSet;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import o.Transition;
import o.getStateDrawableIndex;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes.dex */
public class FlowState implements Serializable {
    public static final Companion Companion = new Companion(null);
    public static final String OVERLAY_STATE = "overlaystate";
    public static final String SITE = "site";
    public static final String SOURCE_STATE = "sourcestate";
    public static final String WLS_SLUG = "wlsSlug";
    private static final long serialVersionUID = 2944863815220770055L;
    private final FlowStates flowState;
    private boolean isActivityToBeFinished;
    private boolean isClearPrevFragment;
    private boolean isTaskToBeCleared;
    private final Map<String, Serializable> mExtraMap;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlowState(FlowStates flowStates) {
        this(flowStates, null, 2, null);
        runAnimators.ag$a(flowStates, "flowState");
    }

    public final int getInt(String str) {
        return getInt$default(this, str, 0, 2, null);
    }

    public final long getLong(String str) {
        return getLong$default(this, str, 0L, 2, null);
    }

    public FlowState(FlowStates flowStates, FlowState flowState) {
        runAnimators.ag$a(flowStates, "flowState");
        this.flowState = flowStates;
        HashMap hashMap = new HashMap();
        this.mExtraMap = hashMap;
        if (flowState != null) {
            hashMap.put(SOURCE_STATE, flowState);
        }
    }

    public /* synthetic */ FlowState(FlowStates flowStates, FlowState flowState, int i, getTargetTypes gettargettypes) {
        this(flowStates, (i & 2) != 0 ? null : flowState);
    }

    public final FlowStates getFlowState() {
        return this.flowState;
    }

    public final boolean isTaskToBeCleared() {
        return this.isTaskToBeCleared;
    }

    public final boolean isActivityToBeFinished() {
        return this.isActivityToBeFinished;
    }

    public final void setActivityToBeFinished(boolean z) {
        this.isActivityToBeFinished = z;
    }

    public final boolean isClearPrevFragment() {
        return this.isClearPrevFragment;
    }

    public final void setClearPrevFragment(boolean z) {
        this.isClearPrevFragment = z;
    }

    public final void clearTask() {
        this.isTaskToBeCleared = true;
    }

    public void putAllExtras(Map<String, Serializable> map) {
        runAnimators.ag$a(map, "args");
        FlowState flowState = this;
        for (Map.Entry<String, Serializable> entry : map.entrySet()) {
            flowState.putExtra(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlowState(FlowStates flowStates, FlowState flowState, String str) {
        this(flowStates, flowState);
        runAnimators.ag$a(flowStates, "flowState");
        this.mExtraMap.put(WLS_SLUG, str);
    }

    public final boolean containsKey(String str) {
        return this.mExtraMap.containsKey(str);
    }

    public final FlowState putExtra(String str, Serializable serializable) {
        runAnimators.ag$a(str, StringSet.key);
        this.mExtraMap.put(str, serializable);
        return this;
    }

    public final FlowState putExtraAll(Map<String, ? extends Serializable> map) {
        runAnimators.ag$a(map, "extras");
        for (Map.Entry<String, ? extends Serializable> entry : map.entrySet()) {
            this.mExtraMap.put(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final Serializable getExtra(String str) {
        if (this.mExtraMap.containsKey(str)) {
            return this.mExtraMap.get(str);
        }
        return null;
    }

    public final <M extends Serializable> M getExtra(String str, Class<M> cls, M m) {
        runAnimators.ag$a(cls, "classOfModelObject");
        getStateDrawableIndex getstatedrawableindex = new getStateDrawableIndex(this);
        try {
            M m2 = (M) getExtra(str);
            getstatedrawableindex.ah$a("erxtra " + m2 + " c " + m2);
            return m2;
        } catch (ClassCastException e) {
            getstatedrawableindex.ah$a("e caught");
            String name = cls.getName();
            getstatedrawableindex.valueOf("Cannot convert string obtained from prefs into collection of type " + name, e);
            getstatedrawableindex.ah$a("returning default value");
            return m;
        }
    }

    public final <M extends Serializable> M getExtra(String str, Class<M> cls) {
        runAnimators.ag$a(cls, "classFile");
        try {
            return (M) getExtra(str, cls, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public final Map<String, Serializable> getExtras() {
        return this.mExtraMap;
    }

    public String toString() {
        FlowStates flowStates = this.flowState;
        Map<String, Serializable> map = this.mExtraMap;
        return "FlowState{mStateId=" + flowStates + ", mExtraMap=" + map + "}";
    }

    public final void setOverlayState(FlowState flowState) {
        putExtra(OVERLAY_STATE, flowState);
    }

    public final FlowState getOverLayState() {
        if (containsKey(OVERLAY_STATE) && (getExtra(OVERLAY_STATE) instanceof FlowState)) {
            return (FlowState) getExtra(OVERLAY_STATE);
        }
        return null;
    }

    public final FlowState getSourceState() {
        if (containsKey(SOURCE_STATE) && (getExtra(SOURCE_STATE) instanceof FlowState)) {
            return (FlowState) getExtra(SOURCE_STATE);
        }
        return null;
    }

    public static /* synthetic */ int getInt$default(FlowState flowState, String str, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return flowState.getInt(str, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInt");
    }

    public final int getInt(String str, int i) {
        Serializable serializable;
        return (this.mExtraMap.containsKey(str) && (serializable = this.mExtraMap.get(str)) != null && (serializable instanceof Integer)) ? ((Number) serializable).intValue() : i;
    }

    public static /* synthetic */ long getLong$default(FlowState flowState, String str, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                j = 0;
            }
            return flowState.getLong(str, j);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLong");
    }

    public final long getLong(String str, long j) {
        Serializable serializable;
        return (this.mExtraMap.containsKey(str) && (serializable = this.mExtraMap.get(str)) != null && (serializable instanceof Long)) ? ((Number) serializable).longValue() : j;
    }

    public final double getDouble(String str) {
        return getDouble(str, 0.0d);
    }

    public final double getDouble(String str, double d) {
        Serializable serializable;
        return (!this.mExtraMap.containsKey(str) || (serializable = this.mExtraMap.get(str)) == null) ? d : serializable instanceof Double ? ((Number) serializable).doubleValue() : serializable instanceof Integer ? ((Number) serializable).intValue() : d;
    }

    public final String getString(String str) {
        Serializable serializable;
        return (this.mExtraMap.containsKey(str) && (serializable = this.mExtraMap.get(str)) != null && (serializable instanceof String)) ? (String) serializable : "";
    }

    public final String getString(String str, String str2) {
        Serializable serializable;
        runAnimators.ag$a(str2, "defaultValue");
        return (this.mExtraMap.containsKey(str) && (serializable = this.mExtraMap.get(str)) != null && (serializable instanceof String)) ? (String) serializable : str2;
    }

    public final boolean getBoolean(String str) {
        if (this.mExtraMap.containsKey(str)) {
            Serializable serializable = this.mExtraMap.get(str);
            if (serializable instanceof Boolean) {
                return ((Boolean) serializable).booleanValue();
            }
        }
        return false;
    }

    public final String getWlsSlug() {
        if (this.mExtraMap.containsKey(WLS_SLUG)) {
            Serializable serializable = this.mExtraMap.get(WLS_SLUG);
            if (serializable instanceof String) {
                return (String) serializable;
            }
        } else if (this.mExtraMap.containsKey(SITE)) {
            Serializable serializable2 = this.mExtraMap.get(SITE);
            if (serializable2 instanceof String) {
                return (String) serializable2;
            }
        }
        return null;
    }

    public final boolean getBoolean(String str, boolean z) {
        if (this.mExtraMap.containsKey(str)) {
            Serializable serializable = this.mExtraMap.get(str);
            Boolean bool = serializable instanceof Boolean ? (Boolean) serializable : null;
            return bool == null ? z : bool.booleanValue();
        }
        return z;
    }

    public final ContestCategory getContestCategory(String str, ContestCategory contestCategory) {
        runAnimators.ag$a(contestCategory, "defaultValue");
        if (this.mExtraMap.containsKey(str)) {
            Serializable serializable = this.mExtraMap.get(str);
            ContestCategory contestCategory2 = serializable instanceof ContestCategory ? (ContestCategory) serializable : null;
            return contestCategory2 == null ? contestCategory : contestCategory2;
        }
        return contestCategory;
    }

    public final Serializable remove(String str) {
        return (Serializable) Transition.AnonymousClass3.ag$a(this.mExtraMap).remove(str);
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }
    }
}
