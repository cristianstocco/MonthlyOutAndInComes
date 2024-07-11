CREATE TABLE IF NOT EXISTS wage (
	id INT PRIMARY KEY,
	the_provider VARCHAR(255) NOT NULL,
	the_money INT,
	gained TIMESTAMP
);