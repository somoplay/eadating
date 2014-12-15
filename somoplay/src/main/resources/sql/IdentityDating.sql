CREATE TABLE IF NOT EXISTS `identity_dating` (
			`id` int(11) NOT NULL AUTO_INCREMENT,
			`user_id` int(11) NOT NULL,
			`deleted` tinyint(1) NOT NULL DEFAULT '0',
			
			`deleted_ts` datetime  NOT NULL,
			`updated_ts` datetime  NOT NULL,
			`created_ts` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
			
			`display_name` varchar(255)  NOT NULL,
			`signature` varchar(755)  NOT NULL,
			`location` int(4) NOT NULL DEFAULT '0',
			`latitude` decimal(18,15) NOT NULL,
  			`longitude` decimal(18,15) NOT NULL,
  			`gender` int(1) NOT NULL DEFAULT '1',
  			`interested_in` int(4) NOT NULL DEFAULT '0',
			`credit_points` int(11) NOT NULL DEFAULT '0',
			`date_purpose` int(4) NOT NULL DEFAULT '0',
			`zodiac` tinyint(4) NOT NULL DEFAULT '0',
			`height` int(4) NOT NULL DEFAULT '0',
			`weight` int(4) NOT NULL DEFAULT '0',
			`body_type` int(4) NOT NULL DEFAULT '0',
			`ethnicity` int(4) NOT NULL DEFAULT '0',
			`education` int(4) NOT NULL DEFAULT '0',
			`profession` int(4) NOT NULL DEFAULT '0',
			`relationship_history` int(4) NOT NULL DEFAULT '0',
			`children` int(4) NOT NULL DEFAULT '0',
			`religion` int(4) NOT NULL DEFAULT '0',
			`smokes` int(4) NOT NULL DEFAULT '0',
			`drinks` int(4) NOT NULL DEFAULT '0',
			
			`introduction` longtext NOT NULL DEFAULT '',
			`perfect_match` longtext NOT NULL DEFAULT '',
			`ideal_date` longtext NOT NULL DEFAULT '',
			
			`image_url0` varchar(255)  NOT NULL,
			`image_url1` varchar(255)  NOT NULL,
			`image_url2` varchar(255)  NOT NULL,
			`image_url3` varchar(255)  NOT NULL,
			`image_url4` varchar(255)  NOT NULL,
			`image_url5` varchar(255)  NOT NULL,
			`image_url6` varchar(255)  NOT NULL,
			`image_url7` varchar(255)  NOT NULL,
			`image_number` int(4) NOT NULL DEFAULT '0',
			
			PRIMARY KEY (`id`)
			
	) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=1;
	
	
	
	
	
	
	INSERT INTO `somoplay`. `identity_dating` (
			`display_name` ,
			`signature` ,
			`location` ,
			`latitude` ,
  			`longitude` ,
  			
  			`gender`,
  			`interested_in`,
			`credit_points`,
			`date_purpose`,
			`zodiac`,
			`height`,
			`weight`,
			`body_type`,
			`ethnicity`,
			`education`,
			`profession`,
			`relationship_history`,
			`children`,
			`religion`,
			`smokes`,
			`drinks`,
			
			`introduction`,
			`perfect_match`,
			`ideal_date`,
			
			`image_url0`,
			`image_url1`,
			`image_url2`,
			`image_url3`,
			`image_url4`,
			`image_url5`,
			`image_url6`,
			`image_url7`,
			`image_number`
	
	) VALUES
	('lucy','like dance',1 ,43.807253, -79.357074,1,2, 123, 2, 12,168,55,1,1,1,1,1,1,1,1,1,'like dance','like dance','like dance',
	'uploads/profile/1.png','uploads/profile/2.png','uploads/profile/3.png','uploads/profile/4.png','uploads/profile/5.png','uploads/profile/6.png','uploads/profile/7.png','uploads/profile/8.png',7),
	
	('lucy','like dance',1 ,43.807253, -79.357074,1,2, 123, 2, 12,168,55,1,1,1,1,1,1,1,1,1,'like dance','like dance','like dance',
	'uploads/profile/2.png','uploads/profile/2.png','uploads/profile/3.png','uploads/profile/4.png','uploads/profile/5.png','uploads/profile/6.png','uploads/profile/7.png','uploads/profile/8.png',7),
	
		('lucy','like dance',1 ,43.807253, -79.357074,1,2, 123, 2, 12,168,55,1,1,1,1,1,1,1,1,1,'like dance','like dance','like dance',
	'uploads/profile/3.png','uploads/profile/2.png','uploads/profile/3.png','uploads/profile/4.png','uploads/profile/5.png','uploads/profile/6.png','uploads/profile/7.png','uploads/profile/8.png',7),
	
		('lucy','like dance',1 ,43.807253, -79.357074,1,2, 123, 2, 12,168,55,1,1,1,1,1,1,1,1,1,'like dance','like dance','like dance',
	'uploads/profile/4.png','uploads/profile/2.png','uploads/profile/3.png','uploads/profile/4.png','uploads/profile/5.png','uploads/profile/6.png','uploads/profile/7.png','uploads/profile/8.png',7),
	
		('lucy','like dance',1 ,43.807253, -79.357074,1,2, 123, 2, 12,168,55,1,1,1,1,1,1,1,1,1,'like dance','like dance','like dance',
	'uploads/profile/5.png','uploads/profile/2.png','uploads/profile/3.png','uploads/profile/4.png','uploads/profile/5.png','uploads/profile/6.png','uploads/profile/7.png','uploads/profile/8.png',7),
	
		('lucy','like dance',1 ,43.807253, -79.357074,1,2, 123, 2, 12,168,55,1,1,1,1,1,1,1,1,1,'like dance','like dance','like dance',
	'uploads/profile/6.png','uploads/profile/2.png','uploads/profile/3.png','uploads/profile/4.png','uploads/profile/5.png','uploads/profile/6.png','uploads/profile/7.png','uploads/profile/8.png',7),
	
		('lucy','like dance',1 ,43.807253, -79.357074,1,2, 123, 2, 12,168,55,1,1,1,1,1,1,1,1,1,'like dance','like dance','like dance',
	'uploads/profile/7.png','uploads/profile/2.png','uploads/profile/3.png','uploads/profile/4.png','uploads/profile/5.png','uploads/profile/6.png','uploads/profile/7.png','uploads/profile/8.png',7),
	
		('lucy','like dance',1 ,43.807253, -79.357074,1,2, 123, 2, 12,168,55,1,1,1,1,1,1,1,1,1,'like dance','like dance','like dance',
	'uploads/profile/8.png','uploads/profile/2.png','uploads/profile/3.png','uploads/profile/4.png','uploads/profile/5.png','uploads/profile/6.png','uploads/profile/7.png','uploads/profile/8.png',7),
	
		('lucy','like dance',1 ,43.807253, -79.357074,1,2, 123, 2, 12,168,55,1,1,1,1,1,1,1,1,1,'like dance','like dance','like dance',
	'uploads/profile/1.png','uploads/profile/2.png','uploads/profile/3.png','uploads/profile/4.png','uploads/profile/5.png','uploads/profile/6.png','uploads/profile/7.png','uploads/profile/8.png',7),
	
		('lucy','like dance',1 ,43.807253, -79.357074,1,2, 123, 2, 12,168,55,1,1,1,1,1,1,1,1,1,'like dance','like dance','like dance',
	'uploads/profile/1.png','uploads/profile/2.png','uploads/profile/3.png','uploads/profile/4.png','uploads/profile/5.png','uploads/profile/6.png','uploads/profile/7.png','uploads/profile/8.png',7),
	
		('lucy','like dance',1 ,43.807253, -79.357074,1,2, 123, 2, 12,168,55,1,1,1,1,1,1,1,1,1,'like dance','like dance','like dance',
	'uploads/profile/1.png','uploads/profile/2.png','uploads/profile/3.png','uploads/profile/4.png','uploads/profile/5.png','uploads/profile/6.png','uploads/profile/7.png','uploads/profile/8.png',7),
	
		('lucy','like dance',1 ,43.807253, -79.357074,1,2, 123, 2, 12,168,55,1,1,1,1,1,1,1,1,1,'like dance','like dance','like dance',
	'uploads/profile/1.png','uploads/profile/2.png','uploads/profile/3.png','uploads/profile/4.png','uploads/profile/5.png','uploads/profile/6.png','uploads/profile/7.png','uploads/profile/8.png',7),
	
		('lucy','like dance',1 ,43.807253, -79.357074,1,2, 123, 2, 12,168,55,1,1,1,1,1,1,1,1,1,'like dance','like dance','like dance',
	'uploads/profile/1.png','uploads/profile/2.png','uploads/profile/3.png','uploads/profile/4.png','uploads/profile/5.png','uploads/profile/6.png','uploads/profile/7.png','uploads/profile/8.png',7),
	
		('lucy','like dance',1 ,43.807253, -79.357074,1,2, 123, 2, 12,168,55,1,1,1,1,1,1,1,1,1,'like dance','like dance','like dance',
	'uploads/profile/1.png','uploads/profile/2.png','uploads/profile/3.png','uploads/profile/4.png','uploads/profile/5.png','uploads/profile/6.png','uploads/profile/7.png','uploads/profile/8.png',7),
	
		('lucy','like dance',1 ,43.807253, -79.357074,1,2, 123, 2, 12,168,55,1,1,1,1,1,1,1,1,1,'like dance','like dance','like dance',
	'uploads/profile/1.png','uploads/profile/2.png','uploads/profile/3.png','uploads/profile/4.png','uploads/profile/5.png','uploads/profile/6.png','uploads/profile/7.png','uploads/profile/8.png',7),
	
		('lucy','like dance',1 ,43.807253, -79.357074,1,2, 123, 2, 12,168,55,1,1,1,1,1,1,1,1,1,'like dance','like dance','like dance',
	'uploads/profile/1.png','uploads/profile/2.png','uploads/profile/3.png','uploads/profile/4.png','uploads/profile/5.png','uploads/profile/6.png','uploads/profile/7.png','uploads/profile/8.png',7),
	
		('lucy','like dance',1 ,43.807253, -79.357074,1,2, 123, 2, 12,168,55,1,1,1,1,1,1,1,1,1,'like dance','like dance','like dance',
	'uploads/profile/1.png','uploads/profile/2.png','uploads/profile/3.png','uploads/profile/4.png','uploads/profile/5.png','uploads/profile/6.png','uploads/profile/7.png','uploads/profile/8.png',7),
	
		('lucy','like dance',1 ,43.807253, -79.357074,1,2, 123, 2, 12,168,55,1,1,1,1,1,1,1,1,1,'like dance','like dance','like dance',
	'uploads/profile/1.png','uploads/profile/2.png','uploads/profile/3.png','uploads/profile/4.png','uploads/profile/5.png','uploads/profile/6.png','uploads/profile/7.png','uploads/profile/8.png',7),
	
		('lucy','like dance',1 ,43.807253, -79.357074,1,2, 123, 2, 12,168,55,1,1,1,1,1,1,1,1,1,'like dance','like dance','like dance',
	'uploads/profile/1.png','uploads/profile/2.png','uploads/profile/3.png','uploads/profile/4.png','uploads/profile/5.png','uploads/profile/6.png','uploads/profile/7.png','uploads/profile/8.png',7),
	
		('lucy','like dance',1 ,43.807253, -79.357074,1,2, 123, 2, 12,168,55,1,1,1,1,1,1,1,1,1,'like dance','like dance','like dance',
	'uploads/profile/1.png','uploads/profile/2.png','uploads/profile/3.png','uploads/profile/4.png','uploads/profile/5.png','uploads/profile/6.png','uploads/profile/7.png','uploads/profile/8.png',7),
	
		('lucy','like dance',1 ,43.807253, -79.357074,1,2, 123, 2, 12,168,55,1,1,1,1,1,1,1,1,1,'like dance','like dance','like dance',
	'uploads/profile/1.png','uploads/profile/2.png','uploads/profile/3.png','uploads/profile/4.png','uploads/profile/5.png','uploads/profile/6.png','uploads/profile/7.png','uploads/profile/8.png',7),
	
			('lucy','like dance',1 ,43.807253, -79.357074,1,2, 123, 2, 12,168,55,1,1,1,1,1,1,1,1,1,'like dance','like dance','like dance',
	'uploads/profile/1.png','uploads/profile/2.png','uploads/profile/3.png','uploads/profile/4.png','uploads/profile/5.png','uploads/profile/6.png','uploads/profile/7.png','uploads/profile/8.png',7),
	
			('lucy','like dance',1 ,43.807253, -79.357074,1,2, 123, 2, 12,168,55,1,1,1,1,1,1,1,1,1,'like dance','like dance','like dance',
	'uploads/profile/1.png','uploads/profile/2.png','uploads/profile/3.png','uploads/profile/4.png','uploads/profile/5.png','uploads/profile/6.png','uploads/profile/7.png','uploads/profile/8.png',7),
	
			('lucy','like dance',1 ,43.807253, -79.357074,1,2, 123, 2, 12,168,55,1,1,1,1,1,1,1,1,1,'like dance','like dance','like dance',
	'uploads/profile/1.png','uploads/profile/2.png','uploads/profile/3.png','uploads/profile/4.png','uploads/profile/5.png','uploads/profile/6.png','uploads/profile/7.png','uploads/profile/8.png',7),
	
			('lucy','like dance',1 ,43.807253, -79.357074,1,2, 123, 2, 12,168,55,1,1,1,1,1,1,1,1,1,'like dance','like dance','like dance',
	'uploads/profile/1.png','uploads/profile/2.png','uploads/profile/3.png','uploads/profile/4.png','uploads/profile/5.png','uploads/profile/6.png','uploads/profile/7.png','uploads/profile/8.png',7),
	
		('lucy','like dance',1 ,43.807253, -79.357074,1,2, 123, 2, 12,168,55,1,1,1,1,1,1,1,1,1,'like dance','like dance','like dance',
	'uploads/profile/1.png','uploads/profile/2.png','uploads/profile/3.png','uploads/profile/4.png','uploads/profile/5.png','uploads/profile/6.png','uploads/profile/7.png','uploads/profile/8.png',7);
	

	 