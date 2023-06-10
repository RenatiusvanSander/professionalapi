create schema if not exists ecomm;
create TABLE IF NOT EXISTS ecomm.user (
	id uuid NOT NULL DEFAULT random_uuid(),
	username varchar(16),
	password varchar(40),
	first_name varchar(16),
	last_name varchar(16),
	email varchar(24),
	phone varchar(24),
	user_status varchar(16)
);
create TABLE IF NOT EXISTS ecomm.product (
	id uuid NOT NULL DEFAULT random_uuid() PRIMARY KEY,
	name varchar(56) NOT NULL,
	description varchar(200),
	price numeric(16, 4) DEFAULT 0 NOT NULL,
	count numeric(8, 0),
	image_url varchar(40)
);
CREATE TABLE IF NOT EXISTS ecomm.cart(
id uuid NOT NULL PRIMARY KEY,
user_id uuid NOT NULL
);
create TABLE IF NOT EXISTS ecomm.item (
	id uuid NOT NULL DEFAULT random_uuid(),
	product_id uuid NOT NULL,
	quantity numeric(8, 0),
	unit_price numeric(16, 4) NOT NULL,
	PRIMARY KEY(id)
);
create TABLE IF NOT EXISTS ecomm.cart_item (cart_id uuid NOT NULL, item_id uuid NOT NULL, FOREIGN KEY (cart_id) REFERENCES ecomm.cart(id));