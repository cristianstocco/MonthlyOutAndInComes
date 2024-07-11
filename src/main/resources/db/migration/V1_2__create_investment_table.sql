CREATE TABLE IF NOT EXISTS investments (
	id INT PRIMARY KEY,
	bank VARCHAR(255),
	the_money INT,
	gained TIMESTAMP
);