package com.app.dream11.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes3.dex */
public class SportConfigJson implements Serializable {
    private static final long serialVersionUID = 1;
    private SportPlayerType[] listPlayerTypesByOrder;
    private Map<String, SportPlayerType> mapPlayerTypesById = new TreeMap();
    private Map<String, SportPlayerType> mapPlayerTypesByType = new TreeMap();
    private List<PlayerRole> playerRole;
    private SportPlayerType[] playerType;
    private String[] typeDisplayOrder;

    public String[] getTypeDisplayOrder() {
        return this.typeDisplayOrder;
    }

    public SportPlayerType[] getPlayerType() {
        buildSupportLists();
        return this.playerType;
    }

    public void setPlayerType(SportPlayerType[] sportPlayerTypeArr) {
        this.playerType = sportPlayerTypeArr;
        buildSupportLists();
    }

    public SportPlayerType getPlayerTypeById(String str) {
        buildSupportLists();
        return this.mapPlayerTypesById.get(str);
    }

    public SportPlayerType getPlayerTypeByType(String str) {
        buildSupportLists();
        return this.mapPlayerTypesByType.get(str);
    }

    public SportPlayerType[] getPlayerTypesInOrder() {
        buildSupportLists();
        return this.listPlayerTypesByOrder;
    }

    public List<PlayerRole> getPlayerRole() {
        return this.playerRole;
    }

    private void buildSupportLists() {
        SportPlayerType[] sportPlayerTypeArr;
        if (this.mapPlayerTypesByType.size() == 0) {
            int i = 0;
            for (SportPlayerType sportPlayerType : this.playerType) {
                this.mapPlayerTypesById.put(sportPlayerType.getGamePlayerTypeId(), sportPlayerType);
                this.mapPlayerTypesByType.put(sportPlayerType.getGamePlayerType(), sportPlayerType);
            }
            this.listPlayerTypesByOrder = new SportPlayerType[this.playerType.length];
            String[] typeDisplayOrder = getTypeDisplayOrder();
            int length = typeDisplayOrder.length;
            int i2 = 0;
            while (i < length) {
                this.listPlayerTypesByOrder[i2] = getPlayerTypeById(typeDisplayOrder[i]);
                i++;
                i2++;
            }
        }
    }
}
