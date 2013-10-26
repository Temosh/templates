SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

DROP SCHEMA IF EXISTS `template_db` ;
CREATE SCHEMA IF NOT EXISTS `template_db` DEFAULT CHARACTER SET utf8;
USE `template_db` ;

-- -----------------------------------------------------
-- Table `template_db`.`category`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `template_db`.`category` ;

-- -----------------------------------------------------
-- Table `template_db`.`category`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `template_db`.`category` (
  `category_id` INT NOT NULL AUTO_INCREMENT,
  `parent_category` INT NULL,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`category_id`))
ENGINE = InnoDB;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;