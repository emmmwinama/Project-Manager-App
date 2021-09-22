CREATE TABLE category(
	id VARCHAR(200) NOT NULL,
	parentId VARCHAR(200),
	title VARCHAR(500) NOT NULL,
	metatitle VARCHAR(500),
	slug VARCHAR(200),
	content TEXT NOT NULL,
	PRIMARY KEY(id)
);

CREATE TYPE pub AS ENUM('true', 'false');

CREATE TABLE POST (
	id VARCHAR(200) NOT NULL,
	authorid VARCHAR(200) NOT NULL,
	parentid VARCHAR(200) NULL,
	category VARCHAR(200) NOT NULL,
	title VARCHAR(500) NOT NULL,
	metatitle VARCHAR(500),
	slug VARCHAR(200),
	summary TEXT NOT NULL,
	published pub NOT NULL,
	createdat TIMESTAMP DEFAULT NOW() NOT NULL,
	updatedat TIMESTAMP NOT NULL,
	publishedAt TIMESTAMP NOT NULL,
	content TEXT NOT NULL,
	CONSTRAINT fk_category
		FOREIGN KEY(category)
		REFERENCES category(id)
		ON DELETE SET NULL
);