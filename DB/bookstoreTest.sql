-- phpMyAdmin SQL Dump
-- version 4.0.10.10
-- http://www.phpmyadmin.net
--
-- Хост: 127.0.0.1:3306
-- Час створення: Бер 30 2018 р., 15:36
-- Версія сервера: 5.6.26
-- Версія PHP: 5.6.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- База даних: `bookstoreTest`
--

-- --------------------------------------------------------

--
-- Структура таблиці `authors`
--

CREATE TABLE IF NOT EXISTS `authors` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first name` varchar(20) NOT NULL,
  `last name` varchar(20) NOT NULL,
  `age` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=5 ;

--
-- Дамп даних таблиці `authors`
--

INSERT INTO `authors` (`id`, `first name`, `last name`, `age`) VALUES
(1, 'Taras', 'Shevchenko', '1814-03-09'),
(2, 'Ivan', 'Franko', '1856-08-27'),
(3, 'Mark', 'Twain', '1835-11-30'),
(4, 'Mayne', 'Reid', '1818-04-04');

-- --------------------------------------------------------

--
-- Структура таблиці `books`
--

CREATE TABLE IF NOT EXISTS `books` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  `author_id` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `author_id` (`author_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=7 ;

--
-- Дамп даних таблиці `books`
--

INSERT INTO `books` (`id`, `name`, `author_id`, `price`) VALUES
(1, 'The Adventures of Tom Sawyer', 3, 20),
(2, 'The Adventures of Huckleberry Finn', 3, 28),
(3, 'Kobsar', 1, 30),
(4, 'Kameniar', 2, 60),
(5, 'Croquet', 4, 33),
(6, 'The Headless Horseman', 4, 49);

--
-- Обмеження зовнішнього ключа збережених таблиць
--

--
-- Обмеження зовнішнього ключа таблиці `books`
--
ALTER TABLE `books`
  ADD CONSTRAINT `author_id` FOREIGN KEY (`author_id`) REFERENCES `authors` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
