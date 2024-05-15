-- planet stats
CREATE TABLE planet_stats (
    planet_id NUMBER PRIMARY KEY NOT NULL,
    name VARCHAR2(100),
    resource_metal_amount NUMBER,
    resource_deuterium_amount NUMBER,
    technology_defense_level INT,
    technology_attack_level INT,
    battlescounter INT,
    missile_launcher_remaining INT,
    ion_cannon_remaining INT,
    plasma_cannon_remaining INT,
    light_hunter_remaining INT,
    heavy_hunter_remaining INT,
    battleship_remaining INT,
    armored_ship_remaining INT
);
-- battle_stats

CREATE TABLE battle_stats (
    planet_id INT,
    num_battle INT NOT NULL,
    resource_metals_adquired NUMBER,
    resource_deuterium_adquired NUMBER,
    PRIMARY KEY (planet_id, num_battle), -- Clave primaria compuesta
    FOREIGN KEY (planet_id) REFERENCES planet_stats(planet_id)
);
CREATE TABLE battle_log (

    planet_id INT,
    num_battle INT,
    num_line INT,
    log_entry VARCHAR2(255),
    PRIMARY KEY (planet_id, num_battle, num_line),
    FOREIGN KEY (planet_id, num_battle) REFERENCES battle_stats(planet_id, num_battle)
);
CREATE TABLE planet_battle_defense (
    planet_id INT,
    num_battle INT,
    misile_launcher_built INT,
    missile_launcher_destroyed INT,
    ion_cannon_built INT,
    plasma_cannon_built INT,
    PRIMARY KEY (planet_id, num_battle),
    FOREIGN KEY (planet_id, num_battle) REFERENCES battle_stats(planet_id, num_battle)
);

CREATE TABLE planet_battle_army(
    planet_id INT,
    num_battle INT,
    light_hunter_build INT,
    light_hunter_destroyed INT,
    heavy_hunter_built INT,
    heavy_hunter_destroyed INT,
    battleship_built INT,
    battleship_destroyed INT,
    armored_ship_built INT,
    armored_ship_destroyed INT,
    PRIMARY KEY (planet_id, num_battle),
    FOREIGN KEY (planet_id, num_battle) REFERENCES battle_stats(planet_id, num_battle)
);

-- tabla enemy_army
CREATE TABLE  enemy_army(
planet_id INT,
num_battle INT,
light_hunter_threat INT,
light_hunter_destroyed INT,
heavy_hunter_threat INT,
heavy_hunter_destroyed INT,
armored_ship_threat INT,
armored_ship_destroyed INT,
PRIMARY KEY (planet_id, num_battle)
);