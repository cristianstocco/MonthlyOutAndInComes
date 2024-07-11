CREATE TABLE IF NOT EXISTS shopping (
	id INT PRIMARY KEY,
	the_money INT,
	supermarket_id INT,
	
	FOREIGN KEY (supermarket_id) REFERENCES supermarket(id)
);