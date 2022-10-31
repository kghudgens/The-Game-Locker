DROP DATABASE IF EXISTS game_locker;
CREATE DATABASE game_locker;
CREATE TABLE IF NOT EXISTS user(
    user_id SERIAL,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    age int,
    email TEXT,
    PRIMARY KEY(user_id),
    UNIQUE(email)
);
CREATE TABLE IF NOT EXISTS game(
    game_id SERIAL NOT NULL,
    game_title VARCHAR(50),
    game_description TEXT,
    genre int,
    PRIMARY KEY(game_id),
    -- name the constraint then call the foreign key on the column in my table, then reference it to the OG table
    CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES user(user_id)
);
CREATE TABLE IF NOT EXISTS game_post(
    game_post_id SERIAL NOT NULL,
    game_post_title VARCHAR(150),
    game_post_description TEXT,
    game_post_created_date DATE NOT NULL DEFAULT CURRENT_DATE,
    PRIMARY KEY(game_post_id),
    CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES user(user_id),
    CONSTRAINT fk_game_id FOREIGN KEY (game_id) REFERENCES game(game_id)
);
CREATE TABLE IF NOT EXISTS comment(
    comment_id SERIAL NOT NULL,
    comment_title VARCHAR(150),
    comment_description TEXT,
    PRIMARY KEY (comment_id),
    CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES user(user_id),
    CONSTRAINT fk_game_id FOREIGN KEY (game_id) REFERENCES game(game_id),
    CONSTRAINT fk_game_post_id FOREIGN KEY (game_post_id) REFERENCES game_post(game_post_id)
);