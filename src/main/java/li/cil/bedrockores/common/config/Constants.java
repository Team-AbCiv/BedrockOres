package li.cil.bedrockores.common.config;

/**
 * Collection of constants used throughout the mod.
 */
public final class Constants {
    // --------------------------------------------------------------------- //
    // Mod data

    public static final String MOD_ID = "bedrockores";
    public static final String MOD_NAME = "Bedrock Ores";
    public static final String MOD_VERSION = "@VERSION@";
    public static final String PROXY_CLIENT = "li.cil.bedrockores.client.ProxyClient";
    public static final String PROXY_COMMON = "li.cil.bedrockores.common.ProxyCommon";

    // --------------------------------------------------------------------- //
    // Block, item, entity and container names

    public static final String NAME_BEDROCK_ORE = "bedrock_ore";
    public static final String NAME_BEDROCK_MINER = "bedrock_miner";

    // --------------------------------------------------------------------- //
    // Sounds

    public static final String SOUND_BEDROCK_MINER = NAME_BEDROCK_MINER;

    // --------------------------------------------------------------------- //
    // Commands

    public static final String COMMAND_USAGE = "commands.bedrockores.usage";
    public static final String COMMAND_SUB_USAGE = "commands.bedrockores.%s.usage";
    public static final String COMMAND_LIST = "commands.bedrockores.list";
    public static final String COMMAND_LIST_ITEM = "commands.bedrockores.list_item";
    public static final String COMMAND_LIST_ERRORS = "commands.bedrockores.list_errors";
    public static final String COMMAND_LIST_ERROR_ITEM = "commands.bedrockores.list_error_item";
    public static final String COMMAND_LIST_ERRORS_EPILOGUE = "commands.bedrockores.list_errors_epilogue";
    public static final String COMMAND_INFO = "commands.bedrockores.info";

    // --------------------------------------------------------------------- //
    // Config

    public static final String CONFIG_MINER_EXTRACTION_COOLDOWN = "config.bedrockores.miner_extraction_cooldown";
    public static final String CONFIG_MINER_EFFICIENCY = "config.bedrockores.miner_efficiency";
    public static final String CONFIG_VEIN_BASE_Y = "config.bedrockores.vein_base_y";
    public static final String CONFIG_VEIN_CHANCE = "config.bedrockores.vein_chance";
    public static final String CONFIG_VEIN_YIELD_BASE_SCALE = "config.bedrockores.vein_yield_base_scale";
    public static final String CONFIG_VEIN_DISTANCE_SCALE_START = "config.bedrockores.vein_distance_scale_start";
    public static final String CONFIG_VEIN_DISTANCE_SCALE_MULTIPLIER = "config.bedrockores.vein_distance_scale_multiplier";
    public static final String CONFIG_UI_ONLY_WHEN_SNEAKING = "config.bedrockores.ui_only_when_sneaking";
    public static final String CONFIG_RETROGEN_SPEED = "config.bedrockores.retrogen_speed";
    public static final String CONFIG_ALLOW_PLAYER_MINING = "config.bedrockores.allow_player_mining";
    public static final String CONFIG_WORLD_GENERATOR_WEIGHT = "config.bedrockores.world_generator_weight";
    public static final String CONFIG_ORE_PRIORITY = "config.bedrockores.ore_priority";
    public static final String CONFIG_ORE_MOD_BLACKLIST = "config.bedrockores.ore_mod_blacklist";

    // --------------------------------------------------------------------- //
    // GUI

    public static final String GUI_EXPECTED_YIELD = "gui.bedrockores.expected_yield";
    public static final String GUI_EXHAUSTED = "gui.bedrockores.exhausted";

    // --------------------------------------------------------------------- //
    // Tooltips

    public static final String TOOLTIP_BEDROCK_MINER = "tooltip.bedrockores.bedrock_miner";

    // --------------------------------------------------------------------- //

    private Constants() {
    }
}
