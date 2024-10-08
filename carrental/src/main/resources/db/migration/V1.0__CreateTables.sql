DROP TABLE IF EXISTS order_table;
DROP TABLE IF EXISTS user_table;
DROP TABLE IF EXISTS car_table;

CREATE TABLE user_table (
    user_id BIGSERIAL PRIMARY KEY,
    user_name VARCHAR(50),
    user_email VARCHAR(50) NOT NULL UNIQUE,
    user_password VARCHAR(50) NOT NULL,
    user_address VARCHAR(255) NOT NULL,
    user_blocked BOOL DEFAULT false,
    user_role VARCHAR(50)
);

CREATE TABLE car_table (
    car_id BIGSERIAL PRIMARY KEY,
    car_model VARCHAR(50),
    car_release_year VARCHAR(50),
    car_color VARCHAR(50),
    car_company VARCHAR(50)
);

CREATE TABLE order_table (
    order_id BIGSERIAL PRIMARY KEY,
    user_id BIGINT REFERENCES user_table(user_id),
    car_id BIGINT REFERENCES car_table(car_id),
    order_date DATE,
    return_date DATE,
    car_return BOOL DEFAULT false,
    rental_cost NUMERIC(7,2)
);
