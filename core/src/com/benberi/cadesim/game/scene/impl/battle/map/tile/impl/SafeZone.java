package com.benberi.cadesim.game.scene.impl.battle.map.tile.impl;

import com.badlogic.gdx.graphics.Texture;
import com.benberi.cadesim.GameContext;
import com.benberi.cadesim.util.RandomUtils;

public class SafeZone extends Cell {

    /**
     * Initializes the tile
     *
     */
    public SafeZone(GameContext ctx) {
        super(ctx);
        setTexture(new Texture("core/assets/sea/safezone.png"));
        setPackedObjectOrientation("cell_safe");
        setOrientation(RandomUtils.randInt(0, 3));
    }
}
