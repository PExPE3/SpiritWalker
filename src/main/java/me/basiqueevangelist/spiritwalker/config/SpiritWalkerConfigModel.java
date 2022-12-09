package me.basiqueevangelist.spiritwalker.config;

import io.wispforest.owo.config.Option;
import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;
import io.wispforest.owo.config.annotation.RestartRequired;
import io.wispforest.owo.config.annotation.Sync;

@Config(name = "spirit-walker", wrapperName = "SpiritWalkerConfig")
@Modmenu(modId = "spirit-walker")
@Sync(Option.SyncMode.OVERRIDE_CLIENT)
public class SpiritWalkerConfigModel {
    @RestartRequired public boolean enableDefaultRecipe = true;
    @RestartRequired public int normalPotionLength = 60;
    @RestartRequired public int strongPotionLength = 30;
    @RestartRequired public int longPotionLength = 60 * 5 / 2;
    public boolean listenFromBody = false;
}
