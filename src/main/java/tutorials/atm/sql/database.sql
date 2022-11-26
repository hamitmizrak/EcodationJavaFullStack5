-- CREATA DATABASE
CREATE SCHEMA `atm_database` DEFAULT CHARACTER SET utf8 COLLATE utf8_turkish_ci ;

-- multiple database one DB selected
use atm_database;

-- CREATE TABLE
CREATE TABLE `atm_database`.`safe` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `money_type` VARCHAR(10)  DEFAULT 'madeni',
  `money_currency` VARCHAR(45)  DEFAULT 'tr',
  `money_amount` VARCHAR(45) NOT NULL DEFAULT '1000',
  `created_date` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_turkish_ci;

-- DROP DATABASE
DROP DATABASE `atm_database`;

-- TRUNCATE
TRUNCATE `atm_database`.`safe`;

-- CRUD:
-- select
select * from safe;

select sum(money_amount) as sum from safe;

-- insert
insert into safe (money_type,money_currency,money_amount) values("kağıt","tr",1000);

-- update
update safe set money_type="tür1" , money_currency="birim1" , money_amount="500" where id=1;

-- delete
delete from safe where id=1;