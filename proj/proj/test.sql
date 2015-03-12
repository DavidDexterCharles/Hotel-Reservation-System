-- phpMyAdmin SQL Dump
-- version 4.0.9
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 14, 2014 at 05:23 PM
-- Server version: 5.6.14
-- PHP Version: 5.5.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `test`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `test_multi_sets`()
    DETERMINISTIC
begin
        select user() as first_col;
        select user() as first_col, now() as second_col;
        select user() as first_col, now() as second_col, now() as third_col;
        end$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE IF NOT EXISTS `employee` (
  `EmpID` int(11) NOT NULL AUTO_INCREMENT,
  `Username` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL,
  PRIMARY KEY (`EmpID`),
  UNIQUE KEY `Username` (`Username`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=20 ;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`EmpID`, `Username`, `Password`) VALUES
(1, 'david', 'charles'),
(5, 'Hakim', 'Trim'),
(15, 'Nickelia', '1234'),
(17, 'Shadae', 'James'),
(18, 'Arian', 'Miller'),
(19, 'Harry', 'Potter');

-- --------------------------------------------------------

--
-- Table structure for table `guest`
--

CREATE TABLE IF NOT EXISTS `guest` (
  `ReservationNumber` int(11) NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(255) NOT NULL,
  `LastName` varchar(255) NOT NULL,
  `Contact` varchar(255) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `Address` varchar(255) DEFAULT NULL,
  `CheckInDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `CheckOutDate` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `CreditCardType` varchar(20) NOT NULL,
  `CreditCardNumber` int(20) NOT NULL,
  `BillingInfo` double DEFAULT NULL,
  `RoomNumber` int(11) DEFAULT '0',
  `Extras` double NOT NULL DEFAULT '0',
  `ExtrasInfo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ReservationNumber`),
  KEY `RoomNumber` (`RoomNumber`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=108 ;

--
-- Dumping data for table `guest`
--

INSERT INTO `guest` (`ReservationNumber`, `FirstName`, `LastName`, `Contact`, `Email`, `Address`, `CheckInDate`, `CheckOutDate`, `CreditCardType`, `CreditCardNumber`, `BillingInfo`, `RoomNumber`, `Extras`, `ExtrasInfo`) VALUES
(6, 'Darnell', 'Gittens', '987-6543', 'dg@gmail.com', 'Def lane', '2014-02-28 06:39:55', '2014-03-18 07:19:04', 'Mastercard', 222222222, 5400, 200, 0, 'Room Service'),
(7, 'Steve', 'Gittens', '652398', 'sg@hotmail.com', '456 Road', '2014-03-07 08:52:16', '2014-03-18 06:45:45', 'Mastercard', 333333333, 3300, 400, 0, 'Room Service'),
(12, 'Bob\r\n', 'Jones', '2222222', 'bj@gmail.com', 'Couva', '2014-03-16 01:31:16', '2014-03-18 06:37:28', 'Visa', 555555555, 525, 300, 0, 'Room Service'),
(16, 'David', 'Jones', NULL, NULL, NULL, '2014-03-16 22:25:49', '2014-03-18 06:37:28', 'Visa', 888888888, 350, 300, 0, 'Room Service'),
(17, 'King', 'John', NULL, NULL, NULL, '2014-03-16 22:27:16', '0000-00-00 00:00:00', 'Visa', 999999999, NULL, NULL, 0, 'Room Service'),
(20, 'ddddddd', 'ddddddddd', 'ddddddddd', 'ddddddddddddd', 'dddddddddddd', '2014-03-18 03:37:59', '2014-03-18 06:37:28', 'ddddddddddddddd', 11111, 175, 300, 0, ''),
(24, 'ggggggg', 'hhhhh', '1235', '', 'ffffff', '2014-03-18 06:37:28', '2014-04-01 01:43:53', 'lllllll', 300, 2275, 300, 0, NULL),
(26, '200', '200', '200', '200', '200', '2014-03-18 07:19:04', '2014-04-01 21:51:09', '200', 200, 4200, 200, 0, ''),
(28, 'ifc.tbj', 'dfh', 'edfjg', 'uirfgv', 'drtgui', '2014-03-18 07:34:15', '2014-04-01 01:43:53', 'idutr', 300, 2275, 300, 25, 'none'),
(29, 'jhtfg', ',kjk;', '56675', '', 'tgbd', '2014-03-18 14:02:30', '2014-03-25 22:02:46', 'hju', 111, 1225, 300, 0, ''),
(30, 'David', 'Charles', '4567', 'rrrrrrrrr', 'Union', '2014-03-19 01:52:26', '2014-03-19 01:52:26', 'Linx', 111, 0, 700, 67, 'Damaged Furniture'),
(31, 'David', 'Test1', '999-8769', '', 'Test', '2014-03-21 00:22:05', '2014-03-21 00:58:44', 'Linx', 9, 0, 200, 0, ''),
(32, 'b', 'b', 'b', '', 'b', '2014-03-21 01:34:34', '2014-03-21 02:08:06', 'b', 8, 0, 800, 0, ''),
(33, 'h', 'h', 'h', 'h', 'h', '2014-03-21 02:08:00', '2014-03-21 02:38:08', 'Linx', 9, 0, 800, 8, ''),
(35, 'Naruto', 'Uzumaki', 'Bird', '', 'Hidden Leaf', '2014-03-21 04:55:43', '2014-03-21 05:43:53', 'Linx', 4, 0, 400, 98.76, 'Destroyed Konoha'),
(37, 'bb', 'bb', 'bb', 'bb', 'bb', '2014-03-21 05:43:53', '2014-03-21 05:43:53', '4ki', 4, 0, 400, 34.78, 'hmm kk!!'),
(38, 'David', 'Charles', '45678', '', 'ghty', '2014-03-25 11:37:50', '2014-03-25 11:37:50', 'thy', 989, 0, 600, 50, 'Extra Day'),
(39, 'gjhf', 'yj', '567', '', 'utj', '2014-03-25 22:02:46', '2014-03-25 22:02:46', 'hgfjk', 111, 0, 300, 0, ''),
(41, 'David', 'Charles', '675-9987', '', 'Union', '2014-03-31 05:29:27', '2014-03-31 05:30:54', 'Linx', 800, 0, 800, 0, ''),
(44, 'Daniel', 'Orion', '3456782', '', 'Plymouth', '2014-03-31 20:24:51', '2014-04-01 01:43:53', 'Visa', 300, 0, 300, 789, 'Room Service'),
(45, 'Samantha', 'Allin', '9990687', '', 'Orange Hill', '2014-03-31 20:25:53', '0000-00-00 00:00:00', 'Visa', 800, NULL, 800, 0, NULL),
(46, 'Clark', 'Kent', '8859807', '', 'Motropolis', '2014-03-31 20:27:25', '2014-04-01 21:51:09', 'Linx', 200, 300, 200, 0, ''),
(47, 'A', 'A', '123456', '', 'A', '2014-03-31 21:41:32', '2014-03-31 21:41:32', 'Linx', 600, 0, 600, 0, ''),
(48, '300', '300', '300', '300', '300', '2014-04-01 01:38:59', '2014-04-01 01:43:53', '300', 300, 0, 300, 0, ''),
(49, '300', '300', '300', '300', '300', '2014-04-01 01:43:53', '2014-04-01 01:43:53', '300', 300, 0, 300, 0, ''),
(50, 'David', 'Charles', '897-9087', 'p@hotmail.com', 'Milner', '2014-04-03 01:30:02', '2014-04-03 01:30:02', 'Linx', 9923, 0, 111, 78, ''),
(51, 'David', 'Charles', '890', 'gfd', 'asd', '2014-04-03 01:31:22', '2014-04-03 01:30:02', 'Linx', 67, 0, 555, 0, ''),
(52, 'Akiva', 'Orr', '000000', '', 'Address', '2014-04-03 02:25:16', '0000-00-00 00:00:00', 'Linx', 234, NULL, 100, 0, NULL),
(53, 'Daniel', 'Samuel', '123456', '', 'Heratic City', '2014-04-03 02:30:55', '2014-04-12 19:35:25', 'erdf', 11, 1750, 111, 0, ''),
(68, 'Dave', 'Zaew', '123456', '', 'ABC Street', '2014-04-12 19:35:25', '0000-00-00 00:00:00', 'Fish', 111, NULL, 600, 0, NULL),
(95, 'David', 'Charles', '639-1992', 'david@hotmail.com', 'Tobago', '2014-04-12 22:16:40', '2014-04-13 20:49:04', 'Linx ', 555, 175, 300, 0, ''),
(96, 'David', 'Charles', '639-1992', 'david@hotmail.com', 'Tobago', '2014-04-12 22:17:31', '2014-04-13 20:49:04', 'Linx ', 555, 175, 300, 0, ''),
(97, 'David', 'Charles', '639-1992', 'david@hotmail.com', 'Tobago', '2014-04-12 22:18:08', '2014-04-13 20:49:04', 'Linx ', 555, 175, 300, 0, ''),
(98, 'David', 'Charles', '639-1992', 'david@hotmail.com', 'Tobago', '2014-04-12 22:18:52', '2014-04-13 20:49:04', 'Linx ', 555, 175, 300, 0, ''),
(99, 'David', 'Charles', '639-1992', 'david@hotmail.com', 'Tobago', '2014-04-12 22:20:28', '2014-04-13 20:49:04', 'Linx ', 555, 175, 300, 0, ''),
(100, 'David', 'Charles', '639-1992', 'david@hotmail.com', 'Tobago', '2014-04-12 22:21:06', '2014-04-13 20:49:04', 'Linx ', 555, 175, 300, 0, ''),
(101, 'David', 'Charles', '639-1992', 'david@hotmail.com', 'Tobago', '2014-04-12 22:24:46', '2014-04-13 20:49:04', 'Linx ', 555, 175, 300, 0, ''),
(102, 'David', 'Charles', '639-1992', 'david@hotmail.com', 'Tobago', '2014-04-12 22:26:09', '2014-04-13 20:49:04', 'Linx ', 555, 175, 300, 0, ''),
(105, 'Anuj', 'Dookie', '7777777', 'nuj8188@hotmail.com', '152 Preysal village', '2014-04-17 04:36:16', '2014-04-14 05:08:23', 'Master Card', 1111111, -525, 111, 0, NULL),
(106, 'Anuj', 'Dookie', '7777777', 'nuj8188@hotmail.com', '152 Preysal village', '2014-04-17 04:36:16', '2014-04-14 05:12:23', 'Master Card', 1111111, -525, 300, 0, NULL),
(107, 'Anuj', 'Dookie', '7120437', 'nuj8188@hotmail.com', '152 Preysal village', '2014-04-01 05:12:48', '2014-04-14 05:14:00', 'Master Card', 1234567, 2275, 111, 0, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE IF NOT EXISTS `room` (
  `RoomNumber` int(11) NOT NULL,
  `TypeID` int(11) NOT NULL,
  PRIMARY KEY (`RoomNumber`),
  KEY `TypeID` (`TypeID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`RoomNumber`, `TypeID`) VALUES
(100, 111),
(111, 111),
(300, 111),
(333, 111),
(344, 111),
(555, 111),
(600, 111),
(200, 222),
(400, 222),
(424, 222),
(700, 222),
(800, 222);

-- --------------------------------------------------------

--
-- Table structure for table `roomtype`
--

CREATE TABLE IF NOT EXISTS `roomtype` (
  `TypeID` int(11) NOT NULL AUTO_INCREMENT,
  `TypeName` varchar(255) NOT NULL,
  `Description` varchar(255) NOT NULL,
  `RoomRate` double NOT NULL,
  PRIMARY KEY (`TypeID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=335 ;

--
-- Dumping data for table `roomtype`
--

INSERT INTO `roomtype` (`TypeID`, `TypeName`, `Description`, `RoomRate`) VALUES
(111, 'Single', 'A room for one', 175),
(222, 'Double', 'A room for 2', 300),
(333, 'Deluxe Suite', 'A luxurious deluxe room', 500);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `firstName` varchar(255) NOT NULL,
  `lastName` varchar(255) NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `dateCreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=18 ;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `firstName`, `lastName`, `username`, `password`, `email`, `dateCreated`) VALUES
(8, 'Anuj', 'Dookie', 'Ad1234', 'anujdookie', 'nuj1811@hotmail.com', '2014-03-25 08:57:47'),
(9, 'john', 'doe', 'jd', 'johndoe', 'jd@jd.jd', '2014-03-26 07:47:25'),
(10, 'test', 'testing', 'test', 'testing', 'test@test.test', '2014-03-26 11:09:42'),
(11, 'Qwer', 'Asdf', 'qwerty', 'qwerty', 'nuj8188@hotmail.com', '2014-04-05 00:36:44'),
(14, 'Ned', 'Stark', 'NS', 'nedstark', 'ns@ns.com', '2014-04-13 07:35:11'),
(17, 'zxcv', 'zxcv', 'zxcv', 'zxcvbn', 'zxcv@zxcv.com', '2014-04-14 05:59:49');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `guest`
--
ALTER TABLE `guest`
  ADD CONSTRAINT `ForeignKey` FOREIGN KEY (`RoomNumber`) REFERENCES `room` (`RoomNumber`);

--
-- Constraints for table `room`
--
ALTER TABLE `room`
  ADD CONSTRAINT `Foreign Key` FOREIGN KEY (`TypeID`) REFERENCES `roomtype` (`TypeID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
