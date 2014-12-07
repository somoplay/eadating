

CREATE TABLE IF NOT EXISTS store (
		
  id int(11) NOT NULL AUTO_INCREMENT,
  active tinyint(1) NOT NULL DEFAULT '0',
  priority tinyint(3) NOT NULL DEFAULT '0',

  name_en varchar(255),
  name_ch_s varchar(255),
  name_ch_t varchar(255),

  type_main int(11),
  type_sub int(11),
  
  lantitude decimal(18,15),
  longitude decimal(18,15),
  average_price decimal(18,15),
  
  order_service tinyint(1),
  have_internet tinyint(4),
  take_out tinyint(4),
  delivery tinyint(4),
  drink tinyint(4),
  room_order tinyint(4),
  outside_place tinyint(4),

  address varchar(255),
  city varchar(255),
  province varchar(255),
  country varchar(255),
  postcode varchar(255),
  
  crossing_address varchar(255),
  chinese_address varchar(255),
  
  phone_main varchar(20),
  phone_cell varchar(20),
  phone_business varchar(20),
  email varchar(255),
  website varchar(255),
  

  feature_product varchar(255),
  destription_en longtext,
  destription_ch longtext,
	
  PRIMARY KEY (id)
  ) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS images (
		id int(11) NOT NULL AUTO_INCREMENT,
		type int(11) NOT NULL,
		element_id int(11) NOT NULL,
		name varchar(255) NOT NULL,
		size_type int(3) NOT NULL,
		description varchar(255) NOT NULL,

		PRIMARY KEY (id)
		) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
		
CREATE TABLE IF NOT EXISTS store_hour (
		id int(11) NOT NULL AUTO_INCREMENT,
		store_id int(11),
		weekday int(2) NOT NULL,
		
		start_hour int(3) NOT NULL,
		end_hour   int(3) NOT NULL,

		PRIMARY KEY (id),
		CONSTRAINT fk_h FOREIGN KEY (store_id) REFERENCES store(id)
		) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
		
		
	
		INSERT INTO somoplay.store (id, active, priority, name_en, name_ch_s, name_ch_t, type_main, longitude, average_price, have_internet, address, city, province, country, phone_main, email, website, destription_en, destription_ch) VALUES ('1', '1', '1', 'abc', 'abc', 'abc', '1', '100', '30', '1', 'stc', 'toronto', 'on', 'ca', '647-111-1111', 'abc@gmail.com', 'abc.ca', '123', '123');

		INSERT INTO somoplay.store (id, active, priority, name_en, name_ch_s, name_ch_t, type_main, longitude, average_price, have_internet, address, city, province, country, phone_main, email, website, destription_en, destription_ch) VALUES ('2', '1', '1', 'google', 'google', 'google', '1', '105', '100', '1', 'markham', 'toronto', 'on', 'ca', '647-111-1111', 'google@gmail.com', 'google.ca', '123', '123');
  
		INSERT INTO somoplay.store (id, active, priority, name_en, name_ch_s, name_ch_t, type_main, longitude, average_price, have_internet, address, city, province, country, phone_main, email, website, destription_en, destription_ch) VALUES ('3', '1', '1', 'microsoft', 'microsoft', 'microsoft', '2', '120', '200', '1', 'stc', 'toronto', 'on', 'ca', '647-111-1111', 'microsoft@gmail.com', 'microsoft.ca', '123', '123');
  
		INSERT INTO somoplay.store (id, active, priority, name_en, name_ch_s, name_ch_t, type_main, longitude, average_price, have_internet, address, city, province, country, phone_main, email, website, destription_en, destription_ch) VALUES ('4', '1', '1', 'facebook', 'facebook', 'facebook', '3', '90', '300', '1', 'north york', 'toronto', 'on', 'ca', '647-111-1111', 'facebook@gmail.com', 'facebook.ca', '123', '123');
  
		INSERT INTO somoplay.store (id, active, priority, name_en, name_ch_s, name_ch_t, type_main, longitude, average_price, have_internet, address, city, province, country, phone_main, email, website, destription_en, destription_ch) VALUES ('5', '1', '1', 'yahoo', 'yahoo', 'yahoo', '5', '70', '500', '1', 'york', 'toronto', 'on', 'ca', '647-111-1111', 'yahoo@gmail.com', 'yahoo.ca', '123', '123');
		
		
				
		INSERT INTO somoplay.store_hour (id, store_id, weekday, start_hour, end_hour) VALUES ('1', '1', '1', '8', '12');
		INSERT INTO somoplay.store_hour (id, store_id, weekday, start_hour, end_hour) VALUES ('2', '1', '2', '8', '12');
		INSERT INTO somoplay.store_hour (id, store_id, weekday, start_hour, end_hour) VALUES ('3', '1', '3', '8', '12');
		INSERT INTO somoplay.store_hour (id, store_id, weekday, start_hour, end_hour) VALUES ('4', '1', '4', '8', '12');
		INSERT INTO somoplay.store_hour (id, store_id, weekday, start_hour, end_hour) VALUES ('5', '1', '5', '8', '12');
		INSERT INTO somoplay.store_hour (id, store_id, weekday, start_hour, end_hour) VALUES ('6', '1', '6', '8', '3');
		INSERT INTO somoplay.store_hour (id, store_id, weekday, start_hour, end_hour) VALUES ('7', '1', '7', '8', '3');
		
		INSERT INTO somoplay.store_hour (id, store_id, weekday, start_hour, end_hour) VALUES ('8', '2', '1', '8', '12');
		INSERT INTO somoplay.store_hour (id, store_id, weekday, start_hour, end_hour) VALUES ('9', '2', '2', '8', '12');
		INSERT INTO somoplay.store_hour (id, store_id, weekday, start_hour, end_hour) VALUES ('10', '2', '3', '8', '12');
		INSERT INTO somoplay.store_hour (id, store_id, weekday, start_hour, end_hour) VALUES ('11', '2', '4', '8', '12');
		INSERT INTO somoplay.store_hour (id, store_id, weekday, start_hour, end_hour) VALUES ('12', '2', '5', '8', '12');
		INSERT INTO somoplay.store_hour (id, store_id, weekday, start_hour, end_hour) VALUES ('13', '2', '6', '8', '3');
		INSERT INTO somoplay.store_hour (id, store_id, weekday, start_hour, end_hour) VALUES ('14', '2', '7', '8', '3');
