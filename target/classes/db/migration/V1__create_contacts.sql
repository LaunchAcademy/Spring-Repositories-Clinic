CREATE TABLE contacts (
id SERIAL PRIMARY KEY,
first_name VARCHAR(255) NOT NULL,
last_name VARCHAR(255) NOT NULL,
email_address VARCHAR(255) NOT NULL,
phone_number VARCHAR(255),
purchase_total INTEGER NOT NULL DEFAULT 0
);