-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 12, 2015 at 09:32 PM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `hotel_reservations`
--

-- --------------------------------------------------------

--
-- Table structure for table `guest`
--

CREATE TABLE IF NOT EXISTS `guest` (
  `ReservationNumber` int(11) NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(255) NOT NULL,
  `LastName` varchar(255) NOT NULL,
  `Contact` varchar(255) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `Address` varchar(255) NOT NULL,
  `CheckInDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `CheckOutDate` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `BillingInfo` varchar(255) NOT NULL,
  `RoomNumber` int(11) NOT NULL,
  PRIMARY KEY (`ReservationNumber`),
  UNIQUE KEY `RoomNumber` (`RoomNumber`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `guest`
--

INSERT INTO `guest` (`ReservationNumber`, `FirstName`, `LastName`, `Contact`, `Email`, `Address`, `CheckInDate`, `CheckOutDate`, `BillingInfo`, `RoomNumber`) VALUES
(5, 'Ronel', 'Gittens', '123-4567', 'rg@hotmail.com', 'ABC Road', '2014-02-28 06:39:55', '0000-00-00 00:00:00', '', 100),
(6, 'Darnell', 'Gittens', '987-6543', 'dg@gmail.com', 'Def lane', '2014-02-28 06:39:55', '0000-00-00 00:00:00', '', 200);

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE IF NOT EXISTS `room` (
  `RoomNumber` int(11) NOT NULL,
  `TypeID` int(11) NOT NULL,
  PRIMARY KEY (`RoomNumber`),
  UNIQUE KEY `TypeID` (`TypeID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`RoomNumber`, `TypeID`) VALUES
(100, 111),
(200, 222),
(300, 333);

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
(333, 'family', '', 0);

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
