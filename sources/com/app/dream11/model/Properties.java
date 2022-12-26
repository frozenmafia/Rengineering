package com.app.dream11.model;

import o.runAnimators;
/* loaded from: classes3.dex */
public final class Properties {
    private final Boolean enabled;
    private final String propertyName;

    public static /* synthetic */ Properties copy$default(Properties properties, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = properties.propertyName;
        }
        if ((i & 2) != 0) {
            bool = properties.enabled;
        }
        return properties.copy(str, bool);
    }

    public final String component1() {
        return this.propertyName;
    }

    public final Boolean component2() {
        return this.enabled;
    }

    public final Properties copy(String str, Boolean bool) {
        return new Properties(str, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Properties) {
            Properties properties = (Properties) obj;
            return runAnimators.values((Object) this.propertyName, (Object) properties.propertyName) && runAnimators.values(this.enabled, properties.enabled);
        }
        return false;
    }

    public int hashCode() {
        String str = this.propertyName;
        int hashCode = str == null ? 0 : str.hashCode();
        Boolean bool = this.enabled;
        return (hashCode * 31) + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.propertyName;
        Boolean bool = this.enabled;
        return "Properties(propertyName=" + str + ", enabled=" + bool + ")";
    }

    public Properties(String str, Boolean bool) {
        this.propertyName = str;
        this.enabled = bool;
    }

    public final String getPropertyName() {
        return this.propertyName;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }
}
