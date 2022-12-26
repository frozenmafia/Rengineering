package com.app.dream11.gameconfig;

import com.app.dream11.model.GameConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class GameConfigListWrapper implements Serializable {
    private static final long serialVersionUID = 1;
    private List<GameConfig> gameConfigList = new ArrayList();

    public List<GameConfig> getGameConfigList() {
        return this.gameConfigList;
    }

    public void setGameConfigList(List<GameConfig> list) {
        this.gameConfigList = list;
    }
}
