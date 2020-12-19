-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 19, 2020 at 11:05 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `exercise`
--

-- --------------------------------------------------------

--
-- Table structure for table `employees`
--

CREATE TABLE `employees` (
  `id` int(3) NOT NULL,
  `fullname` char(10) NOT NULL,
  `gender` char(10) NOT NULL,
  `position` varchar(255) NOT NULL,
  `salary` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employees`
--

INSERT INTO `employees` (`id`, `fullname`, `gender`, `position`, `salary`) VALUES
(1, 'Alice', 'female', 'Director', 4500),
(2, 'Bob', 'male', 'Operation Manager', 3500),
(3, 'Charlie', 'male', 'Finance Manager', 3500),
(4, 'Dean', 'male', 'Staff', 2000),
(5, 'Eve', 'female', 'Staff', 2000),
(6, 'ricoh', 'male', 'Director', 4000);

-- --------------------------------------------------------

--
-- Table structure for table `konser`
--

CREATE TABLE `konser` (
  `nama` varchar(255) NOT NULL,
  `tanggal` date NOT NULL,
  `jenis` char(35) NOT NULL,
  `jumlah` int(10) NOT NULL,
  `harga` int(30) NOT NULL,
  `total` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `konser`
--

INSERT INTO `konser` (`nama`, `tanggal`, `jenis`, `jumlah`, `harga`, `total`) VALUES
('asas', '2020-07-11', 'VIP A', 2, 40000, 80000),
('farras', '2020-07-14', 'YELLOW B', 4, 50000, 200000),
('jessen', '2020-06-15', 'YELLOW A', 2, 50000, 100000),
('jesson', '2020-05-12', 'VIP C', 0, 70000, 100000),
('ricky', '2020-07-19', 'BLACK A', 2, 50000, 100000),
('sars', '2020-06-15', 'VIP C', 3, 60000, 180000);

-- --------------------------------------------------------

--
-- Table structure for table `tiketkonser`
--

CREATE TABLE `tiketkonser` (
  `nama` varchar(255) NOT NULL,
  `tanggal` varchar(30) NOT NULL,
  `gender` char(30) NOT NULL,
  `jenis` varchar(30) NOT NULL,
  `harga` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tiketkonser`
--

INSERT INTO `tiketkonser` (`nama`, `tanggal`, `gender`, `jenis`, `harga`, `quantity`, `total`) VALUES
('david', '07 juli 2020', 'Perempuan', 'PURPLE A', 300000, 2, 600000),
('faras', '10 oktober 2020', 'Perempuan', 'WINGS B', 250000, 3, 750000),
('jessen', '03 maret 2020', 'Pria', 'WINGS B', 250000, 2, 500000),
('novi', '06 juni 2020', 'Perempuan', 'BLACK B', 450000, 6, 2700000),
('ricky', '01januari2020', 'pria', 'WINGS A', 200000, 2, 400000),
('rico', '04 april 2020', 'Pria', 'PURPLE A', 300000, 2, 600000),
('sadasf', '03 maret 2020', 'Perempuan', 'BLACK A', 400000, 4, 1600000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employees`
--
ALTER TABLE `employees`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `konser`
--
ALTER TABLE `konser`
  ADD PRIMARY KEY (`nama`);

--
-- Indexes for table `tiketkonser`
--
ALTER TABLE `tiketkonser`
  ADD PRIMARY KEY (`nama`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
