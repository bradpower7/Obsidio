package com.benberi.cadesim.client.packet.in;

import com.benberi.cadesim.GameContext;
import com.benberi.cadesim.client.codec.util.Packet;
import com.benberi.cadesim.client.packet.ClientPacketExecutor;

public class SetPlayersPacket extends ClientPacketExecutor {

    public SetPlayersPacket(GameContext ctx) {
        super(ctx);
    }

    @Override
    public void execute(Packet p) {

        int size = p.readByte();

        for (int i = 0; i < size; i++) {
            String name = p.readByteString();
            int x = p.readByte();
            int y = p.readByte();
            int face = p.readByte();
            int ship = p.readByte();
            int team = p.readByte();
            getContext().getEntities().addEntity(name, x, y, face, ship, team);
        }


    }

    @Override
    public int getSize() {
        return -1;
    }
}
