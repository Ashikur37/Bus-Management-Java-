-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 30, 2016 at 01:57 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 7.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bus_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `bus`
--

CREATE TABLE `bus` (
  `bname` varchar(20) NOT NULL,
  `date` varchar(2) NOT NULL,
  `month` varchar(20) NOT NULL,
  `ticket` int(5) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bus`
--

INSERT INTO `bus` (`bname`, `date`, `month`, `ticket`) VALUES
('sr', '6', 'september', 12),
('sr', '8', 'september', 0),
('sr', '10', 'september', 3),
('sr', '4', 'september', 2),
('sr', '24', 'september', 2),
('sr', '30', 'september', 4),
('sr', '26', 'september', 2),
('sr', '28', 'august', 6),
('sr', '5', 'september', 3),
('sr', '29', 'august', 15),
('sr', '3', 'september', 1),
('shaymoli', '29', 'august', 11),
('jonaki', '29', 'august', 3),
('sr', '30', 'august', 2),
('econo', '29', 'august', 3),
('econo', '30', 'august', 3);

-- --------------------------------------------------------

--
-- Table structure for table `bus_info`
--

CREATE TABLE `bus_info` (
  `id` int(10) NOT NULL,
  `bname` varchar(20) NOT NULL,
  `from` varchar(20) NOT NULL,
  `to` varchar(20) NOT NULL,
  `class` varchar(20) NOT NULL,
  `price` int(10) NOT NULL,
  `time` time(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bus_info`
--

INSERT INTO `bus_info` (`id`, `bname`, `from`, `to`, `class`, `price`, `time`) VALUES
(1, 'sr', 'dhaka', 'bagura', 'Non AC', 600, '08:00:00.00'),
(2, 'econo', 'dhaka', 'lakshmipur', 'Non AC', 600, '13:00:00.00'),
(3, 'jonaki', 'dhaka', 'lakshmipur', 'AC', 500, '17:02:00.00'),
(5, 'hanif', 'dhaka', 'chittagong', 'AC', 700, '16:00:00.00'),
(6, 'shaymoli', 'sylhet', 'dhaka', 'AC', 600, '20:00:00.00'),
(7, 'brtc', 'dhaka', 'noakhali', 'AC', 550, '17:30:00.00'),
(8, 'VSR', 'Dhaka', 'Khulna', 'AC', 900, '06:00:00.00');

-- --------------------------------------------------------

--
-- Table structure for table `seat_info`
--

CREATE TABLE `seat_info` (
  `bname` varchar(20) NOT NULL,
  `date` varchar(2) NOT NULL,
  `month` varchar(20) NOT NULL,
  `a1` int(2) NOT NULL DEFAULT '0',
  `a2` int(2) NOT NULL DEFAULT '0',
  `a3` int(2) NOT NULL DEFAULT '0',
  `a4` int(2) NOT NULL DEFAULT '0',
  `b1` int(2) DEFAULT '0',
  `b2` int(2) NOT NULL DEFAULT '0',
  `b3` int(2) NOT NULL DEFAULT '0',
  `b4` int(2) NOT NULL DEFAULT '0',
  `c1` int(2) NOT NULL DEFAULT '0',
  `c2` int(2) NOT NULL DEFAULT '0',
  `c3` int(2) NOT NULL DEFAULT '0',
  `c4` int(2) NOT NULL DEFAULT '0',
  `d1` int(2) NOT NULL DEFAULT '0',
  `d2` int(2) NOT NULL DEFAULT '0',
  `d3` int(2) NOT NULL DEFAULT '0',
  `d4` int(2) NOT NULL DEFAULT '0',
  `e1` int(2) NOT NULL DEFAULT '0',
  `e2` int(2) NOT NULL DEFAULT '0',
  `e3` int(2) DEFAULT '0',
  `e4` int(2) NOT NULL DEFAULT '0',
  `e5` int(2) NOT NULL DEFAULT '0',
  `a1n` varchar(20) NOT NULL DEFAULT 'free',
  `a2n` varchar(20) NOT NULL DEFAULT 'free',
  `a3n` varchar(20) NOT NULL DEFAULT 'free',
  `a4n` varchar(20) NOT NULL DEFAULT 'free',
  `b1n` varchar(20) NOT NULL DEFAULT 'free',
  `b2n` varchar(20) NOT NULL DEFAULT 'free',
  `b3n` varchar(20) NOT NULL DEFAULT 'free',
  `b4n` varchar(20) NOT NULL DEFAULT 'free',
  `c1n` varchar(20) NOT NULL DEFAULT 'free',
  `c2n` varchar(20) NOT NULL DEFAULT 'free',
  `c3n` varchar(20) NOT NULL DEFAULT 'free',
  `c4n` varchar(20) NOT NULL DEFAULT 'free',
  `d1n` varchar(20) NOT NULL DEFAULT 'free',
  `d2n` varchar(20) NOT NULL DEFAULT 'free',
  `d3n` varchar(20) NOT NULL DEFAULT 'free',
  `d4n` varchar(20) NOT NULL DEFAULT 'free',
  `e1n` varchar(20) NOT NULL DEFAULT 'free',
  `e2n` varchar(20) NOT NULL DEFAULT 'free',
  `e3n` varchar(20) NOT NULL DEFAULT 'free',
  `e4n` varchar(20) NOT NULL DEFAULT 'free',
  `e5n` varchar(20) NOT NULL DEFAULT 'free'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `seat_info`
--

INSERT INTO `seat_info` (`bname`, `date`, `month`, `a1`, `a2`, `a3`, `a4`, `b1`, `b2`, `b3`, `b4`, `c1`, `c2`, `c3`, `c4`, `d1`, `d2`, `d3`, `d4`, `e1`, `e2`, `e3`, `e4`, `e5`, `a1n`, `a2n`, `a3n`, `a4n`, `b1n`, `b2n`, `b3n`, `b4n`, `c1n`, `c2n`, `c3n`, `c4n`, `d1n`, `d2n`, `d3n`, `d4n`, `e1n`, `e2n`, `e3n`, `e4n`, `e5n`) VALUES
('jonaki', '2', 'january', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free'),
('ab', '3', 'january', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free'),
('sr', '4', 'september', 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 'ab', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'ab', 'free', 'free', 'free', 'free', 'free', 'free', 'free'),
('sr', '6', 'september', 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 'ab', 'ab', 'free', 'free', 'ab', 'ab', 'ab', 'ab', 'ab', 'ab', 'ab', 'ab', 'ab', 'ab', 'ab', 'ab', 'ab', 'ab', 'ab', 'ab', 'ab'),
('sr', '27', 'august', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free'),
('sr', '5', 'september', 1, 1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 'ab', 'ab', 'free', 'free', 'free', 'ab', 'free', 'free', 'ab', 'ab', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free'),
('sr', '8', 'september', 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 'ab', 'free', 'free', 'free', 'free', 'ab', 'free', 'free', 'ab', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'ab', 'free', 'free', 'free'),
('sr', '10', 'september', 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 'ab', 'ab', 'free', 'free', 'free', 'ab', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free'),
('sr', '24', 'september', 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 'ab', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'ab', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free'),
('sr', '30', 'september', 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 'ab', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'ab', 'free', 'free', 'ab', 'free', 'free', 'free', 'free', 'ab', 'free', 'free', 'free'),
('sr', '26', 'september', 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 'free', 'free', 'free', 'free', 'free', 'ab', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free'),
('sr', '28', 'august', 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 'ab', 'free', 'free', 'free', 'free', 'ab', 'free', 'free', 'ab', 'free', 'free', 'free', 'free', 'ab', 'ab', 'ab', 'free', 'free', 'free', 'free', 'free'),
('sr', '29', 'august', 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 'ab', 'ab', 'free', 'ab', 'ab', 'ab', 'ab', 'free', 'free', 'free', 'ab', 'ab', 'free', 'ab', 'ab', 'ab', 'free', 'ab', 'ab', 'ab', 'ab'),
('sr', '3', 'september', 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 'free', 'free', 'ab', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free'),
('shaymoli', '29', 'august', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'ab', 'free', 'free', 'free', 'ab', 'ab', 'free', 'free', 'free', 'ab', 'ab'),
('sr', '30', 'august', 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 'ab', 'ab', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free'),
('econo', '29', 'august', 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'abdullah29', 'abdullah29', 'free', 'free', 'free', 'free', 'abdullah29', 'free', 'free', 'free', 'free', 'free'),
('econo', '30', 'august', 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 'free', 'free', 'ab6', 'free', 'free', 'free', 'free', 'ab6', 'free', 'free', 'free', 'ab6', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free');

-- --------------------------------------------------------

--
-- Table structure for table `sell_info`
--

CREATE TABLE `sell_info` (
  `date` varchar(2) NOT NULL,
  `month` varchar(20) NOT NULL,
  `ticket` int(6) NOT NULL DEFAULT '0',
  `amount` int(10) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sell_info`
--

INSERT INTO `sell_info` (`date`, `month`, `ticket`, `amount`) VALUES
('5', 'september', 8, 3650),
('4', 'september', 0, 0),
('24', 'september', 0, 0),
('30', 'september', 4, 2200),
('26', 'september', 2, 1100),
('28', 'august', 6, 3300),
('29', 'august', 32, 18150),
('3', 'september', 1, 550),
('30', 'august', 5, 2900);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `username` varchar(20) NOT NULL,
  `date` varchar(2) NOT NULL,
  `month` varchar(20) NOT NULL,
  `bname` varchar(20) NOT NULL,
  `ticket` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `date`, `month`, `bname`, `ticket`) VALUES
('ab', '19', 'september', 'sr', 0),
('ab', '26', 'september', 'sr', 2),
('ab', '26', 'september', 'tr', 15),
('ab', '28', 'august', 'sr', 6),
('ab', '5', 'september', 'sr', 3),
('ab', '29', 'august', 'sr', 15),
('ab', '3', 'september', 'sr', 1),
('ab', '29', 'august', 'shaymoli', 11),
('ab', '29', 'august', 'jonaki', 3),
('ab', '30', 'august', 'sr', 2),
('abdullah29', '29', 'august', 'econo', 3),
('ab6', '30', 'august', 'econo', 3);

-- --------------------------------------------------------

--
-- Table structure for table `user_info`
--

CREATE TABLE `user_info` (
  `id` int(10) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `age` int(5) NOT NULL,
  `status` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_info`
--

INSERT INTO `user_info` (`id`, `username`, `password`, `age`, `status`) VALUES
(6, 'piash3700', '1234', 22, 1),
(18, 'admin', 'aiub12', 22, 1),
(23, 'jabed1', '1234', 22, 1),
(33, 'zqc0', '1', 1, 1),
(36, 'an2', '1', 1, 1),
(37, 'an3', '1', 1, 1),
(40, 'aaa', '1', 22, 1),
(41, 'aaaq', '1', 22, 1),
(42, 'aaa1', '1', 22, 0),
(43, 'owner', 'aiub123', 2, 1),
(45, 'sasas', '12', 20, 0),
(46, 'abdullah', '125454', 22, 1),
(47, 'myst', '123', 22, 1),
(48, 'piash37', '1234', 22, 0),
(49, 'ab6', '123', 22, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bus_info`
--
ALTER TABLE `bus_info`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user_info`
--
ALTER TABLE `user_info`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bus_info`
--
ALTER TABLE `bus_info`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `user_info`
--
ALTER TABLE `user_info`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=50;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
