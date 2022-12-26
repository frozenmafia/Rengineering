package com.app.dream11.model;

import java.util.List;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class Integrations {
    private final Boolean enable;
    private final String name;
    private final List<Properties> properties;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Integrations copy$default(Integrations integrations, String str, Boolean bool, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = integrations.name;
        }
        if ((i & 2) != 0) {
            bool = integrations.enable;
        }
        if ((i & 4) != 0) {
            list = integrations.properties;
        }
        return integrations.copy(str, bool, list);
    }

    public final String component1() {
        return this.name;
    }

    public final Boolean component2() {
        return this.enable;
    }

    public final List<Properties> component3() {
        return this.properties;
    }

    public final Integrations copy(String str, Boolean bool, List<Properties> list) {
        return new Integrations(str, bool, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Integrations) {
            Integrations integrations = (Integrations) obj;
            return runAnimators.values((Object) this.name, (Object) integrations.name) && runAnimators.values(this.enable, integrations.enable) && runAnimators.values(this.properties, integrations.properties);
        }
        return false;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = str == null ? 0 : str.hashCode();
        Boolean bool = this.enable;
        int hashCode2 = bool == null ? 0 : bool.hashCode();
        List<Properties> list = this.properties;
        return (((hashCode * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        Boolean bool = this.enable;
        List<Properties> list = this.properties;
        return "Integrations(name=" + str + ", enable=" + bool + ", properties=" + list + ")";
    }

    public Integrations(String str, Boolean bool, List<Properties> list) {
        this.name = str;
        this.enable = bool;
        this.properties = list;
    }

    public final String getName() {
        return this.name;
    }

    public final Boolean getEnable() {
        return this.enable;
    }

    public final List<Properties> getProperties() {
        return this.properties;
    }
}
