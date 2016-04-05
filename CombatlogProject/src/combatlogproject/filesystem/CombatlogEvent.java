package combatlogproject.filesystem;

/**
 * Every event that can occur in a "World of Warcraft" combatlog file.
 *
 * @author Domenik Irrgang
 */
public enum CombatlogEvent {
    SPELL_HEAL,
    SPELL_CAST_SUCCESS,
    SPELL_AURA_REMOVED,
    SPELL_AURA_REFRESH,
    UNIT_DIED,
    SPELL_AURA_APPLIED,
    SPELL_AURA_APPLIED_DOSE,
    SPELL_CAST_START,
    SPELL_CREATE,
    SPELL_CAST_FAILED,
    SPELL_DAMAGE,
    SWING_DAMAGE,
    SWING_DAMAGE_LANDED,
    SPELL_ENERGIZE,
    SPELL_ABSORBED,
    SPELL_PERIODIC_DAMAGE,
    SPELL_SUMMON,
    SPELL_PERIODIC_HEAL,
    RANGE_DAMAGE,
    SPELL_MISSED,
    SPELL_AURA_REMOVED_DOSE,
    SWING_MISSED,
    SPELL_INTERRUPT,
    PARTY_KILL,
    SPELL_DISPEL,
    SPELL_AURA_BROKEN_SPELL,
    UNIT_DESTROYED,
    SPELL_PERIODIC_MISSED,
    SPELL_INSTAKILL,
    ENCOUNTER_START,
    SPELL_PERIODIC_ENERGIZE,
    SPELL_DRAIN,
    ENVIRONMENTAL_DAMAGE,
    ENCOUNTER_END,
    SPELL_RESURRECT,
    RANGE_MISSED,
    SPELL_AURA_BROKEN,
    DAMAGE_SPLIT,
    SPELL_STOLEN;
}