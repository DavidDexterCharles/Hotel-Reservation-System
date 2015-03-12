-- phpMyAdmin SQL Dump
-- version 4.0.9
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 05, 2014 at 02:48 AM
-- Server version: 5.6.14
-- PHP Version: 5.5.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `hotel`
--

-- --------------------------------------------------------

--
-- Table structure for table `archive`
--

CREATE TABLE IF NOT EXISTS `archive` (
  `ArchiveID` int(11) NOT NULL,
  `ReservationNumber` int(11) NOT NULL,
  `FirstName` varchar(255) NOT NULL,
  `LastName` varchar(255) NOT NULL,
  `Contact` varchar(255) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `Address` varchar(255) NOT NULL,
  `CheckInDate` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `CheckOutDate` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `CreditCardType` varchar(255) NOT NULL,
  `CreditCardNumber` varchar(20) NOT NULL,
  `BillingInfo` double NOT NULL,
  `RoomNumber` int(11) NOT NULL,
  PRIMARY KEY (`ArchiveID`),
  KEY `RoomNumber` (`RoomNumber`),
  KEY `ReservationNumber` (`ReservationNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `archive`
--

INSERT INTO `archive` (`ArchiveID`, `ReservationNumber`, `FirstName`, `LastName`, `Contact`, `Email`, `Address`, `CheckInDate`, `CheckOutDate`, `CreditCardType`, `CreditCardNumber`, `BillingInfo`, `RoomNumber`) VALUES
(1, 5, 'Ronel', 'Gittens', '111-1111', 'ron@gmail.com', 'San Fernando', '2014-03-16 07:00:00', '2014-03-18 07:00:00', 'Visa', '1111111111', 350, 100),
(2, 6, 'Darnell', 'Gittens', '222-2222', 'dg@hotmail.com', 'Port of Spain', '2014-03-19 07:00:00', '2014-03-22 07:00:00', 'Master Card', '222222222', 525, 100),
(3, 9, 'John', 'James', '333-3333', 'jj@yahoo.com', 'Penal', '2014-03-28 07:00:00', '2014-03-29 07:00:00', 'Visa', '999999999', 175, 100),
(6, 7, 'Ronel', 'Gittens', '111-1111', 'ron@gmail.com', 'San Fernando', '2014-04-01 07:00:00', '2014-04-03 07:00:00', 'Visa', '1111111111', 600, 400);

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`EmpID`, `Username`, `Password`) VALUES
(1, 'david', 'charles'),
(3, 'ronel', 'gittens'),
(4, 'Darnell', 'John');

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=19 ;

--
-- Dumping data for table `guest`
--

INSERT INTO `guest` (`ReservationNumber`, `FirstName`, `LastName`, `Contact`, `Email`, `Address`, `CheckInDate`, `CheckOutDate`, `CreditCardType`, `CreditCardNumber`, `BillingInfo`, `RoomNumber`, `Extras`, `ExtrasInfo`) VALUES
(5, 'Ronel', 'Gittens', '123-4567', 'ronel@yahoo.com', 'ABC Road', '2014-02-28 06:39:55', '2014-03-17 01:55:11', 'Visa', 111111111, 3375, 100, 400, 'Room Service'),
(6, 'Darnell', 'Gittens', '987-6543', 'dg@gmail.com', 'Def lane', '2014-02-28 06:39:55', '2014-03-01 06:39:55', 'Mastercard', 222222222, 300, 200, 0, 'Room Service'),
(7, 'Steve', 'Gittens', '652398', 'sg@hotmail.com', '456 Road', '2014-03-07 08:52:16', '0000-00-00 00:00:00', 'Mastercard', 333333333, -220699200, 400, 0, 'Room Service'),
(9, 'Andrea \r\n', 'Salvador', '1111111', 'aj@hotmail.com', 'Port of Spain', '2014-03-15 23:01:32', '2014-03-20 07:00:00', 'Visa', 444444444, 4000, 500, 2500, 'Room Service'),
(12, 'Bob\r\n', 'Jones', '2222222', 'bj@gmail.com', 'Couva', '2014-03-16 01:31:16', '2014-03-17 03:52:06', 'Visa', 555555555, 175, 300, 0, 'Room Service'),
(13, 'Andrew', 'John', NULL, NULL, NULL, '2014-03-16 01:34:17', '2014-03-31 07:00:00', 'Mastercard', 666666666, 3000, 600, 200, 'Room Service'),
(14, '', 'Gittens', '111-1111', 'dg@hotmail.com', 'Couva', '2014-03-16 18:00:28', '2014-03-17 03:52:06', 'Visa', 777777777, 0, 900, 0, 'Room Service'),
(18, 'Anuj', 'Dookie', '712-0437', 'nuj1811@hotmail.com', '152 Preysal village', '0000-00-00 00:00:00', '0000-00-00 00:00:00', 'Master Card', 1234567, NULL, 700, 0, NULL);

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
(300, 111),
(600, 111),
(900, 111),
(200, 222),
(400, 222),
(500, 222),
(700, 222),
(800, 222);

-- --------------------------------------------------------

--
-- Table structure for table `roomtype`
--

CREATE TABLE IF NOT EXISTS `roomtype` (
  `TypeID` int(11) NOT NULL,
  `TypeName` varchar(255) NOT NULL,
  `Description` varchar(255) NOT NULL,
  `RoomRate` double NOT NULL,
  PRIMARY KEY (`TypeID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12 ;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `firstName`, `lastName`, `username`, `password`, `email`, `dateCreated`) VALUES
(8, 'Anuj', 'Dookie', 'Ad1234', 'anujdookie', 'nuj1811@hotmail.com', '2014-03-25 08:57:47'),
(9, 'john', 'doe', 'jd', 'johndoe', 'jd@jd.jd', '2014-03-26 07:47:25'),
(10, 'test', 'testing', 'test', 'testing', 'test@test.test', '2014-03-26 11:09:42'),
(11, 'Qwer', 'Asdf', 'qwerty', 'qwerty', 'nuj8188@hotmail.com', '2014-04-05 00:36:44');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `archive`
--
ALTER TABLE `archive`
  ADD CONSTRAINT `archive_ibfk_1` FOREIGN KEY (`ReservationNumber`) REFERENCES `guest` (`ReservationNumber`),
  ADD CONSTRAINT `archive_ibfk_2` FOREIGN KEY (`RoomNumber`) REFERENCES `room` (`RoomNumber`);

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
